package typings.intercomClient.anon

import typings.intercomClient.leadMod.LeadIdentifier
import typings.intercomClient.userMod.UserIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contact extends StObject {
  
  var contact: LeadIdentifier
  
  var user: UserIdentifier
}
object Contact {
  
  @scala.inline
  def apply(contact: LeadIdentifier, user: UserIdentifier): Contact = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
  
  @scala.inline
  implicit class ContactMutableBuilder[Self <: Contact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContact(value: LeadIdentifier): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: UserIdentifier): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
