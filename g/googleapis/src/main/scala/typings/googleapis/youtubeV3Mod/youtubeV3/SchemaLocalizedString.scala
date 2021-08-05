package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocalizedString extends StObject {
  
  var language: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object SchemaLocalizedString {
  
  inline def apply(): SchemaLocalizedString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalizedString]
  }
  
  extension [Self <: SchemaLocalizedString](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
