package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1DataSourceConnectionSpec extends StObject {
  
  /**
    * Output only. Fields specific to BigQuery connections.
    */
  var bigqueryConnectionSpec: js.UndefOr[SchemaGoogleCloudDatacatalogV1BigQueryConnectionSpec] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1DataSourceConnectionSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1DataSourceConnectionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1DataSourceConnectionSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1DataSourceConnectionSpec](x: Self) {
    
    inline def setBigqueryConnectionSpec(value: SchemaGoogleCloudDatacatalogV1BigQueryConnectionSpec): Self = StObject.set(x, "bigqueryConnectionSpec", value.asInstanceOf[js.Any])
    
    inline def setBigqueryConnectionSpecUndefined: Self = StObject.set(x, "bigqueryConnectionSpec", js.undefined)
  }
}
