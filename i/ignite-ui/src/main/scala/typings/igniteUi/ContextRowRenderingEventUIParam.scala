package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextRowRenderingEventUIParam extends StObject {
  
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
  var dataRow: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to igTreeGridPaging.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ContextRowRenderingEventUIParam {
  
  inline def apply(): ContextRowRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextRowRenderingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextRowRenderingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setContextRowMode(value: String): Self = StObject.set(x, "contextRowMode", value.asInstanceOf[js.Any])
    
    inline def setContextRowModeUndefined: Self = StObject.set(x, "contextRowMode", js.undefined)
    
    inline def setCurrentPageIndex(value: Double): Self = StObject.set(x, "currentPageIndex", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageIndexUndefined: Self = StObject.set(x, "currentPageIndex", js.undefined)
    
    inline def setDataRow(value: Any): Self = StObject.set(x, "dataRow", value.asInstanceOf[js.Any])
    
    inline def setDataRowUndefined: Self = StObject.set(x, "dataRow", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
