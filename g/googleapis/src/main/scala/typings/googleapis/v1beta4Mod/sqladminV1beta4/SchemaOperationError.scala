package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance operation error.
  */
@js.native
trait SchemaOperationError extends js.Object {
  /**
    * Identifies the specific error that occurred.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * This is always sql#operationError.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Additional information about the error encountered.
    */
  var message: js.UndefOr[String] = js.native
}

object SchemaOperationError {
  @scala.inline
  def apply(code: String = null, kind: String = null, message: String = null): SchemaOperationError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperationError]
  }
}

