package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealtimeDataUpdatedAt extends StObject {
  
  var realtimeDataUpdatedAt: js.UndefOr[Double] = js.undefined
}
object RealtimeDataUpdatedAt {
  
  inline def apply(): RealtimeDataUpdatedAt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RealtimeDataUpdatedAt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RealtimeDataUpdatedAt] (val x: Self) extends AnyVal {
    
    inline def setRealtimeDataUpdatedAt(value: Double): Self = StObject.set(x, "realtimeDataUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setRealtimeDataUpdatedAtUndefined: Self = StObject.set(x, "realtimeDataUpdatedAt", js.undefined)
  }
}
