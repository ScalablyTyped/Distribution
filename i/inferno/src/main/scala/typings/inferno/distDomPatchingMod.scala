package typings.inferno

import typings.inferno.distCoreTypesMod.VNode
import typings.inferno.distDomUtilsCommonMod.AnimationQueues
import typings.infernoVnodeFlags.mod.VNodeFlags
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomPatchingMod {
  
  @JSImport("inferno/dist/DOM/patching", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def patch(
    lastVNode: VNode,
    nextVNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Null,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(lastVNode.asInstanceOf[js.Any], nextVNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def patch(
    lastVNode: VNode,
    nextVNode: VNode,
    parentDOM: Element,
    context: js.Object,
    isSVG: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(lastVNode.asInstanceOf[js.Any], nextVNode.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def patchElement(
    lastVNode: VNode,
    nextVNode: VNode,
    context: js.Object,
    isSVG: Boolean,
    nextFlags: VNodeFlags,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("patchElement")(lastVNode.asInstanceOf[js.Any], nextVNode.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], nextFlags.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def patchSingleTextChild(lastChildren: Any, nextChildren: Any, parentDOM: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("patchSingleTextChild")(lastChildren.asInstanceOf[js.Any], nextChildren.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateClassComponent(
    instance: Any,
    nextState: Any,
    nextProps: Any,
    parentDOM: Element,
    context: Any,
    isSVG: Boolean,
    force: Boolean,
    nextNode: Null,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateClassComponent")(instance.asInstanceOf[js.Any], nextState.asInstanceOf[js.Any], nextProps.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], force.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateClassComponent(
    instance: Any,
    nextState: Any,
    nextProps: Any,
    parentDOM: Element,
    context: Any,
    isSVG: Boolean,
    force: Boolean,
    nextNode: Element,
    lifecycle: js.Array[js.Function],
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateClassComponent")(instance.asInstanceOf[js.Any], nextState.asInstanceOf[js.Any], nextProps.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], force.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
