package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1BigQueryConnectionSpec extends StObject {
  
  /**
    * Specification for the BigQuery connection to a Cloud SQL instance.
    */
  var cloudSql: js.UndefOr[SchemaGoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpec] = js.undefined
  
  /**
    * The type of the BigQuery connection.
    */
  var connectionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if there are credentials attached to the BigQuery connection; false otherwise.
    */
  var hasCredential: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1BigQueryConnectionSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1BigQueryConnectionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1BigQueryConnectionSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1BigQueryConnectionSpec](x: Self) {
    
    inline def setCloudSql(value: SchemaGoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpec): Self = StObject.set(x, "cloudSql", value.asInstanceOf[js.Any])
    
    inline def setCloudSqlUndefined: Self = StObject.set(x, "cloudSql", js.undefined)
    
    inline def setConnectionType(value: String): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectionTypeNull: Self = StObject.set(x, "connectionType", null)
    
    inline def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
    
    inline def setHasCredential(value: Boolean): Self = StObject.set(x, "hasCredential", value.asInstanceOf[js.Any])
    
    inline def setHasCredentialNull: Self = StObject.set(x, "hasCredential", null)
    
    inline def setHasCredentialUndefined: Self = StObject.set(x, "hasCredential", js.undefined)
  }
}
