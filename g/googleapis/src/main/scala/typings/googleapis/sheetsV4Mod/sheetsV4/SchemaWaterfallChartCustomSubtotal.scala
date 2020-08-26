package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A custom subtotal column for a waterfall chart series.
  */
@js.native
trait SchemaWaterfallChartCustomSubtotal extends js.Object {
  /**
    * True if the data point at subtotal_index is the subtotal. If false, the
    * subtotal will be computed and appear after the data point.
    */
  var dataIsSubtotal: js.UndefOr[Boolean] = js.native
  /**
    * A label for the subtotal column.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The 0-based index of a data point within the series. If data_is_subtotal
    * is true, the data point at this index is the subtotal. Otherwise, the
    * subtotal appears after the data point with this index. A series can have
    * multiple subtotals at arbitrary indices, but subtotals do not affect the
    * indices of the data points. For example, if a series has three data
    * points, their indices will always be 0, 1, and 2, regardless of how many
    * subtotals exist on the series or what data points they are associated
    * with.
    */
  var subtotalIndex: js.UndefOr[Double] = js.native
}

object SchemaWaterfallChartCustomSubtotal {
  @scala.inline
  def apply(): SchemaWaterfallChartCustomSubtotal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWaterfallChartCustomSubtotal]
  }
  @scala.inline
  implicit class SchemaWaterfallChartCustomSubtotalOps[Self <: SchemaWaterfallChartCustomSubtotal] (val x: Self) extends AnyVal {
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
    def setDataIsSubtotal(value: Boolean): Self = this.set("dataIsSubtotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataIsSubtotal: Self = this.set("dataIsSubtotal", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setSubtotalIndex(value: Double): Self = this.set("subtotalIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtotalIndex: Self = this.set("subtotalIndex", js.undefined)
  }
  
}

