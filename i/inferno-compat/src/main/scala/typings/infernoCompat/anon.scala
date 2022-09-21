package typings.infernoCompat

import org.scalablytyped.runtime.Instantiable0
import typings.inferno.anon.ReadonlychildrenInfernoNo
import typings.inferno.commonMod.AnimationQueues
import typings.inferno.mod.Component
import typings.inferno.typesMod.ForwardRef
import typings.inferno.typesMod.Inferno.ComponentClass
import typings.inferno.typesMod.Inferno.InfernoNode
import typings.inferno.typesMod.Inferno.StatelessComponent
import typings.inferno.typesMod.LinkedEvent
import typings.inferno.typesMod.Props
import typings.inferno.typesMod.Ref
import typings.inferno.typesMod.RefObject
import typings.inferno.typesMod.Refs
import typings.inferno.typesMod.VNode
import typings.infernoCompat.mod.IterateChildrenFn
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

object anon {
  
  trait Any extends StObject {
    
    def any(): js.Function0[Unit]
    
    def array(): Unit
    
    def arrayOf(): js.Function0[Unit]
    
    def bool(): Unit
    
    def checkPropTypes(): Null
    
    def element(): js.Function0[Unit]
    
    def func(): Unit
    
    def instanceOf(): js.Function0[Unit]
    
    def node(): js.Function0[Unit]
    
    def number(): Unit
    
    def `object`(): Unit
    
    def objectOf(): js.Function0[Unit]
    
    def oneOf(): js.Function0[Unit]
    
    def oneOfType(): js.Function0[Unit]
    
    def shape(): js.Function0[Unit]
    
    def string(): Unit
    
    def symbol(): Unit
  }
  object Any {
    
    inline def apply(
      any: () => js.Function0[Unit],
      array: () => Unit,
      arrayOf: () => js.Function0[Unit],
      bool: () => Unit,
      checkPropTypes: () => Null,
      element: () => js.Function0[Unit],
      func: () => Unit,
      instanceOf: () => js.Function0[Unit],
      node: () => js.Function0[Unit],
      number: () => Unit,
      `object`: () => Unit,
      objectOf: () => js.Function0[Unit],
      oneOf: () => js.Function0[Unit],
      oneOfType: () => js.Function0[Unit],
      shape: () => js.Function0[Unit],
      string: () => Unit,
      symbol: () => Unit
    ): Any = {
      val __obj = js.Dynamic.literal(any = js.Any.fromFunction0(any), array = js.Any.fromFunction0(array), arrayOf = js.Any.fromFunction0(arrayOf), bool = js.Any.fromFunction0(bool), checkPropTypes = js.Any.fromFunction0(checkPropTypes), element = js.Any.fromFunction0(element), func = js.Any.fromFunction0(func), instanceOf = js.Any.fromFunction0(instanceOf), node = js.Any.fromFunction0(node), number = js.Any.fromFunction0(number), objectOf = js.Any.fromFunction0(objectOf), oneOf = js.Any.fromFunction0(oneOf), oneOfType = js.Any.fromFunction0(oneOfType), shape = js.Any.fromFunction0(shape), string = js.Any.fromFunction0(string), symbol = js.Any.fromFunction0(symbol))
      __obj.updateDynamic("object")(js.Any.fromFunction0(`object`))
      __obj.asInstanceOf[Any]
    }
    
    extension [Self <: Any](x: Self) {
      
      inline def setAny(value: () => js.Function0[Unit]): Self = StObject.set(x, "any", js.Any.fromFunction0(value))
      
      inline def setArray(value: () => Unit): Self = StObject.set(x, "array", js.Any.fromFunction0(value))
      
      inline def setArrayOf(value: () => js.Function0[Unit]): Self = StObject.set(x, "arrayOf", js.Any.fromFunction0(value))
      
      inline def setBool(value: () => Unit): Self = StObject.set(x, "bool", js.Any.fromFunction0(value))
      
      inline def setCheckPropTypes(value: () => Null): Self = StObject.set(x, "checkPropTypes", js.Any.fromFunction0(value))
      
