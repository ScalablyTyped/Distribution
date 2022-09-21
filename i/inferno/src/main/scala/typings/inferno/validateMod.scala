package typings.inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateMod {
  
  @JSImport("inferno/dist/core/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def throwIfObjectIsNotVNode(input: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfObjectIsNotVNode")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateKeys(vNode: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateKeys")(vNode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateVNodeElementChildren(vNode: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateVNodeElementChildren")(vNode.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
