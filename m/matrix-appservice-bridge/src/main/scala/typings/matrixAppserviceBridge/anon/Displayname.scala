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
  
  @scala.inline
  def apply(): Displayname = {
    val __obj = js.Dynamic.literal(membership = null)
    __obj.asInstanceOf[Displayname]
  }
  
  @scala.inline
  implicit class DisplaynameMutableBuilder[Self <: Displayname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
    
    @scala.inline
    def setDisplayname(value: String): Self = StObject.set(x, "displayname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplaynameUndefined: Self = StObject.set(x, "displayname", js.undefined)
    
    @scala.inline
    def setMembership(value: UserMembership): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipNull: Self = StObject.set(x, "membership", null)
  }
}
