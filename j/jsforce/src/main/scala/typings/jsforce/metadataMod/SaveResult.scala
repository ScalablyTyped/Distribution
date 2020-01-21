package typings.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveResult extends js.Object {
  var fullName: String
  var success: Boolean
}

object SaveResult {
  @scala.inline
  def apply(fullName: String, success: Boolean): SaveResult = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SaveResult]
  }
}

