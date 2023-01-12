package typings.ipns

import typings.interfaceDatastore.keyMod.Key
import typings.ipns.distSrcPbIpnsMod.IpnsEntry.ValidityType
import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(peerId: PeerId, value: js.typedarray.Uint8Array, seq: js.BigInt, lifetime: Double): js.Promise[IPNSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(peerId.asInstanceOf[js.Any], value.asInstanceOf[js.Any], seq.asInstanceOf[js.Any], lifetime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IPNSEntry]]
  inline def create(peerId: PeerId, value: js.typedarray.Uint8Array, seq: Double, lifetime: Double): js.Promise[IPNSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(peerId.asInstanceOf[js.Any], value.asInstanceOf[js.Any], seq.asInstanceOf[js.Any], lifetime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IPNSEntry]]
  
  inline def createWithExpiration(peerId: PeerId, value: js.typedarray.Uint8Array, seq: js.BigInt, expiration: String): js.Promise[IPNSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithExpiration")(peerId.asInstanceOf[js.Any], value.asInstanceOf[js.Any], seq.asInstanceOf[js.Any], expiration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IPNSEntry]]
  inline def createWithExpiration(peerId: PeerId, value: js.typedarray.Uint8Array, seq: Double, expiration: String): js.Promise[IPNSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithExpiration")(peerId.asInstanceOf[js.Any], value.asInstanceOf[js.Any], seq.asInstanceOf[js.Any], expiration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IPNSEntry]]
  
  inline def getLocalKey(key: js.typedarray.Uint8Array): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalKey")(key.asInstanceOf[js.Any]).asInstanceOf[Key]
  
  inline def marshal(obj: IPNSEntry): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("marshal")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("ipns", "namespace")
  @js.native
  val namespace: /* "/ipns/" */ String = js.native
  
  @JSImport("ipns", "namespaceLength")
  @js.native
  val namespaceLength: Double = js.native
  
  inline def peerIdFromRoutingKey(key: js.typedarray.Uint8Array): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("peerIdFromRoutingKey")(key.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  
  inline def peerIdToRoutingKey(peerId: PeerId): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("peerIdToRoutingKey")(peerId.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def unmarshal(buf: js.typedarray.Uint8Array): IPNSEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshal")(buf.asInstanceOf[js.Any]).asInstanceOf[IPNSEntry]
  
  trait IDKeys extends StObject {
    
    var ipnsKey: Key
    
    var pkKey: Key
    
    var routingKey: Key
    
    var routingPubKey: Key
  }
  object IDKeys {
    
    inline def apply(ipnsKey: Key, pkKey: Key, routingKey: Key, routingPubKey: Key): IDKeys = {
      val __obj = js.Dynamic.literal(ipnsKey = ipnsKey.asInstanceOf[js.Any], pkKey = pkKey.asInstanceOf[js.Any], routingKey = routingKey.asInstanceOf[js.Any], routingPubKey = routingPubKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDKeys]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDKeys] (val x: Self) extends AnyVal {
      
      inline def setIpnsKey(value: Key): Self = StObject.set(x, "ipnsKey", value.asInstanceOf[js.Any])
      
      inline def setPkKey(value: Key): Self = StObject.set(x, "pkKey", value.asInstanceOf[js.Any])
      
      inline def setRoutingKey(value: Key): Self = StObject.set(x, "routingKey", value.asInstanceOf[js.Any])
      
      inline def setRoutingPubKey(value: Key): Self = StObject.set(x, "routingPubKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPNSEntry extends StObject {
    
    var data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var pubKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var sequence: js.BigInt
    
    var signature: js.typedarray.Uint8Array
    
    var signatureV2: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var ttl: js.UndefOr[js.BigInt] = js.undefined
    
    var validity: js.typedarray.Uint8Array
    
    var validityType: ValidityType
    
    var value: js.typedarray.Uint8Array
  }
  object IPNSEntry {
    
    inline def apply(
      sequence: js.BigInt,
      signature: js.typedarray.Uint8Array,
      validity: js.typedarray.Uint8Array,
      validityType: ValidityType,
      value: js.typedarray.Uint8Array
    ): IPNSEntry = {
      val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any], validityType = validityType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPNSEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPNSEntry] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPubKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "pubKey", value.asInstanceOf[js.Any])
      
      inline def setPubKeyUndefined: Self = StObject.set(x, "pubKey", js.undefined)
      
      inline def setSequence(value: js.BigInt): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureV2(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signatureV2", value.asInstanceOf[js.Any])
      
      inline def setSignatureV2Undefined: Self = StObject.set(x, "signatureV2", js.undefined)
      
      inline def setTtl(value: js.BigInt): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setValidity(value: js.typedarray.Uint8Array): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
      
      inline def setValidityType(value: ValidityType): Self = StObject.set(x, "validityType", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPNSEntryData extends StObject {
    
    var Sequence: js.BigInt
    
    var TTL: js.BigInt
    
    var Validity: js.typedarray.Uint8Array
    
    var ValidityType: typings.ipns.distSrcPbIpnsMod.IpnsEntry.ValidityType
    
    var Value: js.typedarray.Uint8Array
  }
  object IPNSEntryData {
    
    inline def apply(
      Sequence: js.BigInt,
      TTL: js.BigInt,
      Validity: js.typedarray.Uint8Array,
      ValidityType: ValidityType,
      Value: js.typedarray.Uint8Array
    ): IPNSEntryData = {
      val __obj = js.Dynamic.literal(Sequence = Sequence.asInstanceOf[js.Any], TTL = TTL.asInstanceOf[js.Any], Validity = Validity.asInstanceOf[js.Any], ValidityType = ValidityType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPNSEntryData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPNSEntryData] (val x: Self) extends AnyVal {
      
      inline def setSequence(value: js.BigInt): Self = StObject.set(x, "Sequence", value.asInstanceOf[js.Any])
      
      inline def setTTL(value: js.BigInt): Self = StObject.set(x, "TTL", value.asInstanceOf[js.Any])
      
      inline def setValidity(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Validity", value.asInstanceOf[js.Any])
      
      inline def setValidityType(value: ValidityType): Self = StObject.set(x, "ValidityType", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
}
