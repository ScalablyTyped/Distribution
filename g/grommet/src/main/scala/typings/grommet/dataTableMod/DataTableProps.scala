package typings.grommet.dataTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.grommet.anon.Background
import typings.grommet.anon.Direction
import typings.grommet.anon.Expand
import typings.grommet.anon.SizeStyle
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.BorderType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTableProps[TRowType] extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  // Appearance
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  var background: js.UndefOr[
    BackgroundType | (Sections[BackgroundType | js.Array[String], BackgroundType, BackgroundType])
  ] = js.native
  var border: js.UndefOr[BorderType | (Sections[BorderType, BorderType, BorderType])] = js.native
  var columns: js.UndefOr[js.Array[ColumnConfig[TRowType]]] = js.native
  // Data
  var data: js.UndefOr[js.Array[TRowType]] = js.native
  var gridArea: js.UndefOr[GridAreaType] = js.native
  var groupBy: js.UndefOr[String | Expand] = js.native
  var margin: js.UndefOr[MarginType] = js.native
  // Events
  var onClickRow: js.UndefOr[js.Function1[/* event */ MouseClick[TRowType] | KeyPress[TRowType], Unit]] = js.native
  var onMore: js.UndefOr[js.Function0[Unit]] = js.native
  var onSearch: js.UndefOr[js.Function1[/* search */ String, Unit]] = js.native
  var onSort: js.UndefOr[js.Function1[/* sort */ Direction, Unit]] = js.native
  var pad: js.UndefOr[PadType | (Sections[PadType, PadType, PadType])] = js.native
  var primaryKey: js.UndefOr[String | Boolean] = js.native
  var replace: js.UndefOr[Boolean] = js.native
  var resizeable: js.UndefOr[Boolean] = js.native
  var rowProps: js.UndefOr[StringDictionary[Background]] = js.native
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.native
  var sort: js.UndefOr[Direction] = js.native
  var sortable: js.UndefOr[Boolean] = js.native
  var step: js.UndefOr[Double] = js.native
}

object DataTableProps {
  @scala.inline
  def apply[TRowType](): DataTableProps[TRowType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTableProps[TRowType]]
  }
  @scala.inline
  implicit class DataTablePropsOps[Self <: DataTableProps[_], TRowType] (val x: Self with DataTableProps[TRowType]) extends AnyVal {
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
    def setA11yTitle(value: A11yTitleType): Self = this.set("a11yTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA11yTitle: Self = this.set("a11yTitle", js.undefined)
    @scala.inline
    def setAlignSelf(value: AlignSelfType): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    @scala.inline
    def setBackground(
      value: BackgroundType | (Sections[BackgroundType | js.Array[String], BackgroundType, BackgroundType])
    ): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBorderVarargs(value: SizeStyle*): Self = this.set("border", js.Array(value :_*))
    @scala.inline
    def setBorder(value: BorderType | (Sections[BorderType, BorderType, BorderType])): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: ColumnConfig[TRowType]*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[ColumnConfig[TRowType]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setDataVarargs(value: TRowType*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[TRowType]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setGridArea(value: GridAreaType): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    @scala.inline
    def setGroupBy(value: String | Expand): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOnClickRow(value: /* event */ MouseClick[TRowType] | KeyPress[TRowType] => Unit): Self = this.set("onClickRow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClickRow: Self = this.set("onClickRow", js.undefined)
    @scala.inline
    def setOnMore(value: () => Unit): Self = this.set("onMore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMore: Self = this.set("onMore", js.undefined)
    @scala.inline
    def setOnSearch(value: /* search */ String => Unit): Self = this.set("onSearch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
    @scala.inline
    def setOnSort(value: /* sort */ Direction => Unit): Self = this.set("onSort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSort: Self = this.set("onSort", js.undefined)
    @scala.inline
    def setPad(value: PadType | (Sections[PadType, PadType, PadType])): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    @scala.inline
    def setPrimaryKey(value: String | Boolean): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    @scala.inline
    def setResizeable(value: Boolean): Self = this.set("resizeable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeable: Self = this.set("resizeable", js.undefined)
    @scala.inline
    def setRowProps(value: StringDictionary[Background]): Self = this.set("rowProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowProps: Self = this.set("rowProps", js.undefined)
    @scala.inline
    def setSize(value: small | medium | large | xlarge | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSort(value: Direction): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
  
}

