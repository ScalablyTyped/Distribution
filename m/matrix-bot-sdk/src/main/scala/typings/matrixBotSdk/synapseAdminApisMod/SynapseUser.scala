package typings.matrixBotSdk.synapseAdminApisMod

import typings.matrixBotSdk.anon.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynapseUser extends StObject {
  
  /**
    * Whether or not the user is a Synapse administrator.
    */
  var admin: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The avatar URL (usually MXC URI) for the user, if set.
    */
  var avatar_url: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not the user is deactivated.
    */
  var deactivated: js.UndefOr[Boolean] = js.undefined
  
  /***
    * The display name of the user, if set.
    */
  var displayname: js.UndefOr[String] = js.undefined
  
  /**
    * A set of 3PIDs for the user.
    */
  var threepids: js.UndefOr[js.Array[Address]] = js.undefined
}
object SynapseUser {
  
  inline def apply(): SynapseUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynapseUser]
  }
  
  extension [Self <: SynapseUser](x: Self) {
    
    inline def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    inline def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
    
    inline def setDeactivated(value: Boolean): Self = StObject.set(x, "deactivated", value.asInstanceOf[js.Any])
    
    inline def setDeactivatedUndefined: Self = StObject.set(x, "deactivated", js.undefined)
    
    inline def setDisplayname(value: String): Self = StObject.set(x, "displayname", value.asInstanceOf[js.Any])
    
    inline def setDisplaynameUndefined: Self = StObject.set(x, "displayname", js.undefined)
    
    inline def setThreepids(value: js.Array[Address]): Self = StObject.set(x, "threepids", value.asInstanceOf[js.Any])
    
    inline def setThreepidsUndefined: Self = StObject.set(x, "threepids", js.undefined)
    
    inline def setThreepidsVarargs(value: Address*): Self = StObject.set(x, "threepids", js.Array(value*))
  }
}
