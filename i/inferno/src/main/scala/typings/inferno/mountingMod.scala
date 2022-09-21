package typings.inferno

import typings.inferno.commonMod.AnimationQueues
import typings.inferno.typesMod.VNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mountingMod {
  
  @JSImport("inferno/dist/DOM/mounting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mount(
    vNode: VNode,
    parentDOM: Null,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mount(
    vNode: VNode,
    parentDOM: Null,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mount(
    vNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mount(
    vNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mountArrayChildren(
    children: Any,
    dom: Null,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountArrayChildren")(children.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mountArrayChildren(
    children: Any,
    dom: Null,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountArrayChildren")(children.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mountArrayChildren(
    children: Any,
    dom: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountArrayChildren")(children.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mountArrayChildren(
    children: Any,
    dom: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountArrayChildren")(children.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mountClassComponent(
    vNode: VNode,
    parentDOM: Null,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountClassComponent")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mountClassComponent(
    vNode: VNode,
    parentDOM: Null,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountClassComponent")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mountClassComponent(
    vNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountClassComponent")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mountClassComponent(
    vNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountClassComponent")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mountClassComponentCallbacks(ref: Any, instance: Any, lifecycle: js.Array[js.Function], animations: AnimationQueues): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountClassComponentCallbacks")(ref.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mountElement(
    vNode: VNode,
    parentDOM: Null,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountElement")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mountElement(
    vNode: VNode,
    parentDOM: Null,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountElement")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mountElement(
    vNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountElement")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mountElement(
    vNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountElement")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mountFunctionalComponent(
    vNode: VNode,
    parentDOM: Null,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: Any,
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountFunctionalComponent")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mountFunctionalComponent(
    vNode: VNode,
    parentDOM: Null,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: Any,
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountFunctionalComponent")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mountFunctionalComponent(
    vNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: Any,
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountFunctionalComponent")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mountFunctionalComponent(
    vNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: Any,
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountFunctionalComponent")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mountFunctionalComponentCallbacks(vNode: VNode, lifecycle: js.Array[js.Function], animations: AnimationQueues): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountFunctionalComponentCallbacks")(vNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mountText(vNode: VNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mountText")(vNode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mountText(vNode: VNode, parentDOM: Null, nextNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountText")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mountText(vNode: VNode, parentDOM: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountText")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mountText(vNode: VNode, parentDOM: Element, nextNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountText")(vNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
