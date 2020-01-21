package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single DML statement.
  */
@js.native
trait SchemaStatement extends js.Object {
  /**
    * It is not always possible for Cloud Spanner to infer the right SQL type
    * from a JSON value.  For example, values of type `BYTES` and values of
    * type `STRING` both appear in params as JSON strings.  In these cases,
    * `param_types` can be used to specify the exact SQL type for some or all
    * of the SQL statement parameters. See the definition of Type for more
    * information about SQL types.
    */
  var paramTypes: js.UndefOr[StringDictionary[SchemaType]] = js.native
  /**
    * The DML string can contain parameter placeholders. A parameter
    * placeholder consists of `&#39;@&#39;` followed by the parameter name.
    * Parameter names consist of any combination of letters, numbers, and
    * underscores.  Parameters can appear anywhere that a literal value is
    * expected.  The same parameter name can be used more than once, for
    * example:   `&quot;WHERE id &gt; @msg_id AND id &lt; @msg_id + 100&quot;`
    * It is an error to execute an SQL statement with unbound parameters.
    * Parameter values are specified using `params`, which is a JSON object
    * whose keys are parameter names, and whose values are the corresponding
    * parameter values.
    */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Required. The DML string.
    */
  var sql: js.UndefOr[String] = js.native
}

object SchemaStatement {
  @scala.inline
  def apply(
    paramTypes: StringDictionary[SchemaType] = null,
    params: StringDictionary[js.Any] = null,
    sql: String = null
  ): SchemaStatement = {
    val __obj = js.Dynamic.literal()
    if (paramTypes != null) __obj.updateDynamic("paramTypes")(paramTypes.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (sql != null) __obj.updateDynamic("sql")(sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStatement]
  }
}

