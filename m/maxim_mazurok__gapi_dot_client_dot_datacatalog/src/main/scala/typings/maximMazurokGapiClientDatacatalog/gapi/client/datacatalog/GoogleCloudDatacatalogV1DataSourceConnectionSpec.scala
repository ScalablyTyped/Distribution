package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1DataSourceConnectionSpec extends StObject {
  
  /** Output only. Fields specific to BigQuery connections. */
  var bigqueryConnectionSpec: js.UndefOr[GoogleCloudDatacatalogV1BigQueryConnectionSpec] = js.undefined
}
object GoogleCloudDatacatalogV1DataSourceConnectionSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1DataSourceConnectionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1DataSourceConnectionSpec]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1DataSourceConnectionSpec](x: Self) {
    
    inline def setBigqueryConnectionSpec(value: GoogleCloudDatacatalogV1BigQueryConnectionSpec): Self = StObject.set(x, "bigqueryConnectionSpec", value.asInstanceOf[js.Any])
    
    inline def setBigqueryConnectionSpecUndefined: Self = StObject.set(x, "bigqueryConnectionSpec", js.undefined)
  }
}
