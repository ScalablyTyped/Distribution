package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates properties of the supplied banded range.
  */
@js.native
trait SchemaUpdateBandingRequest extends js.Object {
  /**
    * The banded range to update with the new properties.
    */
  var bandedRange: js.UndefOr[SchemaBandedRange] = js.native
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `bandedRange` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
}

object SchemaUpdateBandingRequest {
  @scala.inline
  def apply(bandedRange: SchemaBandedRange = null, fields: String = null): SchemaUpdateBandingRequest = {
    val __obj = js.Dynamic.literal()
    if (bandedRange != null) __obj.updateDynamic("bandedRange")(bandedRange.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateBandingRequest]
  }
}

