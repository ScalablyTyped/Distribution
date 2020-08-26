package typings.grommet.dataTableMod

import typings.grommet.anon.Aggregate
import typings.grommet.grommetStrings.avg
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.max
import typings.grommet.grommetStrings.middle
import typings.grommet.grommetStrings.min
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.sum
import typings.grommet.grommetStrings.top
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnConfig[TRowType] extends js.Object {
  var aggregate: js.UndefOr[avg | max | min | sum] = js.native
  var align: js.UndefOr[center | start | end] = js.native
  var footer: js.UndefOr[ReactNode | Aggregate] = js.native
  var header: js.UndefOr[String | ReactNode | Aggregate] = js.native
  var primary: js.UndefOr[Boolean] = js.native
  var property: String = js.native
  var render: js.UndefOr[js.Function1[/* datum */ TRowType, ReactNode]] = js.native
  var search: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[ColumnSizeType | String] = js.native
  var sortable: js.UndefOr[Boolean] = js.native
  var verticalAlign: js.UndefOr[middle | top | bottom] = js.native
}

object ColumnConfig {
  @scala.inline
  def apply[TRowType](property: String): ColumnConfig[TRowType] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnConfig[TRowType]]
  }
  @scala.inline
  implicit class ColumnConfigOps[Self <: ColumnConfig[_], TRowType] (val x: Self with ColumnConfig[TRowType]) extends AnyVal {
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
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def setAggregate(value: avg | max | min | sum): Self = this.set("aggregate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregate: Self = this.set("aggregate", js.undefined)
    @scala.inline
    def setAlign(value: center | start | end): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setFooter(value: ReactNode | Aggregate): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setHeader(value: String | ReactNode | Aggregate): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setRender(value: /* datum */ TRowType => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setSearch(value: Boolean): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setSize(value: ColumnSizeType | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    @scala.inline
    def setVerticalAlign(value: middle | top | bottom): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
  }
  
}

