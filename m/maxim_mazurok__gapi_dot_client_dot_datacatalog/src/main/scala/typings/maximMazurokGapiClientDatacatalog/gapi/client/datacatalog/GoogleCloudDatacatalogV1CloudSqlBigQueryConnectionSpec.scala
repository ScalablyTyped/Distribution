package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpec extends StObject {
  
  /** Database name. */
  var database: js.UndefOr[String] = js.undefined
  
  /** Cloud SQL instance ID in the format of `project:location:instance`. */
  var instanceId: js.UndefOr[String] = js.undefined
  
  /** Type of the Cloud SQL database. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpec] (val x: Self) extends AnyVal {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
