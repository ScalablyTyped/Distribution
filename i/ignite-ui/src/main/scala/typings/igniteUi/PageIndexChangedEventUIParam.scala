package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageIndexChangedEventUIParam extends StObject {
  
  /**
    * Gets reference to GridPaging.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the current page index.
    */
  var pageIndex: js.UndefOr[Double] = js.undefined
}
object PageIndexChangedEventUIParam {
  
  inline def apply(): PageIndexChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageIndexChangedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageIndexChangedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    inline def setPageIndexUndefined: Self = StObject.set(x, "pageIndex", js.undefined)
  }
}
