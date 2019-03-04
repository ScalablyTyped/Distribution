package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIResponseErrorError extends js.Object {
  var details: js.UndefOr[js.Array[APIResponseErrorDetails]] = js.undefined
  var link: java.lang.String | scala.Null
  var message: java.lang.String
  var `type`: java.lang.String
}

object APIResponseErrorError {
  @scala.inline
  def apply(
    message: java.lang.String,
    `type`: java.lang.String,
    details: js.Array[APIResponseErrorDetails] = null,
    link: java.lang.String = null
  ): APIResponseErrorError = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    if (details != null) __obj.updateDynamic("details")(details)
    if (link != null) __obj.updateDynamic("link")(link)
    __obj.asInstanceOf[APIResponseErrorError]
  }
}

