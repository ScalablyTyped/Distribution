package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1LakeMetastoreStatus extends StObject {
  
  /**
    * The URI of the endpoint used to access the Metastore service.
    */
  var endpoint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional information about the current status.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Current state of association.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Last update time of the metastore status of the lake.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1LakeMetastoreStatus {
  
  inline def apply(): SchemaGoogleCloudDataplexV1LakeMetastoreStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1LakeMetastoreStatus]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1LakeMetastoreStatus](x: Self) {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointNull: Self = StObject.set(x, "endpoint", null)
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
