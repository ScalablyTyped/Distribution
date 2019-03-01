package typings
package jsforceLib.jobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobInfo extends js.Object {
  var id: java.lang.String
  var `object`: java.lang.String
  var operation: java.lang.String
  var state: java.lang.String
}

object JobInfo {
  @scala.inline
  def apply(
    id: java.lang.String,
    `object`: java.lang.String,
    operation: java.lang.String,
    state: java.lang.String
  ): JobInfo = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("operation")(operation)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[JobInfo]
  }
}

