package typings.inferno

import typings.inferno.typesMod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentUtilMod {
  
  @JSImport("inferno/dist/DOM/utils/componentUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClassComponentInstance(
    vNode: VNode,
    Component: Any,
    props: Any,
    context: js.Object,
    isSVG: Boolean,
    lifecycle: js.Array[js.Function]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createClassComponentInstance")(vNode.asInstanceOf[js.Any], Component.asInstanceOf[js.Any], props.asInstanceOf[js.Any], context.asInstanceOf[js.Any], isSVG.asInstanceOf[js.Any], lifecycle.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def renderFunctionalComponent(vNode: VNode, context: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFunctionalComponent")(vNode.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def renderNewInput(instance: Any, props: Any, context: Any): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("renderNewInput")(instance.asInstanceOf[js.Any], props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[VNode]
}
