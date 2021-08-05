package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailAddress extends StObject {
  
  /** The email address. */
  var emailAddress: js.UndefOr[String] = js.undefined
}
object EmailAddress {
  
  inline def apply(): EmailAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailAddress]
  }
  
  extension [Self <: EmailAddress](x: Self) {
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
  }
}
