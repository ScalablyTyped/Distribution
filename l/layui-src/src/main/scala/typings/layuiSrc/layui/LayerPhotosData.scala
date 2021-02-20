package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerPhotosData extends StObject {
  
  var data: js.Array[LayerPhotosDataItem] = js.native
  
  var id: Double = js.native
  
  var start: js.UndefOr[Double] = js.native
  
  var title: String = js.native
}
object LayerPhotosData {
  
  @scala.inline
  def apply(data: js.Array[LayerPhotosDataItem], id: Double, title: String): LayerPhotosData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerPhotosData]
  }
  
  @scala.inline
  implicit class LayerPhotosDataMutableBuilder[Self <: LayerPhotosData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[LayerPhotosDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: LayerPhotosDataItem*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
