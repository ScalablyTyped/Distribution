package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Listing extends StObject {
  
  /** Full description of the app. */
  var fullDescription: js.UndefOr[String] = js.undefined
  
  /** Language localization code (a BCP-47 language tag; for example, "de-AT" for Austrian German). */
  var language: js.UndefOr[String] = js.undefined
  
  /** Short description of the app. */
  var shortDescription: js.UndefOr[String] = js.undefined
  
  /** Localized title of the app. */
  var title: js.UndefOr[String] = js.undefined
  
  /** URL of a promotional YouTube video for the app. */
  var video: js.UndefOr[String] = js.undefined
}
object Listing {
  
  inline def apply(): Listing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Listing]
  }
  
  extension [Self <: Listing](x: Self) {
    
    inline def setFullDescription(value: String): Self = StObject.set(x, "fullDescription", value.asInstanceOf[js.Any])
    
    inline def setFullDescriptionUndefined: Self = StObject.set(x, "fullDescription", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    inline def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVideo(value: String): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
