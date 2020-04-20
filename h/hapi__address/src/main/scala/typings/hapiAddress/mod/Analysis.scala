package typings.hapiAddress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analysis extends js.Object {
  /**
    * The error code.
    */
  var code: String
  /**
    * The reason validation failed.
    */
  var error: String
}

object Analysis {
  @scala.inline
  def apply(code: String, error: String): Analysis = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analysis]
  }
}

