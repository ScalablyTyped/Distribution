package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Numreupload extends js.Object {
  
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
  implicit class NumreuploadOps[Self <: Numreupload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNum_reupload(value: Double): Self = this.set("num_reupload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_step_auto_retry(value: Double): Self = this.set("num_step_auto_retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_step_manual_retry(value: Double): Self = this.set("num_step_manual_retry", value.asInstanceOf[js.Any])
  }
}
