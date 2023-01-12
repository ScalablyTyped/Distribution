package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactInformation extends StObject {
  
  /** Email address of the contact. */
  var email: js.UndefOr[String] = js.undefined
  
  /** The name of the contact. */
  var name: js.UndefOr[String] = js.undefined
}
object ContactInformation {
  
  inline def apply(): ContactInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactInformation] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
