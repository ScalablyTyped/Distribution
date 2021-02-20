package typings.jqgrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ColModel extends StObject {
    
    var colModel: js.Any = js.native
    
    var rowId: js.Any = js.native
  }
  object ColModel {
    
    @scala.inline
    def apply(colModel: js.Any, rowId: js.Any): ColModel = {
      val __obj = js.Dynamic.literal(colModel = colModel.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColModel]
    }
    
    @scala.inline
    implicit class ColModelMutableBuilder[Self <: ColModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColModel(value: js.Any): Self = StObject.set(x, "colModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowId(value: js.Any): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    var data: js.Array[_] = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: js.Array[_]): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    }
  }
}
