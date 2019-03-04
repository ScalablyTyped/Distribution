package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification[T] extends js.Object {
  var account_id: scala.Double
  var content: T
  var id: scala.Double
  var viewed: scala.Boolean
}

object Notification {
  @scala.inline
  def apply[T](account_id: scala.Double, content: T, id: scala.Double, viewed: scala.Boolean): Notification[T] = {
    val __obj = js.Dynamic.literal(account_id = account_id, content = content.asInstanceOf[js.Any], id = id, viewed = viewed)
  
    __obj.asInstanceOf[Notification[T]]
  }
}

