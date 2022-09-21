package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoProcessingDetailsProcessingProgress extends StObject {
  
  /**
    * The number of parts of the video that YouTube has already processed. You can estimate the percentage of the video that YouTube has already processed by calculating: 100 * parts_processed / parts_total Note that since the estimated number of parts could increase without a corresponding increase in the number of parts that have already been processed, it is possible that the calculated progress could periodically decrease while YouTube processes a video.
    */
  var partsProcessed: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An estimate of the total number of parts that need to be processed for the video. The number may be updated with more precise estimates while YouTube processes the video.
    */
  var partsTotal: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An estimate of the amount of time, in millseconds, that YouTube needs to finish processing the video.
    */
  var timeLeftMs: js.UndefOr[String | Null] = js.undefined
}
object SchemaVideoProcessingDetailsProcessingProgress {
  
  inline def apply(): SchemaVideoProcessingDetailsProcessingProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoProcessingDetailsProcessingProgress]
  }
  
  extension [Self <: SchemaVideoProcessingDetailsProcessingProgress](x: Self) {
    
    inline def setPartsProcessed(value: String): Self = StObject.set(x, "partsProcessed", value.asInstanceOf[js.Any])
    
    inline def setPartsProcessedNull: Self = StObject.set(x, "partsProcessed", null)
    
    inline def setPartsProcessedUndefined: Self = StObject.set(x, "partsProcessed", js.undefined)
    
    inline def setPartsTotal(value: String): Self = StObject.set(x, "partsTotal", value.asInstanceOf[js.Any])
    
    inline def setPartsTotalNull: Self = StObject.set(x, "partsTotal", null)
    
    inline def setPartsTotalUndefined: Self = StObject.set(x, "partsTotal", js.undefined)
    
    inline def setTimeLeftMs(value: String): Self = StObject.set(x, "timeLeftMs", value.asInstanceOf[js.Any])
    
    inline def setTimeLeftMsNull: Self = StObject.set(x, "timeLeftMs", null)
    
    inline def setTimeLeftMsUndefined: Self = StObject.set(x, "timeLeftMs", js.undefined)
  }
}
