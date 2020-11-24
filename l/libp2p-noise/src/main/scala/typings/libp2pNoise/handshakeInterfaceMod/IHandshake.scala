package typings.libp2pNoise.handshakeInterfaceMod

import typings.libp2pNoise.anon.Plaintext
import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.handshakeMod.NoiseSession
import typings.node.Buffer
import typings.peerId.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHandshake extends js.Object {
  
  def decrypt(ciphertext: bytes, session: NoiseSession): Plaintext = js.native
  
  def encrypt(plaintext: bytes, session: NoiseSession): bytes = js.native
  
  var remoteEarlyData: Buffer = js.native
  
  var remotePeer: ^ = js.native
  
  var session: NoiseSession = js.native
}
object IHandshake {
  
  @scala.inline
  def apply(
    decrypt: (bytes, NoiseSession) => Plaintext,
    encrypt: (bytes, NoiseSession) => bytes,
    remoteEarlyData: Buffer,
    remotePeer: ^,
    session: NoiseSession
  ): IHandshake = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction2(decrypt), encrypt = js.Any.fromFunction2(encrypt), remoteEarlyData = remoteEarlyData.asInstanceOf[js.Any], remotePeer = remotePeer.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHandshake]
  }
  
  @scala.inline
  implicit class IHandshakeOps[Self <: IHandshake] (val x: Self) extends AnyVal {
    
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
    def setDecrypt(value: (bytes, NoiseSession) => Plaintext): Self = this.set("decrypt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEncrypt(value: (bytes, NoiseSession) => bytes): Self = this.set("encrypt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoteEarlyData(value: Buffer): Self = this.set("remoteEarlyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotePeer(value: ^): Self = this.set("remotePeer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NoiseSession): Self = this.set("session", value.asInstanceOf[js.Any])
  }
}
