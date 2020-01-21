package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a DimensionValuesRequest.
  */
@js.native
trait SchemaDimensionValueRequest extends js.Object {
  /**
    * The name of the dimension for which values should be requested.
    */
  var dimensionName: js.UndefOr[String] = js.native
  /**
    * The end date of the date range for which to retrieve dimension values. A
    * string of the format &quot;yyyy-MM-dd&quot;.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * The list of filters by which to filter values. The filters are ANDed.
    */
  var filters: js.UndefOr[js.Array[SchemaDimensionFilter]] = js.native
  /**
    * The kind of request this is, in this case
    * dfareporting#dimensionValueRequest.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The start date of the date range for which to retrieve dimension values.
    * A string of the format &quot;yyyy-MM-dd&quot;.
    */
  var startDate: js.UndefOr[String] = js.native
}

object SchemaDimensionValueRequest {
  @scala.inline
  def apply(
    dimensionName: String = null,
    endDate: String = null,
    filters: js.Array[SchemaDimensionFilter] = null,
    kind: String = null,
    startDate: String = null
  ): SchemaDimensionValueRequest = {
    val __obj = js.Dynamic.literal()
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDimensionValueRequest]
  }
}

