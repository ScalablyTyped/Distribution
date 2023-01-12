package typings.lesgo

import typings.lesgo.anon.`2`
import typings.lesgo.utilsPrepSQLParamsMod.SQLValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsPrepSQLInsertParamsMod {
  
  @JSImport("lesgo/utils/prepSQLInsertParams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Record[String, SQLValue] */](params: T, columns: js.Array[`2`[T]]): SQLInsertParams = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[SQLInsertParams]
  
  trait SQLInsertParams extends StObject {
    
    var insertColumns: String
    
    var insertFields: Record[String, SQLValue]
    
    var insertValues: String
  }
  object SQLInsertParams {
    
    inline def apply(insertColumns: String, insertFields: Record[String, SQLValue], insertValues: String): SQLInsertParams = {
      val __obj = js.Dynamic.literal(insertColumns = insertColumns.asInstanceOf[js.Any], insertFields = insertFields.asInstanceOf[js.Any], insertValues = insertValues.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQLInsertParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SQLInsertParams] (val x: Self) extends AnyVal {
      
      inline def setInsertColumns(value: String): Self = StObject.set(x, "insertColumns", value.asInstanceOf[js.Any])
      
      inline def setInsertFields(value: Record[String, SQLValue]): Self = StObject.set(x, "insertFields", value.asInstanceOf[js.Any])
      
      inline def setInsertValues(value: String): Self = StObject.set(x, "insertValues", value.asInstanceOf[js.Any])
    }
  }
}
