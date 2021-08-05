package typings.got.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress extends StObject {
  
  var percent: Double
  
  var total: Double | Null
  
  var transferred: Double
}
object Progress {
  
  inline def apply(percent: Double, transferred: Double): Progress = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], transferred = transferred.asInstanceOf[js.Any], total = null)
    __obj.asInstanceOf[Progress]
  }
  
  extension [Self <: Progress](x: Self) {
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalNull: Self = StObject.set(x, "total", null)
    
    inline def setTransferred(value: Double): Self = StObject.set(x, "transferred", value.asInstanceOf[js.Any])
  }
}
