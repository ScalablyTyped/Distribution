package typings.inferno

import typings.inferno.anon.Children
import typings.inferno.typesMod.Inferno.ExoticComponent
import typings.inferno.typesMod.Inferno.InfernoNode
import typings.inferno.typesMod.VNode
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import typings.std.SVGAElement
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("inferno/dist/DOM/utils/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("inferno/dist/DOM/utils/common", "AnimationQueues")
  @js.native
  open class AnimationQueues () extends StObject {
    
    var componentDidAppear: js.Array[js.Function] = js.native
    
    var componentWillDisappear: js.Array[js.Function] = js.native
    
    var componentWillMove: js.Array[MoveQueueItem] = js.native
  }
  
  @JSImport("inferno/dist/DOM/utils/common", "Fragment")
  @js.native
  val Fragment: ExoticComponent[Children] = js.native
  
  inline def appendChild(parentDOM: Any, dom: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendChild")(parentDOM.asInstanceOf[js.Any], dom.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def callAll(arrayFn: js.Array[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callAll")(arrayFn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def callAllAnimationHooks(animationQueue: js.Array[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callAllAnimationHooks")(animationQueue.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def callAllAnimationHooks(animationQueue: js.Array[js.Function], callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callAllAnimationHooks")(animationQueue.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def callAllMoveAnimationHooks(animationQueue: js.Array[MoveQueueItem]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callAllMoveAnimationHooks")(animationQueue.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearVNodeDOM(vNode: VNode, parentDOM: Element, deferredRemoval: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearVNodeDOM")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], deferredRemoval.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createDerivedState(instance: Any, nextProps: Any, state: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDerivedState")(instance.asInstanceOf[js.Any], nextProps.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def documentCreateElement(tag: Any, isSVG: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("documentCreateElement")(tag.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def findDOMFromVNode(vNode: VNode, startEdge: Boolean): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findDOMFromVNode")(vNode.asInstanceOf[js.Any], startEdge.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  inline def getComponentName(instance: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponentName")(instance.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def insertOrAppend(parentDOM: Element, newNode: Any, nextNode: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertOrAppend")(parentDOM.asInstanceOf[js.Any], newNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isLastValueSameLinkEvent(lastValue: Any, nextValue: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLastValueSameLinkEvent")(lastValue.asInstanceOf[js.Any], nextValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def mergeUnsetProperties(to: Any, from: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeUnsetProperties")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def moveVNodeDOM(parentVNode: Any, vNode: Any, parentDOM: Any, nextNode: Any, animations: AnimationQueues): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveVNodeDOM")(parentVNode.asInstanceOf[js.Any], vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def normalizeEventName(name: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEventName")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  object options {
    
    @JSImport("inferno/dist/DOM/utils/common", "options")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inferno/dist/DOM/utils/common", "options.componentComparator")
    @js.native
    def componentComparator: (js.Function2[/* lastVNode */ VNode, /* nextVNode */ VNode, Boolean]) | Null = js.native
    inline def componentComparator_=(x: (js.Function2[/* lastVNode */ VNode, /* nextVNode */ VNode, Boolean]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentComparator")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno/dist/DOM/utils/common", "options.createVNode")
    @js.native
    def createVNode: (js.Function1[/* vNode */ VNode, Unit]) | Null = js.native
    inline def createVNode_=(x: (js.Function1[/* vNode */ VNode, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createVNode")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno/dist/DOM/utils/common", "options.reactStyles")
    @js.native
    def reactStyles: js.UndefOr[Boolean] = js.native
    inline def reactStyles_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reactStyles")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno/dist/DOM/utils/common", "options.renderComplete")
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
  
  inline def removeChild(parentDOM: Element, childNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeChild")(parentDOM.asInstanceOf[js.Any], childNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeVNodeDOM(vNode: VNode, parentDOM: Element, animations: AnimationQueues): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeVNodeDOM")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object renderCheck {
    
    @JSImport("inferno/dist/DOM/utils/common", "renderCheck")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inferno/dist/DOM/utils/common", "renderCheck.v")
    @js.native
    def v: Boolean = js.native
    inline def v_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v")(x.asInstanceOf[js.Any])
  }
  
  inline def replaceChild(parentDOM: Element, newDom: Any, lastDom: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceChild")(parentDOM.asInstanceOf[js.Any], newDom.asInstanceOf[js.Any], lastDom.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def safeCall1(method: js.Function, arg1: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("safeCall1")(method.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def safeCall1(method: Null, arg1: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("safeCall1")(method.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def safeCall1(method: Unit, arg1: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("safeCall1")(method.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setTextContent(dom: Element, children: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTextContent")(dom.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait MoveQueueItem extends StObject {
    
    var dom: Element
    
    var fn: js.Function
    
    var next: Element
    
    var parent: Element
  }
  object MoveQueueItem {
    
    inline def apply(dom: Element, fn: js.Function, next: Element, parent: Element): MoveQueueItem = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveQueueItem]
    }
    
    extension [Self <: MoveQueueItem](x: Self) {
      
      inline def setDom(value: Element): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setFn(value: js.Function): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setNext(value: Element): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Element): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
}
