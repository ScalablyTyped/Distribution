package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSuperStickerMetadata extends StObject {
  
  /**
    * Internationalized alt text that describes the sticker image and any
    * animation associated with it.
    */
  var altText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the localization language in which the alt text is returned.
    */
  var altTextLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier of the Super Sticker. This is a shorter form of the
    * alt_text that includes pack name and a recognizable characteristic of the
    * sticker.
    */
  var stickerId: js.UndefOr[String] = js.undefined
}
object SchemaSuperStickerMetadata {
  
  @scala.inline
  def apply(): SchemaSuperStickerMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuperStickerMetadata]
  }
  
  @scala.inline
  implicit class SchemaSuperStickerMetadataMutableBuilder[Self <: SchemaSuperStickerMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTextLanguage(value: String): Self = StObject.set(x, "altTextLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTextLanguageUndefined: Self = StObject.set(x, "altTextLanguage", js.undefined)
    
    @scala.inline
    def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    @scala.inline
    def setStickerId(value: String): Self = StObject.set(x, "stickerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickerIdUndefined: Self = StObject.set(x, "stickerId", js.undefined)
  }
}
