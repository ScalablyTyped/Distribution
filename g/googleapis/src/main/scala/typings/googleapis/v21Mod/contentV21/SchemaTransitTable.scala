package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTransitTable extends js.Object {
  /**
    * A list of postal group names. The last value can be &quot;all other
    * locations&quot;. Example: [&quot;zone 1&quot;, &quot;zone 2&quot;,
    * &quot;all other locations&quot;]. The referred postal code groups must
    * match the delivery country of the service.
    */
  var postalCodeGroupNames: js.UndefOr[js.Array[String]] = js.native
  var rows: js.UndefOr[js.Array[SchemaTransitTableTransitTimeRow]] = js.native
  /**
    * A list of transit time labels. The last value can be &quot;all other
    * labels&quot;. Example: [&quot;food&quot;, &quot;electronics&quot;,
    * &quot;all other labels&quot;].
    */
  var transitTimeLabels: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTransitTable {
  @scala.inline
  def apply(
    postalCodeGroupNames: js.Array[String] = null,
    rows: js.Array[SchemaTransitTableTransitTimeRow] = null,
    transitTimeLabels: js.Array[String] = null
  ): SchemaTransitTable = {
    val __obj = js.Dynamic.literal()
    if (postalCodeGroupNames != null) __obj.updateDynamic("postalCodeGroupNames")(postalCodeGroupNames.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (transitTimeLabels != null) __obj.updateDynamic("transitTimeLabels")(transitTimeLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTransitTable]
  }
}

