package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPersonProperties extends StObject {
  
  /**
    * Output only. The email address linked to this Person. This field is always present.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the person if it is displayed in the link text instead of the person's email address.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaPersonProperties {
  
  inline def apply(): SchemaPersonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPersonProperties]
  }
  
  extension [Self <: SchemaPersonProperties](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
