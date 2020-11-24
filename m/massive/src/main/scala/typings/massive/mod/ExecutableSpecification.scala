package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutableSpecification extends js.Object {
  
  /** A Database. */
  var db: Database = js.native
  
  /** True to enable single row/value results processing. */
  var enhancedFunctions: Boolean = js.native
  
  /** Whether a database function accepts variable-length argument lists as the last parameter. */
  var isVariadic: Boolean = js.native
  
  /** The table or view's name. */
  var name: String = js.native
  
  /** Number of parameters the executable expects. */
  var paramCount: Double = js.native
  
  /** The name of the schema owning the table or */
  var schema: String = js.native
  
  /** If true, return the first result row as an object (with enhancedFunctions). */
  var singleRow: Boolean = js.native
  
  /** If true, return results as a primitive or primitives (with enhancedFunctions). */
  var singleValue: Boolean = js.native
  
  /** A function invocation statement or a pg-promise QueryFile. */
  var sql: js.Any = js.native
}
object ExecutableSpecification {
  
  @scala.inline
  def apply(
    db: Database,
    enhancedFunctions: Boolean,
    isVariadic: Boolean,
    name: String,
    paramCount: Double,
    schema: String,
    singleRow: Boolean,
    singleValue: Boolean,
    sql: js.Any
  ): ExecutableSpecification = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], enhancedFunctions = enhancedFunctions.asInstanceOf[js.Any], isVariadic = isVariadic.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paramCount = paramCount.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], singleRow = singleRow.asInstanceOf[js.Any], singleValue = singleValue.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutableSpecification]
  }
  
  @scala.inline
  implicit class ExecutableSpecificationOps[Self <: ExecutableSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDb(value: Database): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedFunctions(value: Boolean): Self = this.set("enhancedFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVariadic(value: Boolean): Self = this.set("isVariadic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamCount(value: Double): Self = this.set("paramCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleRow(value: Boolean): Self = this.set("singleRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleValue(value: Boolean): Self = this.set("singleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSql(value: js.Any): Self = this.set("sql", value.asInstanceOf[js.Any])
  }
}
