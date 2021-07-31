package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageIndexChangedEventUIParam extends StObject {
  
  /**
    * Gets reference to GridPaging.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the current page index.
    */
  var pageIndex: js.UndefOr[Double] = js.undefined
}
object PageIndexChangedEventUIParam {
  
  @scala.inline
  def apply(): PageIndexChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageIndexChangedEventUIParam]
  }
  
  @scala.inline
  implicit class PageIndexChangedEventUIParamMutableBuilder[Self <: PageIndexChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIndexUndefined: Self = StObject.set(x, "pageIndex", js.undefined)
  }
}
