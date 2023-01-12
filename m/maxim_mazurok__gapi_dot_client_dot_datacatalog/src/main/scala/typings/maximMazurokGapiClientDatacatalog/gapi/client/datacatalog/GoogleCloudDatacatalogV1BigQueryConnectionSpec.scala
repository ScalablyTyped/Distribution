package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1BigQueryConnectionSpec extends StObject {
  
  /** Specification for the BigQuery connection to a Cloud SQL instance. */
  var cloudSql: js.UndefOr[GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpec] = js.undefined
  
  /** The type of the BigQuery connection. */
  var connectionType: js.UndefOr[String] = js.undefined
  
  /** True if there are credentials attached to the BigQuery connection; false otherwise. */
  var hasCredential: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudDatacatalogV1BigQueryConnectionSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1BigQueryConnectionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1BigQueryConnectionSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1BigQueryConnectionSpec] (val x: Self) extends AnyVal {
    
    inline def setCloudSql(value: GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpec): Self = StObject.set(x, "cloudSql", value.asInstanceOf[js.Any])
    
    inline def setCloudSqlUndefined: Self = StObject.set(x, "cloudSql", js.undefined)
    
    inline def setConnectionType(value: String): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
    
    inline def setHasCredential(value: Boolean): Self = StObject.set(x, "hasCredential", value.asInstanceOf[js.Any])
    
    inline def setHasCredentialUndefined: Self = StObject.set(x, "hasCredential", js.undefined)
  }
}
