package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAudioContentTypeTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The audio content type.
    */
  var audioContentType: js.UndefOr[String | Null] = js.undefined
}
object SchemaAudioContentTypeTargetingOptionDetails {
  
  inline def apply(): SchemaAudioContentTypeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAudioContentTypeTargetingOptionDetails]
  }
  
  extension [Self <: SchemaAudioContentTypeTargetingOptionDetails](x: Self) {
    
    inline def setAudioContentType(value: String): Self = StObject.set(x, "audioContentType", value.asInstanceOf[js.Any])
    
    inline def setAudioContentTypeNull: Self = StObject.set(x, "audioContentType", null)
    
    inline def setAudioContentTypeUndefined: Self = StObject.set(x, "audioContentType", js.undefined)
  }
}
