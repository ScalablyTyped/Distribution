package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error returned by the API.
  */
@js.native
trait SchemaError extends js.Object {
  /**
    * The domain of the error.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * A description of the error.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The error code.
    */
  var reason: js.UndefOr[String] = js.native
}

object SchemaError {
  @scala.inline
  def apply(domain: String = null, message: String = null, reason: String = null): SchemaError = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaError]
  }
}

