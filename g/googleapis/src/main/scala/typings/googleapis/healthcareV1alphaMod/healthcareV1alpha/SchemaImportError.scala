package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains error status for each import failure.
  */
@js.native
trait SchemaImportError extends js.Object {
  /**
    * Resource name.
    */
  var resource: js.UndefOr[String] = js.native
  /**
    * Error status associated with resource.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}

object SchemaImportError {
  @scala.inline
  def apply(resource: String = null, status: SchemaStatus = null): SchemaImportError = {
    val __obj = js.Dynamic.literal()
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImportError]
  }
}

