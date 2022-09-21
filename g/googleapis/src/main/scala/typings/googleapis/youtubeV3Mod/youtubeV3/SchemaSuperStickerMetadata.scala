package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSuperStickerMetadata extends StObject {
  
  /**
    * Internationalized alt text that describes the sticker image and any animation associated with it.
    */
  var altText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the localization language in which the alt text is returned.
    */
  var altTextLanguage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier of the Super Sticker. This is a shorter form of the alt_text that includes pack name and a recognizable characteristic of the sticker.
    */
  var stickerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSuperStickerMetadata {
  
  inline def apply(): SchemaSuperStickerMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuperStickerMetadata]
  }
  
  extension [Self <: SchemaSuperStickerMetadata](x: Self) {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextLanguage(value: String): Self = StObject.set(x, "altTextLanguage", value.asInstanceOf[js.Any])
    
    inline def setAltTextLanguageNull: Self = StObject.set(x, "altTextLanguage", null)
    
    inline def setAltTextLanguageUndefined: Self = StObject.set(x, "altTextLanguage", js.undefined)
    
    inline def setAltTextNull: Self = StObject.set(x, "altText", null)
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setStickerId(value: String): Self = StObject.set(x, "stickerId", value.asInstanceOf[js.Any])
    
    inline def setStickerIdNull: Self = StObject.set(x, "stickerId", null)
    
    inline def setStickerIdUndefined: Self = StObject.set(x, "stickerId", js.undefined)
  }
}
