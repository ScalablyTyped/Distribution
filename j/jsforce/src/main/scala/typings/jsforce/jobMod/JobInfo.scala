package typings.jsforce.jobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobInfo extends js.Object {
  var id: String
  var `object`: String
  var operation: String
  var state: String
}

object JobInfo {
  @scala.inline
  def apply(id: String, `object`: String, operation: String, state: String): JobInfo = {
    val __obj = js.Dynamic.literal(id = id, operation = operation, state = state)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[JobInfo]
  }
}

