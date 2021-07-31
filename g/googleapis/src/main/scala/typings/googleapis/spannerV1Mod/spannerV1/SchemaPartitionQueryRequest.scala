package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for PartitionQuery
  */
trait SchemaPartitionQueryRequest extends StObject {
  
  /**
    * It is not always possible for Cloud Spanner to infer the right SQL type
    * from a JSON value.  For example, values of type `BYTES` and values of
    * type `STRING` both appear in params as JSON strings.  In these cases,
    * `param_types` can be used to specify the exact SQL type for some or all
    * of the SQL query parameters. See the definition of Type for more
    * information about SQL types.
    */
  var paramTypes: js.UndefOr[StringDictionary[SchemaType]] = js.undefined
  
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
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Additional options that affect how many partitions are created.
    */
  var partitionOptions: js.UndefOr[SchemaPartitionOptions] = js.undefined
  
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
  var sql: js.UndefOr[String] = js.undefined
  
  /**
    * Read only snapshot transactions are supported, read/write and single use
    * transactions are not.
    */
  var transaction: js.UndefOr[SchemaTransactionSelector] = js.undefined
}
object SchemaPartitionQueryRequest {
  
  @scala.inline
  def apply(): SchemaPartitionQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartitionQueryRequest]
  }
  
  @scala.inline
  implicit class SchemaPartitionQueryRequestMutableBuilder[Self <: SchemaPartitionQueryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamTypes(value: StringDictionary[SchemaType]): Self = StObject.set(x, "paramTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamTypesUndefined: Self = StObject.set(x, "paramTypes", js.undefined)
    
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setPartitionOptions(value: SchemaPartitionOptions): Self = StObject.set(x, "partitionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionOptionsUndefined: Self = StObject.set(x, "partitionOptions", js.undefined)
    
    @scala.inline
    def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
    
    @scala.inline
    def setTransaction(value: SchemaTransactionSelector): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
