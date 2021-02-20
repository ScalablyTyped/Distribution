package typings.kendoUi.kendo.dataviz.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group
  extends typings.kendoUi.kendo.drawing.Element {
  
  def append(element: typings.kendoUi.kendo.drawing.Element): Unit = js.native
  
  var children: js.Any = js.native
  
  def clear(): Unit = js.native
  
  def insert(position: Double, element: typings.kendoUi.kendo.drawing.Element): Unit = js.native
  
  @JSName("options")
  var options_Group: GroupOptions = js.native
  
  def remove(element: typings.kendoUi.kendo.drawing.Element): Unit = js.native
  
  def removeAt(index: Double): Unit = js.native
}
