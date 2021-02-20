package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Numreupload extends StObject {
  
  var num_reupload: Double = js.native
  
  var num_step_auto_retry: Double = js.native
  
  var num_step_manual_retry: Double = js.native
}
object Numreupload {
  
  @scala.inline
  def apply(num_reupload: Double, num_step_auto_retry: Double, num_step_manual_retry: Double): Numreupload = {
    val __obj = js.Dynamic.literal(num_reupload = num_reupload.asInstanceOf[js.Any], num_step_auto_retry = num_step_auto_retry.asInstanceOf[js.Any], num_step_manual_retry = num_step_manual_retry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Numreupload]
  }
  
  @scala.inline
  implicit class NumreuploadMutableBuilder[Self <: Numreupload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNum_reupload(value: Double): Self = StObject.set(x, "num_reupload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_step_auto_retry(value: Double): Self = StObject.set(x, "num_step_auto_retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_step_manual_retry(value: Double): Self = StObject.set(x, "num_step_manual_retry", value.asInstanceOf[js.Any])
  }
}
