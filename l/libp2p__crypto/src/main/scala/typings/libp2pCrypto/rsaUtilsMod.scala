package typings.libp2pCrypto

import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsaUtilsMod {
  
  @JSImport("@libp2p/crypto/dist/src/keys/rsa-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jwkToPkcs1(jwk: JsonWebKey): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("jwkToPkcs1")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def jwkToPkix(jwk: JsonWebKey): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("jwkToPkix")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def pkcs1ToJwk(bytes: js.typedarray.Uint8Array): JsonWebKey = ^.asInstanceOf[js.Dynamic].applyDynamic("pkcs1ToJwk")(bytes.asInstanceOf[js.Any]).asInstanceOf[JsonWebKey]
  
  inline def pkixToJwk(bytes: js.typedarray.Uint8Array): JsonWebKey = ^.asInstanceOf[js.Dynamic].applyDynamic("pkixToJwk")(bytes.asInstanceOf[js.Any]).asInstanceOf[JsonWebKey]
}
