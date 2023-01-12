package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterState extends StObject {
  
  /**
    * Output only. The encryption information for the table in this cluster. If the encryption key protecting this resource is customer managed, then its version can be rotated in Cloud
    * Key Management Service (Cloud KMS). The primary version of the key and its status will be reflected here when changes propagate from Cloud KMS.
    */
  var encryptionInfo: js.UndefOr[js.Array[EncryptionInfo]] = js.undefined
  
  /** Output only. The state of replication for the table in this cluster. */
  var replicationState: js.UndefOr[String] = js.undefined
}
object ClusterState {
  
  inline def apply(): ClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterState] (val x: Self) extends AnyVal {
    
    inline def setEncryptionInfo(value: js.Array[EncryptionInfo]): Self = StObject.set(x, "encryptionInfo", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInfoUndefined: Self = StObject.set(x, "encryptionInfo", js.undefined)
    
    inline def setEncryptionInfoVarargs(value: EncryptionInfo*): Self = StObject.set(x, "encryptionInfo", js.Array(value*))
    
    inline def setReplicationState(value: String): Self = StObject.set(x, "replicationState", value.asInstanceOf[js.Any])
    
    inline def setReplicationStateUndefined: Self = StObject.set(x, "replicationState", js.undefined)
  }
}
