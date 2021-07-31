package typings.mapsjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataFormat extends StObject {
  
  var dataFormat: js.UndefOr[String] = js.undefined
  
  var maxAvailableZoomLevel: js.UndefOr[Double] = js.undefined
  
  var timeoutMs: js.UndefOr[Double] = js.undefined
}
object DataFormat {
  
  @scala.inline
  def apply(): DataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFormat]
  }
  
  @scala.inline
  implicit class DataFormatMutableBuilder[Self <: DataFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFormat(value: String): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
    
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
