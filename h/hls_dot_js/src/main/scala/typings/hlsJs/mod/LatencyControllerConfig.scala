package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatencyControllerConfig extends StObject {
  
  var liveMaxLatencyDuration: js.UndefOr[Double] = js.undefined
  
  var liveMaxLatencyDurationCount: Double
  
  var liveSyncDuration: js.UndefOr[Double] = js.undefined
  
  var liveSyncDurationCount: Double
  
  var maxLiveSyncPlaybackRate: Double
}
object LatencyControllerConfig {
  
  inline def apply(
    liveMaxLatencyDurationCount: Double,
    liveSyncDurationCount: Double,
    maxLiveSyncPlaybackRate: Double
  ): LatencyControllerConfig = {
    val __obj = js.Dynamic.literal(liveMaxLatencyDurationCount = liveMaxLatencyDurationCount.asInstanceOf[js.Any], liveSyncDurationCount = liveSyncDurationCount.asInstanceOf[js.Any], maxLiveSyncPlaybackRate = maxLiveSyncPlaybackRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatencyControllerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LatencyControllerConfig] (val x: Self) extends AnyVal {
    
    inline def setLiveMaxLatencyDuration(value: Double): Self = StObject.set(x, "liveMaxLatencyDuration", value.asInstanceOf[js.Any])
    
    inline def setLiveMaxLatencyDurationCount(value: Double): Self = StObject.set(x, "liveMaxLatencyDurationCount", value.asInstanceOf[js.Any])
    
    inline def setLiveMaxLatencyDurationUndefined: Self = StObject.set(x, "liveMaxLatencyDuration", js.undefined)
    
    inline def setLiveSyncDuration(value: Double): Self = StObject.set(x, "liveSyncDuration", value.asInstanceOf[js.Any])
    
    inline def setLiveSyncDurationCount(value: Double): Self = StObject.set(x, "liveSyncDurationCount", value.asInstanceOf[js.Any])
    
    inline def setLiveSyncDurationUndefined: Self = StObject.set(x, "liveSyncDuration", js.undefined)
    
    inline def setMaxLiveSyncPlaybackRate(value: Double): Self = StObject.set(x, "maxLiveSyncPlaybackRate", value.asInstanceOf[js.Any])
  }
}
