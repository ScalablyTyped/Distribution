package typings.imgDiffJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DataList extends StObject {
    
    var dataList: js.Array[js.typedarray.Uint8Array]
    
    var height: Double
    
    var width: Double
  }
  object DataList {
    
    inline def apply(dataList: js.Array[js.typedarray.Uint8Array], height: Double, width: Double): DataList = {
      val __obj = js.Dynamic.literal(dataList = dataList.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataList] (val x: Self) extends AnyVal {
      
      inline def setDataList(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "dataList", value.asInstanceOf[js.Any])
      
      inline def setDataListVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "dataList", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
