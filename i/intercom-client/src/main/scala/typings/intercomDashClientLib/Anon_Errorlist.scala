package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errorlist extends js.Object {
  var errors: js.Array[Anon_Code]
  var request_id: java.lang.String
  var `type`: intercomDashClientLib.intercomDashClientLibStrings.errorDOTlist
}

object Anon_Errorlist {
  @scala.inline
  def apply(
    errors: js.Array[Anon_Code],
    request_id: java.lang.String,
    `type`: intercomDashClientLib.intercomDashClientLibStrings.errorDOTlist
  ): Anon_Errorlist = {
    val __obj = js.Dynamic.literal(errors = errors, request_id = request_id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Errorlist]
  }
}

