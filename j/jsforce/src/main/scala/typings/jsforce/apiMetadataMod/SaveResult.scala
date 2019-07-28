package typings.jsforce.apiMetadataMod

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
    val __obj = js.Dynamic.literal(fullName = fullName, success = success)
  
    __obj.asInstanceOf[SaveResult]
  }
}

