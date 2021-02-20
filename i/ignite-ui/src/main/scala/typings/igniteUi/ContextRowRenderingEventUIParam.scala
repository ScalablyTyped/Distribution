package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextRowRenderingEventUIParam extends StObject {
  
  /**
    * Gets the current context row mode.
    */
  var contextRowMode: js.UndefOr[String] = js.native
  
  /**
    * Gets current page index.
    */
  var currentPageIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets reference to the first data row. Null if there are no records.
    */
  var dataRow: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to igTreeGridPaging.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ContextRowRenderingEventUIParam {
  
  @scala.inline
  def apply(): ContextRowRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextRowRenderingEventUIParam]
  }
  
  @scala.inline
  implicit class ContextRowRenderingEventUIParamMutableBuilder[Self <: ContextRowRenderingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextRowMode(value: String): Self = StObject.set(x, "contextRowMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextRowModeUndefined: Self = StObject.set(x, "contextRowMode", js.undefined)
    
    @scala.inline
    def setCurrentPageIndex(value: Double): Self = StObject.set(x, "currentPageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageIndexUndefined: Self = StObject.set(x, "currentPageIndex", js.undefined)
    
    @scala.inline
    def setDataRow(value: js.Any): Self = StObject.set(x, "dataRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRowUndefined: Self = StObject.set(x, "dataRow", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
