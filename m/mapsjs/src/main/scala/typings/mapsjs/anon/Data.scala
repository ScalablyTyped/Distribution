package typings.mapsjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: js.Array[js.Object]
  
  var dataFormat: js.UndefOr[String] = js.undefined
  
  var maxAvailableZoomLevel: js.UndefOr[Double] = js.undefined
  
  var timeoutMs: js.UndefOr[Double] = js.undefined
}
object Data {
  
  inline def apply(data: js.Array[js.Object]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataFormat(value: String): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
    
    inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setMaxAvailableZoomLevel(value: Double): Self = StObject.set(x, "maxAvailableZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setMaxAvailableZoomLevelUndefined: Self = StObject.set(x, "maxAvailableZoomLevel", js.undefined)
    
    inline def setTimeoutMs(value: Double): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
    
    inline def setTimeoutMsUndefined: Self = StObject.set(x, "timeoutMs", js.undefined)
  }
}
