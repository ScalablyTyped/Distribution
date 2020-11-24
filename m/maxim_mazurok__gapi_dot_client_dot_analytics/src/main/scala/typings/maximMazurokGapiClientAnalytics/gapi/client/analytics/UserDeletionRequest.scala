package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.maximMazurokGapiClientAnalytics.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDeletionRequest extends js.Object {
  
  /** This marks the point in time for which all user data before should be deleted */
  var deletionRequestTime: js.UndefOr[String] = js.native
  
  /** Firebase Project Id */
  var firebaseProjectId: js.UndefOr[String] = js.native
  
  /** User ID. */
  var id: js.UndefOr[Type] = js.native
  
  /** Value is "analytics#userDeletionRequest". */
  var kind: js.UndefOr[String] = js.native
  
  /** Property ID */
  var propertyId: js.UndefOr[String] = js.native
  
  /** Web property ID of the form UA-XXXXX-YY. */
  var webPropertyId: js.UndefOr[String] = js.native
}
object UserDeletionRequest {
  
  @scala.inline
  def apply(): UserDeletionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDeletionRequest]
  }
  
  @scala.inline
  implicit class UserDeletionRequestOps[Self <: UserDeletionRequest] (val x: Self) extends AnyVal {
    
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
    def setDeletionRequestTime(value: String): Self = this.set("deletionRequestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionRequestTime: Self = this.set("deletionRequestTime", js.undefined)
    
    @scala.inline
    def setFirebaseProjectId(value: String): Self = this.set("firebaseProjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirebaseProjectId: Self = this.set("firebaseProjectId", js.undefined)
    
    @scala.inline
    def setId(value: Type): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPropertyId(value: String): Self = this.set("propertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyId: Self = this.set("propertyId", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
}
