package typings.lruMemoizer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFreezeMod {
  
  @JSImport("lru-memoizer/lib/freeze", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deepFreeze(o: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deepFreeze")(o.asInstanceOf[js.Any]).asInstanceOf[Any]
}
