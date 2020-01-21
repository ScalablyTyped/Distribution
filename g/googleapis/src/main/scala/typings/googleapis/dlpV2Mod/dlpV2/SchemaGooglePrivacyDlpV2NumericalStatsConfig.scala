package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Compute numerical stats over an individual column, including min, max, and
  * quantiles.
  */
@js.native
trait SchemaGooglePrivacyDlpV2NumericalStatsConfig extends js.Object {
  /**
    * Field to compute numerical stats on. Supported types are integer, float,
    * date, datetime, timestamp, time.
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
}

object SchemaGooglePrivacyDlpV2NumericalStatsConfig {
  @scala.inline
  def apply(field: SchemaGooglePrivacyDlpV2FieldId = null): SchemaGooglePrivacyDlpV2NumericalStatsConfig = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2NumericalStatsConfig]
  }
}

