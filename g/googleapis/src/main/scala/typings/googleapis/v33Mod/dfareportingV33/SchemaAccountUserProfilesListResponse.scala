package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Account User Profile List Response
  */
@js.native
trait SchemaAccountUserProfilesListResponse extends js.Object {
  
  /**
    * Account user profile collection.
    */
  var accountUserProfiles: js.UndefOr[js.Array[SchemaAccountUserProfile]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountUserProfilesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaAccountUserProfilesListResponse {
  
  @scala.inline
  def apply(): SchemaAccountUserProfilesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountUserProfilesListResponse]
  }
  
  @scala.inline
  implicit class SchemaAccountUserProfilesListResponseOps[Self <: SchemaAccountUserProfilesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountUserProfilesVarargs(value: SchemaAccountUserProfile*): Self = this.set("accountUserProfiles", js.Array(value :_*))
    
    @scala.inline
    def setAccountUserProfiles(value: js.Array[SchemaAccountUserProfile]): Self = this.set("accountUserProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountUserProfiles: Self = this.set("accountUserProfiles", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
