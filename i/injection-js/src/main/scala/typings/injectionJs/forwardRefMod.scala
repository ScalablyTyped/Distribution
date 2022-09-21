package typings.injectionJs

import typings.injectionJs.typeMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forwardRefMod {
  
  @JSImport("injection-js/forward_ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forwardRef(forwardRefFn: ForwardRefFn): Type[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(forwardRefFn.asInstanceOf[js.Any]).asInstanceOf[Type[Any]]
  
  inline def resolveForwardRef(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveForwardRef")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  type ForwardRefFn = js.Function0[Any]
}
