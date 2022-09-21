package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1LakeMetastore extends StObject {
  
  /**
    * Optional. A relative reference to the Dataproc Metastore (https://cloud.google.com/dataproc-metastore/docs) service associated with the lake: projects/{project_id\}/locations/{location_id\}/services/{service_id\}
    */
  var service: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1LakeMetastore {
  
  inline def apply(): SchemaGoogleCloudDataplexV1LakeMetastore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1LakeMetastore]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1LakeMetastore](x: Self) {
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
