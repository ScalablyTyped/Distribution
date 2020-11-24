package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for PartitionQuery
  */
@js.native
trait SchemaPartitionQueryRequest extends js.Object {
  
  /**
    * It is not always possible for Cloud Spanner to infer the right SQL type
    * from a JSON value.  For example, values of type `BYTES` and values of
    * type `STRING` both appear in params as JSON strings.  In these cases,
    * `param_types` can be used to specify the exact SQL type for some or all
    * of the SQL query parameters. See the definition of Type for more
    * information about SQL types.
    */
  var paramTypes: js.UndefOr[StringDictionary[SchemaType]] = js.native
  
  /**
    * The SQL query string can contain parameter placeholders. A parameter
    * placeholder consists of `&#39;@&#39;` followed by the parameter name.
    * Parameter names consist of any combination of letters, numbers, and
    * underscores.  Parameters can appear anywhere that a literal value is
    * expected.  The same parameter name can be used more than once, for
    * example:   `&quot;WHERE id &gt; @msg_id AND id &lt; @msg_id + 100&quot;`
    * It is an error to execute an SQL query with unbound parameters. Parameter
    * values are specified using `params`, which is a JSON object whose keys
    * are parameter names, and whose values are the corresponding parameter
    * values.
    */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Additional options that affect how many partitions are created.
    */
  var partitionOptions: js.UndefOr[SchemaPartitionOptions] = js.native
  
  /**
    * The query request to generate partitions for. The request will fail if
    * the query is not root partitionable. The query plan of a root
    * partitionable query has a single distributed union operator. A
    * distributed union operator conceptually divides one or more tables into
    * multiple splits, remotely evaluates a subquery independently on each
    * split, and then unions all results.  This must not contain DML commands,
    * such as INSERT, UPDATE, or DELETE. Use ExecuteStreamingSql with a
    * PartitionedDml transaction for large, partition-friendly DML operations.
    */
  var sql: js.UndefOr[String] = js.native
  
  /**
    * Read only snapshot transactions are supported, read/write and single use
    * transactions are not.
    */
  var transaction: js.UndefOr[SchemaTransactionSelector] = js.native
}
object SchemaPartitionQueryRequest {
  
  @scala.inline
  def apply(): SchemaPartitionQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartitionQueryRequest]
  }
  
  @scala.inline
  implicit class SchemaPartitionQueryRequestOps[Self <: SchemaPartitionQueryRequest] (val x: Self) extends AnyVal {
    
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
    def setParamTypes(value: StringDictionary[SchemaType]): Self = this.set("paramTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParamTypes: Self = this.set("paramTypes", js.undefined)
    
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setPartitionOptions(value: SchemaPartitionOptions): Self = this.set("partitionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionOptions: Self = this.set("partitionOptions", js.undefined)
    
    @scala.inline
    def setSql(value: String): Self = this.set("sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSql: Self = this.set("sql", js.undefined)
    
    @scala.inline
    def setTransaction(value: SchemaTransactionSelector): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
}
