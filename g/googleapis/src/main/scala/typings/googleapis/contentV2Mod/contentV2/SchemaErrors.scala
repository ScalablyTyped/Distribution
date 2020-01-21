package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of errors returned by a failed batch entry.
  */
@js.native
trait SchemaErrors extends js.Object {
  /**
    * The HTTP status of the first error in errors.
    */
  var code: js.UndefOr[Double] = js.native
  /**
    * A list of errors.
    */
  var errors: js.UndefOr[js.Array[SchemaError]] = js.native
  /**
    * The message of the first error in errors.
    */
  var message: js.UndefOr[String] = js.native
}

object SchemaErrors {
  @scala.inline
  def apply(code: Int | Double = null, errors: js.Array[SchemaError] = null, message: String = null): SchemaErrors = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaErrors]
  }
}

