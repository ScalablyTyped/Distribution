package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveObsSettingsMod {
  
  trait LiveRtmpSettings extends StObject {
    
    var stream_key: String
    
    var stream_url: String
  }
  object LiveRtmpSettings {
    
    inline def apply(stream_key: String, stream_url: String): LiveRtmpSettings = {
      val __obj = js.Dynamic.literal(stream_key = stream_key.asInstanceOf[js.Any], stream_url = stream_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveRtmpSettings]
    }
    
    extension [Self <: LiveRtmpSettings](x: Self) {
      
      inline def setStream_key(value: String): Self = StObject.set(x, "stream_key", value.asInstanceOf[js.Any])
      
      inline def setStream_url(value: String): Self = StObject.set(x, "stream_url", value.asInstanceOf[js.Any])
    }
  }
}
