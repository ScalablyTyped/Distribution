package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a UserProfile resource.
  */
@js.native
trait SchemaUserProfile extends StObject {
  
  /**
    * The account ID to which this profile belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * The account name this profile belongs to.
    */
  var accountName: js.UndefOr[String] = js.native
  
  /**
    * The eTag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The kind of resource this is, in this case dfareporting#userProfile.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The unique ID of the user profile.
    */
  var profileId: js.UndefOr[String] = js.native
  
  /**
    * The sub account ID this profile belongs to if applicable.
    */
  var subAccountId: js.UndefOr[String] = js.native
  
  /**
    * The sub account name this profile belongs to if applicable.
    */
  var subAccountName: js.UndefOr[String] = js.native
  
  /**
    * The user name.
    */
  var userName: js.UndefOr[String] = js.native
}
object SchemaUserProfile {
  
  @scala.inline
  def apply(): SchemaUserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserProfile]
  }
  
  @scala.inline
  implicit class SchemaUserProfileMutableBuilder[Self <: SchemaUserProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    @scala.inline
    def setSubAccountId(value: String): Self = StObject.set(x, "subAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubAccountIdUndefined: Self = StObject.set(x, "subAccountId", js.undefined)
    
    @scala.inline
    def setSubAccountName(value: String): Self = StObject.set(x, "subAccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubAccountNameUndefined: Self = StObject.set(x, "subAccountName", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
