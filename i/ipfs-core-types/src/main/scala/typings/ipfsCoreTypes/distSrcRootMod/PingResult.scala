package typings.ipfsCoreTypes.distSrcRootMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PingResult extends StObject {
  
  var success: Boolean
  
  var text: String
  
  var time: Double
}
object PingResult {
  
  inline def apply(success: Boolean, text: String, time: Double): PingResult = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PingResult] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
