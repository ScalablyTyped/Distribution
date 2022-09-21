package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLanguageTag extends StObject {
  
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaLanguageTag {
  
  inline def apply(): SchemaLanguageTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguageTag]
  }
  
  extension [Self <: SchemaLanguageTag](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
