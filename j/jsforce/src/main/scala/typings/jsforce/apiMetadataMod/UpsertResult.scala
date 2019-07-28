package typings.jsforce.apiMetadataMod

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
    val __obj = js.Dynamic.literal(created = created, fullName = fullName, success = success)
  
    __obj.asInstanceOf[UpsertResult]
  }
}

