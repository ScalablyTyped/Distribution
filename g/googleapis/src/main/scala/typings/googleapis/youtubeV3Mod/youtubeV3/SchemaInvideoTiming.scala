package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a temporal position of a visual widget inside a video.
  */
trait SchemaInvideoTiming extends StObject {
  
  /**
    * Defines the duration in milliseconds for which the promotion should be
    * displayed. If missing, the client should use the default.
    */
  var durationMs: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the time at which the promotion will appear. Depending on the
    * value of type the value of the offsetMs field will represent a time
    * offset from the start or from the end of the video, expressed in
    * milliseconds.
    */
  var offsetMs: js.UndefOr[String] = js.undefined
  
  /**
    * Describes a timing type. If the value is offsetFromStart, then the
    * offsetMs field represents an offset from the start of the video. If the
    * value is offsetFromEnd, then the offsetMs field represents an offset from
    * the end of the video.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaInvideoTiming {
  
  @scala.inline
  def apply(): SchemaInvideoTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvideoTiming]
  }
  
  @scala.inline
  implicit class SchemaInvideoTimingMutableBuilder[Self <: SchemaInvideoTiming] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationMs(value: String): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
    
    @scala.inline
    def setOffsetMs(value: String): Self = StObject.set(x, "offsetMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetMsUndefined: Self = StObject.set(x, "offsetMs", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
