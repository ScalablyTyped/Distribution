package typings.griddleDashReact.griddleDashReactMod.components

import org.scalablytyped.runtime.StringDictionary
import typings.griddleDashReact.griddleDashReactMod.GriddleComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinitionProps
  extends // Allow custom plugin props
/* x */ StringDictionary[js.Any] {
  // TODO: Unused?
  //The number of cells this column should extend. Default is 1.
  var colSpan: js.UndefOr[Double] = js.undefined
  //The css class name, or a function to generate a class name from props, to apply to this column.
  var cssClassName: js.UndefOr[String | (js.Function1[/* props */ js.Any, String])] = js.undefined
  //The component that should be rendered instead of the standard column data. This component will still be rendered inside of a TD element.
  var customComponent: js.UndefOr[GriddleComponent[CellProps with js.Any]] = js.undefined
  //The component that should be used instead of the normal title
  var customHeadingComponent: js.UndefOr[GriddleComponent[TableHeadingCellProps with js.Any]] = js.undefined
  //Any extra data that should be passed to each instance of this column
  var extraData: js.UndefOr[js.Any] = js.undefined
  //Can this column be filtered
  var filterable: js.UndefOr[Boolean] = js.undefined
  //The css class name, or a function to generate a class name from props, to apply to the header for the column.
  var headerCssClassName: js.UndefOr[String | (js.Function1[/* props */ js.Any, String])] = js.undefined
  //The name of the column that this definition applies to.
  var id: String
  // Is this column metadta
  var isMetadata: js.UndefOr[Boolean] = js.undefined
  // TODO: Unused?
  //Determines whether or not the user can disable this column from the settings.
  var locked: js.UndefOr[Boolean] = js.undefined
  //The order that this column appears in. If not specified will just use the order that they are defined
  var order: js.UndefOr[Double] = js.undefined
  //What sort method this column uses
  var sortMethod: js.UndefOr[
    js.Function3[
      /* data */ js.Array[_], 
      /* column */ String, 
      /* sortAscending */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.undefined
  // TODO: Unused?
  //What sort type this column uses - magic string :shame:
  var sortType: js.UndefOr[String] = js.undefined
  //Can this column be sorted
  var sortable: js.UndefOr[Boolean] = js.undefined
  //The display name for the column. This is used when the name in the column heading and settings should be different from the data passed in to the Griddle component.
  var title: js.UndefOr[String] = js.undefined
  // Is this column visible
  var visible: js.UndefOr[Boolean] = js.undefined
  //The width of this column -- this is string so things like % can be specified
  var width: js.UndefOr[Double | String] = js.undefined
}

object ColumnDefinitionProps {
  @scala.inline
  def apply(
    id: String,
    StringDictionary: // Allow custom plugin props
  /* x */ StringDictionary[js.Any] = null,
    colSpan: Int | Double = null,
    cssClassName: String | (js.Function1[/* props */ js.Any, String]) = null,
    customComponent: GriddleComponent[CellProps with js.Any] = null,
    customHeadingComponent: GriddleComponent[TableHeadingCellProps with js.Any] = null,
    extraData: js.Any = null,
    filterable: js.UndefOr[Boolean] = js.undefined,
    headerCssClassName: String | (js.Function1[/* props */ js.Any, String]) = null,
    isMetadata: js.UndefOr[Boolean] = js.undefined,
    locked: js.UndefOr[Boolean] = js.undefined,
    order: Int | Double = null,
    sortMethod: (/* data */ js.Array[_], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double = null,
    sortType: String = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null
  ): ColumnDefinitionProps = {
    val __obj = js.Dynamic.literal(id = id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (cssClassName != null) __obj.updateDynamic("cssClassName")(cssClassName.asInstanceOf[js.Any])
    if (customComponent != null) __obj.updateDynamic("customComponent")(customComponent.asInstanceOf[js.Any])
    if (customHeadingComponent != null) __obj.updateDynamic("customHeadingComponent")(customHeadingComponent.asInstanceOf[js.Any])
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable)
    if (headerCssClassName != null) __obj.updateDynamic("headerCssClassName")(headerCssClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(isMetadata)) __obj.updateDynamic("isMetadata")(isMetadata)
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (sortMethod != null) __obj.updateDynamic("sortMethod")(js.Any.fromFunction3(sortMethod))
    if (sortType != null) __obj.updateDynamic("sortType")(sortType)
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinitionProps]
  }
}

