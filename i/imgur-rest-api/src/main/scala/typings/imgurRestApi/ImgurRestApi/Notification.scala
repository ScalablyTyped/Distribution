package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification[T] extends StObject {
  
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
  implicit class NotificationMutableBuilder[Self <: Notification[_], T] (val x: Self with Notification[T]) extends AnyVal {
    
    @scala.inline
    def setAccount_id(value: Double): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: T): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewed(value: Boolean): Self = StObject.set(x, "viewed", value.asInstanceOf[js.Any])
  }
}
