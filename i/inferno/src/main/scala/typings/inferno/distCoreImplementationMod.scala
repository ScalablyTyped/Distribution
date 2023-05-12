package typings.inferno

import typings.inferno.distCoreTypesMod.ForwardRef
import typings.inferno.distCoreTypesMod.Inferno.ComponentClass
import typings.inferno.distCoreTypesMod.InfernoNode
import typings.inferno.distCoreTypesMod.Ref
import typings.inferno.distCoreTypesMod.Refs
import typings.inferno.distCoreTypesMod.VNode
import typings.infernoVnodeFlags.mod.ChildFlags
import typings.infernoVnodeFlags.mod.VNodeFlags
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreImplementationMod {
  
  @JSImport("inferno/dist/core/implementation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createComponentVNode[P](
    flags: VNodeFlags,
    `type`: js.Function | ComponentClass[P] | (ForwardRef[P, Any]),
    props: js.UndefOr[P | Null],
    key: js.UndefOr[Null | String | Double],
    ref: js.UndefOr[Ref[Element] | Refs[P] | Null]
  ): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponentVNode")(flags.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[VNode]
  
  inline def createFragment(children: Any, childFlags: ChildFlags): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createFragment")(children.asInstanceOf[js.Any], childFlags.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def createFragment(children: Any, childFlags: ChildFlags, key: String): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createFragment")(children.asInstanceOf[js.Any], childFlags.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def createFragment(children: Any, childFlags: ChildFlags, key: Double): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createFragment")(children.asInstanceOf[js.Any], childFlags.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode]
  
  inline def createPortal(children: Any, container: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[VNode]
  
  inline def createTextVNode(): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")().asInstanceOf[VNode]
  inline def createTextVNode(text: String): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")(text.asInstanceOf[js.Any]).asInstanceOf[VNode]
  inline def createTextVNode(text: String, key: String): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")(text.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def createTextVNode(text: String, key: Double): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")(text.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def createTextVNode(text: Boolean): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")(text.asInstanceOf[js.Any]).asInstanceOf[VNode]
  inline def createTextVNode(text: Boolean, key: String): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")(text.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def createTextVNode(text: Boolean, key: Double): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")(text.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def createTextVNode(text: Double): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")(text.asInstanceOf[js.Any]).asInstanceOf[VNode]
  inline def createTextVNode(text: Double, key: String): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")(text.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def createTextVNode(text: Double, key: Double): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")(text.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def createTextVNode(text: Null, key: String): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")(text.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def createTextVNode(text: Null, key: Double): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")(text.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def createTextVNode(text: Unit, key: String): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")(text.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def createTextVNode(text: Unit, key: Double): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")(text.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode]
  
  inline def createVNode[P](
    flags: VNodeFlags,
    `type`: String,
    className: js.UndefOr[String | Null],
    children: js.UndefOr[InfernoNode],
    childFlags: js.UndefOr[ChildFlags],
    props: js.UndefOr[P | Null],
    key: js.UndefOr[String | Double | Null],
    ref: js.UndefOr[Ref[Element] | Refs[P] | Null]
  ): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createVNode")(flags.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], className.asInstanceOf[js.Any], children.asInstanceOf[js.Any], childFlags.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[VNode]
  
  inline def createVoidVNode(): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createVoidVNode")().asInstanceOf[VNode]
  
  inline def directClone(vNodeToClone: VNode): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("directClone")(vNodeToClone.asInstanceOf[js.Any]).asInstanceOf[VNode]
  
  inline def getFlagsForElementVnode(`type`: String): VNodeFlags = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlagsForElementVnode")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNodeFlags]
  
  inline def normalizeChildren(vNode: VNode, children: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeChildren")(vNode.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
  
  inline def normalizeProps(vNode: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeProps")(vNode.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def normalizeRoot(input: Any): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRoot")(input.asInstanceOf[js.Any]).asInstanceOf[VNode]
  
  inline def normalizeVNodes(nodes: js.Array[Any], result: js.Array[VNode], index: Double, currentKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_normalizeVNodes")(nodes.asInstanceOf[js.Any], result.asInstanceOf[js.Any], index.asInstanceOf[js.Any], currentKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
