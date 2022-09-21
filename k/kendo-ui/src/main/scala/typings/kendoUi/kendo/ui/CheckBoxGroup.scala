package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckBoxGroup
  extends StObject
     with Widget {
  
  def checkAll(select: Boolean): Unit = js.native
  
  def enable(enable: Boolean): Unit = js.native
  
  def enableItem(enable: Boolean, index: Double): Unit = js.native
  
  def item(index: Double): JQuery = js.native
  
  def items(): JQuery = js.native
  
  @JSName("options")
  var options_CheckBoxGroup: CheckBoxGroupOptions = js.native
  
  def value(): Any = js.native
  def value(value: Any): Unit = js.native
  
  var wrapper: JQuery = js.native
}
