package typings.libp2pInterfacePeerId

import typings.libp2pInterfacePeerId.libp2pInterfacePeerIdStrings.Ed25519
import typings.libp2pInterfacePeerId.libp2pInterfacePeerIdStrings.RSA
import typings.libp2pInterfacePeerId.libp2pInterfacePeerIdStrings.secp256k1
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashDigest
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/interface-peer-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPeerId(other: Any): /* is @libp2p/interface-peer-id.@libp2p/interface-peer-id.PeerId */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPeerId")(other.asInstanceOf[js.Any]).asInstanceOf[/* is @libp2p/interface-peer-id.@libp2p/interface-peer-id.PeerId */ Boolean]
  
  @JSImport("@libp2p/interface-peer-id", "symbol")
  @js.native
  val symbol: js.Symbol = js.native
  
  @js.native
  trait BasePeerId extends StObject {
    
    def equals(other: String): Boolean = js.native
    def equals(other: js.typedarray.Uint8Array): Boolean = js.native
    def equals(other: PeerId): Boolean = js.native
    
    val multihash: MultihashDigest[Double] = js.native
    
    val privateKey: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    val publicKey: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    def toBytes(): js.typedarray.Uint8Array = js.native
    
    def toCID(): CID[Any, Double, Double, Version] = js.native
    
    val `type`: PeerIdType = js.native
  }
  
  @js.native
  trait Ed25519PeerId
    extends StObject
       with BasePeerId
       with PeerId {
    
    @JSName("publicKey")
    val publicKey_Ed25519PeerId: js.typedarray.Uint8Array = js.native
    
    @JSName("type")
    val type_Ed25519PeerId: Ed25519 = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.libp2pInterfacePeerId.mod.RSAPeerId
    - typings.libp2pInterfacePeerId.mod.Ed25519PeerId
    - typings.libp2pInterfacePeerId.mod.Secp256k1PeerId
  */
  trait PeerId extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.libp2pInterfacePeerId.libp2pInterfacePeerIdStrings.RSA
    - typings.libp2pInterfacePeerId.libp2pInterfacePeerIdStrings.Ed25519
    - typings.libp2pInterfacePeerId.libp2pInterfacePeerIdStrings.secp256k1
  */
  trait PeerIdType extends StObject
  object PeerIdType {
    
    inline def Ed25519: typings.libp2pInterfacePeerId.libp2pInterfacePeerIdStrings.Ed25519 = "Ed25519".asInstanceOf[typings.libp2pInterfacePeerId.libp2pInterfacePeerIdStrings.Ed25519]
    
    inline def RSA: typings.libp2pInterfacePeerId.libp2pInterfacePeerIdStrings.RSA = "RSA".asInstanceOf[typings.libp2pInterfacePeerId.libp2pInterfacePeerIdStrings.RSA]
    
    inline def secp256k1: typings.libp2pInterfacePeerId.libp2pInterfacePeerIdStrings.secp256k1 = "secp256k1".asInstanceOf[typings.libp2pInterfacePeerId.libp2pInterfacePeerIdStrings.secp256k1]
  }
  
  @js.native
  trait RSAPeerId
    extends StObject
       with BasePeerId
       with PeerId {
    
    @JSName("type")
    val type_RSAPeerId: RSA = js.native
  }
  
  @js.native
  trait Secp256k1PeerId
    extends StObject
       with BasePeerId
       with PeerId {
    
    @JSName("publicKey")
    val publicKey_Secp256k1PeerId: js.typedarray.Uint8Array = js.native
    
    @JSName("type")
    val type_Secp256k1PeerId: secp256k1 = js.native
  }
}
