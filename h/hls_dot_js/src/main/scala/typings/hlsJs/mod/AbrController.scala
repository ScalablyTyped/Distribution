package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * (default: internal ABR controller)
  * Customized Adaptive Bitrate Streaming Controller.
  */
@js.native
trait AbrController extends StObject {
  
  /**
    * get: capping/max level value that could be used by ABR Controller
    * set: capping/max level value that could be used by ABR Controller
    */
  var autoLevelCapping: Double = js.native
  
  /**
    *  accumulated handled events
    */
  var handledEvents: js.Array[String] = js.native
  
  /**
    * current hls instance
    */
  var hls: Hls = js.native
  
  /**
    * last fragments corresponding level
    */
  var lastLoadedFragLevel: Double = js.native
  
  /**
    * get: next auto-quality levele/force next auto-quality level that should be returned
    * set: next auto-quality levele/force next auto-quality level that should be returned
    *  - currently used for emergency switch down
    */
  var nextAutoLevel: Double = js.native
  
  var useGenericHandler: Boolean = js.native
}
object AbrController {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AbrControllerMutableBuilder[Self <: AbrController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoLevelCapping(value: Double): Self = StObject.set(x, "autoLevelCapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandledEvents(value: js.Array[String]): Self = StObject.set(x, "handledEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandledEventsVarargs(value: String*): Self = StObject.set(x, "handledEvents", js.Array(value :_*))
    
    @scala.inline
    def setHls(value: Hls): Self = StObject.set(x, "hls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastLoadedFragLevel(value: Double): Self = StObject.set(x, "lastLoadedFragLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextAutoLevel(value: Double): Self = StObject.set(x, "nextAutoLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseGenericHandler(value: Boolean): Self = StObject.set(x, "useGenericHandler", value.asInstanceOf[js.Any])
  }
}
