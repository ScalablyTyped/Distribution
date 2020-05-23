package typings.jqueryAjaxfile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Method extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var timeout: Double
}

object Method {
  @scala.inline
  def apply(timeout: Double, method: String = null): Method = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
}

