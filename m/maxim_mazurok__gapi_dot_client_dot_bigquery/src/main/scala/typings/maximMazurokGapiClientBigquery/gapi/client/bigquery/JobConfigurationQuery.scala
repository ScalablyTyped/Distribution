package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobConfigurationQuery extends js.Object {
  
  /**
    * [Optional] If true and query uses legacy SQL dialect, allows the query to produce arbitrarily large result tables at a slight cost in performance. Requires destinationTable to be
    * set. For standard SQL queries, this flag is ignored and large results are always allowed. However, you must still set destinationTable when result size exceeds the allowed maximum
    * response size.
    */
  var allowLargeResults: js.UndefOr[Boolean] = js.native
  
  /** [Beta] Clustering specification for the destination table. Must be specified with time-based partitioning, data in the table will be first partitioned and subsequently clustered. */
  var clustering: js.UndefOr[Clustering] = js.native
  
  /** Connection properties. */
  var connectionProperties: js.UndefOr[js.Array[ConnectionProperty]] = js.native
  
  /**
    * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table.
    * CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append
    * actions occur as one atomic update upon job completion.
    */
  var createDisposition: js.UndefOr[String] = js.native
  
  /** [Optional] Specifies the default dataset to use for unqualified table names in the query. Note that this does not alter behavior of unqualified dataset names. */
  var defaultDataset: js.UndefOr[DatasetReference] = js.native
  
  /** Custom encryption configuration (e.g., Cloud KMS keys). */
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.native
  
  /**
    * [Optional] Describes the table where the query results should be stored. If not present, a new table will be created to store the results. This property must be set for large
    * results that exceed the maximum response size.
    */
  var destinationTable: js.UndefOr[TableReference] = js.native
  
  /**
    * [Optional] If true and query uses legacy SQL dialect, flattens all nested and repeated fields in the query results. allowLargeResults must be true if this is set to false. For
    * standard SQL queries, this flag is ignored and results are never flattened.
    */
  var flattenResults: js.UndefOr[Boolean] = js.native
  
  /**
    * [Optional] Limits the billing tier for this job. Queries that have resource usage beyond this tier will fail (without incurring a charge). If unspecified, this will be set to your
    * project default.
    */
  var maximumBillingTier: js.UndefOr[Double] = js.native
  
  /**
    * [Optional] Limits the bytes billed for this job. Queries that will have bytes billed beyond this limit will fail (without incurring a charge). If unspecified, this will be set to
    * your project default.
    */
  var maximumBytesBilled: js.UndefOr[String] = js.native
  
  /** Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use named (@myparam) query parameters in this query. */
  var parameterMode: js.UndefOr[String] = js.native
  
  /** [Deprecated] This property is deprecated. */
  var preserveNulls: js.UndefOr[Boolean] = js.native
  
  /** [Optional] Specifies a priority for the query. Possible values include INTERACTIVE and BATCH. The default value is INTERACTIVE. */
  var priority: js.UndefOr[String] = js.native
  
  /** [Required] SQL query text to execute. The useLegacySql field can be used to indicate whether the query uses legacy SQL or standard SQL. */
  var query: js.UndefOr[String] = js.native
  
  /** Query parameters for standard SQL queries. */
  var queryParameters: js.UndefOr[js.Array[QueryParameter]] = js.native
  
  /** [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified. */
  var rangePartitioning: js.UndefOr[RangePartitioning] = js.native
  
  /**
    * Allows the schema of the destination table to be updated as a side effect of the query job. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND;
    * when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators. For normal tables, WRITE_TRUNCATE will always
    * overwrite the schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a
    * required field in the original schema to nullable.
    */
  var schemaUpdateOptions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * [Optional] If querying an external data source outside of BigQuery, describes the data format, location and other properties of the data source. By defining these properties, the
    * data source can then be queried as if it were a standard BigQuery table.
    */
  var tableDefinitions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.bigquery.gapi.client.bigquery.ExternalDataConfiguration}
    */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.JobConfigurationQuery with TopLevel[js.Any]
  ] = js.native
  
  /** Time-based partitioning specification for the destination table. Only one of timePartitioning and rangePartitioning should be specified. */
  var timePartitioning: js.UndefOr[TimePartitioning] = js.native
  
  /**
    * Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is true. If set to false, the query will use BigQuery's standard SQL:
    * https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set to false, the value of flattenResults is ignored; query will be run as if flattenResults is false.
    */
  var useLegacySql: js.UndefOr[Boolean] = js.native
  
  /**
    * [Optional] Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever tables in the query are modified. Moreover, the
    * query cache is only available when a query does not have a destination table specified. The default value is true.
    */
  var useQueryCache: js.UndefOr[Boolean] = js.native
  
  /** Describes user-defined function resources used in the query. */
  var userDefinedFunctionResources: js.UndefOr[js.Array[UserDefinedFunctionResource]] = js.native
  
  /**
    * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery
    * overwrites the table data and uses the schema from the query result. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table
    * already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to
    * complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
    */
  var writeDisposition: js.UndefOr[String] = js.native
}
object JobConfigurationQuery {
  
