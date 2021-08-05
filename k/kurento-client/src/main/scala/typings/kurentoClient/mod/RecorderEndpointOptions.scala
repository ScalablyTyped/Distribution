package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecorderEndpointOptions extends StObject {
  
  var stopOnEndOfStream: js.UndefOr[Boolean] = js.undefined
  
  var uri: String
}
object RecorderEndpointOptions {
  
  inline def apply(uri: String): RecorderEndpointOptions = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderEndpointOptions]
  }
  
  extension [Self <: RecorderEndpointOptions](x: Self) {
    
    inline def setStopOnEndOfStream(value: Boolean): Self = StObject.set(x, "stopOnEndOfStream", value.asInstanceOf[js.Any])
    
    inline def setStopOnEndOfStreamUndefined: Self = StObject.set(x, "stopOnEndOfStream", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
