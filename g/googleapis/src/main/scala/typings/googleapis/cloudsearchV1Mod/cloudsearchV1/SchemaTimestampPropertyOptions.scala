package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for timestamp properties.
  */
@js.native
trait SchemaTimestampPropertyOptions extends js.Object {
  /**
    * If set, describes how the timestamp should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaTimestampOperatorOptions] = js.native
}

object SchemaTimestampPropertyOptions {
  @scala.inline
  def apply(operatorOptions: SchemaTimestampOperatorOptions = null): SchemaTimestampPropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (operatorOptions != null) __obj.updateDynamic("operatorOptions")(operatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTimestampPropertyOptions]
  }
}

