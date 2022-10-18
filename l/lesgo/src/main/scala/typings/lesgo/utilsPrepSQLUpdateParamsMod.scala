package typings.lesgo

import typings.lesgo.anon.`2`
import typings.lesgo.utilsPrepSQLParamsMod.SQLValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsPrepSQLUpdateParamsMod {
  
  @JSImport("lesgo/utils/prepSQLUpdateParams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Record[String, SQLValue] */](params: T, columns: js.Array[`2`[T]]): SQLUpdateParams = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[SQLUpdateParams]
  
  trait SQLUpdateParams extends StObject {
    
    var updateColumnValues: String
    
    var updateFields: Record[String, SQLValue]
    
    var wherePrimaryKey: String
  }
  object SQLUpdateParams {
    
    inline def apply(updateColumnValues: String, updateFields: Record[String, SQLValue], wherePrimaryKey: String): SQLUpdateParams = {
      val __obj = js.Dynamic.literal(updateColumnValues = updateColumnValues.asInstanceOf[js.Any], updateFields = updateFields.asInstanceOf[js.Any], wherePrimaryKey = wherePrimaryKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQLUpdateParams]
    }
    
    extension [Self <: SQLUpdateParams](x: Self) {
      
      inline def setUpdateColumnValues(value: String): Self = StObject.set(x, "updateColumnValues", value.asInstanceOf[js.Any])
      
      inline def setUpdateFields(value: Record[String, SQLValue]): Self = StObject.set(x, "updateFields", value.asInstanceOf[js.Any])
      
      inline def setWherePrimaryKey(value: String): Self = StObject.set(x, "wherePrimaryKey", value.asInstanceOf[js.Any])
    }
  }
}
