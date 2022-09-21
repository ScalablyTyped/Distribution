package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferControllerConfig extends StObject {
  
  var appendErrorMaxRetry: Double
  
  var backBufferLength: Double
  
  var liveBackBufferLength: Double | Null
  
  var liveDurationInfinity: Boolean
}
object BufferControllerConfig {
  
  inline def apply(appendErrorMaxRetry: Double, backBufferLength: Double, liveDurationInfinity: Boolean): BufferControllerConfig = {
    val __obj = js.Dynamic.literal(appendErrorMaxRetry = appendErrorMaxRetry.asInstanceOf[js.Any], backBufferLength = backBufferLength.asInstanceOf[js.Any], liveDurationInfinity = liveDurationInfinity.asInstanceOf[js.Any], liveBackBufferLength = null)
    __obj.asInstanceOf[BufferControllerConfig]
  }
  
  extension [Self <: BufferControllerConfig](x: Self) {
    
    inline def setAppendErrorMaxRetry(value: Double): Self = StObject.set(x, "appendErrorMaxRetry", value.asInstanceOf[js.Any])
    
    inline def setBackBufferLength(value: Double): Self = StObject.set(x, "backBufferLength", value.asInstanceOf[js.Any])
    
    inline def setLiveBackBufferLength(value: Double): Self = StObject.set(x, "liveBackBufferLength", value.asInstanceOf[js.Any])
    
    inline def setLiveBackBufferLengthNull: Self = StObject.set(x, "liveBackBufferLength", null)
    
    inline def setLiveDurationInfinity(value: Boolean): Self = StObject.set(x, "liveDurationInfinity", value.asInstanceOf[js.Any])
  }
}
