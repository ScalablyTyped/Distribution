package typings.googleapis.vectortileV1Mod.vectortileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProviderInfo extends StObject {
  
  /**
    * Attribution string for this provider. This string is not localized.
    */
  var description: js.UndefOr[String | Null] = js.undefined
}
object SchemaProviderInfo {
  
  inline def apply(): SchemaProviderInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProviderInfo]
  }
  
  extension [Self <: SchemaProviderInfo](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
