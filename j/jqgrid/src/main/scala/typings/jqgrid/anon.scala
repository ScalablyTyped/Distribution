package typings.jqgrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ColModel extends StObject {
    
    var colModel: js.Any
    
    var rowId: js.Any
  }
  object ColModel {
    
    inline def apply(colModel: js.Any, rowId: js.Any): ColModel = {
      val __obj = js.Dynamic.literal(colModel = colModel.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColModel]
    }
    
    extension [Self <: ColModel](x: Self) {
      
      inline def setColModel(value: js.Any): Self = StObject.set(x, "colModel", value.asInstanceOf[js.Any])
      
      inline def setRowId(value: js.Any): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: js.Array[js.Any]
  }
  object Data {
    
    inline def apply(data: js.Array[js.Any]): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    }
  }
}
