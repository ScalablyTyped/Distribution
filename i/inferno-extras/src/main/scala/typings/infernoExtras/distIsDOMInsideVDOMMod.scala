package typings.infernoExtras

import typings.inferno.distCoreTypesMod.VNode
import typings.inferno.mod.Component
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIsDOMInsideVDOMMod {
  
  @JSImport("inferno-extras/dist/isDOMInsideVDOM", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDOMInsideComponent(DOM: Element, instance: Component[Any, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDOMInsideComponent")(DOM.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isDOMInsideVNode(DOM: Element, vNode: VNode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDOMInsideVNode")(DOM.asInstanceOf[js.Any], vNode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
