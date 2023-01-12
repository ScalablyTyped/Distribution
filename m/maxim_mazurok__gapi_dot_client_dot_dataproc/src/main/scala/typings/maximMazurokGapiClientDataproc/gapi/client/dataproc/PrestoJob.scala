package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrestoJob extends StObject {
  
  /** Optional. Presto client tags to attach to this query */
  var clientTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries. */
  var continueOnFailure: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. The runtime log config for job execution. */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.undefined
  
  /** Optional. The format in which query output will be displayed. See the Presto documentation for supported output formats */
  var outputFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A mapping of property names to values. Used to set Presto session properties (https://prestodb.io/docs/current/sql/set-session.html) Equivalent to using the --session flag
    * in the Presto CLI
    */
  var properties: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The HCFS URI of the script that contains SQL queries. */
  var queryFileUri: js.UndefOr[String] = js.undefined
  
  /** A list of queries. */
  var queryList: js.UndefOr[QueryList] = js.undefined
}
object PrestoJob {
  
  inline def apply(): PrestoJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrestoJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrestoJob] (val x: Self) extends AnyVal {
    
    inline def setClientTags(value: js.Array[String]): Self = StObject.set(x, "clientTags", value.asInstanceOf[js.Any])
    
    inline def setClientTagsUndefined: Self = StObject.set(x, "clientTags", js.undefined)
    
    inline def setClientTagsVarargs(value: String*): Self = StObject.set(x, "clientTags", js.Array(value*))
    
    inline def setContinueOnFailure(value: Boolean): Self = StObject.set(x, "continueOnFailure", value.asInstanceOf[js.Any])
    
    inline def setContinueOnFailureUndefined: Self = StObject.set(x, "continueOnFailure", js.undefined)
    
    inline def setLoggingConfig(value: LoggingConfig): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
    
    inline def setOutputFormat(value: String): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
    
    inline def setProperties(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setQueryFileUri(value: String): Self = StObject.set(x, "queryFileUri", value.asInstanceOf[js.Any])
    
    inline def setQueryFileUriUndefined: Self = StObject.set(x, "queryFileUri", js.undefined)
    
    inline def setQueryList(value: QueryList): Self = StObject.set(x, "queryList", value.asInstanceOf[js.Any])
    
    inline def setQueryListUndefined: Self = StObject.set(x, "queryList", js.undefined)
  }
}
