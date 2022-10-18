package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkSqlJob extends StObject {
  
  /** Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH. */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. The runtime log config for job execution. */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.undefined
  
  /** Optional. A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Dataproc API may be overwritten. */
  var properties: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The HCFS URI of the script that contains SQL queries. */
  var queryFileUri: js.UndefOr[String] = js.undefined
  
  /** A list of queries. */
  var queryList: js.UndefOr[QueryList] = js.undefined
  
  /** Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name="value";). */
  var scriptVariables: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object SparkSqlJob {
  
  inline def apply(): SparkSqlJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparkSqlJob]
  }
  
  extension [Self <: SparkSqlJob](x: Self) {
    
    inline def setJarFileUris(value: js.Array[String]): Self = StObject.set(x, "jarFileUris", value.asInstanceOf[js.Any])
    
    inline def setJarFileUrisUndefined: Self = StObject.set(x, "jarFileUris", js.undefined)
    
    inline def setJarFileUrisVarargs(value: String*): Self = StObject.set(x, "jarFileUris", js.Array(value*))
    
    inline def setLoggingConfig(value: LoggingConfig): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
    
    inline def setProperties(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setQueryFileUri(value: String): Self = StObject.set(x, "queryFileUri", value.asInstanceOf[js.Any])
    
    inline def setQueryFileUriUndefined: Self = StObject.set(x, "queryFileUri", js.undefined)
    
    inline def setQueryList(value: QueryList): Self = StObject.set(x, "queryList", value.asInstanceOf[js.Any])
    
    inline def setQueryListUndefined: Self = StObject.set(x, "queryList", js.undefined)
    
    inline def setScriptVariables(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "scriptVariables", value.asInstanceOf[js.Any])
    
    inline def setScriptVariablesUndefined: Self = StObject.set(x, "scriptVariables", js.undefined)
  }
}
