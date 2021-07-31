package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountUserProfilesListResponse extends StObject {
  
  /** Account user profile collection. */
  var accountUserProfiles: js.UndefOr[js.Array[AccountUserProfile]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountUserProfilesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object AccountUserProfilesListResponse {
  
  @scala.inline
  def apply(): AccountUserProfilesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountUserProfilesListResponse]
  }
  
  @scala.inline
  implicit class AccountUserProfilesListResponseMutableBuilder[Self <: AccountUserProfilesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountUserProfiles(value: js.Array[AccountUserProfile]): Self = StObject.set(x, "accountUserProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUserProfilesUndefined: Self = StObject.set(x, "accountUserProfiles", js.undefined)
    
    @scala.inline
    def setAccountUserProfilesVarargs(value: AccountUserProfile*): Self = StObject.set(x, "accountUserProfiles", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
