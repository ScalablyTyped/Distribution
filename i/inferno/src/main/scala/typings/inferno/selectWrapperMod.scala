package typings.inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectWrapperMod {
  
  @JSImport("inferno/dist/DOM/wrappers/SelectWrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyValueSelect(nextPropsOrEmpty: Any, dom: Any, mounting: Boolean, vNode: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyValueSelect")(nextPropsOrEmpty.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], mounting.asInstanceOf[js.Any], vNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def selectEvents(dom: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectEvents")(dom.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
