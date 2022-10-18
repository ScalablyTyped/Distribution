package typings.libp2p

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeychainUtilMod {
  
  @JSImport("libp2p/dist/src/keychain/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def certificateForKey(
    key: Any,
    privateKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify forge.pki.rsa.PrivateKey */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("certificateForKey")(key.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def findAsync[T](array: js.Array[T], asyncCompare: js.Function1[/* val */ T, js.Promise[Any]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAsync")(array.asInstanceOf[js.Any], asyncCompare.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