  @scala.inline
  def apply(): JobConfigurationQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationQuery]
  }
  
  @scala.inline
  implicit class JobConfigurationQueryOps[Self <: JobConfigurationQuery] (val x: Self) extends AnyVal {
    
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
    def setAllowLargeResults(value: Boolean): Self = this.set("allowLargeResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowLargeResults: Self = this.set("allowLargeResults", js.undefined)
    
    @scala.inline
    def setClustering(value: Clustering): Self = this.set("clustering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClustering: Self = this.set("clustering", js.undefined)
    
    @scala.inline
    def setConnectionPropertiesVarargs(value: ConnectionProperty*): Self = this.set("connectionProperties", js.Array(value :_*))
    
    @scala.inline
    def setConnectionProperties(value: js.Array[ConnectionProperty]): Self = this.set("connectionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionProperties: Self = this.set("connectionProperties", js.undefined)
    
    @scala.inline
    def setCreateDisposition(value: String): Self = this.set("createDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDisposition: Self = this.set("createDisposition", js.undefined)
    
    @scala.inline
    def setDefaultDataset(value: DatasetReference): Self = this.set("defaultDataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDataset: Self = this.set("defaultDataset", js.undefined)
    
    @scala.inline
    def setDestinationEncryptionConfiguration(value: EncryptionConfiguration): Self = this.set("destinationEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationEncryptionConfiguration: Self = this.set("destinationEncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setDestinationTable(value: TableReference): Self = this.set("destinationTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationTable: Self = this.set("destinationTable", js.undefined)
    
    @scala.inline
    def setFlattenResults(value: Boolean): Self = this.set("flattenResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlattenResults: Self = this.set("flattenResults", js.undefined)
    
    @scala.inline
    def setMaximumBillingTier(value: Double): Self = this.set("maximumBillingTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumBillingTier: Self = this.set("maximumBillingTier", js.undefined)
    
    @scala.inline
    def setMaximumBytesBilled(value: String): Self = this.set("maximumBytesBilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumBytesBilled: Self = this.set("maximumBytesBilled", js.undefined)
    
    @scala.inline
    def setParameterMode(value: String): Self = this.set("parameterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterMode: Self = this.set("parameterMode", js.undefined)
    
    @scala.inline
    def setPreserveNulls(value: Boolean): Self = this.set("preserveNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveNulls: Self = this.set("preserveNulls", js.undefined)
    
    @scala.inline
    def setPriority(value: String): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setQueryParametersVarargs(value: QueryParameter*): Self = this.set("queryParameters", js.Array(value :_*))
    
    @scala.inline
    def setQueryParameters(value: js.Array[QueryParameter]): Self = this.set("queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParameters: Self = this.set("queryParameters", js.undefined)
    
    @scala.inline
    def setRangePartitioning(value: RangePartitioning): Self = this.set("rangePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangePartitioning: Self = this.set("rangePartitioning", js.undefined)
    
    @scala.inline
    def setSchemaUpdateOptionsVarargs(value: String*): Self = this.set("schemaUpdateOptions", js.Array(value :_*))
    
    @scala.inline
    def setSchemaUpdateOptions(value: js.Array[String]): Self = this.set("schemaUpdateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaUpdateOptions: Self = this.set("schemaUpdateOptions", js.undefined)
    
    @scala.inline
    def setTableDefinitions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.bigquery.gapi.client.bigquery.ExternalDataConfiguration}
      */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.JobConfigurationQuery with TopLevel[js.Any]
    ): Self = this.set("tableDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableDefinitions: Self = this.set("tableDefinitions", js.undefined)
    
    @scala.inline
    def setTimePartitioning(value: TimePartitioning): Self = this.set("timePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimePartitioning: Self = this.set("timePartitioning", js.undefined)
    
    @scala.inline
    def setUseLegacySql(value: Boolean): Self = this.set("useLegacySql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLegacySql: Self = this.set("useLegacySql", js.undefined)
    
    @scala.inline
    def setUseQueryCache(value: Boolean): Self = this.set("useQueryCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseQueryCache: Self = this.set("useQueryCache", js.undefined)
    
    @scala.inline
    def setUserDefinedFunctionResourcesVarargs(value: UserDefinedFunctionResource*): Self = this.set("userDefinedFunctionResources", js.Array(value :_*))
    
    @scala.inline
    def setUserDefinedFunctionResources(value: js.Array[UserDefinedFunctionResource]): Self = this.set("userDefinedFunctionResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDefinedFunctionResources: Self = this.set("userDefinedFunctionResources", js.undefined)
    
    @scala.inline
    def setWriteDisposition(value: String): Self = this.set("writeDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteDisposition: Self = this.set("writeDisposition", js.undefined)
  }
}
