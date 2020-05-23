package typings.jestSnapshot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deleted extends js.Object {
  var deleted: Boolean
  var saved: Boolean
}

object Deleted {
  @scala.inline
  def apply(deleted: Boolean, saved: Boolean): Deleted = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], saved = saved.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deleted]
  }
}

