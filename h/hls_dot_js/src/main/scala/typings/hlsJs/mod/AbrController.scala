package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * (default: internal ABR controller)
  * Customized Adaptive Bitrate Streaming Controller.
  */
trait AbrController extends StObject {
  
  /**
    * get: capping/max level value that could be used by ABR Controller
    * set: capping/max level value that could be used by ABR Controller
    */
  var autoLevelCapping: Double
  
  /**
    *  accumulated handled events
    */
  var handledEvents: js.Array[String]
  
  /**
    * current hls instance
    */
  var hls: Hls
  
  /**
    * last fragments corresponding level
    */
  var lastLoadedFragLevel: Double
  
  /**
    * get: next auto-quality levele/force next auto-quality level that should be returned
    * set: next auto-quality levele/force next auto-quality level that should be returned
    *  - currently used for emergency switch down
    */
  var nextAutoLevel: Double
  
  var useGenericHandler: Boolean
}
object AbrController {
  
  inline def apply(
    autoLevelCapping: Double,
    handledEvents: js.Array[String],
    hls: Hls,
    lastLoadedFragLevel: Double,
    nextAutoLevel: Double,
    useGenericHandler: Boolean
  ): AbrController = {
    val __obj = js.Dynamic.literal(autoLevelCapping = autoLevelCapping.asInstanceOf[js.Any], handledEvents = handledEvents.asInstanceOf[js.Any], hls = hls.asInstanceOf[js.Any], lastLoadedFragLevel = lastLoadedFragLevel.asInstanceOf[js.Any], nextAutoLevel = nextAutoLevel.asInstanceOf[js.Any], useGenericHandler = useGenericHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbrController]
  }
  
  extension [Self <: AbrController](x: Self) {
    
    inline def setAutoLevelCapping(value: Double): Self = StObject.set(x, "autoLevelCapping", value.asInstanceOf[js.Any])
    
    inline def setHandledEvents(value: js.Array[String]): Self = StObject.set(x, "handledEvents", value.asInstanceOf[js.Any])
    
    inline def setHandledEventsVarargs(value: String*): Self = StObject.set(x, "handledEvents", js.Array(value :_*))
    
    inline def setHls(value: Hls): Self = StObject.set(x, "hls", value.asInstanceOf[js.Any])
    
    inline def setLastLoadedFragLevel(value: Double): Self = StObject.set(x, "lastLoadedFragLevel", value.asInstanceOf[js.Any])
    
    inline def setNextAutoLevel(value: Double): Self = StObject.set(x, "nextAutoLevel", value.asInstanceOf[js.Any])
    
    inline def setUseGenericHandler(value: Boolean): Self = StObject.set(x, "useGenericHandler", value.asInstanceOf[js.Any])
  }
}
