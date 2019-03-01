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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("account_id")(account_id)
    __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("viewed")(viewed)
    __obj.asInstanceOf[Notification[T]]
  }
}

