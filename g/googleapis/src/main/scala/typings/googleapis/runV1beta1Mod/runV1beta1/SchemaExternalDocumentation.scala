package typings.googleapis.runV1beta1Mod.runV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExternalDocumentation extends StObject {
  
  var description: js.UndefOr[String | Null] = js.undefined
  
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaExternalDocumentation {
  
  inline def apply(): SchemaExternalDocumentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExternalDocumentation]
  }
  
  extension [Self <: SchemaExternalDocumentation](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
