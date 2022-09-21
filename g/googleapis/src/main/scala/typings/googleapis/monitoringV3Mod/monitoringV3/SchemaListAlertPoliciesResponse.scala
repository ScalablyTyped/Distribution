package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAlertPoliciesResponse extends StObject {
  
  /**
    * The returned alert policies.
    */
  var alertPolicies: js.UndefOr[js.Array[SchemaAlertPolicy]] = js.undefined
  
  /**
    * If there might be more results than were returned, then this field is set to a non-empty value. To see the additional results, use that value as page_token in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total number of alert policies in all pages. This number is only an estimate, and may change in subsequent pages. https://aip.dev/158
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaListAlertPoliciesResponse {
  
  inline def apply(): SchemaListAlertPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAlertPoliciesResponse]
  }
  
  extension [Self <: SchemaListAlertPoliciesResponse](x: Self) {
    
    inline def setAlertPolicies(value: js.Array[SchemaAlertPolicy]): Self = StObject.set(x, "alertPolicies", value.asInstanceOf[js.Any])
    
    inline def setAlertPoliciesUndefined: Self = StObject.set(x, "alertPolicies", js.undefined)
    
    inline def setAlertPoliciesVarargs(value: SchemaAlertPolicy*): Self = StObject.set(x, "alertPolicies", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
