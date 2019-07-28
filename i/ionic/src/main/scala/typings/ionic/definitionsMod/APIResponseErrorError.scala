package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIResponseErrorError extends js.Object {
  var details: js.UndefOr[js.Array[APIResponseErrorDetails]] = js.undefined
  var link: String | Null
  var message: String
  var `type`: String
}

object APIResponseErrorError {
  @scala.inline
  def apply(
    message: String,
    `type`: String,
    details: js.Array[APIResponseErrorDetails] = null,
    link: String = null
  ): APIResponseErrorError = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    if (details != null) __obj.updateDynamic("details")(details)
    if (link != null) __obj.updateDynamic("link")(link)
    __obj.asInstanceOf[APIResponseErrorError]
  }
}

