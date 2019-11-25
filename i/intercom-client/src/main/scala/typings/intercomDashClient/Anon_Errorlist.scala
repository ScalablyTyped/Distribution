package typings.intercomDashClient

import typings.intercomDashClient.intercomDashClientStrings.errorDOTlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errorlist extends js.Object {
  var errors: js.Array[Anon_Code]
  var request_id: String
  var `type`: errorDOTlist
}

object Anon_Errorlist {
  @scala.inline
  def apply(errors: js.Array[Anon_Code], request_id: String, `type`: errorDOTlist): Anon_Errorlist = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Errorlist]
  }
}

