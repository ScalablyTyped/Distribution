package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExtraMaterial extends StObject {
  
  /**
    * Text feedback.
    */
  var link: js.UndefOr[SchemaTextLink] = js.undefined
  
  /**
    * Video feedback.
    */
  var video: js.UndefOr[SchemaVideoLink] = js.undefined
}
object SchemaExtraMaterial {
  
  inline def apply(): SchemaExtraMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtraMaterial]
  }
  
  extension [Self <: SchemaExtraMaterial](x: Self) {
    
    inline def setLink(value: SchemaTextLink): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setVideo(value: SchemaVideoLink): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
