package typings.griddleDashReact.griddleDashReactMod

import org.scalablytyped.runtime.StringDictionary
import typings.griddleDashReact.griddleDashReactMod.componentsNs.CellProps
import typings.griddleDashReact.griddleDashReactMod.componentsNs.ColumnDefinitionProps
import typings.griddleDashReact.griddleDashReactMod.componentsNs.FilterProps
import typings.griddleDashReact.griddleDashReactMod.componentsNs.RowDefinitionProps
import typings.griddleDashReact.griddleDashReactMod.componentsNs.RowProps
import typings.griddleDashReact.griddleDashReactMod.componentsNs.SettingsProps
import typings.griddleDashReact.griddleDashReactMod.componentsNs.SettingsToggleProps
import typings.griddleDashReact.griddleDashReactMod.componentsNs.SettingsWrapperProps
import typings.griddleDashReact.griddleDashReactMod.componentsNs.TableBodyProps
import typings.griddleDashReact.griddleDashReactMod.componentsNs.TableHeadingCellProps
import typings.griddleDashReact.griddleDashReactMod.componentsNs.TableHeadingProps
import typings.griddleDashReact.griddleDashReactMod.componentsNs.TableProps
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Component
import typings.react.reactMod.MouseEventHandler
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("griddle-react", "components")
@js.native
object componentsNs extends js.Object {
  @js.native
  class Cell ()
    extends Component[CellProps, js.Any, js.Any]
  
  trait CellProps extends js.Object {
    var className: js.UndefOr[String] = js.undefined
    var columnId: js.UndefOr[String] = js.undefined
    var griddleKey: js.UndefOr[Double] = js.undefined
    var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    var style: js.UndefOr[CSSProperties] = js.undefined
    var value: js.UndefOr[js.Any] = js.undefined
  }
  
  @js.native
  class ColumnDefinition ()
    extends Component[ColumnDefinitionProps, js.Any, js.Any]
  
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
  
  @js.native
  class Filter ()
    extends Component[FilterProps, js.Any, js.Any]
  
  trait FilterProps
    extends /* x */ StringDictionary[js.Any] {
    var className: js.UndefOr[String] = js.undefined
    var placeholder: js.UndefOr[String] = js.undefined
    var setFilter: js.UndefOr[js.Function1[/* filter */ GriddleFilter, Unit]] = js.undefined
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  
  @js.native
  class Row ()
    extends Component[RowProps, js.Any, js.Any]
  
  @js.native
  class RowDefinition ()
    extends Component[RowDefinitionProps, js.Any, js.Any]
  
  trait RowDefinitionProps
    extends // Allow custom plugin props
  /* x */ StringDictionary[js.Any] {
    //The column that will be known used to track child data
    //By default this will be "children"
    var childColumnName: js.UndefOr[String] = js.undefined
    //The css class name, or a function to generate a class name from props, to apply to this row.
    var cssClassName: js.UndefOr[String | (js.Function1[/* props */ js.Any, String])] = js.undefined
    //The column value that should be used as the key for the row
    //if this is not set it will make one up (not efficient)
    var rowKey: js.UndefOr[String] = js.undefined
  }
  
  trait RowProps extends js.Object {
    var Cell: js.UndefOr[js.Any] = js.undefined
    var className: js.UndefOr[String] = js.undefined
    var columnIds: js.UndefOr[js.Array[Double]] = js.undefined
    var griddleKey: js.UndefOr[String] = js.undefined
    var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  
  @js.native
  class Settings ()
    extends Component[SettingsProps, js.Any, js.Any]
  
  trait SettingsProps extends js.Object {
    var className: js.UndefOr[String] = js.undefined
    var settingsComponents: js.UndefOr[js.Array[GriddleComponent[_]]] = js.undefined
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  
  @js.native
  class SettingsToggle ()
    extends Component[SettingsToggleProps, js.Any, js.Any]
  
  trait SettingsToggleProps extends js.Object {
    var className: js.UndefOr[String] = js.undefined
    var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    var style: js.UndefOr[CSSProperties] = js.undefined
    var text: js.UndefOr[js.Any] = js.undefined
  }
  
  @js.native
  class SettingsWrapper ()
    extends Component[SettingsWrapperProps, js.Any, js.Any]
  
  trait SettingsWrapperProps extends js.Object {
    var Settings: js.UndefOr[GriddleComponent[SettingsProps]] = js.undefined
    var SettingsToggle: js.UndefOr[GriddleComponent[SettingsToggleProps]] = js.undefined
    var className: js.UndefOr[String] = js.undefined
    var isEnabled: js.UndefOr[Boolean] = js.undefined
    var isVisible: js.UndefOr[Boolean] = js.undefined
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  
  @js.native
  class Table ()
    extends Component[TableProps, js.Any, js.Any]
  
  @js.native
  class TableBody ()
    extends Component[TableBodyProps, js.Any, js.Any]
  
  trait TableBodyProps extends js.Object {
    var Row: js.UndefOr[js.Any] = js.undefined
    var className: js.UndefOr[String] = js.undefined
    var rowIds: js.UndefOr[js.Array[Double]] = js.undefined
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  
  @js.native
  class TableHeading ()
    extends Component[TableHeadingProps, js.Any, js.Any]
  
  @js.native
  class TableHeadingCell ()
    extends Component[TableHeadingCellProps, js.Any, js.Any]
  
  trait TableHeadingCellProps extends js.Object {
    var className: js.UndefOr[String] = js.undefined
    var columnId: js.UndefOr[Double] = js.undefined
    var icon: js.UndefOr[js.Any] = js.undefined
    var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    var style: js.UndefOr[CSSProperties] = js.undefined
    var title: js.UndefOr[String] = js.undefined
  }
  
  trait TableHeadingProps extends js.Object {
    var TableHeadingCell: js.Any
    var columnIds: js.UndefOr[js.Array[Double]] = js.undefined
    var columnTitles: js.UndefOr[js.Array[String]] = js.undefined
  }
  
  trait TableProps extends js.Object {
    var NoResults: js.UndefOr[js.Any] = js.undefined
    var TableBody: js.UndefOr[js.Any] = js.undefined
    var TableHeading: js.UndefOr[js.Any] = js.undefined
    var visibleRows: js.UndefOr[Double] = js.undefined
  }
  
  val SettingsComponents: PropertyBag[GriddleComponent[js.Any]] = js.native
  def SettingsContainer(OriginalComponent: js.Any): js.Any = js.native
  def SettingsToggleContainer(OriginalComponent: js.Any): js.Any = js.native
  def SettingsWrapperContainer(OriginalComponent: js.Any): js.Any = js.native
  def TableContainer(OriginalComponent: js.Any): js.Any = js.native
}

