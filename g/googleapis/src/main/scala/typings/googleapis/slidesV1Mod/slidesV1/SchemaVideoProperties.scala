package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoProperties extends StObject {
  
  /**
    * Whether to enable video autoplay when the page is displayed in present mode. Defaults to false.
    */
  var autoPlay: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The time at which to end playback, measured in seconds from the beginning of the video. If set, the end time should be after the start time. If not set or if you set this to a value that exceeds the video's length, the video will be played until its end.
    */
  var end: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether to mute the audio during video playback. Defaults to false.
    */
  var mute: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The outline of the video. The default outline matches the defaults for new videos created in the Slides editor.
    */
  var outline: js.UndefOr[SchemaOutline] = js.undefined
  
  /**
    * The time at which to start playback, measured in seconds from the beginning of the video. If set, the start time should be before the end time. If you set this to a value that exceeds the video's length in seconds, the video will be played from the last second. If not set, the video will be played from the beginning.
    */
  var start: js.UndefOr[Double | Null] = js.undefined
}
object SchemaVideoProperties {
  
  inline def apply(): SchemaVideoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoProperties]
  }
  
  extension [Self <: SchemaVideoProperties](x: Self) {
    
    inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayNull: Self = StObject.set(x, "autoPlay", null)
    
    inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    inline def setMuteNull: Self = StObject.set(x, "mute", null)
    
    inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
    
    inline def setOutline(value: SchemaOutline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
