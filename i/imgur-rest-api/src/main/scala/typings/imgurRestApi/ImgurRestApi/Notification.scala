package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification[T] extends js.Object {
  
  var account_id: Double = js.native
  
  var content: T = js.native
  
  var id: Double = js.native
  
  var viewed: Boolean = js.native
}
object Notification {
  
  @scala.inline
  def apply[T](account_id: Double, content: T, id: Double, viewed: Boolean): Notification[T] = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], viewed = viewed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification[T]]
  }
  
  @scala.inline
  implicit class NotificationOps[Self <: Notification[_], T] (val x: Self with Notification[T]) extends AnyVal {
    
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
    def setAccount_id(value: Double): Self = this.set("account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: T): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewed(value: Boolean): Self = this.set("viewed", value.asInstanceOf[js.Any])
  }
}
