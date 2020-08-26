package typings.griddleReact.mod.components

import org.scalablytyped.runtime.StringDictionary
import typings.griddleReact.mod.GriddleComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnDefinitionProps
  extends /* x */ StringDictionary[js.Any] {
  // TODO: Unused?
  //The number of cells this column should extend. Default is 1.
  var colSpan: js.UndefOr[Double] = js.native
  //The css class name, or a function to generate a class name from props, to apply to this column.
  var cssClassName: js.UndefOr[String | (js.Function1[/* props */ js.Any, String])] = js.native
  //The component that should be rendered instead of the standard column data. This component will still be rendered inside of a TD element.
  var customComponent: js.UndefOr[GriddleComponent[CellProps with js.Any]] = js.native
  //The component that should be used instead of the normal title
  var customHeadingComponent: js.UndefOr[GriddleComponent[TableHeadingCellProps with js.Any]] = js.native
  //Any extra data that should be passed to each instance of this column
  var extraData: js.UndefOr[js.Any] = js.native
  //Can this column be filtered
  var filterable: js.UndefOr[Boolean] = js.native
  //The css class name, or a function to generate a class name from props, to apply to the header for the column.
  var headerCssClassName: js.UndefOr[String | (js.Function1[/* props */ js.Any, String])] = js.native
  //The name of the column that this definition applies to.
  var id: String = js.native
  // Is this column metadta
  var isMetadata: js.UndefOr[Boolean] = js.native
  // TODO: Unused?
  //Determines whether or not the user can disable this column from the settings.
  var locked: js.UndefOr[Boolean] = js.native
  //The order that this column appears in. If not specified will just use the order that they are defined
  var order: js.UndefOr[Double] = js.native
  //What sort method this column uses
  var sortMethod: js.UndefOr[
    js.Function3[
      /* data */ js.Array[_], 
      /* column */ String, 
      /* sortAscending */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.native
  // TODO: Unused?
  //What sort type this column uses - magic string :shame:
  var sortType: js.UndefOr[String] = js.native
  //Can this column be sorted
  var sortable: js.UndefOr[Boolean] = js.native
  //The display name for the column. This is used when the name in the column heading and settings should be different from the data passed in to the Griddle component.
  var title: js.UndefOr[String] = js.native
  // Is this column visible
  var visible: js.UndefOr[Boolean] = js.native
  //The width of this column -- this is string so things like % can be specified
  var width: js.UndefOr[Double | String] = js.native
}

object ColumnDefinitionProps {
  @scala.inline
  def apply(id: String): ColumnDefinitionProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinitionProps]
  }
  @scala.inline
  implicit class ColumnDefinitionPropsOps[Self <: ColumnDefinitionProps] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    @scala.inline
    def setCssClassNameFunction1(value: /* props */ js.Any => String): Self = this.set("cssClassName", js.Any.fromFunction1(value))
    @scala.inline
    def setCssClassName(value: String | (js.Function1[/* props */ js.Any, String])): Self = this.set("cssClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClassName: Self = this.set("cssClassName", js.undefined)
    @scala.inline
    def setCustomComponent(value: GriddleComponent[CellProps with js.Any]): Self = this.set("customComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomComponent: Self = this.set("customComponent", js.undefined)
    @scala.inline
    def setCustomHeadingComponent(value: GriddleComponent[TableHeadingCellProps with js.Any]): Self = this.set("customHeadingComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomHeadingComponent: Self = this.set("customHeadingComponent", js.undefined)
    @scala.inline
    def setExtraData(value: js.Any): Self = this.set("extraData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraData: Self = this.set("extraData", js.undefined)
    @scala.inline
    def setFilterable(value: Boolean): Self = this.set("filterable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterable: Self = this.set("filterable", js.undefined)
    @scala.inline
    def setHeaderCssClassNameFunction1(value: /* props */ js.Any => String): Self = this.set("headerCssClassName", js.Any.fromFunction1(value))
    @scala.inline
    def setHeaderCssClassName(value: String | (js.Function1[/* props */ js.Any, String])): Self = this.set("headerCssClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderCssClassName: Self = this.set("headerCssClassName", js.undefined)
    @scala.inline
    def setIsMetadata(value: Boolean): Self = this.set("isMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMetadata: Self = this.set("isMetadata", js.undefined)
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setSortMethod(
      value: (/* data */ js.Array[_], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double
    ): Self = this.set("sortMethod", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSortMethod: Self = this.set("sortMethod", js.undefined)
    @scala.inline
    def setSortType(value: String): Self = this.set("sortType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortType: Self = this.set("sortType", js.undefined)
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

