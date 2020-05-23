package typings.jestUtil.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Failed extends js.Object {
  var failed: String
  var pending: String
  var success: String
  var todo: String
}

object Failed {
  @scala.inline
  def apply(failed: String, pending: String, success: String, todo: String): Failed = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], todo = todo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failed]
  }
}