      inline def setElement(value: () => js.Function0[Unit]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      inline def setFunc(value: () => Unit): Self = StObject.set(x, "func", js.Any.fromFunction0(value))
      
      inline def setInstanceOf(value: () => js.Function0[Unit]): Self = StObject.set(x, "instanceOf", js.Any.fromFunction0(value))
      
      inline def setNode(value: () => js.Function0[Unit]): Self = StObject.set(x, "node", js.Any.fromFunction0(value))
      
      inline def setNumber(value: () => Unit): Self = StObject.set(x, "number", js.Any.fromFunction0(value))
      
      inline def setObject(value: () => Unit): Self = StObject.set(x, "object", js.Any.fromFunction0(value))
      
      inline def setObjectOf(value: () => js.Function0[Unit]): Self = StObject.set(x, "objectOf", js.Any.fromFunction0(value))
      
      inline def setOneOf(value: () => js.Function0[Unit]): Self = StObject.set(x, "oneOf", js.Any.fromFunction0(value))
      
      inline def setOneOfType(value: () => js.Function0[Unit]): Self = StObject.set(x, "oneOfType", js.Any.fromFunction0(value))
      
      inline def setShape(value: () => js.Function0[Unit]): Self = StObject.set(x, "shape", js.Any.fromFunction0(value))
      
      inline def setString(value: () => Unit): Self = StObject.set(x, "string", js.Any.fromFunction0(value))
      
      inline def setSymbol(value: () => Unit): Self = StObject.set(x, "symbol", js.Any.fromFunction0(value))
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[InfernoNode] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: InfernoNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait ComponentComparator extends StObject {
    
    var componentComparator: (js.Function2[/* lastVNode */ VNode, /* nextVNode */ VNode, Boolean]) | Null
    
    var createVNode: (js.Function1[/* vNode */ VNode, Unit]) | Null
    
    var reactStyles: js.UndefOr[Boolean] = js.undefined
    
    var renderComplete: (js.Function2[
        /* rootInput */ InfernoNode | VNode, 
        /* parentDOM */ Element | Node | HTMLElement | SVGAElement | ShadowRoot | DocumentFragment, 
        Unit
      ]) | Null
  }
  object ComponentComparator {
    
    inline def apply(): ComponentComparator = {
      val __obj = js.Dynamic.literal(componentComparator = null, createVNode = null, renderComplete = null)
      __obj.asInstanceOf[ComponentComparator]
    }
    
    extension [Self <: ComponentComparator](x: Self) {
      
      inline def setComponentComparator(value: (/* lastVNode */ VNode, /* nextVNode */ VNode) => Boolean): Self = StObject.set(x, "componentComparator", js.Any.fromFunction2(value))
      
      inline def setComponentComparatorNull: Self = StObject.set(x, "componentComparator", null)
      
      inline def setCreateVNode(value: /* vNode */ VNode => Unit): Self = StObject.set(x, "createVNode", js.Any.fromFunction1(value))
      
      inline def setCreateVNodeNull: Self = StObject.set(x, "createVNode", null)
      
      inline def setReactStyles(value: Boolean): Self = StObject.set(x, "reactStyles", value.asInstanceOf[js.Any])
      
      inline def setReactStylesUndefined: Self = StObject.set(x, "reactStyles", js.undefined)
      
      inline def setRenderComplete(
        value: (/* rootInput */ InfernoNode | VNode, /* parentDOM */ Element | Node | HTMLElement | SVGAElement | ShadowRoot | DocumentFragment) => Unit
      ): Self = StObject.set(x, "renderComplete", js.Any.fromFunction2(value))
      
      inline def setRenderCompleteNull: Self = StObject.set(x, "renderComplete", null)
    }
  }
  
  @js.native
  trait Count extends StObject {
    
    def count(children: js.Array[scala.Any]): Double = js.native
    
    def forEach(children: js.Array[scala.Any], fn: IterateChildrenFn): Unit = js.native
    def forEach(children: js.Array[scala.Any], fn: IterateChildrenFn, ctx: scala.Any): Unit = js.native
    
    def map(children: js.Array[scala.Any], fn: IterateChildrenFn, ctx: scala.Any): js.Array[scala.Any] = js.native
    
    def only(children: js.Array[scala.Any]): scala.Any = js.native
    
    def toArray(children: js.Array[scala.Any]): js.Array[scala.Any] = js.native
  }
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply[T](): RefObject[T] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(
      vNode: VNode,
      parentDOM: Null,
      context: js.Object,
      isSVG: Boolean,
      nextNode: Null,
      lifecycle: js.Array[js.Function],
      animations: AnimationQueues
    ): Unit = js.native
    def apply(
      vNode: VNode,
      parentDOM: Null,
      context: js.Object,
      isSVG: Boolean,
      nextNode: Element,
      lifecycle: js.Array[js.Function],
      animations: AnimationQueues
    ): Unit = js.native
    def apply(
      vNode: VNode,
      parentDOM: Element,
      context: js.Object,
      isSVG: Boolean,
      nextNode: Null,
      lifecycle: js.Array[js.Function],
      animations: AnimationQueues
    ): Unit = js.native
    def apply(
      vNode: VNode,
      parentDOM: Element,
      context: js.Object,
      isSVG: Boolean,
      nextNode: Element,
      lifecycle: js.Array[js.Function],
      animations: AnimationQueues
    ): Unit = js.native
  }
  
  @js.native
  trait FnCallChildrenChildFlagsKey extends StObject {
    
    def apply(children: scala.Any, childFlags: ChildFlags): VNode = js.native
    def apply(children: scala.Any, childFlags: ChildFlags, key: String): VNode = js.native
    def apply(children: scala.Any, childFlags: ChildFlags, key: Double): VNode = js.native
  }
  
  @js.native
  trait FnCallDataEvent extends StObject {
    
    def apply[T, E /* <: Event */](data: T, event: js.Function2[/* data */ T, /* event */ E, Unit]): (LinkedEvent[T, E]) | Null = js.native
  }
  
