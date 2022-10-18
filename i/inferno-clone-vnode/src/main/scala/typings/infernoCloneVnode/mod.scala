package typings.infernoCloneVnode

import typings.inferno.distCoreTypesMod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inferno-clone-vnode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cloneVNode(vNodeToClone: VNode): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneVNode")(vNodeToClone.asInstanceOf[js.Any]).asInstanceOf[VNode]
  inline def cloneVNode(vNodeToClone: VNode, props: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneVNode")(vNodeToClone.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def cloneVNode(vNodeToClone: VNode, props: Any, _children: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneVNode")(vNodeToClone.asInstanceOf[js.Any], props.asInstanceOf[js.Any], _children.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def cloneVNode(vNodeToClone: VNode, props: Unit, _children: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneVNode")(vNodeToClone.asInstanceOf[js.Any], props.asInstanceOf[js.Any], _children.asInstanceOf[js.Any])).asInstanceOf[VNode]
}
