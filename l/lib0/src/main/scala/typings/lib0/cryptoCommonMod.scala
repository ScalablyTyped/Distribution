package typings.lib0

import typings.std.CryptoKey
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoCommonMod {
  
  @JSImport("lib0/crypto/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exportKey(key: CryptoKey): js.Promise[JsonWebKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JsonWebKey]]
}
