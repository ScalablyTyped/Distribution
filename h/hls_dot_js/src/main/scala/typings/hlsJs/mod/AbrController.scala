package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * (default: internal ABR controller)
  * Customized Adaptive Bitrate Streaming Controller.
  */
@js.native
trait AbrController extends js.Object {
  
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
  implicit class AbrControllerOps[Self <: AbrController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoLevelCapping(value: Double): Self = this.set("autoLevelCapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandledEventsVarargs(value: String*): Self = this.set("handledEvents", js.Array(value :_*))
    
    @scala.inline
    def setHandledEvents(value: js.Array[String]): Self = this.set("handledEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHls(value: Hls): Self = this.set("hls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastLoadedFragLevel(value: Double): Self = this.set("lastLoadedFragLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextAutoLevel(value: Double): Self = this.set("nextAutoLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseGenericHandler(value: Boolean): Self = this.set("useGenericHandler", value.asInstanceOf[js.Any])
  }
}
