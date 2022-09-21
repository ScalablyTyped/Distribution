package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocalizedMessage extends StObject {
  
  /**
    * The locale used following the specification defined at http://www.rfc-editor.org/rfc/bcp/bcp47.txt. Examples are: "en-US", "fr-CH", "es-MX"
    */
  var locale: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The localized error message in the above locale.
    */
  var message: js.UndefOr[String | Null] = js.undefined
}
object SchemaLocalizedMessage {
  
  inline def apply(): SchemaLocalizedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalizedMessage]
  }
  
  extension [Self <: SchemaLocalizedMessage](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
