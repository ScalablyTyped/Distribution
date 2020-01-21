package typings.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpsertResult extends js.Object {
  var created: Boolean
  var fullName: String
  var success: Boolean
}

object UpsertResult {
  @scala.inline
  def apply(created: Boolean, fullName: String, success: Boolean): UpsertResult = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpsertResult]
  }
}

