package typings.matrixBotSdk.libSynapseAdminApisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynapseUserListing extends StObject {
  
  /**
    * Whether or not the user is an admin. 1 is true, 0 is false.
    */
  var admin: Double
  
  /**
    * The avatar for the user, if set.
    */
  var avatar_url: String | Null
  
  /**
    * Whether or not the user is deactivated. 1 is true, 0 is false.
    */
  var deactivated: Double
  
  /**
    * The display name of the user, if set.
    */
  var displayname: String | Null
  
  /**
    * Whether or not the user is a guest. 1 is true, 0 is false.
    */
  var is_guest: Double
  
  /**
    * User ID.
    */
  var name: String
  
  /**
    * The hash of the user's password, if relevant.
    */
  var password_hash: String | Null
  
  /**
    * The type of user, if relevant.
    */
  var user_type: String | Null
}
object SynapseUserListing {
  
  inline def apply(admin: Double, deactivated: Double, is_guest: Double, name: String): SynapseUserListing = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], deactivated = deactivated.asInstanceOf[js.Any], is_guest = is_guest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], avatar_url = null, displayname = null, password_hash = null, user_type = null)
    __obj.asInstanceOf[SynapseUserListing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynapseUserListing] (val x: Self) extends AnyVal {
    
    inline def setAdmin(value: Double): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setAvatar_urlNull: Self = StObject.set(x, "avatar_url", null)
    
    inline def setDeactivated(value: Double): Self = StObject.set(x, "deactivated", value.asInstanceOf[js.Any])
    
    inline def setDisplayname(value: String): Self = StObject.set(x, "displayname", value.asInstanceOf[js.Any])
    
    inline def setDisplaynameNull: Self = StObject.set(x, "displayname", null)
    
    inline def setIs_guest(value: Double): Self = StObject.set(x, "is_guest", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPassword_hash(value: String): Self = StObject.set(x, "password_hash", value.asInstanceOf[js.Any])
    
    inline def setPassword_hashNull: Self = StObject.set(x, "password_hash", null)
    
    inline def setUser_type(value: String): Self = StObject.set(x, "user_type", value.asInstanceOf[js.Any])
    
    inline def setUser_typeNull: Self = StObject.set(x, "user_type", null)
  }
}
