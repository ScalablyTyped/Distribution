package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The error code and description for a conversion that failed to insert or
  * update.
  */
@js.native
trait SchemaConversionError extends js.Object {
  /**
    * The error code.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversionError&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A description of the error.
    */
  var message: js.UndefOr[String] = js.native
}

object SchemaConversionError {
  @scala.inline
  def apply(code: String = null, kind: String = null, message: String = null): SchemaConversionError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConversionError]
  }
}

