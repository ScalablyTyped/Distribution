package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpec extends StObject {
  
  /**
    * Database name.
    */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cloud SQL instance ID in the format of `project:location:instance`.
    */
  var instanceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the Cloud SQL database.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpec](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdNull: Self = StObject.set(x, "instanceId", null)
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
