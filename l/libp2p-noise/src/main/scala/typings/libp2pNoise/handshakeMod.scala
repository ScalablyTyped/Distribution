package typings.libp2pNoise

import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.basicMod.bytes32
import typings.libp2pNoise.basicMod.uint32
import typings.libp2pNoise.basicMod.uint64
import typings.libp2pNoise.libp2pMod.KeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handshakeMod {
  
  trait CipherState extends StObject {
    
    var k: bytes32
    
    var n: uint32
  }
  object CipherState {
    
    inline def apply(k: bytes32, n: uint32): CipherState = {
      val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[CipherState]
    }
    
    extension [Self <: CipherState](x: Self) {
      
      inline def setK(value: bytes32): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setN(value: uint32): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    }
  }
  
  trait HandshakeState extends StObject {
    
    var e: js.UndefOr[KeyPair] = js.undefined
    
    var psk: bytes32
    
    var re: bytes32
    
    var rs: bytes32
    
    var s: KeyPair
    
    var ss: SymmetricState
  }
  object HandshakeState {
    
    inline def apply(psk: bytes32, re: bytes32, rs: bytes32, s: KeyPair, ss: SymmetricState): HandshakeState = {
      val __obj = js.Dynamic.literal(psk = psk.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any], rs = rs.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandshakeState]
    }
    
    extension [Self <: HandshakeState](x: Self) {
      
      inline def setE(value: KeyPair): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setPsk(value: bytes32): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
      
      inline def setRe(value: bytes32): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
      
      inline def setRs(value: bytes32): Self = StObject.set(x, "rs", value.asInstanceOf[js.Any])
      
      inline def setS(value: KeyPair): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSs(value: SymmetricState): Self = StObject.set(x, "ss", value.asInstanceOf[js.Any])
    }
  }
  
  type Hkdf = js.Tuple3[bytes, bytes, bytes]
  
  trait INoisePayload extends StObject {
    
    var data: bytes
    
    var identityKey: bytes
    
    var identitySig: bytes
  }
  object INoisePayload {
    
    inline def apply(data: bytes, identityKey: bytes, identitySig: bytes): INoisePayload = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], identityKey = identityKey.asInstanceOf[js.Any], identitySig = identitySig.asInstanceOf[js.Any])
      __obj.asInstanceOf[INoisePayload]
    }
    
    extension [Self <: INoisePayload](x: Self) {
      
      inline def setData(value: bytes): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIdentityKey(value: bytes): Self = StObject.set(x, "identityKey", value.asInstanceOf[js.Any])
      
      inline def setIdentitySig(value: bytes): Self = StObject.set(x, "identitySig", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageBuffer extends StObject {
    
    var ciphertext: bytes
    
    @JSName("ne")
    var ne_FMessageBuffer: bytes32
    
    var ns: bytes
  }
  object MessageBuffer {
    
    inline def apply(ciphertext: bytes, ne_ : bytes32, ns: bytes): MessageBuffer = {
      val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any])
      __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageBuffer]
    }
    
    extension [Self <: MessageBuffer](x: Self) {
      
      inline def setCiphertext(value: bytes): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      inline def setNe_(value: bytes32): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
      
      inline def setNs(value: bytes): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    }
  }
  
  trait NoiseSession extends StObject {
    
    var cs1: js.UndefOr[CipherState] = js.undefined
    
    var cs2: js.UndefOr[CipherState] = js.undefined
    
    var h: js.UndefOr[bytes32] = js.undefined
    
    var hs: HandshakeState
    
    var i: Boolean
    
    var mc: uint64
  }
  object NoiseSession {
    
    inline def apply(hs: HandshakeState, i: Boolean, mc: uint64): NoiseSession = {
      val __obj = js.Dynamic.literal(hs = hs.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], mc = mc.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoiseSession]
    }
    
    extension [Self <: NoiseSession](x: Self) {
      
      inline def setCs1(value: CipherState): Self = StObject.set(x, "cs1", value.asInstanceOf[js.Any])
      
      inline def setCs1Undefined: Self = StObject.set(x, "cs1", js.undefined)
      
      inline def setCs2(value: CipherState): Self = StObject.set(x, "cs2", value.asInstanceOf[js.Any])
      
      inline def setCs2Undefined: Self = StObject.set(x, "cs2", js.undefined)
      
      inline def setH(value: bytes32): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setHs(value: HandshakeState): Self = StObject.set(x, "hs", value.asInstanceOf[js.Any])
      
      inline def setI(value: Boolean): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setMc(value: uint64): Self = StObject.set(x, "mc", value.asInstanceOf[js.Any])
    }
  }
  
  trait SymmetricState extends StObject {
    
    var ck: bytes32
    
    var cs: CipherState
    
    // chaining key
    var h: bytes32
  }
  object SymmetricState {
    
    inline def apply(ck: bytes32, cs: CipherState, h: bytes32): SymmetricState = {
      val __obj = js.Dynamic.literal(ck = ck.asInstanceOf[js.Any], cs = cs.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any])
      __obj.asInstanceOf[SymmetricState]
    }
    
    extension [Self <: SymmetricState](x: Self) {
      
      inline def setCk(value: bytes32): Self = StObject.set(x, "ck", value.asInstanceOf[js.Any])
      
      inline def setCs(value: CipherState): Self = StObject.set(x, "cs", value.asInstanceOf[js.Any])
      
      inline def setH(value: bytes32): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    }
  }
}
