package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsWarmup extends StObject {
  
  /** the end date and time for the warmup process as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var end_at: String
  
  /** the start time for the warmup process as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var start_at: String
  
  /** whether the ip is currently in warmup mode */
  var warming_up: Boolean
}
object IpsWarmup {
  
  inline def apply(end_at: String, start_at: String, warming_up: Boolean): IpsWarmup = {
    val __obj = js.Dynamic.literal(end_at = end_at.asInstanceOf[js.Any], start_at = start_at.asInstanceOf[js.Any], warming_up = warming_up.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpsWarmup]
  }
  
  extension [Self <: IpsWarmup](x: Self) {
    
    inline def setEnd_at(value: String): Self = StObject.set(x, "end_at", value.asInstanceOf[js.Any])
    
    inline def setStart_at(value: String): Self = StObject.set(x, "start_at", value.asInstanceOf[js.Any])
    
    inline def setWarming_up(value: Boolean): Self = StObject.set(x, "warming_up", value.asInstanceOf[js.Any])
  }
}
