package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MP4RemuxerConfig extends StObject {
  
  var maxAudioFramesDrift: Double
  
  var stretchShortVideoTrack: Boolean
}
object MP4RemuxerConfig {
  
  inline def apply(maxAudioFramesDrift: Double, stretchShortVideoTrack: Boolean): MP4RemuxerConfig = {
    val __obj = js.Dynamic.literal(maxAudioFramesDrift = maxAudioFramesDrift.asInstanceOf[js.Any], stretchShortVideoTrack = stretchShortVideoTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MP4RemuxerConfig]
  }
  
  extension [Self <: MP4RemuxerConfig](x: Self) {
    
    inline def setMaxAudioFramesDrift(value: Double): Self = StObject.set(x, "maxAudioFramesDrift", value.asInstanceOf[js.Any])
    
    inline def setStretchShortVideoTrack(value: Boolean): Self = StObject.set(x, "stretchShortVideoTrack", value.asInstanceOf[js.Any])
  }
}
