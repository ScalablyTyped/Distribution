package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamId_ extends StObject {
  
  var ruploadParams: js.Any
  
  var streamId: js.Any
}
object StreamId_ {
  
  @scala.inline
  def apply(ruploadParams: js.Any, streamId: js.Any): StreamId_ = {
    val __obj = js.Dynamic.literal(ruploadParams = ruploadParams.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamId_]
  }
  
  @scala.inline
  implicit class StreamId_MutableBuilder[Self <: StreamId_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuploadParams(value: js.Any): Self = StObject.set(x, "ruploadParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: js.Any): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
  }
}
