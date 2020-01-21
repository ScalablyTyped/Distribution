package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Errors when the connector is communicating to the source repository.
  */
@js.native
trait SchemaRepositoryError extends js.Object {
  /**
    * Message that describes the error. The maximum allowable length of the
    * message is 8192 characters.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * Error codes.  Matches the definition of HTTP status codes.
    */
  var httpStatusCode: js.UndefOr[Double] = js.native
  /**
    * Type of error.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaRepositoryError {
  @scala.inline
  def apply(errorMessage: String = null, httpStatusCode: Int | Double = null, `type`: String = null): SchemaRepositoryError = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (httpStatusCode != null) __obj.updateDynamic("httpStatusCode")(httpStatusCode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRepositoryError]
  }
}

