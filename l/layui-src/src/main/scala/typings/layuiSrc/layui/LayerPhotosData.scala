package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerPhotosData extends StObject {
  
  var data: js.Array[LayerPhotosDataItem]
  
  var id: Double
  
  var start: js.UndefOr[Double] = js.undefined
  
  var title: String
}
object LayerPhotosData {
  
  inline def apply(data: js.Array[LayerPhotosDataItem], id: Double, title: String): LayerPhotosData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerPhotosData]
  }
  
  extension [Self <: LayerPhotosData](x: Self) {
    
    inline def setData(value: js.Array[LayerPhotosDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: LayerPhotosDataItem*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
