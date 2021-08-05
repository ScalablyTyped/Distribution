package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.membershipCacheMod.UserMembership
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Displayname extends StObject {
  
  var avatar_url: js.UndefOr[String] = js.undefined
  
  var displayname: js.UndefOr[String] = js.undefined
  
  var membership: UserMembership
}
object Displayname {
  
  inline def apply(): Displayname = {
    val __obj = js.Dynamic.literal(membership = null)
    __obj.asInstanceOf[Displayname]
  }
  
  extension [Self <: Displayname](x: Self) {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
    
    inline def setDisplayname(value: String): Self = StObject.set(x, "displayname", value.asInstanceOf[js.Any])
    
    inline def setDisplaynameUndefined: Self = StObject.set(x, "displayname", js.undefined)
    
    inline def setMembership(value: UserMembership): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
    
    inline def setMembershipNull: Self = StObject.set(x, "membership", null)
  }
}
