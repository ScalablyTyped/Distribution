package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viewprogresss extends js.Object {
  
  var view_progress_s: Double = js.native
}
object Viewprogresss {
  
  @scala.inline
  def apply(view_progress_s: Double): Viewprogresss = {
    val __obj = js.Dynamic.literal(view_progress_s = view_progress_s.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewprogresss]
  }
  
  @scala.inline
  implicit class ViewprogresssOps[Self <: Viewprogresss] (val x: Self) extends AnyVal {
    
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
    def setView_progress_s(value: Double): Self = this.set("view_progress_s", value.asInstanceOf[js.Any])
  }
}
