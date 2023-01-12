package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DRMSystemOptions extends StObject {
  
  var audioRobustness: js.UndefOr[String] = js.undefined
  
  var videoRobustness: js.UndefOr[String] = js.undefined
}
object DRMSystemOptions {
  
  inline def apply(): DRMSystemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DRMSystemOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DRMSystemOptions] (val x: Self) extends AnyVal {
    
    inline def setAudioRobustness(value: String): Self = StObject.set(x, "audioRobustness", value.asInstanceOf[js.Any])
    
    inline def setAudioRobustnessUndefined: Self = StObject.set(x, "audioRobustness", js.undefined)
    
    inline def setVideoRobustness(value: String): Self = StObject.set(x, "videoRobustness", value.asInstanceOf[js.Any])
    
    inline def setVideoRobustnessUndefined: Self = StObject.set(x, "videoRobustness", js.undefined)
  }
}
