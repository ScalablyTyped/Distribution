package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Validation based on a list of allowed values.
  */
@js.native
trait SchemaValueValidation extends js.Object {
  /**
    * Required. List of allowed values for the parameter.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaValueValidation {
  @scala.inline
  def apply(values: js.Array[String] = null): SchemaValueValidation = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaValueValidation]
  }
}

