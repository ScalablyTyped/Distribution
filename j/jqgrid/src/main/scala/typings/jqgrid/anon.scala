package typings.jqgrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ColModel extends StObject {
    
    var colModel: Any
    
    var rowId: Any
  }
  object ColModel {
    
    inline def apply(colModel: Any, rowId: Any): ColModel = {
      val __obj = js.Dynamic.literal(colModel = colModel.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColModel]
    }
    
    extension [Self <: ColModel](x: Self) {
      
      inline def setColModel(value: Any): Self = StObject.set(x, "colModel", value.asInstanceOf[js.Any])
      
      inline def setRowId(value: Any): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: js.Array[Any]
  }
  object Data {
    
    inline def apply(data: js.Array[Any]): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
}
