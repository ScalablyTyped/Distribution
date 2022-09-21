package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1EntityCompatibilityStatus extends StObject {
  
  /**
    * Output only. Whether this entity is compatible with BigQuery.
    */
  var bigquery: js.UndefOr[SchemaGoogleCloudDataplexV1EntityCompatibilityStatusCompatibility] = js.undefined
  
  /**
    * Output only. Whether this entity is compatible with Hive Metastore.
    */
  var hiveMetastore: js.UndefOr[SchemaGoogleCloudDataplexV1EntityCompatibilityStatusCompatibility] = js.undefined
}
object SchemaGoogleCloudDataplexV1EntityCompatibilityStatus {
  
  inline def apply(): SchemaGoogleCloudDataplexV1EntityCompatibilityStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1EntityCompatibilityStatus]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1EntityCompatibilityStatus](x: Self) {
    
    inline def setBigquery(value: SchemaGoogleCloudDataplexV1EntityCompatibilityStatusCompatibility): Self = StObject.set(x, "bigquery", value.asInstanceOf[js.Any])
    
    inline def setBigqueryUndefined: Self = StObject.set(x, "bigquery", js.undefined)
    
    inline def setHiveMetastore(value: SchemaGoogleCloudDataplexV1EntityCompatibilityStatusCompatibility): Self = StObject.set(x, "hiveMetastore", value.asInstanceOf[js.Any])
    
    inline def setHiveMetastoreUndefined: Self = StObject.set(x, "hiveMetastore", js.undefined)
  }
}
