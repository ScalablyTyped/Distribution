package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceMap extends StObject {
  
  var audioInput: js.UndefOr[js.Array[Device]] = js.undefined
  
  var audioOutput: js.UndefOr[js.Array[Device]] = js.undefined
  
  var videoInput: js.UndefOr[js.Array[Device]] = js.undefined
}
object DeviceMap {
  
  inline def apply(): DeviceMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMap]
  }
  
  extension [Self <: DeviceMap](x: Self) {
    
    inline def setAudioInput(value: js.Array[Device]): Self = StObject.set(x, "audioInput", value.asInstanceOf[js.Any])
    
    inline def setAudioInputUndefined: Self = StObject.set(x, "audioInput", js.undefined)
    
    inline def setAudioInputVarargs(value: Device*): Self = StObject.set(x, "audioInput", js.Array(value*))
    
    inline def setAudioOutput(value: js.Array[Device]): Self = StObject.set(x, "audioOutput", value.asInstanceOf[js.Any])
    
    inline def setAudioOutputUndefined: Self = StObject.set(x, "audioOutput", js.undefined)
    
    inline def setAudioOutputVarargs(value: Device*): Self = StObject.set(x, "audioOutput", js.Array(value*))
    
    inline def setVideoInput(value: js.Array[Device]): Self = StObject.set(x, "videoInput", value.asInstanceOf[js.Any])
    
    inline def setVideoInputUndefined: Self = StObject.set(x, "videoInput", js.undefined)
    
    inline def setVideoInputVarargs(value: Device*): Self = StObject.set(x, "videoInput", js.Array(value*))
  }
}
