package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure to describe the error encountered during batch operation on one
  * resource. This is used both for sample errors in operation response, and
  * for format of errors in error reports.
  */
@js.native
trait SchemaErrorDetail extends js.Object {
  /**
    * The status of the error.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  /**
    * The identifier of the resource.
    */
  var resource: js.UndefOr[String] = js.native
}

object SchemaErrorDetail {
  @scala.inline
  def apply(error: SchemaStatus = null, resource: String = null): SchemaErrorDetail = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaErrorDetail]
  }
}

