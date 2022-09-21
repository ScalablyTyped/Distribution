package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAudioVideoOffset extends StObject {
  
  /**
    * The offset in percentage of the audio or video duration.
    */
  var percentage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The offset in seconds from the start of the audio or video.
    */
  var seconds: js.UndefOr[String | Null] = js.undefined
}
object SchemaAudioVideoOffset {
  
  inline def apply(): SchemaAudioVideoOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAudioVideoOffset]
  }
  
  extension [Self <: SchemaAudioVideoOffset](x: Self) {
    
    inline def setPercentage(value: String): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageNull: Self = StObject.set(x, "percentage", null)
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    
    inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsNull: Self = StObject.set(x, "seconds", null)
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
