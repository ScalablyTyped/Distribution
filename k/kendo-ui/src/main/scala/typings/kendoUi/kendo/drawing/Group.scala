package typings.kendoUi.kendo.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group
  extends StObject
     with Element {
  
  def append(elements: Element*): Unit = js.native
  
  var children: js.Any = js.native
  
  def clear(): Unit = js.native
  
  def insert(position: Double, element: Element): Unit = js.native
  
  @JSName("options")
  var options_Group: GroupOptions = js.native
  
  def remove(element: Element): Unit = js.native
  
  def removeAt(index: Double): Unit = js.native
}
