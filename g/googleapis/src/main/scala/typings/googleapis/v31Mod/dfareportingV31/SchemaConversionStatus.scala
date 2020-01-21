package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The original conversion that was inserted or updated and whether there were
  * any errors.
  */
@js.native
trait SchemaConversionStatus extends js.Object {
  /**
    * The original conversion that was inserted or updated.
    */
  var conversion: js.UndefOr[SchemaConversion] = js.native
  /**
    * A list of errors related to this conversion.
    */
  var errors: js.UndefOr[js.Array[SchemaConversionError]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversionStatus&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaConversionStatus {
  @scala.inline
  def apply(
    conversion: SchemaConversion = null,
    errors: js.Array[SchemaConversionError] = null,
    kind: String = null
  ): SchemaConversionStatus = {
    val __obj = js.Dynamic.literal()
    if (conversion != null) __obj.updateDynamic("conversion")(conversion.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConversionStatus]
  }
}

