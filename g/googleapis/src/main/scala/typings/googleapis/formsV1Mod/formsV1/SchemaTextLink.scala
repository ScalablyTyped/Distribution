package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextLink extends StObject {
  
  /**
    * Required. Display text for the URI.
    */
  var displayText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The URI.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaTextLink {
  
  inline def apply(): SchemaTextLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextLink]
  }
  
  extension [Self <: SchemaTextLink](x: Self) {
    
    inline def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    inline def setDisplayTextNull: Self = StObject.set(x, "displayText", null)
    
    inline def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
