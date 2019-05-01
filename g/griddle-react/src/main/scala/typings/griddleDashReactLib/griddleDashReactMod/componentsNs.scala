package typings
package griddleDashReactLib.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("griddle-react", "components")
@js.native
object componentsNs extends js.Object {
  @js.native
  class Cell ()
    extends reactLib.reactMod.Component[CellProps, js.Any, js.Any]
  
  trait CellProps extends js.Object {
    var className: js.UndefOr[java.lang.String] = js.undefined
    var columnId: js.UndefOr[java.lang.String] = js.undefined
    var griddleKey: js.UndefOr[scala.Double] = js.undefined
    var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.Element]] = js.undefined
    var onMouseEnter: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.Element]] = js.undefined
    var onMouseLeave: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.Element]] = js.undefined
    var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
    var value: js.UndefOr[js.Any] = js.undefined
  }
  
  @js.native
  class ColumnDefinition ()
    extends reactLib.reactMod.Component[ColumnDefinitionProps, js.Any, js.Any]
  
  trait ColumnDefinitionProps
    extends // Allow custom plugin props
  /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
    // TODO: Unused?
    //The number of cells this column should extend. Default is 1.
    var colSpan: js.UndefOr[scala.Double] = js.undefined
    //The css class name, or a function to generate a class name from props, to apply to this column.
    var cssClassName: js.UndefOr[java.lang.String | (js.Function1[/* props */ js.Any, java.lang.String])] = js.undefined
    //The component that should be rendered instead of the standard column data. This component will still be rendered inside of a TD element.
    var customComponent: js.UndefOr[griddleDashReactLib.griddleDashReactMod.GriddleComponent[CellProps with js.Any]] = js.undefined
    //The component that should be used instead of the normal title
    var customHeadingComponent: js.UndefOr[
        griddleDashReactLib.griddleDashReactMod.GriddleComponent[TableHeadingCellProps with js.Any]
      ] = js.undefined
    //Any extra data that should be passed to each instance of this column
    var extraData: js.UndefOr[js.Any] = js.undefined
    //Can this column be filtered
    var filterable: js.UndefOr[scala.Boolean] = js.undefined
    //The css class name, or a function to generate a class name from props, to apply to the header for the column.
    var headerCssClassName: js.UndefOr[java.lang.String | (js.Function1[/* props */ js.Any, java.lang.String])] = js.undefined
    //The name of the column that this definition applies to.
    var id: java.lang.String
    // Is this column metadta
    var isMetadata: js.UndefOr[scala.Boolean] = js.undefined
    // TODO: Unused?
    //Determines whether or not the user can disable this column from the settings.
    var locked: js.UndefOr[scala.Boolean] = js.undefined
    //The order that this column appears in. If not specified will just use the order that they are defined
    var order: js.UndefOr[scala.Double] = js.undefined
    //What sort method this column uses
    var sortMethod: js.UndefOr[
        js.Function3[
          /* data */ js.Array[_], 
          /* column */ java.lang.String, 
          /* sortAscending */ js.UndefOr[scala.Boolean], 
          scala.Double
        ]
      ] = js.undefined
    // TODO: Unused?
    //What sort type this column uses - magic string :shame:
    var sortType: js.UndefOr[java.lang.String] = js.undefined
    //Can this column be sorted
    var sortable: js.UndefOr[scala.Boolean] = js.undefined
    //The display name for the column. This is used when the name in the column heading and settings should be different from the data passed in to the Griddle component.
    var title: js.UndefOr[java.lang.String] = js.undefined
    // Is this column visible
    var visible: js.UndefOr[scala.Boolean] = js.undefined
    //The width of this column -- this is string so things like % can be specified
    var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  }
  
  @js.native
  class Filter ()
    extends reactLib.reactMod.Component[FilterProps, js.Any, js.Any]
  
  trait FilterProps
    extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
    var className: js.UndefOr[java.lang.String] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var setFilter: js.UndefOr[
        js.Function1[/* filter */ griddleDashReactLib.griddleDashReactMod.GriddleFilter, scala.Unit]
      ] = js.undefined
    var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  }
  
  @js.native
  class Row ()
    extends reactLib.reactMod.Component[RowProps, js.Any, js.Any]
  
  @js.native
  class RowDefinition ()
    extends reactLib.reactMod.Component[RowDefinitionProps, js.Any, js.Any]
  
  trait RowDefinitionProps
    extends // Allow custom plugin props
  /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
    //The column that will be known used to track child data
    //By default this will be "children"
    var childColumnName: js.UndefOr[java.lang.String] = js.undefined
    //The css class name, or a function to generate a class name from props, to apply to this row.
    var cssClassName: js.UndefOr[java.lang.String | (js.Function1[/* props */ js.Any, java.lang.String])] = js.undefined
    //The column value that should be used as the key for the row
    //if this is not set it will make one up (not efficient)
    var rowKey: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait RowProps extends js.Object {
    var Cell: js.UndefOr[js.Any] = js.undefined
    var className: js.UndefOr[java.lang.String] = js.undefined
    var columnIds: js.UndefOr[js.Array[scala.Double]] = js.undefined
    var griddleKey: js.UndefOr[java.lang.String] = js.undefined
    var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.Element]] = js.undefined
    var onMouseEnter: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.Element]] = js.undefined
    var onMouseLeave: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.Element]] = js.undefined
    var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  }
  
  @js.native
  class Settings ()
    extends reactLib.reactMod.Component[SettingsProps, js.Any, js.Any]
  
  trait SettingsProps extends js.Object {
    var className: js.UndefOr[java.lang.String] = js.undefined
    var settingsComponents: js.UndefOr[js.Array[griddleDashReactLib.griddleDashReactMod.GriddleComponent[_]]] = js.undefined
    var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  }
  
  @js.native
  class SettingsToggle ()
    extends reactLib.reactMod.Component[SettingsToggleProps, js.Any, js.Any]
  
  trait SettingsToggleProps extends js.Object {
    var className: js.UndefOr[java.lang.String] = js.undefined
    var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.Element]] = js.undefined
    var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
    var text: js.UndefOr[js.Any] = js.undefined
  }
  
  @js.native
  class SettingsWrapper ()
    extends reactLib.reactMod.Component[SettingsWrapperProps, js.Any, js.Any]
  
  trait SettingsWrapperProps extends js.Object {
    var Settings: js.UndefOr[griddleDashReactLib.griddleDashReactMod.GriddleComponent[SettingsProps]] = js.undefined
    var SettingsToggle: js.UndefOr[griddleDashReactLib.griddleDashReactMod.GriddleComponent[SettingsToggleProps]] = js.undefined
    var className: js.UndefOr[java.lang.String] = js.undefined
    var isEnabled: js.UndefOr[scala.Boolean] = js.undefined
    var isVisible: js.UndefOr[scala.Boolean] = js.undefined
    var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  }
  
  @js.native
  class Table ()
    extends reactLib.reactMod.Component[TableProps, js.Any, js.Any]
  
  @js.native
  class TableBody ()
    extends reactLib.reactMod.Component[TableBodyProps, js.Any, js.Any]
  
  trait TableBodyProps extends js.Object {
    var Row: js.UndefOr[js.Any] = js.undefined
    var className: js.UndefOr[java.lang.String] = js.undefined
    var rowIds: js.UndefOr[js.Array[scala.Double]] = js.undefined
    var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  }
  
  @js.native
  class TableHeading ()
    extends reactLib.reactMod.Component[TableHeadingProps, js.Any, js.Any]
  
  @js.native
  class TableHeadingCell ()
    extends reactLib.reactMod.Component[TableHeadingCellProps, js.Any, js.Any]
  
  trait TableHeadingCellProps extends js.Object {
    var className: js.UndefOr[java.lang.String] = js.undefined
    var columnId: js.UndefOr[scala.Double] = js.undefined
    var icon: js.UndefOr[js.Any] = js.undefined
    var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.Element]] = js.undefined
    var onMouseEnter: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.Element]] = js.undefined
    var onMouseLeave: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.Element]] = js.undefined
    var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
    var title: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait TableHeadingProps extends js.Object {
    var TableHeadingCell: js.Any
    var columnIds: js.UndefOr[js.Array[scala.Double]] = js.undefined
    var columnTitles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  }
  
  trait TableProps extends js.Object {
    var NoResults: js.UndefOr[js.Any] = js.undefined
    var TableBody: js.UndefOr[js.Any] = js.undefined
    var TableHeading: js.UndefOr[js.Any] = js.undefined
    var visibleRows: js.UndefOr[scala.Double] = js.undefined
  }
  
  val SettingsComponents: griddleDashReactLib.griddleDashReactMod.PropertyBag[griddleDashReactLib.griddleDashReactMod.GriddleComponent[js.Any]] = js.native
  def SettingsContainer(OriginalComponent: js.Any): js.Any = js.native
  def SettingsToggleContainer(OriginalComponent: js.Any): js.Any = js.native
  def SettingsWrapperContainer(OriginalComponent: js.Any): js.Any = js.native
  def TableContainer(OriginalComponent: js.Any): js.Any = js.native
}

