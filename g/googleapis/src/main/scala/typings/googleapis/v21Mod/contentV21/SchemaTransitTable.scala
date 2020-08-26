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
  def apply(): SchemaTransitTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransitTable]
  }
  @scala.inline
  implicit class SchemaTransitTableOps[Self <: SchemaTransitTable] (val x: Self) extends AnyVal {
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
    def setPostalCodeGroupNamesVarargs(value: String*): Self = this.set("postalCodeGroupNames", js.Array(value :_*))
    @scala.inline
    def setPostalCodeGroupNames(value: js.Array[String]): Self = this.set("postalCodeGroupNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCodeGroupNames: Self = this.set("postalCodeGroupNames", js.undefined)
    @scala.inline
    def setRowsVarargs(value: SchemaTransitTableTransitTimeRow*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[SchemaTransitTableTransitTimeRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setTransitTimeLabelsVarargs(value: String*): Self = this.set("transitTimeLabels", js.Array(value :_*))
    @scala.inline
    def setTransitTimeLabels(value: js.Array[String]): Self = this.set("transitTimeLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitTimeLabels: Self = this.set("transitTimeLabels", js.undefined)
  }
  
}

