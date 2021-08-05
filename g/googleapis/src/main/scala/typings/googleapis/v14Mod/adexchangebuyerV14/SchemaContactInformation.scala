package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContactInformation extends StObject {
  
  /**
    * Email address of the contact.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the contact.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaContactInformation {
  
  inline def apply(): SchemaContactInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactInformation]
  }
  
  extension [Self <: SchemaContactInformation](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
