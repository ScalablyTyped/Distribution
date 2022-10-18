package typings.inferno

import typings.inferno.distCoreTypesMod.VNode
import typings.inferno.distDomUtilsCommonMod.AnimationQueues
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomPropsMod {
  
  @JSImport("inferno/dist/DOM/props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mountProps(vNode: Any, flags: Any, props: Any, dom: Any, isSVG: Any, animations: AnimationQueues): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mountProps")(vNode.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], props.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def patchEvent(name: String, lastValue: Any, nextValue: Any, dom: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("patchEvent")(name.asInstanceOf[js.Any], lastValue.asInstanceOf[js.Any], nextValue.asInstanceOf[js.Any], dom.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def patchProp(
    prop: Any,
    lastValue: Any,
    nextValue: Any,
    dom: Element,
    isSVG: Boolean,
    hasControlledValue: Boolean,
    lastVNode: Null,
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("patchProp")(prop.asInstanceOf[js.Any], lastValue.asInstanceOf[js.Any], nextValue.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], hasControlledValue.asInstanceOf[js.Any], lastVNode.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def patchProp(
    prop: Any,
    lastValue: Any,
    nextValue: Any,
    dom: Element,
    isSVG: Boolean,
    hasControlledValue: Boolean,
    lastVNode: VNode,
    animations: AnimationQueues
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("patchProp")(prop.asInstanceOf[js.Any], lastValue.asInstanceOf[js.Any], nextValue.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], hasControlledValue.asInstanceOf[js.Any], lastVNode.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
