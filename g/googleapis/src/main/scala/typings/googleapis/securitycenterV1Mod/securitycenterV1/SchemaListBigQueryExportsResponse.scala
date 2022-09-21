package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListBigQueryExportsResponse extends StObject {
  
  /**
    * The BigQuery exports from the specified parent.
    */
  var bigQueryExports: js.UndefOr[js.Array[SchemaGoogleCloudSecuritycenterV1BigQueryExport]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListBigQueryExportsResponse {
  
  inline def apply(): SchemaListBigQueryExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBigQueryExportsResponse]
  }
  
  extension [Self <: SchemaListBigQueryExportsResponse](x: Self) {
    
    inline def setBigQueryExports(value: js.Array[SchemaGoogleCloudSecuritycenterV1BigQueryExport]): Self = StObject.set(x, "bigQueryExports", value.asInstanceOf[js.Any])
    
    inline def setBigQueryExportsUndefined: Self = StObject.set(x, "bigQueryExports", js.undefined)
    
    inline def setBigQueryExportsVarargs(value: SchemaGoogleCloudSecuritycenterV1BigQueryExport*): Self = StObject.set(x, "bigQueryExports", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
