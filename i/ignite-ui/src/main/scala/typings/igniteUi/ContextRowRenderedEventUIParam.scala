package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextRowRenderedEventUIParam extends StObject {
  
  /**
    * Gets the current context row mode.
    */
  var contextRowMode: js.UndefOr[String] = js.undefined
  
  /**
    * Gets current page index.
    */
  var currentPageIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets reference to the first data row. Null if there are no records.
    */
  var dataRow: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to igTreeGridPaging.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets array of the parent rows(of the ui.dataRow). If the dataRow is null(for instance filter is applied and no records are shown) then it is empty array. Otherwise it contains all ancestors ordered by level(including the current dataRow) - the first item is root level, the last array item is the current ui.dataRow
    */
  var parentRows: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object ContextRowRenderedEventUIParam {
  
  inline def apply(): ContextRowRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextRowRenderedEventUIParam]
  }
  
  extension [Self <: ContextRowRenderedEventUIParam](x: Self) {
    
    inline def setContextRowMode(value: String): Self = StObject.set(x, "contextRowMode", value.asInstanceOf[js.Any])
    
    inline def setContextRowModeUndefined: Self = StObject.set(x, "contextRowMode", js.undefined)
    
    inline def setCurrentPageIndex(value: Double): Self = StObject.set(x, "currentPageIndex", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageIndexUndefined: Self = StObject.set(x, "currentPageIndex", js.undefined)
    
    inline def setDataRow(value: js.Any): Self = StObject.set(x, "dataRow", value.asInstanceOf[js.Any])
    
    inline def setDataRowUndefined: Self = StObject.set(x, "dataRow", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setParentRows(value: js.Array[js.Any]): Self = StObject.set(x, "parentRows", value.asInstanceOf[js.Any])
    
    inline def setParentRowsUndefined: Self = StObject.set(x, "parentRows", js.undefined)
    
    inline def setParentRowsVarargs(value: js.Any*): Self = StObject.set(x, "parentRows", js.Array(value :_*))
  }
}
