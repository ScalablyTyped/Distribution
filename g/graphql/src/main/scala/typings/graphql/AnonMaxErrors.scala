package typings.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxErrors extends js.Object {
  var maxErrors: js.UndefOr[Double] = js.undefined
}

object AnonMaxErrors {
  @scala.inline
  def apply(maxErrors: Int | Double = null): AnonMaxErrors = {
    val __obj = js.Dynamic.literal()
    if (maxErrors != null) __obj.updateDynamic("maxErrors")(maxErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxErrors]
  }
}

