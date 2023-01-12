package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecorderEndpointOptions extends StObject {
  
  var mediaProfile: js.UndefOr[MediaProfileSpecType] = js.undefined
  
  var stopOnEndOfStream: js.UndefOr[Boolean] = js.undefined
  
  var uri: String
}
object RecorderEndpointOptions {
  
  inline def apply(uri: String): RecorderEndpointOptions = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderEndpointOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecorderEndpointOptions] (val x: Self) extends AnyVal {
    
    inline def setMediaProfile(value: MediaProfileSpecType): Self = StObject.set(x, "mediaProfile", value.asInstanceOf[js.Any])
    
    inline def setMediaProfileUndefined: Self = StObject.set(x, "mediaProfile", js.undefined)
    
    inline def setStopOnEndOfStream(value: Boolean): Self = StObject.set(x, "stopOnEndOfStream", value.asInstanceOf[js.Any])
    
    inline def setStopOnEndOfStreamUndefined: Self = StObject.set(x, "stopOnEndOfStream", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
