package typings
package jsforceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeletedDate extends js.Object {
  var deletedDate: java.lang.String
  var id: java.lang.String
}

object Anon_DeletedDate {
  @scala.inline
  def apply(deletedDate: java.lang.String, id: java.lang.String): Anon_DeletedDate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deletedDate")(deletedDate)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_DeletedDate]
  }
}

