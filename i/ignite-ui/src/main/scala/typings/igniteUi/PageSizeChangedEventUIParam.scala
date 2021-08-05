package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageSizeChangedEventUIParam extends StObject {
  
  /**
    * Gets reference to GridPaging.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the current page size.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
}
object PageSizeChangedEventUIParam {
  
  inline def apply(): PageSizeChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSizeChangedEventUIParam]
  }
  
  extension [Self <: PageSizeChangedEventUIParam](x: Self) {
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
  }
}
