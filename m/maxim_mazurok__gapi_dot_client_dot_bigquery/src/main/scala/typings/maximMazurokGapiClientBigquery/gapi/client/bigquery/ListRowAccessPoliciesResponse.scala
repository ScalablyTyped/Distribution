package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRowAccessPoliciesResponse extends StObject {
  
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Row access policies on the requested table. */
  var rowAccessPolicies: js.UndefOr[js.Array[RowAccessPolicy]] = js.native
}
object ListRowAccessPoliciesResponse {
  
  @scala.inline
  def apply(): ListRowAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRowAccessPoliciesResponse]
  }
  
  @scala.inline
  implicit class ListRowAccessPoliciesResponseMutableBuilder[Self <: ListRowAccessPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRowAccessPolicies(value: js.Array[RowAccessPolicy]): Self = StObject.set(x, "rowAccessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowAccessPoliciesUndefined: Self = StObject.set(x, "rowAccessPolicies", js.undefined)
    
    @scala.inline
    def setRowAccessPoliciesVarargs(value: RowAccessPolicy*): Self = StObject.set(x, "rowAccessPolicies", js.Array(value :_*))
  }
}
