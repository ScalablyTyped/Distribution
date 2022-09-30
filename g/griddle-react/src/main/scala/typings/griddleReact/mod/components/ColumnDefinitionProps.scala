package typings.griddleReact.mod.components

import org.scalablytyped.runtime.StringDictionary
import typings.griddleReact.mod.GriddleComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnDefinitionProps
  extends StObject
     with /* x */ StringDictionary[Any] {
  
  // TODO: Unused?
  //The number of cells this column should extend. Default is 1.
  var colSpan: js.UndefOr[Double] = js.undefined
  
  //The css class name, or a function to generate a class name from props, to apply to this column.
  var cssClassName: js.UndefOr[String | (js.Function1[/* props */ Any, String])] = js.undefined
  
  //The component that should be rendered instead of the standard column data. This component will still be rendered inside of a TD element.
  var customComponent: js.UndefOr[GriddleComponent[CellProps & Any]] = js.undefined
  
  //The component that should be used instead of the normal title
  var customHeadingComponent: js.UndefOr[GriddleComponent[TableHeadingCellProps & Any]] = js.undefined
  
  //Any extra data that should be passed to each instance of this column
  var extraData: js.UndefOr[Any] = js.undefined
  
  //Can this column be filtered
  var filterable: js.UndefOr[Boolean] = js.undefined
  
  //The css class name, or a function to generate a class name from props, to apply to the header for the column.
  var headerCssClassName: js.UndefOr[String | (js.Function1[/* props */ Any, String])] = js.undefined
  
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
      /* data */ js.Array[Any], 
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
  
  inline def apply(id: String): ColumnDefinitionProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinitionProps]
  }
  
  extension [Self <: ColumnDefinitionProps](x: Self) {
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setCssClassName(value: String | (js.Function1[/* props */ Any, String])): Self = StObject.set(x, "cssClassName", value.asInstanceOf[js.Any])
    
    inline def setCssClassNameFunction1(value: /* props */ Any => String): Self = StObject.set(x, "cssClassName", js.Any.fromFunction1(value))
    
    inline def setCssClassNameUndefined: Self = StObject.set(x, "cssClassName", js.undefined)
    
    inline def setCustomComponent(value: GriddleComponent[CellProps & Any]): Self = StObject.set(x, "customComponent", value.asInstanceOf[js.Any])
    
    inline def setCustomComponentUndefined: Self = StObject.set(x, "customComponent", js.undefined)
    
    inline def setCustomHeadingComponent(value: GriddleComponent[TableHeadingCellProps & Any]): Self = StObject.set(x, "customHeadingComponent", value.asInstanceOf[js.Any])
    
    inline def setCustomHeadingComponentUndefined: Self = StObject.set(x, "customHeadingComponent", js.undefined)
    
    inline def setExtraData(value: Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    inline def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    
    inline def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    inline def setHeaderCssClassName(value: String | (js.Function1[/* props */ Any, String])): Self = StObject.set(x, "headerCssClassName", value.asInstanceOf[js.Any])
    
    inline def setHeaderCssClassNameFunction1(value: /* props */ Any => String): Self = StObject.set(x, "headerCssClassName", js.Any.fromFunction1(value))
    
    inline def setHeaderCssClassNameUndefined: Self = StObject.set(x, "headerCssClassName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsMetadata(value: Boolean): Self = StObject.set(x, "isMetadata", value.asInstanceOf[js.Any])
    
    inline def setIsMetadataUndefined: Self = StObject.set(x, "isMetadata", js.undefined)
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setSortMethod(
      value: (/* data */ js.Array[Any], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double
    ): Self = StObject.set(x, "sortMethod", js.Any.fromFunction3(value))
    
    inline def setSortMethodUndefined: Self = StObject.set(x, "sortMethod", js.undefined)
    
    inline def setSortType(value: String): Self = StObject.set(x, "sortType", value.asInstanceOf[js.Any])
    
    inline def setSortTypeUndefined: Self = StObject.set(x, "sortType", js.undefined)
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
