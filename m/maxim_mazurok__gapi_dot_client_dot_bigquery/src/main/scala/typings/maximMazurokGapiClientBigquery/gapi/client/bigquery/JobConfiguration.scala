package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobConfiguration extends StObject {
  
  /** [Pick one] Copies a table. */
  var copy: js.UndefOr[JobConfigurationTableCopy] = js.undefined
  
  /**
    * [Optional] If set, don't actually run this job. A valid query will return a mostly empty response with some processing statistics, while an invalid query will return the same error
    * it would if it wasn't a dry run. Behavior of non-query jobs is undefined.
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /** [Pick one] Configures an extract job. */
  var extract: js.UndefOr[JobConfigurationExtract] = js.undefined
  
  /** [Optional] Job timeout in milliseconds. If this time limit is exceeded, BigQuery may attempt to terminate the job. */
  var jobTimeoutMs: js.UndefOr[String] = js.undefined
  
  /** [Output-only] The type of the job. Can be QUERY, LOAD, EXTRACT, COPY or UNKNOWN. */
  var jobType: js.UndefOr[String] = js.undefined
  
  /**
    * The labels associated with this job. You can use these to organize and group your jobs. Label keys and values can be no longer than 63 characters, can only contain lowercase
    * letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list
    * must have a different key.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** [Pick one] Configures a load job. */
  var load: js.UndefOr[JobConfigurationLoad] = js.undefined
  
  /** [Pick one] Configures a query job. */
  var query: js.UndefOr[JobConfigurationQuery] = js.undefined
}
object JobConfiguration {
  
  inline def apply(): JobConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfiguration]
  }
  
  extension [Self <: JobConfiguration](x: Self) {
    
    inline def setCopy(value: JobConfigurationTableCopy): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setExtract(value: JobConfigurationExtract): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
    
    inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
    
    inline def setJobTimeoutMs(value: String): Self = StObject.set(x, "jobTimeoutMs", value.asInstanceOf[js.Any])
    
    inline def setJobTimeoutMsUndefined: Self = StObject.set(x, "jobTimeoutMs", js.undefined)
    
    inline def setJobType(value: String): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "jobType", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLoad(value: JobConfigurationLoad): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setQuery(value: JobConfigurationQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
