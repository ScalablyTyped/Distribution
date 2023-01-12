package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamControllerConfig extends StObject {
  
  var autoStartLoad: Boolean
  
  var defaultAudioCodec: js.UndefOr[String] = js.undefined
  
  var highBufferWatchdogPeriod: Double
  
  var initialLiveManifestSize: Double
  
  var maxBufferHole: Double
  
  var maxBufferLength: Double
  
  var maxBufferSize: Double
  
  var maxFragLookUpTolerance: Double
  
  var maxMaxBufferLength: Double
  
  var nudgeMaxRetry: Double
  
  var nudgeOffset: Double
  
  var startFragPrefetch: Boolean
  
  var startPosition: Double
  
  var testBandwidth: Boolean
}
object StreamControllerConfig {
  
  inline def apply(
    autoStartLoad: Boolean,
    highBufferWatchdogPeriod: Double,
    initialLiveManifestSize: Double,
    maxBufferHole: Double,
    maxBufferLength: Double,
    maxBufferSize: Double,
    maxFragLookUpTolerance: Double,
    maxMaxBufferLength: Double,
    nudgeMaxRetry: Double,
    nudgeOffset: Double,
    startFragPrefetch: Boolean,
    startPosition: Double,
    testBandwidth: Boolean
  ): StreamControllerConfig = {
    val __obj = js.Dynamic.literal(autoStartLoad = autoStartLoad.asInstanceOf[js.Any], highBufferWatchdogPeriod = highBufferWatchdogPeriod.asInstanceOf[js.Any], initialLiveManifestSize = initialLiveManifestSize.asInstanceOf[js.Any], maxBufferHole = maxBufferHole.asInstanceOf[js.Any], maxBufferLength = maxBufferLength.asInstanceOf[js.Any], maxBufferSize = maxBufferSize.asInstanceOf[js.Any], maxFragLookUpTolerance = maxFragLookUpTolerance.asInstanceOf[js.Any], maxMaxBufferLength = maxMaxBufferLength.asInstanceOf[js.Any], nudgeMaxRetry = nudgeMaxRetry.asInstanceOf[js.Any], nudgeOffset = nudgeOffset.asInstanceOf[js.Any], startFragPrefetch = startFragPrefetch.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any], testBandwidth = testBandwidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamControllerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamControllerConfig] (val x: Self) extends AnyVal {
    
    inline def setAutoStartLoad(value: Boolean): Self = StObject.set(x, "autoStartLoad", value.asInstanceOf[js.Any])
    
    inline def setDefaultAudioCodec(value: String): Self = StObject.set(x, "defaultAudioCodec", value.asInstanceOf[js.Any])
    
    inline def setDefaultAudioCodecUndefined: Self = StObject.set(x, "defaultAudioCodec", js.undefined)
    
    inline def setHighBufferWatchdogPeriod(value: Double): Self = StObject.set(x, "highBufferWatchdogPeriod", value.asInstanceOf[js.Any])
    
    inline def setInitialLiveManifestSize(value: Double): Self = StObject.set(x, "initialLiveManifestSize", value.asInstanceOf[js.Any])
    
    inline def setMaxBufferHole(value: Double): Self = StObject.set(x, "maxBufferHole", value.asInstanceOf[js.Any])
    
    inline def setMaxBufferLength(value: Double): Self = StObject.set(x, "maxBufferLength", value.asInstanceOf[js.Any])
    
    inline def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFragLookUpTolerance(value: Double): Self = StObject.set(x, "maxFragLookUpTolerance", value.asInstanceOf[js.Any])
    
    inline def setMaxMaxBufferLength(value: Double): Self = StObject.set(x, "maxMaxBufferLength", value.asInstanceOf[js.Any])
    
    inline def setNudgeMaxRetry(value: Double): Self = StObject.set(x, "nudgeMaxRetry", value.asInstanceOf[js.Any])
    
    inline def setNudgeOffset(value: Double): Self = StObject.set(x, "nudgeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartFragPrefetch(value: Boolean): Self = StObject.set(x, "startFragPrefetch", value.asInstanceOf[js.Any])
    
    inline def setStartPosition(value: Double): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    inline def setTestBandwidth(value: Boolean): Self = StObject.set(x, "testBandwidth", value.asInstanceOf[js.Any])
  }
}
