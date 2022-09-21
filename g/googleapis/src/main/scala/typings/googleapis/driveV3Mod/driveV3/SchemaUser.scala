package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUser extends StObject {
  
  /**
    * A plain text displayable name for this user.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email address of the user. This may not be present in certain contexts if the user has not made their email address visible to the requester.
    */
  var emailAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "drive#user".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this user is the requesting user.
    */
  var me: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The user's ID as visible in Permission resources.
    */
  var permissionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link to the user's profile photo, if available.
    */
  var photoLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaUser {
  
  inline def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  extension [Self <: SchemaUser](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMe(value: Boolean): Self = StObject.set(x, "me", value.asInstanceOf[js.Any])
    
    inline def setMeNull: Self = StObject.set(x, "me", null)
    
    inline def setMeUndefined: Self = StObject.set(x, "me", js.undefined)
    
    inline def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    inline def setPermissionIdNull: Self = StObject.set(x, "permissionId", null)
    
    inline def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
    
    inline def setPhotoLink(value: String): Self = StObject.set(x, "photoLink", value.asInstanceOf[js.Any])
    
    inline def setPhotoLinkNull: Self = StObject.set(x, "photoLink", null)
    
    inline def setPhotoLinkUndefined: Self = StObject.set(x, "photoLink", js.undefined)
  }
}
