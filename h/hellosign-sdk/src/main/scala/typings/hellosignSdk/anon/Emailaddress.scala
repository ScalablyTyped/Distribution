package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emailaddress extends StObject {
  
  var email_address: String
}
object Emailaddress {
  
  inline def apply(email_address: String): Emailaddress = {
    val __obj = js.Dynamic.literal(email_address = email_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emailaddress]
  }
  
  extension [Self <: Emailaddress](x: Self) {
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
  }
}
