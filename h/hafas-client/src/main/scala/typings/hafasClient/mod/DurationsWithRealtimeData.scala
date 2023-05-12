package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurationsWithRealtimeData
  extends StObject
     with RealtimeDataUpdatedAt {
  
  var reachable: js.Array[Duration]
}
object DurationsWithRealtimeData {
  
  inline def apply(reachable: js.Array[Duration]): DurationsWithRealtimeData = {
    val __obj = js.Dynamic.literal(reachable = reachable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationsWithRealtimeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DurationsWithRealtimeData] (val x: Self) extends AnyVal {
    
    inline def setReachable(value: js.Array[Duration]): Self = StObject.set(x, "reachable", value.asInstanceOf[js.Any])
    
    inline def setReachableVarargs(value: Duration*): Self = StObject.set(x, "reachable", js.Array(value*))
  }
}
