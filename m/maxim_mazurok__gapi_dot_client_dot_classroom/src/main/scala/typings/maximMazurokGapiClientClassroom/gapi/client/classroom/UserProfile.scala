package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserProfile extends StObject {
  
  /** Email address of the user. Read-only. */
  var emailAddress: js.UndefOr[String] = js.native
  
  /** Identifier of the user. Read-only. */
  var id: js.UndefOr[String] = js.native
  
  /** Name of the user. Read-only. */
  var name: js.UndefOr[Name] = js.native
  
  /** Global permissions of the user. Read-only. */
  var permissions: js.UndefOr[js.Array[GlobalPermission]] = js.native
  
  /** URL of user's profile photo. Read-only. */
  var photoUrl: js.UndefOr[String] = js.native
  
  /**
    * Represents whether a G Suite for Education user's domain administrator has explicitly verified them as being a teacher. If the user is not a member of a G Suite for Education
    * domain, than this field is always false. Read-only
    */
  var verifiedTeacher: js.UndefOr[Boolean] = js.native
}
object UserProfile {
  
  @scala.inline
  def apply(): UserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserProfile]
  }
  
  @scala.inline
  implicit class UserProfileMutableBuilder[Self <: UserProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPermissions(value: js.Array[GlobalPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: GlobalPermission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    @scala.inline
    def setVerifiedTeacher(value: Boolean): Self = StObject.set(x, "verifiedTeacher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedTeacherUndefined: Self = StObject.set(x, "verifiedTeacher", js.undefined)
  }
}
