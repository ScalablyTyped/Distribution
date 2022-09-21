package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoLink extends StObject {
  
  /**
    * Required. The display text for the link.
    */
  var displayText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI of a YouTube video.
    */
  var youtubeUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaVideoLink {
  
  inline def apply(): SchemaVideoLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoLink]
  }
  
  extension [Self <: SchemaVideoLink](x: Self) {
    
    inline def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    inline def setDisplayTextNull: Self = StObject.set(x, "displayText", null)
    
    inline def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
    
    inline def setYoutubeUri(value: String): Self = StObject.set(x, "youtubeUri", value.asInstanceOf[js.Any])
    
    inline def setYoutubeUriNull: Self = StObject.set(x, "youtubeUri", null)
    
    inline def setYoutubeUriUndefined: Self = StObject.set(x, "youtubeUri", js.undefined)
  }
}
