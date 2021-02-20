package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccessPoliciesResponse extends StObject {
  
  /** List of the AccessPolicy instances. */
  var accessPolicies: js.UndefOr[js.Array[AccessPolicy]] = js.native
  
  /** The pagination token to retrieve the next page of results. If the value is empty, no further results remain. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListAccessPoliciesResponse {
  
  @scala.inline
  def apply(): ListAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccessPoliciesResponse]
  }
  
  @scala.inline
  implicit class ListAccessPoliciesResponseMutableBuilder[Self <: ListAccessPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPolicies(value: js.Array[AccessPolicy]): Self = StObject.set(x, "accessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPoliciesUndefined: Self = StObject.set(x, "accessPolicies", js.undefined)
    
    @scala.inline
    def setAccessPoliciesVarargs(value: AccessPolicy*): Self = StObject.set(x, "accessPolicies", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
