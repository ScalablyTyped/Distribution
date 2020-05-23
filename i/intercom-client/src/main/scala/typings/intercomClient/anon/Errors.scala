package typings.intercomClient.anon

import typings.intercomClient.intercomClientStrings.errorDotlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: js.Array[Code]
  var request_id: String
  var `type`: errorDotlist
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[Code], request_id: String, `type`: errorDotlist): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

