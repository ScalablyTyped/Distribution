package typings.griddleReact.mod.components

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableProps extends StObject {
  
  var NoResults: js.UndefOr[js.Any] = js.native
  
  var TableBody: js.UndefOr[js.Any] = js.native
  
  var TableHeading: js.UndefOr[js.Any] = js.native
  
  var visibleRows: js.UndefOr[Double] = js.native
}
object TableProps {
  
  @scala.inline
  def apply(): TableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableProps]
  }
  
  @scala.inline
  implicit class TablePropsMutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoResults(value: js.Any): Self = StObject.set(x, "NoResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoResultsUndefined: Self = StObject.set(x, "NoResults", js.undefined)
    
    @scala.inline
    def setTableBody(value: js.Any): Self = StObject.set(x, "TableBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableBodyUndefined: Self = StObject.set(x, "TableBody", js.undefined)
    
    @scala.inline
    def setTableHeading(value: js.Any): Self = StObject.set(x, "TableHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableHeadingUndefined: Self = StObject.set(x, "TableHeading", js.undefined)
    
    @scala.inline
    def setVisibleRows(value: Double): Self = StObject.set(x, "visibleRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleRowsUndefined: Self = StObject.set(x, "visibleRows", js.undefined)
  }
}
