package typings.ipfsCore.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.libp2pCrypto.mod.keys.supportedKeys.rsa.RsaPrivateKey
import typings.libp2pCrypto.mod.keys.supportedKeys.rsa.RsaPublicKey
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofrsa extends js.Object {
  
  var RsaPrivateKey: Instantiable2[
    /* key */ js.Any, 
    /* publicKey */ Uint8Array, 
    typings.libp2pCrypto.mod.keys.supportedKeys.rsa.RsaPrivateKey
  ] = js.native
  
  var RsaPublicKey: Instantiable1[/* key */ Uint8Array, typings.libp2pCrypto.mod.keys.supportedKeys.rsa.RsaPublicKey] = js.native
  
  def fromJwk(jwk: Uint8Array): js.Promise[RsaPrivateKey] = js.native
  
  def generateKeyPair(bits: Double): js.Promise[RsaPrivateKey] = js.native
  
  def unmarshalRsaPrivateKey(buf: Uint8Array): js.Promise[RsaPrivateKey] = js.native
  
  def unmarshalRsaPublicKey(buf: Uint8Array): RsaPublicKey = js.native
}
object Typeofrsa {
  
  @scala.inline
  def apply(
    RsaPrivateKey: Instantiable2[/* key */ js.Any, /* publicKey */ Uint8Array, RsaPrivateKey],
    RsaPublicKey: Instantiable1[/* key */ Uint8Array, RsaPublicKey],
    fromJwk: Uint8Array => js.Promise[RsaPrivateKey],
    generateKeyPair: Double => js.Promise[RsaPrivateKey],
    unmarshalRsaPrivateKey: Uint8Array => js.Promise[RsaPrivateKey],
    unmarshalRsaPublicKey: Uint8Array => RsaPublicKey
  ): Typeofrsa = {
    val __obj = js.Dynamic.literal(RsaPrivateKey = RsaPrivateKey.asInstanceOf[js.Any], RsaPublicKey = RsaPublicKey.asInstanceOf[js.Any], fromJwk = js.Any.fromFunction1(fromJwk), generateKeyPair = js.Any.fromFunction1(generateKeyPair), unmarshalRsaPrivateKey = js.Any.fromFunction1(unmarshalRsaPrivateKey), unmarshalRsaPublicKey = js.Any.fromFunction1(unmarshalRsaPublicKey))
    __obj.asInstanceOf[Typeofrsa]
  }
  
  @scala.inline
  implicit class TypeofrsaOps[Self <: Typeofrsa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRsaPrivateKey(value: Instantiable2[/* key */ js.Any, /* publicKey */ Uint8Array, RsaPrivateKey]): Self = this.set("RsaPrivateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsaPublicKey(value: Instantiable1[/* key */ Uint8Array, RsaPublicKey]): Self = this.set("RsaPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromJwk(value: Uint8Array => js.Promise[RsaPrivateKey]): Self = this.set("fromJwk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGenerateKeyPair(value: Double => js.Promise[RsaPrivateKey]): Self = this.set("generateKeyPair", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnmarshalRsaPrivateKey(value: Uint8Array => js.Promise[RsaPrivateKey]): Self = this.set("unmarshalRsaPrivateKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnmarshalRsaPublicKey(value: Uint8Array => RsaPublicKey): Self = this.set("unmarshalRsaPublicKey", js.Any.fromFunction1(value))
  }
}
