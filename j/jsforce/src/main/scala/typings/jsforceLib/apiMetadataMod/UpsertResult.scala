package typings
package jsforceLib.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpsertResult extends js.Object {
  var created: scala.Boolean
  var fullName: java.lang.String
  var success: scala.Boolean
}

object UpsertResult {
  @scala.inline
  def apply(created: scala.Boolean, fullName: java.lang.String, success: scala.Boolean): UpsertResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("fullName")(fullName)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[UpsertResult]
  }
}

