package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ascending extends StObject {
  
  var ascending: js.UndefOr[js.Any] = js.undefined
  
  var contract: js.UndefOr[js.Any] = js.undefined
  
  var descending: js.UndefOr[js.Any] = js.undefined
  
  var expand: js.UndefOr[js.Any] = js.undefined
  
  var sortable: js.UndefOr[js.Any] = js.undefined
}
object Ascending {
  
  inline def apply(): Ascending = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ascending]
  }
  
  extension [Self <: Ascending](x: Self) {
    
    inline def setAscending(value: js.Any): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    inline def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    inline def setContract(value: js.Any): Self = StObject.set(x, "contract", value.asInstanceOf[js.Any])
    
    inline def setContractUndefined: Self = StObject.set(x, "contract", js.undefined)
    
    inline def setDescending(value: js.Any): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    
    inline def setDescendingUndefined: Self = StObject.set(x, "descending", js.undefined)
    
    inline def setExpand(value: js.Any): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setSortable(value: js.Any): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
  }
}
