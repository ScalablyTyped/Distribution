package typings.libp2pKeychain

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilMod {
  
  @JSImport("@libp2p/keychain/dist/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findAsync[T](array: js.Array[T], asyncCompare: js.Function1[/* val */ T, js.Promise[Any]]): js.Promise[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAsync")(array.asInstanceOf[js.Any], asyncCompare.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[T]]]
}
