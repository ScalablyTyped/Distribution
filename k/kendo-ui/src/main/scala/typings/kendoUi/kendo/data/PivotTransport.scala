package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTransport extends StObject {
  
  var discover: js.UndefOr[Any] = js.undefined
  
  var read: js.UndefOr[Any] = js.undefined
}
object PivotTransport {
  
  inline def apply(): PivotTransport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTransport]
  }
  
  extension [Self <: PivotTransport](x: Self) {
    
    inline def setDiscover(value: Any): Self = StObject.set(x, "discover", value.asInstanceOf[js.Any])
    
    inline def setDiscoverUndefined: Self = StObject.set(x, "discover", js.undefined)
    
    inline def setRead(value: Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
  }
}
