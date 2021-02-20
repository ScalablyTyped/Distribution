package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scroller
  extends typings.kendoUi.kendo.ui.Widget {
  
  def animatedScrollTo(x: Double, y: Double): Unit = js.native
  
  def contentResized(): Unit = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def height(): Double = js.native
  
  @JSName("options")
  var options_Scroller: ScrollerOptions = js.native
  
  def pullHandled(): Unit = js.native
  
  def reset(): Unit = js.native
  
  def scrollHeight(): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  def scrollWidth(): Unit = js.native
  
  var wrapper: JQuery = js.native
  
  def zoomOut(): Unit = js.native
}
