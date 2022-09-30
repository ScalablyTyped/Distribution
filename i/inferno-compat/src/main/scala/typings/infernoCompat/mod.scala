package typings.infernoCompat

import org.scalablytyped.runtime.Instantiable0
import typings.inferno.anon.ReadonlychildrenInfernoNo
import typings.inferno.commonMod.AnimationQueues
import typings.inferno.typesMod.ForwardRef
import typings.inferno.typesMod.Inferno.ComponentClass
import typings.inferno.typesMod.Inferno.ExoticComponent
import typings.inferno.typesMod.Inferno.InfernoElement
import typings.inferno.typesMod.Inferno.InfernoNode
import typings.inferno.typesMod.Inferno.StatelessComponent
import typings.inferno.typesMod.LinkedEvent
import typings.inferno.typesMod.Props
import typings.inferno.typesMod.Ref
import typings.inferno.typesMod.RefObject
import typings.inferno.typesMod.Refs
import typings.inferno.typesMod.VNode
import typings.infernoCompat.anon.Children
import typings.infernoCompat.anon.ComponentComparator
import typings.infernoCompat.anon.Count
import typings.infernoCompat.anon.Fn0
import typings.infernoCompat.anon.FnCall
import typings.infernoCompat.anon.FnCallChildrenChildFlagsKey
import typings.infernoCompat.anon.FnCallDataEvent
import typings.infernoCompat.anon.FnCallFlagsTypeClassNameChildrenChildFlagsPropsKeyRef
import typings.infernoCompat.anon.FnCallFlagsTypePropsKeyRef
import typings.infernoCompat.anon.FnCallInputParentDOMCallback
import typings.infernoCompat.anon.FnCallObj
import typings.infernoCompat.anon.FnCallParentDOM
import typings.infernoCompat.anon.FnCallRender
import typings.infernoCompat.anon.FnCallTextKey
import typings.infernoCompat.anon.FnCallTypePropsChildren
import typings.infernoCompat.anon.FnCallVNodeToClonePropsChildren
import typings.infernoCompat.anon.TypeofComponent
import typings.infernoCreateClass.mod.ClassicComponentClass
import typings.infernoCreateClass.mod.ComponentSpec
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
  
  @JSImport("inferno-compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("inferno-compat", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inferno-compat", "default.Children")
    @js.native
    def Children: Count = js.native
    inline def Children_=(x: Count): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Children")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.Component")
    @js.native
    def Component: TypeofComponent = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("inferno-compat", "default.Component")
    @js.native
    open class ComponentCls[P, S] ()
      extends typings.inferno.mod.Component[P, S]
    
    inline def Component_=(x: TypeofComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Component")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.Fragment")
    @js.native
    def Fragment: ExoticComponent[Children] = js.native
    inline def Fragment(props: Children): InfernoElement[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Fragment")(props.asInstanceOf[js.Any]).asInstanceOf[InfernoElement[Any]]
    inline def Fragment_=(x: ExoticComponent[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Fragment")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.PropTypes")
    @js.native
    def PropTypes: typings.infernoCompat.anon.Any = js.native
    inline def PropTypes_=(x: typings.infernoCompat.anon.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PropTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.PureComponent")
    @js.native
    def PureComponent: Instantiable0[typings.infernoCompat.mod.PureComponent[js.Object, js.Object]] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("inferno-compat", "default.PureComponent")
    @js.native
    open class PureComponentCls[P, S] () extends PureComponent[P, S]
    
    inline def PureComponent_=(x: Instantiable0[PureComponent[js.Object, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PureComponent")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default._CI")
    @js.native
    def _CI: js.Function6[
        /* vNode */ VNode, 
        /* Component */ Any, 
        /* props */ Any, 
        /* context */ js.Object, 
        /* isSVG */ Boolean, 
        /* lifecycle */ js.Array[js.Function], 
        Any
      ] = js.native
    inline def _CI(
      vNode: VNode,
      Component: Any,
      props: Any,
      context: js.Object,
      isSVG: Boolean,
      lifecycle: js.Array[js.Function]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_CI")(vNode.asInstanceOf[js.Any], Component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def _CI_=(
      x: js.Function6[
          /* vNode */ VNode, 
          /* Component */ Any, 
          /* props */ Any, 
          /* context */ js.Object, 
          /* isSVG */ Boolean, 
          /* lifecycle */ js.Array[js.Function], 
          Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CI")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default._HI")
    @js.native
    def _HI: js.Function1[/* input */ Any, VNode] = js.native
    inline def _HI(input: Any): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("_HI")(input.asInstanceOf[js.Any]).asInstanceOf[VNode]
    inline def _HI_=(x: js.Function1[/* input */ Any, VNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_HI")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default._M")
    @js.native
    def _M: FnCall = js.native
    inline def _M(
      vNode: VNode,
      parentDOM: Null,
      context: js.Object,
      isSVG: Boolean,
      nextNode: Null,
      lifecycle: js.Array[js.Function],
      animations: AnimationQueues
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_M")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def _M(
      vNode: VNode,
      parentDOM: Null,
      context: js.Object,
      isSVG: Boolean,
      nextNode: Element,
      lifecycle: js.Array[js.Function],
      animations: AnimationQueues
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_M")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def _M(
      vNode: VNode,
      parentDOM: Element,
      context: js.Object,
      isSVG: Boolean,
      nextNode: Null,
      lifecycle: js.Array[js.Function],
      animations: AnimationQueues
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_M")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def _M(
      vNode: VNode,
      parentDOM: Element,
      context: js.Object,
      isSVG: Boolean,
      nextNode: Element,
      lifecycle: js.Array[js.Function],
      animations: AnimationQueues
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_M")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("inferno-compat", "default._MCCC")
    @js.native
    def _MCCC: js.Function4[
        /* ref */ Any, 
        /* instance */ Any, 
        /* lifecycle */ js.Array[js.Function], 
        /* animations */ AnimationQueues, 
        Unit
      ] = js.native
    inline def _MCCC(ref: Any, instance: Any, lifecycle: js.Array[js.Function], animations: AnimationQueues): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_MCCC")(ref.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def _MCCC_=(
      x: js.Function4[
          /* ref */ Any, 
          /* instance */ Any, 
          /* lifecycle */ js.Array[js.Function], 
          /* animations */ AnimationQueues, 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MCCC")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default._ME")
    @js.native
    def _ME: FnCall = js.native
    inline def _ME(
      vNode: VNode,
      parentDOM: Null,
      context: js.Object,
      isSVG: Boolean,
      nextNode: Null,
      lifecycle: js.Array[js.Function],
      animations: AnimationQueues
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ME")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def _ME(
      vNode: VNode,
      parentDOM: Null,
      context: js.Object,
      isSVG: Boolean,
      nextNode: Element,
      lifecycle: js.Array[js.Function],
      animations: AnimationQueues
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ME")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def _ME(
      vNode: VNode,
      parentDOM: Element,
      context: js.Object,
      isSVG: Boolean,
      nextNode: Null,
      lifecycle: js.Array[js.Function],
      animations: AnimationQueues
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ME")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def _ME(
      vNode: VNode,
      parentDOM: Element,
      context: js.Object,
      isSVG: Boolean,
      nextNode: Element,
      lifecycle: js.Array[js.Function],
      animations: AnimationQueues
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ME")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def _ME_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ME")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default._MFCC")
    @js.native
    def _MFCC: js.Function3[
        /* vNode */ VNode, 
        /* lifecycle */ js.Array[js.Function], 
        /* animations */ AnimationQueues, 
        Unit
      ] = js.native
    inline def _MFCC(vNode: VNode, lifecycle: js.Array[js.Function], animations: AnimationQueues): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_MFCC")(vNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def _MFCC_=(
      x: js.Function3[
          /* vNode */ VNode, 
          /* lifecycle */ js.Array[js.Function], 
          /* animations */ AnimationQueues, 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MFCC")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default._MP")
    @js.native
    def _MP: js.Function6[
        /* vNode */ Any, 
        /* flags */ Any, 
        /* props */ Any, 
        /* dom */ Any, 
        /* isSVG */ Any, 
        /* animations */ AnimationQueues, 
        Unit
      ] = js.native
    inline def _MP(vNode: Any, flags: Any, props: Any, dom: Any, isSVG: Any, animations: AnimationQueues): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_MP")(vNode.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], props.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def _MP_=(
      x: js.Function6[
          /* vNode */ Any, 
          /* flags */ Any, 
          /* props */ Any, 
          /* dom */ Any, 
          /* isSVG */ Any, 
          /* animations */ AnimationQueues, 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MP")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default._MR")
    @js.native
    def _MR: js.Function3[/* ref */ Any, /* value */ Any, /* lifecycle */ js.Array[js.Function], Unit] = js.native
    inline def _MR(ref: Any, value: Any, lifecycle: js.Array[js.Function]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_MR")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def _MR_=(x: js.Function3[/* ref */ Any, /* value */ Any, /* lifecycle */ js.Array[js.Function], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MR")(x.asInstanceOf[js.Any])
    
    inline def _M_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_M")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.__render")
    @js.native
    def _Render: js.Function4[
        /* input */ js.UndefOr[VNode | Null | InfernoNode], 
        /* parentDOM */ Element | SVGAElement | ShadowRoot | DocumentFragment | HTMLElement | Node | Null, 
        /* callback */ js.Function | Null, 
        /* context */ Any, 
        Unit
      ] = js.native
    
    inline def _Render(
      input: js.UndefOr[VNode | Null | InfernoNode],
      parentDOM: Element | SVGAElement | ShadowRoot | DocumentFragment | HTMLElement | Node | Null,
      callback: js.Function | Null,
      context: Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__render")(input.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def _Render_=(
      x: js.Function4[
          /* input */ js.UndefOr[VNode | Null | InfernoNode], 
          /* parentDOM */ Element | SVGAElement | ShadowRoot | DocumentFragment | HTMLElement | Node | Null, 
          /* callback */ js.Function | Null, 
          /* context */ Any, 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__render")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.cloneElement")
    @js.native
    def cloneElement: FnCallVNodeToClonePropsChildren = js.native
    inline def cloneElement(vNodeToClone: VNode): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vNodeToClone.asInstanceOf[js.Any]).asInstanceOf[VNode]
    inline def cloneElement(vNodeToClone: VNode, props: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vNodeToClone.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def cloneElement(vNodeToClone: VNode, props: Any, _children: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vNodeToClone.asInstanceOf[js.Any], props.asInstanceOf[js.Any], _children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def cloneElement(vNodeToClone: VNode, props: Unit, _children: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vNodeToClone.asInstanceOf[js.Any], props.asInstanceOf[js.Any], _children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def cloneElement_=(x: FnCallVNodeToClonePropsChildren): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cloneElement")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.cloneVNode")
    @js.native
    def cloneVNode: FnCallVNodeToClonePropsChildren = js.native
    inline def cloneVNode(vNodeToClone: VNode): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneVNode")(vNodeToClone.asInstanceOf[js.Any]).asInstanceOf[VNode]
    inline def cloneVNode(vNodeToClone: VNode, props: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneVNode")(vNodeToClone.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def cloneVNode(vNodeToClone: VNode, props: Any, _children: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneVNode")(vNodeToClone.asInstanceOf[js.Any], props.asInstanceOf[js.Any], _children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def cloneVNode(vNodeToClone: VNode, props: Unit, _children: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneVNode")(vNodeToClone.asInstanceOf[js.Any], props.asInstanceOf[js.Any], _children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def cloneVNode_=(x: FnCallVNodeToClonePropsChildren): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cloneVNode")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.createClass")
    @js.native
    def createClass: FnCallObj = js.native
    inline def createClass[P, S](obj: ComponentSpec[P, S]): ClassicComponentClass[P, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClass")(obj.asInstanceOf[js.Any]).asInstanceOf[ClassicComponentClass[P, S]]
    inline def createClass_=(x: FnCallObj): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createClass")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.createComponentVNode")
    @js.native
    def createComponentVNode: FnCallFlagsTypePropsKeyRef = js.native
    inline def createComponentVNode[P](
      flags: VNodeFlags,
      `type`: js.Function | ComponentClass[P] | (ForwardRef[P, Any]),
      props: js.UndefOr[P | Null],
      key: js.UndefOr[Null | String | Double],
      ref: js.UndefOr[Ref[Element] | Refs[P] | Null]
    ): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponentVNode")(flags.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def createComponentVNode_=(x: FnCallFlagsTypePropsKeyRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createComponentVNode")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.createElement")
    @js.native
    def createElement: FnCallTypePropsChildren = js.native
    inline def createElement[P](`type`: String, props: P & Props[P], _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
    inline def createElement[P](`type`: String, props: Null, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
    inline def createElement[P](`type`: String, props: Unit, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
    inline def createElement[P](`type`: ComponentClass[P], props: P & Props[P], _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
    inline def createElement[P](`type`: ComponentClass[P], props: Null, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
    inline def createElement[P](`type`: ComponentClass[P], props: Unit, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
    inline def createElement[P](`type`: StatelessComponent[P], props: P & Props[P], _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
    inline def createElement[P](`type`: StatelessComponent[P], props: Null, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
    inline def createElement[P](`type`: StatelessComponent[P], props: Unit, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
    inline def createElement_=(x: FnCallTypePropsChildren): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createElement")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.createFactory")
    @js.native
    def createFactory: js.Function1[/* type */ Any, Any] = js.native
    inline def createFactory(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def createFactory_=(x: js.Function1[/* type */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createFactory")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.createFragment")
    @js.native
    def createFragment: FnCallChildrenChildFlagsKey = js.native
    inline def createFragment(children: Any, childFlags: ChildFlags): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createFragment")(children.asInstanceOf[js.Any], childFlags.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def createFragment(children: Any, childFlags: ChildFlags, key: String): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createFragment")(children.asInstanceOf[js.Any], childFlags.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def createFragment(children: Any, childFlags: ChildFlags, key: Double): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createFragment")(children.asInstanceOf[js.Any], childFlags.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def createFragment_=(x: FnCallChildrenChildFlagsKey): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createFragment")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.createPortal")
    @js.native
    def createPortal: js.Function2[/* children */ Any, /* container */ Any, VNode] = js.native
    inline def createPortal(children: Any, container: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def createPortal_=(x: js.Function2[/* children */ Any, /* container */ Any, VNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createPortal")(x.asInstanceOf[js.Any])
    
    inline def createRef[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[RefObject[T]]
    @JSImport("inferno-compat", "default.createRef")
    @js.native
    def createRef_Fdefault: Fn0 = js.native
    
    inline def createRef_Fdefault_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createRef")(x.asInstanceOf[js.Any])
    
    inline def createRenderer(): js.Function4[/* lastInput */ Any, /* nextInput */ Any, /* callback */ Any, /* context */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderer")().asInstanceOf[js.Function4[/* lastInput */ Any, /* nextInput */ Any, /* callback */ Any, /* context */ Any, Unit]]
    inline def createRenderer(parentDOM: Any): js.Function4[/* lastInput */ Any, /* nextInput */ Any, /* callback */ Any, /* context */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderer")(parentDOM.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* lastInput */ Any, /* nextInput */ Any, /* callback */ Any, /* context */ Any, Unit]]
    @JSImport("inferno-compat", "default.createRenderer")
    @js.native
    def createRenderer_Fdefault: FnCallParentDOM = js.native
    
    inline def createRenderer_Fdefault_=(x: FnCallParentDOM): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createRenderer")(x.asInstanceOf[js.Any])
    
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
    @JSImport("inferno-compat", "default.createTextVNode")
    @js.native
    def createTextVNode_Fdefault: FnCallTextKey = js.native
    
    inline def createTextVNode_Fdefault_=(x: FnCallTextKey): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createTextVNode")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.createVNode")
    @js.native
    def createVNode: FnCallFlagsTypeClassNameChildrenChildFlagsPropsKeyRef = js.native
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
    inline def createVNode_=(x: FnCallFlagsTypeClassNameChildrenChildFlagsPropsKeyRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createVNode")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.directClone")
    @js.native
    def directClone: js.Function1[/* vNodeToClone */ VNode, VNode] = js.native
    inline def directClone(vNodeToClone: VNode): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("directClone")(vNodeToClone.asInstanceOf[js.Any]).asInstanceOf[VNode]
    inline def directClone_=(x: js.Function1[/* vNodeToClone */ VNode, VNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("directClone")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.findDOMFromVNode")
    @js.native
    def findDOMFromVNode: js.Function2[/* vNode */ VNode, /* startEdge */ Boolean, Element | Null] = js.native
    inline def findDOMFromVNode(vNode: VNode, startEdge: Boolean): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findDOMFromVNode")(vNode.asInstanceOf[js.Any], startEdge.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def findDOMFromVNode_=(x: js.Function2[/* vNode */ VNode, /* startEdge */ Boolean, Element | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findDOMFromVNode")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.findDOMNode")
    @js.native
    def findDOMNode: js.Function1[/* ref */ Any, Any] = js.native
    inline def findDOMNode(ref: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")(ref.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def findDOMNode_=(x: js.Function1[/* ref */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findDOMNode")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.forwardRef")
    @js.native
    def forwardRef: FnCallRender = js.native
    inline def forwardRef[T, P](
      render: js.Function2[/* props */ ReadonlychildrenInfernoNo & P, /* ref */ RefObject[T], InfernoNode]
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def forwardRef_=(x: FnCallRender): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forwardRef")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.getFlagsForElementVnode")
    @js.native
    def getFlagsForElementVnode: js.Function1[/* type */ String, VNodeFlags] = js.native
    inline def getFlagsForElementVnode(`type`: String): VNodeFlags = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlagsForElementVnode")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNodeFlags]
    inline def getFlagsForElementVnode_=(x: js.Function1[/* type */ String, VNodeFlags]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFlagsForElementVnode")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.hydrate")
    @js.native
    def hydrate: FnCallInputParentDOMCallback = js.native
    inline def hydrate(input: Any, parentDOM: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(input.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def hydrate(input: Any, parentDOM: Element, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(input.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def hydrate_=(x: FnCallInputParentDOMCallback): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hydrate")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.isValidElement")
    @js.native
    def isValidElement: js.Function1[/* obj */ VNode, Boolean] = js.native
    inline def isValidElement(obj: VNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValidElement_=(x: js.Function1[/* obj */ VNode, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isValidElement")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.linkEvent")
    @js.native
    def linkEvent: FnCallDataEvent = js.native
    inline def linkEvent[T, E /* <: Event */](data: T, event: js.Function2[/* data */ T, /* event */ E, Unit]): (LinkedEvent[T, E]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("linkEvent")(data.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[(LinkedEvent[T, E]) | Null]
    inline def linkEvent_=(x: FnCallDataEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkEvent")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.normalizeProps")
    @js.native
    def normalizeProps: js.Function1[/* vNode */ Any, Any] = js.native
    inline def normalizeProps(vNode: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeProps")(vNode.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def normalizeProps_=(x: js.Function1[/* vNode */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normalizeProps")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.options")
    @js.native
    def options: ComponentComparator = js.native
    inline def options_=(x: ComponentComparator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.render")
    @js.native
    def render: js.Function4[
        /* rootInput */ Any, 
        /* container */ Any, 
        /* cb */ js.UndefOr[Null], 
        /* context */ js.UndefOr[js.Object], 
        Any
      ] = js.native
    inline def render(rootInput: Any, container: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(rootInput.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def render(rootInput: Any, container: Any, cb: Null, context: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(rootInput.asInstanceOf[js.Any], container.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def render(rootInput: Any, container: Any, cb: Unit, context: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(rootInput.asInstanceOf[js.Any], container.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def render_=(
      x: js.Function4[
          /* rootInput */ Any, 
          /* container */ Any, 
          /* cb */ js.UndefOr[Null], 
          /* context */ js.UndefOr[js.Object], 
          Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("render")(x.asInstanceOf[js.Any])
    
    inline def rerender(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rerender")().asInstanceOf[Unit]
    @JSImport("inferno-compat", "default.rerender")
    @js.native
    def rerender_Fdefault: js.Function0[Unit] = js.native
    
    inline def rerender_Fdefault_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rerender")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.unmountComponentAtNode")
    @js.native
    def unmountComponentAtNode: js.Function1[/* container */ Element | SVGAElement | DocumentFragment, Boolean] = js.native
    inline def unmountComponentAtNode(container: DocumentFragment): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def unmountComponentAtNode(container: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def unmountComponentAtNode(container: SVGAElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def unmountComponentAtNode_=(x: js.Function1[/* container */ Element | SVGAElement | DocumentFragment, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unmountComponentAtNode")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.unstable_renderSubtreeIntoContainer")
    @js.native
    def unstableRenderSubtreeIntoContainer: js.Function4[/* parentComponent */ Any, /* vNode */ Any, /* container */ Any, /* callback */ Any, Any] = js.native
    
    inline def unstableRenderSubtreeIntoContainer(parentComponent: Any, vNode: Any, container: Any, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], vNode.asInstanceOf[js.Any], container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def unstableRenderSubtreeIntoContainer_=(
      x: js.Function4[/* parentComponent */ Any, /* vNode */ Any, /* container */ Any, /* callback */ Any, Any]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unstable_renderSubtreeIntoContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "default.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  object Children {
    
    @JSImport("inferno-compat", "Children")
    @js.native
    val ^ : js.Any = js.native
    
    inline def count(children: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(children.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def forEach(children: js.Array[Any], fn: IterateChildrenFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def forEach(children: js.Array[Any], fn: IterateChildrenFn, ctx: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def map(children: js.Array[Any], fn: IterateChildrenFn, ctx: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def only(children: js.Array[Any]): InfernoNode | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(children.asInstanceOf[js.Any]).asInstanceOf[InfernoNode | Any]
    
    inline def toArray(children: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  }
  
  @JSImport("inferno-compat", "Component")
  @js.native
  open class Component[P, S] ()
    extends typings.inferno.mod.Component[P, S] {
    def this(props: P) = this()
    def this(props: P, context: Any) = this()
    def this(props: Unit, context: Any) = this()
  }
  /* static members */
  object Component {
    
    @JSImport("inferno-compat", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inferno-compat", "Component.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[js.Object] = js.native
    inline def defaultProps_=(x: js.UndefOr[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "Component.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps: js.UndefOr[js.Function2[/* nextProps */ Any, /* state */ Any, Any]] = js.native
    inline def getDerivedStateFromProps_=(x: js.UndefOr[js.Function2[/* nextProps */ Any, /* state */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("inferno-compat", "Fragment")
  @js.native
  val Fragment: ExoticComponent[typings.inferno.anon.Children] = js.native
  
  object Inferno {
    
    @JSImport("inferno-compat", "Inferno.version")
    @js.native
    val version: String = js.native
  }
  
  object PropTypes {
    
    @JSImport("inferno-compat", "PropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    inline def any(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")().asInstanceOf[js.Function0[Unit]]
    
    inline def array(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("array")().asInstanceOf[Unit]
    
    inline def arrayOf(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayOf")().asInstanceOf[js.Function0[Unit]]
    
    @JSImport("inferno-compat", "PropTypes.array")
    @js.native
    def array_FPropTypes: js.Function0[Unit] = js.native
    
    inline def array_FPropTypes_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("array")(x.asInstanceOf[js.Any])
    
    inline def bool(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")().asInstanceOf[Unit]
    @JSImport("inferno-compat", "PropTypes.bool")
    @js.native
    def bool_FPropTypes: js.Function0[Unit] = js.native
    
    inline def bool_FPropTypes_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bool")(x.asInstanceOf[js.Any])
    
    inline def checkPropTypes(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPropTypes")().asInstanceOf[Null]
    
    inline def element(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("element")().asInstanceOf[js.Function0[Unit]]
    
    inline def func(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("func")().asInstanceOf[Unit]
    @JSImport("inferno-compat", "PropTypes.func")
    @js.native
    def func_FPropTypes: js.Function0[Unit] = js.native
    
    inline def func_FPropTypes_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("func")(x.asInstanceOf[js.Any])
    
    inline def instanceOf(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOf")().asInstanceOf[js.Function0[Unit]]
    
    inline def node(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("node")().asInstanceOf[js.Function0[Unit]]
    
    inline def number(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[Unit]
    @JSImport("inferno-compat", "PropTypes.number")
    @js.native
    def number_FPropTypes: js.Function0[Unit] = js.native
    
    inline def number_FPropTypes_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    
    inline def `object`(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("object")().asInstanceOf[Unit]
    
    inline def objectOf(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectOf")().asInstanceOf[js.Function0[Unit]]
    
    @JSImport("inferno-compat", "PropTypes.object")
    @js.native
    def object_FPropTypes: js.Function0[Unit] = js.native
    
    inline def object_FPropTypes_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("object")(x.asInstanceOf[js.Any])
    
    inline def oneOf(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")().asInstanceOf[js.Function0[Unit]]
    
    inline def oneOfType(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOfType")().asInstanceOf[js.Function0[Unit]]
    
    inline def shape(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("shape")().asInstanceOf[js.Function0[Unit]]
    
    inline def string(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[Unit]
    @JSImport("inferno-compat", "PropTypes.string")
    @js.native
    def string_FPropTypes: js.Function0[Unit] = js.native
    
    inline def string_FPropTypes_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
    
    inline def symbol(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")().asInstanceOf[Unit]
    @JSImport("inferno-compat", "PropTypes.symbol")
    @js.native
    def symbol_FPropTypes: js.Function0[Unit] = js.native
    
    inline def symbol_FPropTypes_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbol")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("inferno-compat", "PureComponent")
  @js.native
  open class PureComponent[P, S] ()
    extends typings.inferno.mod.Component[P, S] {
    def this(props: P) = this()
    def this(props: P, context: Any) = this()
    def this(props: Unit, context: Any) = this()
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MPureComponent(props: Any, state: Any): Boolean = js.native
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
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_M")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def _M(
    vNode: VNode,
    parentDOM: Null,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_M")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def _M(
    vNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_M")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def _M(
    vNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_M")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def _MCCC(ref: Any, instance: Any, lifecycle: js.Array[js.Function], animations: AnimationQueues): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_MCCC")(ref.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def _ME(
    vNode: VNode,
    parentDOM: Null,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ME")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def _ME(
    vNode: VNode,
    parentDOM: Null,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ME")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def _ME(
    vNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ME")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def _ME(
    vNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ME")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def _MFCC(vNode: VNode, lifecycle: js.Array[js.Function], animations: AnimationQueues): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_MFCC")(vNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def _MP(vNode: Any, flags: Any, props: Any, dom: Any, isSVG: Any, animations: AnimationQueues): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_MP")(vNode.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], props.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def _MR(ref: Any, value: Any, lifecycle: js.Array[js.Function]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_MR")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def _Render(
    input: js.UndefOr[VNode | Null | InfernoNode],
    parentDOM: Element | SVGAElement | ShadowRoot | DocumentFragment | HTMLElement | Node | Null,
    callback: js.Function | Null,
    context: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__render")(input.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cloneElement(vNodeToClone: VNode): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vNodeToClone.asInstanceOf[js.Any]).asInstanceOf[VNode]
  inline def cloneElement(vNodeToClone: VNode, props: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vNodeToClone.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def cloneElement(vNodeToClone: VNode, props: Any, _children: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vNodeToClone.asInstanceOf[js.Any], props.asInstanceOf[js.Any], _children.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def cloneElement(vNodeToClone: VNode, props: Unit, _children: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vNodeToClone.asInstanceOf[js.Any], props.asInstanceOf[js.Any], _children.asInstanceOf[js.Any])).asInstanceOf[VNode]
  
  inline def cloneVNode(vNodeToClone: VNode): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneVNode")(vNodeToClone.asInstanceOf[js.Any]).asInstanceOf[VNode]
  inline def cloneVNode(vNodeToClone: VNode, props: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneVNode")(vNodeToClone.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def cloneVNode(vNodeToClone: VNode, props: Any, _children: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneVNode")(vNodeToClone.asInstanceOf[js.Any], props.asInstanceOf[js.Any], _children.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def cloneVNode(vNodeToClone: VNode, props: Unit, _children: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneVNode")(vNodeToClone.asInstanceOf[js.Any], props.asInstanceOf[js.Any], _children.asInstanceOf[js.Any])).asInstanceOf[VNode]
  
  inline def createClass[P, S](obj: ComponentSpec[P, S]): ClassicComponentClass[P, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClass")(obj.asInstanceOf[js.Any]).asInstanceOf[ClassicComponentClass[P, S]]
  
  inline def createComponentVNode[P](
    flags: VNodeFlags,
    `type`: js.Function | ComponentClass[P] | (ForwardRef[P, Any]),
    props: js.UndefOr[P | Null],
    key: js.UndefOr[Null | String | Double],
    ref: js.UndefOr[Ref[Element] | Refs[P] | Null]
  ): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponentVNode")(flags.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[VNode]
  
  inline def createElement[P](`type`: String, props: P & Props[P], _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
  inline def createElement[P](`type`: String, props: Null, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
  inline def createElement[P](`type`: String, props: Unit, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
  inline def createElement[P](`type`: ComponentClass[P], props: P & Props[P], _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
  inline def createElement[P](`type`: ComponentClass[P], props: Null, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
  inline def createElement[P](`type`: ComponentClass[P], props: Unit, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
  inline def createElement[P](`type`: StatelessComponent[P], props: P & Props[P], _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
  inline def createElement[P](`type`: StatelessComponent[P], props: Null, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
  inline def createElement[P](`type`: StatelessComponent[P], props: Unit, _children: Any*): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(_children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode]
  
  inline def createFactory(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  
  inline def findDOMNode(ref: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")(ref.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def forwardRef[T, P](
    render: js.Function2[/* props */ ReadonlychildrenInfernoNo & P, /* ref */ RefObject[T], InfernoNode]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getFlagsForElementVnode(`type`: String): VNodeFlags = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlagsForElementVnode")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNodeFlags]
  
  inline def hydrate(input: Any, parentDOM: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(input.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hydrate(input: Any, parentDOM: Element, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(input.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isValidElement(obj: VNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def linkEvent[T, E /* <: Event */](data: T, event: js.Function2[/* data */ T, /* event */ E, Unit]): (LinkedEvent[T, E]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("linkEvent")(data.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[(LinkedEvent[T, E]) | Null]
  
  inline def normalizeProps(vNode: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeProps")(vNode.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  object options {
    
    @JSImport("inferno-compat", "options")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inferno-compat", "options.componentComparator")
    @js.native
    def componentComparator: (js.Function2[/* lastVNode */ VNode, /* nextVNode */ VNode, Boolean]) | Null = js.native
    inline def componentComparator_=(x: (js.Function2[/* lastVNode */ VNode, /* nextVNode */ VNode, Boolean]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentComparator")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "options.createVNode")
    @js.native
    def createVNode: (js.Function1[/* vNode */ VNode, Unit]) | Null = js.native
    inline def createVNode_=(x: (js.Function1[/* vNode */ VNode, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createVNode")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "options.reactStyles")
    @js.native
    def reactStyles: js.UndefOr[Boolean] = js.native
    inline def reactStyles_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reactStyles")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno-compat", "options.renderComplete")
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
  
  inline def render(rootInput: Any, container: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(rootInput.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def render(rootInput: Any, container: Any, cb: Null, context: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(rootInput.asInstanceOf[js.Any], container.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def render(rootInput: Any, container: Any, cb: Unit, context: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(rootInput.asInstanceOf[js.Any], container.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def rerender(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rerender")().asInstanceOf[Unit]
  
  inline def unmountComponentAtNode(container: DocumentFragment): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def unmountComponentAtNode(container: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def unmountComponentAtNode(container: SVGAElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def unstableRenderSubtreeIntoContainer(parentComponent: Any, vNode: Any, container: Any, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], vNode.asInstanceOf[js.Any], container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("inferno-compat", "version")
  @js.native
  val version: /* "15.4.2" */ String = js.native
  
  type IterateChildrenFn = js.Function3[/* value */ InfernoNode | Any, /* index */ Double, /* array */ js.Array[Any], Any]
  
  object global {
    
    trait Event extends StObject {
      
      var persist: js.Function
    }
    object Event {
      
      inline def apply(persist: js.Function): typings.infernoCompat.mod.global.Event = {
        val __obj = js.Dynamic.literal(persist = persist.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.infernoCompat.mod.global.Event]
      }
      
      extension [Self <: typings.infernoCompat.mod.global.Event](x: Self) {
        
        inline def setPersist(value: js.Function): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      }
    }
  }
}
