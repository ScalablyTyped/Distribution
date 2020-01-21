package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance operation errors list wrapper.
  */
@js.native
trait SchemaOperationErrors extends js.Object {
  /**
    * The list of errors encountered while processing this operation.
    */
  var errors: js.UndefOr[js.Array[SchemaOperationError]] = js.native
  /**
    * This is always sql#operationErrors.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaOperationErrors {
  @scala.inline
  def apply(errors: js.Array[SchemaOperationError] = null, kind: String = null): SchemaOperationErrors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperationErrors]
  }
}

