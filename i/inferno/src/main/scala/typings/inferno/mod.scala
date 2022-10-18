package typings.inferno

import typings.inferno.anon.Children
import typings.inferno.anon.ReadonlychildrenInfernoNo
import typings.inferno.distCoreTypesMod.ForwardRef
import typings.inferno.distCoreTypesMod.Inferno.ComponentClass
import typings.inferno.distCoreTypesMod.Inferno.ExoticComponent
import typings.inferno.distCoreTypesMod.Inferno.InfernoNode
import typings.inferno.distCoreTypesMod.LinkedEvent
import typings.inferno.distCoreTypesMod.Ref
import typings.inferno.distCoreTypesMod.RefObject
import typings.inferno.distCoreTypesMod.Refs
import typings.inferno.distCoreTypesMod.VNode
import typings.infernoVnodeFlags.mod.ChildFlags
import typings.infernoVnodeFlags.mod.VNodeFlags
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Node
import typings.std.SVGAElement
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inferno", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("inferno", "AnimationQueues")
  @js.native
  open class AnimationQueues ()
    extends typings.inferno.distDomUtilsCommonMod.AnimationQueues
  
  @JSImport("inferno", "Component")
  @js.native
  open class Component[P, S] ()
    extends typings.inferno.distCoreComponentMod.Component[P, S] {
    def this(props: P) = this()
    def this(props: P, context: Any) = this()
    def this(props: Unit, context: Any) = this()
  }
  /* static members */
  object Component {
    
    @JSImport("inferno", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inferno", "Component.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[js.Object] = js.native
    inline def defaultProps_=(x: js.UndefOr[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno", "Component.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps: js.UndefOr[js.Function2[/* nextProps */ Any, /* state */ Any, Any]] = js.native
    inline def getDerivedStateFromProps_=(x: js.UndefOr[js.Function2[/* nextProps */ Any, /* state */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("inferno", "Fragment")
  @js.native
  val Fragment: ExoticComponent[Children] = js.native
  
  object Inferno {
    
    @JSImport("inferno", "Inferno.version")
    @js.native
    val version: String = js.native
  }
  
  inline def _CI(
    vNode: VNode,
    Component: Any,
    props: Any,
    context: js.Object,
    isSVG: Boolean,
    lifecycle: js.Array[js.Function]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_CI")(vNode.asInstanceOf[js.Any], Component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def _HI(input: Any): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("_HI")(input.asInstanceOf[js.Any]).asInstanceOf[VNode]
  
  inline def _M(
    vNode: VNode,
    parentDOM: Null,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: js.Array[js.Function],
    animations: typings.inferno.distDomUtilsCommonMod.AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_M")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def _M(
    vNode: VNode,
    parentDOM: Null,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: typings.inferno.distDomUtilsCommonMod.AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_M")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def _M(
    vNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: js.Array[js.Function],
    animations: typings.inferno.distDomUtilsCommonMod.AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_M")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def _M(
    vNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: typings.inferno.distDomUtilsCommonMod.AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_M")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def _MCCC(
    ref: Any,
    instance: Any,
    lifecycle: js.Array[js.Function],
    animations: typings.inferno.distDomUtilsCommonMod.AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_MCCC")(ref.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def _ME(
    vNode: VNode,
    parentDOM: Null,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: js.Array[js.Function],
    animations: typings.inferno.distDomUtilsCommonMod.AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ME")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def _ME(
    vNode: VNode,
    parentDOM: Null,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: typings.inferno.distDomUtilsCommonMod.AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ME")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def _ME(
    vNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: js.Array[js.Function],
    animations: typings.inferno.distDomUtilsCommonMod.AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ME")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def _ME(
    vNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: typings.inferno.distDomUtilsCommonMod.AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ME")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def _MFCC(
    vNode: VNode,
    lifecycle: js.Array[js.Function],
    animations: typings.inferno.distDomUtilsCommonMod.AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_MFCC")(vNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def _MP(
    vNode: Any,
    flags: Any,
    props: Any,
    dom: Any,
    isSVG: Any,
    animations: typings.inferno.distDomUtilsCommonMod.AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_MP")(vNode.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], props.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def _MR(ref: Any, value: Any, lifecycle: js.Array[js.Function]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_MR")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def _RFC(vNode: VNode, context: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_RFC")(vNode.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def _Render(
    input: js.UndefOr[VNode | Null | InfernoNode],
    parentDOM: Element | SVGAElement | ShadowRoot | DocumentFragment | HTMLElement | Node | Null,
    callback: js.Function | Null,
    context: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__render")(input.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  
  inline def createRef[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[RefObject[T]]
  
  inline def createRenderer(): js.Function4[/* lastInput */ Any, /* nextInput */ Any, /* callback */ Any, /* context */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderer")().asInstanceOf[js.Function4[/* lastInput */ Any, /* nextInput */ Any, /* callback */ Any, /* context */ Any, Unit]]
  inline def createRenderer(parentDOM: Any): js.Function4[/* lastInput */ Any, /* nextInput */ Any, /* callback */ Any, /* context */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderer")(parentDOM.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* lastInput */ Any, /* nextInput */ Any, /* callback */ Any, /* context */ Any, Unit]]
  
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
  
  inline def directClone(vNodeToClone: VNode): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("directClone")(vNodeToClone.asInstanceOf[js.Any]).asInstanceOf[VNode]
  
  inline def findDOMFromVNode(vNode: VNode, startEdge: Boolean): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findDOMFromVNode")(vNode.asInstanceOf[js.Any], startEdge.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  inline def forwardRef[T, P](
    render: js.Function2[/* props */ ReadonlychildrenInfernoNo & P, /* ref */ RefObject[T], InfernoNode]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getFlagsForElementVnode(`type`: String): VNodeFlags = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlagsForElementVnode")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNodeFlags]
  
  inline def linkEvent[T, E /* <: Event */](data: T, event: js.Function2[/* data */ T, /* event */ E, Unit]): (LinkedEvent[T, E]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("linkEvent")(data.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[(LinkedEvent[T, E]) | Null]
  
  inline def normalizeProps(vNode: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeProps")(vNode.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  object options {
    
    @JSImport("inferno", "options")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inferno", "options.componentComparator")
    @js.native
    def componentComparator: (js.Function2[/* lastVNode */ VNode, /* nextVNode */ VNode, Boolean]) | Null = js.native
    inline def componentComparator_=(x: (js.Function2[/* lastVNode */ VNode, /* nextVNode */ VNode, Boolean]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentComparator")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno", "options.createVNode")
    @js.native
    def createVNode: (js.Function1[/* vNode */ VNode, Unit]) | Null = js.native
    inline def createVNode_=(x: (js.Function1[/* vNode */ VNode, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createVNode")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno", "options.reactStyles")
    @js.native
    def reactStyles: js.UndefOr[Boolean] = js.native
    inline def reactStyles_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reactStyles")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno", "options.renderComplete")
    @js.native
    def renderComplete: (js.Function2[
        /* rootInput */ VNode | InfernoNode, 
        /* parentDOM */ Element | SVGAElement | ShadowRoot | DocumentFragment | HTMLElement | Node, 
        Unit
      ]) | Null = js.native
    inline def renderComplete_=(
      x: (js.Function2[
          /* rootInput */ VNode | InfernoNode, 
          /* parentDOM */ Element | SVGAElement | ShadowRoot | DocumentFragment | HTMLElement | Node, 
          Unit
        ]) | Null
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderComplete")(x.asInstanceOf[js.Any])
  }
  
  inline def render(
    input: js.UndefOr[VNode | Null | InfernoNode],
    parentDOM: Element | SVGAElement | ShadowRoot | DocumentFragment | HTMLElement | Node | Null,
    callback: js.UndefOr[js.Function | Null],
    context: js.UndefOr[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(input.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rerender(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rerender")().asInstanceOf[Unit]
  
  @JSImport("inferno", "version")
  @js.native
  val version: js.UndefOr[String] = js.native
}
