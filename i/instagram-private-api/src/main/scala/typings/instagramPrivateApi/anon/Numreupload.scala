package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Numreupload extends StObject {
  
  var num_reupload: Double
  
  var num_step_auto_retry: Double
  
  var num_step_manual_retry: Double
}
object Numreupload {
  
  inline def apply(num_reupload: Double, num_step_auto_retry: Double, num_step_manual_retry: Double): Numreupload = {
    val __obj = js.Dynamic.literal(num_reupload = num_reupload.asInstanceOf[js.Any], num_step_auto_retry = num_step_auto_retry.asInstanceOf[js.Any], num_step_manual_retry = num_step_manual_retry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Numreupload]
  }
  
  extension [Self <: Numreupload](x: Self) {
    
    inline def setNum_reupload(value: Double): Self = StObject.set(x, "num_reupload", value.asInstanceOf[js.Any])
    
    inline def setNum_step_auto_retry(value: Double): Self = StObject.set(x, "num_step_auto_retry", value.asInstanceOf[js.Any])
    
    inline def setNum_step_manual_retry(value: Double): Self = StObject.set(x, "num_step_manual_retry", value.asInstanceOf[js.Any])
  }
}
