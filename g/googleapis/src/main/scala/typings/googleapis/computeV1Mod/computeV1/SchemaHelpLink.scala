package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHelpLink extends StObject {
  
  /**
    * Describes what the link offers.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the link.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaHelpLink {
  
  inline def apply(): SchemaHelpLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHelpLink]
  }
  
  extension [Self <: SchemaHelpLink](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
