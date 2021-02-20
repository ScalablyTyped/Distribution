package typings.griddleReact.mod.components

import org.scalablytyped.runtime.StringDictionary
import typings.griddleReact.mod.GriddleComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ColumnDefinitionPropsMutableBuilder[Self <: ColumnDefinitionProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    @scala.inline
    def setCssClassName(value: String | (js.Function1[/* props */ js.Any, String])): Self = StObject.set(x, "cssClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassNameFunction1(value: /* props */ js.Any => String): Self = StObject.set(x, "cssClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCssClassNameUndefined: Self = StObject.set(x, "cssClassName", js.undefined)
    
    @scala.inline
    def setCustomComponent(value: GriddleComponent[CellProps with js.Any]): Self = StObject.set(x, "customComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomComponentUndefined: Self = StObject.set(x, "customComponent", js.undefined)
    
    @scala.inline
    def setCustomHeadingComponent(value: GriddleComponent[TableHeadingCellProps with js.Any]): Self = StObject.set(x, "customHeadingComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomHeadingComponentUndefined: Self = StObject.set(x, "customHeadingComponent", js.undefined)
    
    @scala.inline
    def setExtraData(value: js.Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    @scala.inline
    def setHeaderCssClassName(value: String | (js.Function1[/* props */ js.Any, String])): Self = StObject.set(x, "headerCssClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderCssClassNameFunction1(value: /* props */ js.Any => String): Self = StObject.set(x, "headerCssClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderCssClassNameUndefined: Self = StObject.set(x, "headerCssClassName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMetadata(value: Boolean): Self = StObject.set(x, "isMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMetadataUndefined: Self = StObject.set(x, "isMetadata", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setSortMethod(
      value: (/* data */ js.Array[_], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double
    ): Self = StObject.set(x, "sortMethod", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSortMethodUndefined: Self = StObject.set(x, "sortMethod", js.undefined)
    
    @scala.inline
    def setSortType(value: String): Self = StObject.set(x, "sortType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortTypeUndefined: Self = StObject.set(x, "sortType", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
