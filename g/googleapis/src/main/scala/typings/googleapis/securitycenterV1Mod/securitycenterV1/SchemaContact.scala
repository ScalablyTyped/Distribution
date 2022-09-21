package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContact extends StObject {
  
  /**
    * An email address e.g. "person123@company.com"
    */
  var email: js.UndefOr[String | Null] = js.undefined
}
object SchemaContact {
  
  inline def apply(): SchemaContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContact]
  }
  
  extension [Self <: SchemaContact](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
