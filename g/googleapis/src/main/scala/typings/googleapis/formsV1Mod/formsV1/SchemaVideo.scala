package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideo extends StObject {
  
  /**
    * Properties of a video.
    */
  var properties: js.UndefOr[SchemaMediaProperties] = js.undefined
  
  /**
    * Required. A YouTube URI.
    */
  var youtubeUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaVideo {
  
  inline def apply(): SchemaVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideo]
  }
  
  extension [Self <: SchemaVideo](x: Self) {
    
    inline def setProperties(value: SchemaMediaProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setYoutubeUri(value: String): Self = StObject.set(x, "youtubeUri", value.asInstanceOf[js.Any])
    
    inline def setYoutubeUriNull: Self = StObject.set(x, "youtubeUri", null)
    
    inline def setYoutubeUriUndefined: Self = StObject.set(x, "youtubeUri", js.undefined)
  }
}
