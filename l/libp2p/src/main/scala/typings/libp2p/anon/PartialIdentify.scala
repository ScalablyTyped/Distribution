package typings.libp2p.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p.libp2p/dist/src/identify/pb/message.Identify> */
trait PartialIdentify extends StObject {
  
  var agentVersion: js.UndefOr[String] = js.undefined
  
  var listenAddrs: js.UndefOr[js.Array[js.typedarray.Uint8Array]] = js.undefined
  
  var observedAddr: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var protocolVersion: js.UndefOr[String] = js.undefined
  
  var protocols: js.UndefOr[js.Array[String]] = js.undefined
  
  var publicKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var signedPeerRecord: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
}
object PartialIdentify {
  
  inline def apply(): PartialIdentify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIdentify]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialIdentify] (val x: Self) extends AnyVal {
    
    inline def setAgentVersion(value: String): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
    
    inline def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
    
    inline def setListenAddrs(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "listenAddrs", value.asInstanceOf[js.Any])
    
    inline def setListenAddrsUndefined: Self = StObject.set(x, "listenAddrs", js.undefined)
    
    inline def setListenAddrsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "listenAddrs", js.Array(value*))
    
    inline def setObservedAddr(value: js.typedarray.Uint8Array): Self = StObject.set(x, "observedAddr", value.asInstanceOf[js.Any])
    
    inline def setObservedAddrUndefined: Self = StObject.set(x, "observedAddr", js.undefined)
    
    inline def setProtocolVersion(value: String): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    inline def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
    
    inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
    
    inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setSignedPeerRecord(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signedPeerRecord", value.asInstanceOf[js.Any])
    
    inline def setSignedPeerRecordUndefined: Self = StObject.set(x, "signedPeerRecord", js.undefined)
  }
}
