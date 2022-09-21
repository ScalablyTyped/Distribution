package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBar
  extends StObject
     with Widget {
  
  def enable(enable: Boolean): Unit = js.native
  
  @JSName("options")
  var options_ProgressBar: ProgressBarOptions = js.native
  
  var progressStatus: JQuery = js.native
  
  var progressWrapper: JQuery = js.native
  
  def value(): Double = js.native
  def value(value: Boolean): Unit = js.native
  def value(value: Double): Unit = js.native
  
  var wrapper: JQuery = js.native
}
