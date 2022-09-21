package typings.matterJs.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Mouse")
@js.native
open class Mouse () extends StObject {
  
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
object Mouse {
  
  @JSImport("matter-js", "Mouse")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearSourceEvents(mouse: Mouse): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSourceEvents")(mouse.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def create(element: HTMLElement): Mouse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any]).asInstanceOf[Mouse]
  
  inline def setElement(mouse: Mouse, element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setElement")(mouse.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setOffset(mouse: Mouse, offset: Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOffset")(mouse.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setScale(mouse: Mouse, scale: Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setScale")(mouse.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
