package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactInformation extends StObject {
  
  /** Email address for the contact. */
  var email: js.UndefOr[String] = js.undefined
  
  /** The name of the contact. */
  var name: js.UndefOr[String] = js.undefined
}
object ContactInformation {
  
  inline def apply(): ContactInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactInformation]
  }
  
  extension [Self <: ContactInformation](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
