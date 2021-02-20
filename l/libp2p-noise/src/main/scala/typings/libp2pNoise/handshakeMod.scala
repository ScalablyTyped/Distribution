package typings.libp2pNoise

import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.basicMod.bytes32
import typings.libp2pNoise.basicMod.uint32
import typings.libp2pNoise.basicMod.uint64
import typings.libp2pNoise.libp2pMod.KeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handshakeMod {
  
  @js.native
  trait CipherState extends StObject {
    
    var k: bytes32 = js.native
    
    var n: uint32 = js.native
  }
  object CipherState {
    
    @scala.inline
    def apply(k: bytes32, n: uint32): CipherState = {
      val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[CipherState]
    }
    
    @scala.inline
    implicit class CipherStateMutableBuilder[Self <: CipherState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setK(value: bytes32): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: uint32): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HandshakeState extends StObject {
    
    var e: js.UndefOr[KeyPair] = js.native
    
    var psk: bytes32 = js.native
    
    var re: bytes32 = js.native
    
    var rs: bytes32 = js.native
    
    var s: KeyPair = js.native
    
    var ss: SymmetricState = js.native
  }
  object HandshakeState {
    
    @scala.inline
    def apply(psk: bytes32, re: bytes32, rs: bytes32, s: KeyPair, ss: SymmetricState): HandshakeState = {
      val __obj = js.Dynamic.literal(psk = psk.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any], rs = rs.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandshakeState]
    }
    
    @scala.inline
    implicit class HandshakeStateMutableBuilder[Self <: HandshakeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setE(value: KeyPair): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      @scala.inline
      def setPsk(value: bytes32): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRe(value: bytes32): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRs(value: bytes32): Self = StObject.set(x, "rs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: KeyPair): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSs(value: SymmetricState): Self = StObject.set(x, "ss", value.asInstanceOf[js.Any])
    }
  }
  
  type Hkdf = js.Tuple3[bytes, bytes, bytes]
  
  @js.native
  trait INoisePayload extends StObject {
    
    var data: bytes = js.native
    
    var identityKey: bytes = js.native
    
    var identitySig: bytes = js.native
  }
  object INoisePayload {
    
    @scala.inline
    def apply(data: bytes, identityKey: bytes, identitySig: bytes): INoisePayload = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], identityKey = identityKey.asInstanceOf[js.Any], identitySig = identitySig.asInstanceOf[js.Any])
      __obj.asInstanceOf[INoisePayload]
    }
    
    @scala.inline
    implicit class INoisePayloadMutableBuilder[Self <: INoisePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: bytes): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityKey(value: bytes): Self = StObject.set(x, "identityKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentitySig(value: bytes): Self = StObject.set(x, "identitySig", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MessageBuffer extends StObject {
    
    var ciphertext: bytes = js.native
    
    @JSName("ne")
    var ne_FMessageBuffer: bytes32 = js.native
    
    var ns: bytes = js.native
  }
  object MessageBuffer {
    
    @scala.inline
    def apply(ciphertext: bytes, ne_ : bytes32, ns: bytes): MessageBuffer = {
      val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any])
      __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageBuffer]
    }
    
    @scala.inline
    implicit class MessageBufferMutableBuilder[Self <: MessageBuffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCiphertext(value: bytes): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNe_(value: bytes32): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNs(value: bytes): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NoiseSession extends StObject {
    
    var cs1: js.UndefOr[CipherState] = js.native
    
    var cs2: js.UndefOr[CipherState] = js.native
    
    var h: js.UndefOr[bytes32] = js.native
    
    var hs: HandshakeState = js.native
    
    var i: Boolean = js.native
    
    var mc: uint64 = js.native
  }
  object NoiseSession {
    
    @scala.inline
    def apply(hs: HandshakeState, i: Boolean, mc: uint64): NoiseSession = {
      val __obj = js.Dynamic.literal(hs = hs.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], mc = mc.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoiseSession]
    }
    
    @scala.inline
    implicit class NoiseSessionMutableBuilder[Self <: NoiseSession] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCs1(value: CipherState): Self = StObject.set(x, "cs1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCs1Undefined: Self = StObject.set(x, "cs1", js.undefined)
      
      @scala.inline
      def setCs2(value: CipherState): Self = StObject.set(x, "cs2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCs2Undefined: Self = StObject.set(x, "cs2", js.undefined)
      
      @scala.inline
      def setH(value: bytes32): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      @scala.inline
      def setHs(value: HandshakeState): Self = StObject.set(x, "hs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI(value: Boolean): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMc(value: uint64): Self = StObject.set(x, "mc", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SymmetricState extends StObject {
    
    var ck: bytes32 = js.native
    
    var cs: CipherState = js.native
    
    // chaining key
    var h: bytes32 = js.native
  }
  object SymmetricState {
    
    @scala.inline
    def apply(ck: bytes32, cs: CipherState, h: bytes32): SymmetricState = {
      val __obj = js.Dynamic.literal(ck = ck.asInstanceOf[js.Any], cs = cs.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any])
      __obj.asInstanceOf[SymmetricState]
    }
    
    @scala.inline
    implicit class SymmetricStateMutableBuilder[Self <: SymmetricState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCk(value: bytes32): Self = StObject.set(x, "ck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCs(value: CipherState): Self = StObject.set(x, "cs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH(value: bytes32): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    }
  }
}
