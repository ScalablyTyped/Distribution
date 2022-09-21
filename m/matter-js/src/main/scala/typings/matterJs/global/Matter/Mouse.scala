package typings.matterJs.global.Matter

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Mouse")
@js.native
open class Mouse ()
  extends typings.matterJs.mod.Mouse
/* static members */
object Mouse {
  
  @JSGlobal("Matter.Mouse")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearSourceEvents(mouse: typings.matterJs.mod.Mouse): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSourceEvents")(mouse.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def create(element: HTMLElement): typings.matterJs.mod.Mouse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Mouse]
  
  inline def setElement(mouse: typings.matterJs.mod.Mouse, element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setElement")(mouse.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setOffset(mouse: typings.matterJs.mod.Mouse, offset: typings.matterJs.mod.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOffset")(mouse.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setScale(mouse: typings.matterJs.mod.Mouse, scale: typings.matterJs.mod.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setScale")(mouse.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
