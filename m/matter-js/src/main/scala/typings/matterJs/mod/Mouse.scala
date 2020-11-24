package typings.matterJs.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Mouse")
@js.native
class Mouse () extends js.Object {
  
  var absolute: IMousePoint = js.native
  
  var button: Double = js.native
  
  var element: HTMLElement = js.native
  
  var mousedownPosition: IMousePoint = js.native
  
  var mouseupPosition: IMousePoint = js.native
  
  var offset: IMousePoint = js.native
  
  var pixelRatio: Double = js.native
  
  var position: IMousePoint = js.native
  
  var scale: IMousePoint = js.native
  
  var wheelDelta: Double = js.native
}
/* static members */
@JSImport("matter-js", "Mouse")
@js.native
object Mouse extends js.Object {
  
  def clearSourceEvents(mouse: Mouse): Unit = js.native
  
  def create(element: HTMLElement): Mouse = js.native
  
  def setElement(mouse: Mouse, element: HTMLElement): Unit = js.native
  
  def setOffset(mouse: Mouse, offset: Vector): Unit = js.native
  
  def setScale(mouse: Mouse, scale: Vector): Unit = js.native
}
