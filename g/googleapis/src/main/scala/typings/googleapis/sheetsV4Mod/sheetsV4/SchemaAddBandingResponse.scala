package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a banded range.
  */
@js.native
trait SchemaAddBandingResponse extends js.Object {
  /**
    * The banded range that was added.
    */
  var bandedRange: js.UndefOr[SchemaBandedRange] = js.native
}

object SchemaAddBandingResponse {
  @scala.inline
  def apply(bandedRange: SchemaBandedRange = null): SchemaAddBandingResponse = {
    val __obj = js.Dynamic.literal()
    if (bandedRange != null) __obj.updateDynamic("bandedRange")(bandedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddBandingResponse]
  }
}

