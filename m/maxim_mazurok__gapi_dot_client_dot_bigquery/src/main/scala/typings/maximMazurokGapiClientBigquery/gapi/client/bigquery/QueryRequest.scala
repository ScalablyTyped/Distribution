package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRequest extends StObject {
  
  /** Connection properties. */
  var connectionProperties: js.UndefOr[js.Array[ConnectionProperty]] = js.undefined
  
  /**
    * [Optional] Specifies the default datasetId and projectId to assume for any unqualified table names in the query. If not set, all table names in the query string must be qualified in
    * the format 'datasetId.tableId'.
    */
  var defaultDataset: js.UndefOr[DatasetReference] = js.undefined
  
  /**
    * [Optional] If set to true, BigQuery doesn't run the job. Instead, if the query is valid, BigQuery returns statistics about the job such as how many bytes would be processed. If the
    * query is invalid, an error returns. The default value is false.
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /** The resource type of the request. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The labels associated with this job. You can use these to organize and group your jobs. Label keys and values can be no longer than 63 characters, can only contain lowercase
    * letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list
    * must have a different key.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.QueryRequest & TopLevel[js.Any]
  ] = js.undefined
  
  /** The geographic location where the job should run. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location. */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] The maximum number of rows of data to return per page of results. Setting this flag to a small value such as 1000 and then paging through results might improve
    * reliability when the query result set is large. In addition to this limit, responses are also limited to 10 MB. By default, there is no maximum row count, and only the byte limit
    * applies.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * [Optional] Limits the bytes billed for this job. Queries that will have bytes billed beyond this limit will fail (without incurring a charge). If unspecified, this will be set to
    * your project default.
    */
  var maximumBytesBilled: js.UndefOr[String] = js.undefined
  
  /** Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use named (@myparam) query parameters in this query. */
  var parameterMode: js.UndefOr[String] = js.undefined
  
  /** [Deprecated] This property is deprecated. */
  var preserveNulls: js.UndefOr[Boolean] = js.undefined
  
  /** [Required] A query string, following the BigQuery query syntax, of the query to execute. Example: "SELECT count(f1) FROM [myProjectId:myDatasetId.myTableId]". */
  var query: js.UndefOr[String] = js.undefined
  
  /** Query parameters for Standard SQL queries. */
  var queryParameters: js.UndefOr[js.Array[QueryParameter]] = js.undefined
  
  /**
    * A unique user provided identifier to ensure idempotent behavior for queries. Note that this is different from the job_id. It has the following properties: 1. It is case-sensitive,
    * limited to up to 36 ASCII characters. A UUID is recommended. 2. Read only queries can ignore this token since they are nullipotent by definition. 3. For the purposes of idempotency
    * ensured by the request_id, a request is considered duplicate of another only if they have the same request_id and are actually duplicates. When determining whether a request is a
    * duplicate of the previous request, all parameters in the request that may affect the behavior are considered. For example, query, connection_properties, query_parameters,
    * use_legacy_sql are parameters that affect the result and are considered when determining whether a request is a duplicate, but properties like timeout_ms don't affect the result and
    * are thus not considered. Dry run query requests are never considered duplicate of another request. 4. When a duplicate mutating query request is detected, it returns: a. the results
    * of the mutation if it completes successfully within the timeout. b. the running operation if it is still in progress at the end of the timeout. 5. Its lifetime is limited to 15
    * minutes. In other words, if two requests are sent with the same request_id, but more than 15 minutes apart, idempotency is not guaranteed.
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] How long to wait for the query to complete, in milliseconds, before the request times out and returns. Note that this is only a timeout for the request, not the query. If
    * the query takes longer to run than the timeout value, the call returns without any results and with the 'jobComplete' flag set to false. You can call GetQueryResults() to wait for
    * the query to complete and read the results. The default value is 10000 milliseconds (10 seconds).
    */
  var timeoutMs: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is true. If set to false, the query will use BigQuery's standard SQL:
    * https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set to false, the value of flattenResults is ignored; query will be run as if flattenResults is false.
    */
  var useLegacySql: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Optional] Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever tables in the query are modified. The default
    * value is true.
    */
  var useQueryCache: js.UndefOr[Boolean] = js.undefined
}
object QueryRequest {
  
  inline def apply(): QueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRequest]
  }
  
  extension [Self <: QueryRequest](x: Self) {
    
    inline def setConnectionProperties(value: js.Array[ConnectionProperty]): Self = StObject.set(x, "connectionProperties", value.asInstanceOf[js.Any])
    
    inline def setConnectionPropertiesUndefined: Self = StObject.set(x, "connectionProperties", js.undefined)
    
    inline def setConnectionPropertiesVarargs(value: ConnectionProperty*): Self = StObject.set(x, "connectionProperties", js.Array(value :_*))
    
    inline def setDefaultDataset(value: DatasetReference): Self = StObject.set(x, "defaultDataset", value.asInstanceOf[js.Any])
    
    inline def setDefaultDatasetUndefined: Self = StObject.set(x, "defaultDataset", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.QueryRequest & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMaximumBytesBilled(value: String): Self = StObject.set(x, "maximumBytesBilled", value.asInstanceOf[js.Any])
    
    inline def setMaximumBytesBilledUndefined: Self = StObject.set(x, "maximumBytesBilled", js.undefined)
    
    inline def setParameterMode(value: String): Self = StObject.set(x, "parameterMode", value.asInstanceOf[js.Any])
    
    inline def setParameterModeUndefined: Self = StObject.set(x, "parameterMode", js.undefined)
    
    inline def setPreserveNulls(value: Boolean): Self = StObject.set(x, "preserveNulls", value.asInstanceOf[js.Any])
    
    inline def setPreserveNullsUndefined: Self = StObject.set(x, "preserveNulls", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryParameters(value: js.Array[QueryParameter]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    inline def setQueryParametersVarargs(value: QueryParameter*): Self = StObject.set(x, "queryParameters", js.Array(value :_*))
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setTimeoutMs(value: Double): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
    
    inline def setTimeoutMsUndefined: Self = StObject.set(x, "timeoutMs", js.undefined)
    
    inline def setUseLegacySql(value: Boolean): Self = StObject.set(x, "useLegacySql", value.asInstanceOf[js.Any])
    
    inline def setUseLegacySqlUndefined: Self = StObject.set(x, "useLegacySql", js.undefined)
    
    inline def setUseQueryCache(value: Boolean): Self = StObject.set(x, "useQueryCache", value.asInstanceOf[js.Any])
    
    inline def setUseQueryCacheUndefined: Self = StObject.set(x, "useQueryCache", js.undefined)
  }
}
