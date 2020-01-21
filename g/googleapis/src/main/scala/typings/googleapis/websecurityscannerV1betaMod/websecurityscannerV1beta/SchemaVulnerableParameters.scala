package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about vulnerable request parameters.
  */
@js.native
trait SchemaVulnerableParameters extends js.Object {
  /**
    * The vulnerable parameter names.
    */
  var parameterNames: js.UndefOr[js.Array[String]] = js.native
}

object SchemaVulnerableParameters {
  @scala.inline
  def apply(parameterNames: js.Array[String] = null): SchemaVulnerableParameters = {
    val __obj = js.Dynamic.literal()
    if (parameterNames != null) __obj.updateDynamic("parameterNames")(parameterNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVulnerableParameters]
  }
}

