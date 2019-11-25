package typings.massive.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutableSpecification extends js.Object {
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
  var sql: js.Any
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
}

