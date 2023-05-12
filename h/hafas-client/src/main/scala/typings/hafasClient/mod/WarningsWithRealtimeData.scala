package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WarningsWithRealtimeData
  extends StObject
     with RealtimeDataUpdatedAt {
  
  var remarks: js.Array[Warning]
}
object WarningsWithRealtimeData {
  
  inline def apply(remarks: js.Array[Warning]): WarningsWithRealtimeData = {
    val __obj = js.Dynamic.literal(remarks = remarks.asInstanceOf[js.Any])
    __obj.asInstanceOf[WarningsWithRealtimeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WarningsWithRealtimeData] (val x: Self) extends AnyVal {
    
    inline def setRemarks(value: js.Array[Warning]): Self = StObject.set(x, "remarks", value.asInstanceOf[js.Any])
    
    inline def setRemarksVarargs(value: Warning*): Self = StObject.set(x, "remarks", js.Array(value*))
  }
}
