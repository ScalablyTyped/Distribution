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
    
    @scala.inline
    def apply(stream_key: String, stream_url: String): LiveRtmpSettings = {
      val __obj = js.Dynamic.literal(stream_key = stream_key.asInstanceOf[js.Any], stream_url = stream_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveRtmpSettings]
    }
    
    @scala.inline
    implicit class LiveRtmpSettingsMutableBuilder[Self <: LiveRtmpSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStream_key(value: String): Self = StObject.set(x, "stream_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStream_url(value: String): Self = StObject.set(x, "stream_url", value.asInstanceOf[js.Any])
    }
  }
}
