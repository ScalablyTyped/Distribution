package typings.ipfsCoreTypes.distSrcConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityConfig extends StObject {
  
  /**
    * The unique PKI identity label for this configs peer. Set on init and never
    * read, its merely here for convenience. IPFS will always generate the peerID
    * from its keypair at runtime.
    */
  var PeerID: String
  
  /**
    * The base64 encoded protobuf describing (and containing) the nodes private key.
    */
  var PrivKey: String
}
object IdentityConfig {
  
  inline def apply(PeerID: String, PrivKey: String): IdentityConfig = {
    val __obj = js.Dynamic.literal(PeerID = PeerID.asInstanceOf[js.Any], PrivKey = PrivKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityConfig] (val x: Self) extends AnyVal {
    
    inline def setPeerID(value: String): Self = StObject.set(x, "PeerID", value.asInstanceOf[js.Any])
    
    inline def setPrivKey(value: String): Self = StObject.set(x, "PrivKey", value.asInstanceOf[js.Any])
  }
}
