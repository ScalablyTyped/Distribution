package typings.jestDashSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deleted extends js.Object {
  var deleted: Boolean
  var saved: Boolean
}

object Anon_Deleted {
  @scala.inline
  def apply(deleted: Boolean, saved: Boolean): Anon_Deleted = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], saved = saved.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Deleted]
  }
}

