package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Administrator extends StObject {
  
  /** The admin's email address. */
  var email: js.UndefOr[String] = js.undefined
}
object Administrator {
  
  inline def apply(): Administrator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Administrator]
  }
  
  extension [Self <: Administrator](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
