package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRowAccessPoliciesResponse extends StObject {
  
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Row access policies on the requested table. */
  var rowAccessPolicies: js.UndefOr[js.Array[RowAccessPolicy]] = js.undefined
}
object ListRowAccessPoliciesResponse {
  
  inline def apply(): ListRowAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRowAccessPoliciesResponse]
  }
  
  extension [Self <: ListRowAccessPoliciesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRowAccessPolicies(value: js.Array[RowAccessPolicy]): Self = StObject.set(x, "rowAccessPolicies", value.asInstanceOf[js.Any])
    
    inline def setRowAccessPoliciesUndefined: Self = StObject.set(x, "rowAccessPolicies", js.undefined)
    
    inline def setRowAccessPoliciesVarargs(value: RowAccessPolicy*): Self = StObject.set(x, "rowAccessPolicies", js.Array(value*))
  }
}
