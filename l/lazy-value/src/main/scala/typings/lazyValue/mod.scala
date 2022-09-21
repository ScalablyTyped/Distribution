package typings.lazyValue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lazy-value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.Function0[Any] */](function_ : T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(function_.asInstanceOf[js.Any]).asInstanceOf[T]
}
