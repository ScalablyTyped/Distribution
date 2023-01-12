package typings.griddleReact.mod.components

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableProps extends StObject {
  
  var NoResults: js.UndefOr[Any] = js.undefined
  
  var TableBody: js.UndefOr[Any] = js.undefined
  
  var TableHeading: js.UndefOr[Any] = js.undefined
  
  var visibleRows: js.UndefOr[Double] = js.undefined
}
object TableProps {
  
  inline def apply(): TableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
    
    inline def setNoResults(value: Any): Self = StObject.set(x, "NoResults", value.asInstanceOf[js.Any])
    
    inline def setNoResultsUndefined: Self = StObject.set(x, "NoResults", js.undefined)
    
    inline def setTableBody(value: Any): Self = StObject.set(x, "TableBody", value.asInstanceOf[js.Any])
    
    inline def setTableBodyUndefined: Self = StObject.set(x, "TableBody", js.undefined)
    
    inline def setTableHeading(value: Any): Self = StObject.set(x, "TableHeading", value.asInstanceOf[js.Any])
    
    inline def setTableHeadingUndefined: Self = StObject.set(x, "TableHeading", js.undefined)
    
    inline def setVisibleRows(value: Double): Self = StObject.set(x, "visibleRows", value.asInstanceOf[js.Any])
    
    inline def setVisibleRowsUndefined: Self = StObject.set(x, "visibleRows", js.undefined)
  }
}
