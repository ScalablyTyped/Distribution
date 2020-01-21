package typings.jestSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeleted extends js.Object {
  var deleted: Boolean
  var saved: Boolean
}

object AnonDeleted {
  @scala.inline
  def apply(deleted: Boolean, saved: Boolean): AnonDeleted = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], saved = saved.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeleted]
  }
}

