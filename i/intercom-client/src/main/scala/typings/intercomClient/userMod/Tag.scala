package typings.intercomClient.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  val id: String
}

object Tag {
  @scala.inline
  def apply(id: String): Tag = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

