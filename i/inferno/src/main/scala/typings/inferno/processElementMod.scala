package typings.inferno

import typings.inferno.typesMod.VNode
import typings.infernoVnodeFlags.mod.VNodeFlags
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processElementMod {
  
  @JSImport("inferno/dist/DOM/wrappers/processElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addFormElementEventHandlers(flags: VNodeFlags, dom: Element, nextPropsOrEmpty: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addFormElementEventHandlers")(flags.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], nextPropsOrEmpty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isControlledFormElement(nextPropsOrEmpty: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isControlledFormElement")(nextPropsOrEmpty.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def processElement(
    flags: VNodeFlags,
    vNode: VNode,
    dom: Element,
    nextPropsOrEmpty: Any,
    mounting: Boolean,
    isControlled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processElement")(flags.asInstanceOf[js.Any], vNode.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], nextPropsOrEmpty.asInstanceOf[js.Any], mounting.asInstanceOf[js.Any], isControlled.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
