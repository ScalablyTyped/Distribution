package typings.ipfsCoreUtils

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWithTimeoutOptionMod {
  
  @JSImport("ipfs-core-utils/dist/src/with-timeout-option", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withTimeoutOption[Args /* <: js.Array[Any] */, R /* <: js.Promise[Any] | AsyncIterable[Any] */](fn: js.Function1[/* args */ Args, R]): js.Function1[/* args */ Args, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTimeoutOption")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, R]]
  inline def withTimeoutOption[Args /* <: js.Array[Any] */, R /* <: js.Promise[Any] | AsyncIterable[Any] */](fn: js.Function1[/* args */ Args, R], optionsArgIndex: Double): js.Function1[/* args */ Args, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTimeoutOption")(fn.asInstanceOf[js.Any], optionsArgIndex.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Args, R]]
}
