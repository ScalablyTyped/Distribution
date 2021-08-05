package typings.googleapis.driveV2Mod.driveV2

import typings.googleapis.anon.Url
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
    * The email address of the user.
    */
  var emailAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this user is the same as the authenticated user for whom the
    * request was made.
    */
  var isAuthenticatedUser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This is always drive#user.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The user&#39;s ID as visible in the permissions collection.
    */
  var permissionId: js.UndefOr[String] = js.undefined
  
  /**
    * The user&#39;s profile picture.
    */
  var picture: js.UndefOr[Url] = js.undefined
}
object SchemaUser {
  
  inline def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  extension [Self <: SchemaUser](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setIsAuthenticatedUser(value: Boolean): Self = StObject.set(x, "isAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setIsAuthenticatedUserUndefined: Self = StObject.set(x, "isAuthenticatedUser", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    inline def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
    
    inline def setPicture(value: Url): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
  }
}
