package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailAddress extends StObject {
  
  /** The email address. */
  var emailAddress: js.UndefOr[String] = js.undefined
}
object EmailAddress {
  
  @scala.inline
  def apply(): EmailAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailAddress]
  }
  
  @scala.inline
  implicit class EmailAddressMutableBuilder[Self <: EmailAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
  }
}
