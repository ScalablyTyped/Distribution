package typings.inferno

import typings.inferno.distCoreTypesMod.VNode
import typings.inferno.distDomUtilsCommonMod.AnimationQueues
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomUnmountingMod {
  
  @JSImport("inferno/dist/DOM/unmounting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearDOM(parentDOM: Any, children: js.Array[VNode], animations: AnimationQueues): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearDOM")(parentDOM.asInstanceOf[js.Any], children.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def remove(vNode: VNode, parentDOM: Element, animations: AnimationQueues): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeAllChildren(dom: Element, vNode: VNode, children: Any, animations: AnimationQueues): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAllChildren")(dom.asInstanceOf[js.Any], vNode.asInstanceOf[js.Any], children.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unmount(vNode: Any, animations: AnimationQueues): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unmount")(vNode.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unmountAllChildren(children: js.Array[VNode], animations: AnimationQueues): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unmountAllChildren")(children.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