  @js.native
  trait FnCallFlagsTypeClassNameChildrenChildFlagsPropsKeyRef extends StObject {
    
    def apply[P](
      flags: VNodeFlags,
      `type`: String,
      className: js.UndefOr[String | Null],
      children: js.UndefOr[InfernoNode],
      childFlags: js.UndefOr[ChildFlags],
      props: js.UndefOr[P | Null],
      key: js.UndefOr[String | Double | Null],
      ref: js.UndefOr[Ref[Element] | Refs[P] | Null]
    ): VNode = js.native
  }
  
  @js.native
  trait FnCallFlagsTypePropsKeyRef extends StObject {
    
    def apply[P](
      flags: VNodeFlags,
      `type`: js.Function | ComponentClass[P] | (ForwardRef[P, scala.Any]),
      props: js.UndefOr[P | Null],
      key: js.UndefOr[Null | String | Double],
      ref: js.UndefOr[Ref[Element] | Refs[P] | Null]
    ): VNode = js.native
  }
  
  @js.native
  trait FnCallInputParentDOMCallback extends StObject {
    
    def apply(input: scala.Any, parentDOM: Element): Unit = js.native
    def apply(input: scala.Any, parentDOM: Element, callback: js.Function): Unit = js.native
  }
  
  @js.native
  trait FnCallObj extends StObject {
    
    def apply[P, S](obj: ComponentSpec[P, S]): ClassicComponentClass[P, S] = js.native
  }
  
  @js.native
  trait FnCallParentDOM extends StObject {
    
    def apply(): js.Function4[
        /* lastInput */ scala.Any, 
        /* nextInput */ scala.Any, 
        /* callback */ scala.Any, 
        /* context */ scala.Any, 
        Unit
      ] = js.native
    def apply(parentDOM: scala.Any): js.Function4[
        /* lastInput */ scala.Any, 
        /* nextInput */ scala.Any, 
        /* callback */ scala.Any, 
        /* context */ scala.Any, 
        Unit
      ] = js.native
  }
  
  @js.native
  trait FnCallRender extends StObject {
    
    def apply[T, P](
      render: js.Function2[/* props */ ReadonlychildrenInfernoNo & P, /* ref */ RefObject[T], InfernoNode]
    ): scala.Any = js.native
  }
  
  @js.native
  trait FnCallTextKey extends StObject {
    
    def apply(): VNode = js.native
    def apply(text: String): VNode = js.native
    def apply(text: String, key: String): VNode = js.native
    def apply(text: String, key: Double): VNode = js.native
    def apply(text: Boolean): VNode = js.native
    def apply(text: Boolean, key: String): VNode = js.native
    def apply(text: Boolean, key: Double): VNode = js.native
    def apply(text: Double): VNode = js.native
    def apply(text: Double, key: String): VNode = js.native
    def apply(text: Double, key: Double): VNode = js.native
    def apply(text: Null, key: String): VNode = js.native
    def apply(text: Null, key: Double): VNode = js.native
    def apply(text: Unit, key: String): VNode = js.native
    def apply(text: Unit, key: Double): VNode = js.native
  }
  
  @js.native
  trait FnCallTypePropsChildren extends StObject {
    
    def apply[P](`type`: String, props: P & Props[P], _children: scala.Any*): VNode = js.native
    def apply[P](`type`: String, props: Null, _children: scala.Any*): VNode = js.native
    def apply[P](`type`: String, props: Unit, _children: scala.Any*): VNode = js.native
    def apply[P](`type`: ComponentClass[P], props: P & Props[P], _children: scala.Any*): VNode = js.native
    def apply[P](`type`: ComponentClass[P], props: Null, _children: scala.Any*): VNode = js.native
    def apply[P](`type`: ComponentClass[P], props: Unit, _children: scala.Any*): VNode = js.native
    def apply[P](`type`: StatelessComponent[P], props: P & Props[P], _children: scala.Any*): VNode = js.native
    def apply[P](`type`: StatelessComponent[P], props: Null, _children: scala.Any*): VNode = js.native
    def apply[P](`type`: StatelessComponent[P], props: Unit, _children: scala.Any*): VNode = js.native
  }
  
  @js.native
  trait FnCallVNodeToClonePropsChildren extends StObject {
    
    def apply(vNodeToClone: VNode): VNode = js.native
    def apply(vNodeToClone: VNode, props: scala.Any): VNode = js.native
    def apply(vNodeToClone: VNode, props: scala.Any, _children: scala.Any): VNode = js.native
    def apply(vNodeToClone: VNode, props: Unit, _children: scala.Any): VNode = js.native
  }
  
  @js.native
  trait TypeofComponent
    extends StObject
       with Instantiable0[Component[js.Object, js.Object]] {
    
    var defaultProps: js.UndefOr[js.Object] = js.native
    
    var getDerivedStateFromProps: js.UndefOr[js.Function2[/* nextProps */ scala.Any, /* state */ scala.Any, scala.Any]] = js.native
  }
}
