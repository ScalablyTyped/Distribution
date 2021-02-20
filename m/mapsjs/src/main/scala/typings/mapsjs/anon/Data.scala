package typings.mapsjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends StObject {
  
  var data: js.Array[js.Object] = js.native
  
  var dataFormat: js.UndefOr[String] = js.native
  
  var maxAvailableZoomLevel: js.UndefOr[Double] = js.native
  
  var timeoutMs: js.UndefOr[Double] = js.native
}
object Data {
  
  @scala.inline
  def apply(data: js.Array[js.Object]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFormat(value: String): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setMaxAvailableZoomLevel(value: Double): Self = StObject.set(x, "maxAvailableZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAvailableZoomLevelUndefined: Self = StObject.set(x, "maxAvailableZoomLevel", js.undefined)
    
    @scala.inline
    def setTimeoutMs(value: Double): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutMsUndefined: Self = StObject.set(x, "timeoutMs", js.undefined)
  }
}
