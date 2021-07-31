package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a Drive user.
  */
trait SchemaUser extends StObject {
  
  /**
    * A plain text displayable name for this user.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The email address of the user. This may not be present in certain
    * contexts if the user has not made their email address visible to the
    * requester.
    */
  var emailAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#user&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this user is the requesting user.
    */
  var me: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The user&#39;s ID as visible in Permission resources.
    */
  var permissionId: js.UndefOr[String] = js.undefined
  
  /**
    * A link to the user&#39;s profile photo, if available.
    */
  var photoLink: js.UndefOr[String] = js.undefined
}
object SchemaUser {
  
  @scala.inline
  def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  @scala.inline
  implicit class SchemaUserMutableBuilder[Self <: SchemaUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMe(value: Boolean): Self = StObject.set(x, "me", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeUndefined: Self = StObject.set(x, "me", js.undefined)
    
    @scala.inline
    def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
    
    @scala.inline
    def setPhotoLink(value: String): Self = StObject.set(x, "photoLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoLinkUndefined: Self = StObject.set(x, "photoLink", js.undefined)
  }
}
