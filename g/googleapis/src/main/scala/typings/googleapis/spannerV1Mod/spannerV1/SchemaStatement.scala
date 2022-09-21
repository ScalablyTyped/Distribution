package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStatement extends StObject {
  
  /**
    * It is not always possible for Cloud Spanner to infer the right SQL type from a JSON value. For example, values of type `BYTES` and values of type `STRING` both appear in params as JSON strings. In these cases, `param_types` can be used to specify the exact SQL type for some or all of the SQL statement parameters. See the definition of Type for more information about SQL types.
    */
  var paramTypes: js.UndefOr[StringDictionary[SchemaType] | Null] = js.undefined
  
  /**
    * Parameter names and values that bind to placeholders in the DML string. A parameter placeholder consists of the `@` character followed by the parameter name (for example, `@firstName`). Parameter names can contain letters, numbers, and underscores. Parameters can appear anywhere that a literal value is expected. The same parameter name can be used more than once, for example: `"WHERE id \> @msg_id AND id < @msg_id + 100"` It is an error to execute a SQL statement with unbound parameters.
    */
  var params: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Required. The DML string.
    */
  var sql: js.UndefOr[String | Null] = js.undefined
}
object SchemaStatement {
  
  inline def apply(): SchemaStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatement]
  }
  
  extension [Self <: SchemaStatement](x: Self) {
    
    inline def setParamTypes(value: StringDictionary[SchemaType]): Self = StObject.set(x, "paramTypes", value.asInstanceOf[js.Any])
    
    inline def setParamTypesNull: Self = StObject.set(x, "paramTypes", null)
    
    inline def setParamTypesUndefined: Self = StObject.set(x, "paramTypes", js.undefined)
    
    inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsNull: Self = StObject.set(x, "params", null)
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setSqlNull: Self = StObject.set(x, "sql", null)
    
    inline def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
  }
}
