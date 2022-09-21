package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecretVersion extends StObject {
  
  /**
    * Output only. True if payload checksum specified in SecretPayload object has been received by SecretManagerService on SecretManagerService.AddSecretVersion.
    */
  var clientSpecifiedPayloadChecksum: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The time at which the SecretVersion was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time this SecretVersion was destroyed. Only present if state is DESTROYED.
    */
  var destroyTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Etag of the currently stored SecretVersion.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the SecretVersion in the format `projects/x/secrets/x/versions/x`. SecretVersion IDs in a Secret start at 1 and are incremented for each subsequent version of the secret.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The replication status of the SecretVersion.
    */
  var replicationStatus: js.UndefOr[SchemaReplicationStatus] = js.undefined
  
  /**
    * Output only. The current state of the SecretVersion.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecretVersion {
  
  inline def apply(): SchemaSecretVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecretVersion]
  }
  
  extension [Self <: SchemaSecretVersion](x: Self) {
    
    inline def setClientSpecifiedPayloadChecksum(value: Boolean): Self = StObject.set(x, "clientSpecifiedPayloadChecksum", value.asInstanceOf[js.Any])
    
    inline def setClientSpecifiedPayloadChecksumNull: Self = StObject.set(x, "clientSpecifiedPayloadChecksum", null)
    
    inline def setClientSpecifiedPayloadChecksumUndefined: Self = StObject.set(x, "clientSpecifiedPayloadChecksum", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDestroyTime(value: String): Self = StObject.set(x, "destroyTime", value.asInstanceOf[js.Any])
    
    inline def setDestroyTimeNull: Self = StObject.set(x, "destroyTime", null)
    
    inline def setDestroyTimeUndefined: Self = StObject.set(x, "destroyTime", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReplicationStatus(value: SchemaReplicationStatus): Self = StObject.set(x, "replicationStatus", value.asInstanceOf[js.Any])
    
    inline def setReplicationStatusUndefined: Self = StObject.set(x, "replicationStatus", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
