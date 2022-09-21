package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutableSpecification extends StObject {
  
  /** A Database. */
  var db: Database
  
  /** True to enable single row/value results processing. */
  var enhancedFunctions: Boolean
  
  /** Whether a database function accepts variable-length argument lists as the last parameter. */
  var isVariadic: Boolean
  
  /** The table or view's name. */
  var name: String
  
  /** Number of parameters the executable expects. */
  var paramCount: Double
  
  /** The name of the schema owning the table or */
  var schema: String
  
  /** If true, return the first result row as an object (with enhancedFunctions). */
  var singleRow: Boolean
  
  /** If true, return results as a primitive or primitives (with enhancedFunctions). */
  var singleValue: Boolean
  
  /** A function invocation statement or a pg-promise QueryFile. */
  var sql: Any
}
object ExecutableSpecification {
  
  inline def apply(
    db: Database,
    enhancedFunctions: Boolean,
    isVariadic: Boolean,
    name: String,
    paramCount: Double,
    schema: String,
    singleRow: Boolean,
    singleValue: Boolean,
    sql: Any
  ): ExecutableSpecification = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], enhancedFunctions = enhancedFunctions.asInstanceOf[js.Any], isVariadic = isVariadic.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paramCount = paramCount.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], singleRow = singleRow.asInstanceOf[js.Any], singleValue = singleValue.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutableSpecification]
  }
  
  extension [Self <: ExecutableSpecification](x: Self) {
    
    inline def setDb(value: Database): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setEnhancedFunctions(value: Boolean): Self = StObject.set(x, "enhancedFunctions", value.asInstanceOf[js.Any])
    
    inline def setIsVariadic(value: Boolean): Self = StObject.set(x, "isVariadic", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParamCount(value: Double): Self = StObject.set(x, "paramCount", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSingleRow(value: Boolean): Self = StObject.set(x, "singleRow", value.asInstanceOf[js.Any])
    
    inline def setSingleValue(value: Boolean): Self = StObject.set(x, "singleValue", value.asInstanceOf[js.Any])
    
    inline def setSql(value: Any): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
  }
}
