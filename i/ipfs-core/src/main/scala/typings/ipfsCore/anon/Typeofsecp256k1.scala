package typings.ipfsCore.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.libp2pCrypto.mod.keys.supportedKeys.secp256k1.Secp256k1PrivateKey
import typings.libp2pCrypto.mod.keys.supportedKeys.secp256k1.Secp256k1PublicKey
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsecp256k1 extends js.Object {
  
  var Secp256k1PrivateKey: Instantiable2[
    /* key */ Uint8Array, 
    /* publicKey */ Uint8Array, 
    typings.libp2pCrypto.mod.keys.supportedKeys.secp256k1.Secp256k1PrivateKey
  ] = js.native
  
  var Secp256k1PublicKey: Instantiable1[
    /* key */ Uint8Array, 
    typings.libp2pCrypto.mod.keys.supportedKeys.secp256k1.Secp256k1PublicKey
  ] = js.native
  
  def generateKeyPair(): js.Promise[Secp256k1PrivateKey] = js.native
  
  def unmarshalSecp256k1PrivateKey(bytes: Uint8Array): js.Promise[Secp256k1PrivateKey] = js.native
  
  def unmarshalSecp256k1PublicKey(bytes: Uint8Array): Secp256k1PublicKey = js.native
}
object Typeofsecp256k1 {
  
  @scala.inline
  def apply(
    Secp256k1PrivateKey: Instantiable2[/* key */ Uint8Array, /* publicKey */ Uint8Array, Secp256k1PrivateKey],
    Secp256k1PublicKey: Instantiable1[/* key */ Uint8Array, Secp256k1PublicKey],
    generateKeyPair: () => js.Promise[Secp256k1PrivateKey],
    unmarshalSecp256k1PrivateKey: Uint8Array => js.Promise[Secp256k1PrivateKey],
    unmarshalSecp256k1PublicKey: Uint8Array => Secp256k1PublicKey
  ): Typeofsecp256k1 = {
    val __obj = js.Dynamic.literal(Secp256k1PrivateKey = Secp256k1PrivateKey.asInstanceOf[js.Any], Secp256k1PublicKey = Secp256k1PublicKey.asInstanceOf[js.Any], generateKeyPair = js.Any.fromFunction0(generateKeyPair), unmarshalSecp256k1PrivateKey = js.Any.fromFunction1(unmarshalSecp256k1PrivateKey), unmarshalSecp256k1PublicKey = js.Any.fromFunction1(unmarshalSecp256k1PublicKey))
    __obj.asInstanceOf[Typeofsecp256k1]
  }
  
  @scala.inline
  implicit class Typeofsecp256k1Ops[Self <: Typeofsecp256k1] (val x: Self) extends AnyVal {
    
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
    def setSecp256k1PrivateKey(value: Instantiable2[/* key */ Uint8Array, /* publicKey */ Uint8Array, Secp256k1PrivateKey]): Self = this.set("Secp256k1PrivateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecp256k1PublicKey(value: Instantiable1[/* key */ Uint8Array, Secp256k1PublicKey]): Self = this.set("Secp256k1PublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateKeyPair(value: () => js.Promise[Secp256k1PrivateKey]): Self = this.set("generateKeyPair", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnmarshalSecp256k1PrivateKey(value: Uint8Array => js.Promise[Secp256k1PrivateKey]): Self = this.set("unmarshalSecp256k1PrivateKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnmarshalSecp256k1PublicKey(value: Uint8Array => Secp256k1PublicKey): Self = this.set("unmarshalSecp256k1PublicKey", js.Any.fromFunction1(value))
  }
}
