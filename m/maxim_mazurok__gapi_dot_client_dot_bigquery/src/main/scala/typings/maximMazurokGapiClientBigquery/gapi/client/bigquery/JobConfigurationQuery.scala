package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobConfigurationQuery extends StObject {
  
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
  implicit class JobConfigurationQueryMutableBuilder[Self <: JobConfigurationQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowLargeResults(value: Boolean): Self = StObject.set(x, "allowLargeResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowLargeResultsUndefined: Self = StObject.set(x, "allowLargeResults", js.undefined)
    
    @scala.inline
    def setClustering(value: Clustering): Self = StObject.set(x, "clustering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusteringUndefined: Self = StObject.set(x, "clustering", js.undefined)
    
    @scala.inline
    def setConnectionProperties(value: js.Array[ConnectionProperty]): Self = StObject.set(x, "connectionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPropertiesUndefined: Self = StObject.set(x, "connectionProperties", js.undefined)
    
    @scala.inline
    def setConnectionPropertiesVarargs(value: ConnectionProperty*): Self = StObject.set(x, "connectionProperties", js.Array(value :_*))
    
    @scala.inline
    def setCreateDisposition(value: String): Self = StObject.set(x, "createDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDispositionUndefined: Self = StObject.set(x, "createDisposition", js.undefined)
    
    @scala.inline
    def setDefaultDataset(value: DatasetReference): Self = StObject.set(x, "defaultDataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDatasetUndefined: Self = StObject.set(x, "defaultDataset", js.undefined)
    
    @scala.inline
    def setDestinationEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "destinationEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationEncryptionConfigurationUndefined: Self = StObject.set(x, "destinationEncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setDestinationTable(value: TableReference): Self = StObject.set(x, "destinationTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationTableUndefined: Self = StObject.set(x, "destinationTable", js.undefined)
    
    @scala.inline
    def setFlattenResults(value: Boolean): Self = StObject.set(x, "flattenResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenResultsUndefined: Self = StObject.set(x, "flattenResults", js.undefined)
    
    @scala.inline
    def setMaximumBillingTier(value: Double): Self = StObject.set(x, "maximumBillingTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumBillingTierUndefined: Self = StObject.set(x, "maximumBillingTier", js.undefined)
    
    @scala.inline
    def setMaximumBytesBilled(value: String): Self = StObject.set(x, "maximumBytesBilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumBytesBilledUndefined: Self = StObject.set(x, "maximumBytesBilled", js.undefined)
    
    @scala.inline
    def setParameterMode(value: String): Self = StObject.set(x, "parameterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterModeUndefined: Self = StObject.set(x, "parameterMode", js.undefined)
    
    @scala.inline
    def setPreserveNulls(value: Boolean): Self = StObject.set(x, "preserveNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveNullsUndefined: Self = StObject.set(x, "preserveNulls", js.undefined)
    
    @scala.inline
    def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParameters(value: js.Array[QueryParameter]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    @scala.inline
    def setQueryParametersVarargs(value: QueryParameter*): Self = StObject.set(x, "queryParameters", js.Array(value :_*))
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRangePartitioning(value: RangePartitioning): Self = StObject.set(x, "rangePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangePartitioningUndefined: Self = StObject.set(x, "rangePartitioning", js.undefined)
    
    @scala.inline
    def setSchemaUpdateOptions(value: js.Array[String]): Self = StObject.set(x, "schemaUpdateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUpdateOptionsUndefined: Self = StObject.set(x, "schemaUpdateOptions", js.undefined)
    
    @scala.inline
    def setSchemaUpdateOptionsVarargs(value: String*): Self = StObject.set(x, "schemaUpdateOptions", js.Array(value :_*))
    
    @scala.inline
    def setTableDefinitions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.bigquery.gapi.client.bigquery.ExternalDataConfiguration}
      */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.JobConfigurationQuery with TopLevel[js.Any]
    ): Self = StObject.set(x, "tableDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableDefinitionsUndefined: Self = StObject.set(x, "tableDefinitions", js.undefined)
    
    @scala.inline
    def setTimePartitioning(value: TimePartitioning): Self = StObject.set(x, "timePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePartitioningUndefined: Self = StObject.set(x, "timePartitioning", js.undefined)
    
    @scala.inline
    def setUseLegacySql(value: Boolean): Self = StObject.set(x, "useLegacySql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLegacySqlUndefined: Self = StObject.set(x, "useLegacySql", js.undefined)
    
    @scala.inline
    def setUseQueryCache(value: Boolean): Self = StObject.set(x, "useQueryCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseQueryCacheUndefined: Self = StObject.set(x, "useQueryCache", js.undefined)
    
    @scala.inline
    def setUserDefinedFunctionResources(value: js.Array[UserDefinedFunctionResource]): Self = StObject.set(x, "userDefinedFunctionResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDefinedFunctionResourcesUndefined: Self = StObject.set(x, "userDefinedFunctionResources", js.undefined)
    
    @scala.inline
    def setUserDefinedFunctionResourcesVarargs(value: UserDefinedFunctionResource*): Self = StObject.set(x, "userDefinedFunctionResources", js.Array(value :_*))
    
    @scala.inline
    def setWriteDisposition(value: String): Self = StObject.set(x, "writeDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteDispositionUndefined: Self = StObject.set(x, "writeDisposition", js.undefined)
  }
}
