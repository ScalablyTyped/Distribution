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
  def apply(): SchemaDimensionValueRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionValueRequest]
  }
  @scala.inline
  implicit class SchemaDimensionValueRequestOps[Self <: SchemaDimensionValueRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDimensionName(value: String): Self = this.set("dimensionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionName: Self = this.set("dimensionName", js.undefined)
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: SchemaDimensionFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[SchemaDimensionFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
  }
  
}

