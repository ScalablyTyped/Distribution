package typings.imgurDashRestDashApi.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification[T] extends js.Object {
  var account_id: Double
  var content: T
  var id: Double
  var viewed: Boolean
}

object Notification {
  @scala.inline
  def apply[T](account_id: Double, content: T, id: Double, viewed: Boolean): Notification[T] = {
    val __obj = js.Dynamic.literal(account_id = account_id, content = content.asInstanceOf[js.Any], id = id, viewed = viewed)
  
    __obj.asInstanceOf[Notification[T]]
  }
}

