package typings
package jsforceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreatedDate extends js.Object {
  var createdDate: js.Any
  var `type`: js.Object
}

object Anon_CreatedDate {
  @scala.inline
  def apply(createdDate: js.Any, `type`: js.Object): Anon_CreatedDate = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.asInstanceOf[Anon_CreatedDate]
  }
}

