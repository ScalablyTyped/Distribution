package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkSqlBatch extends StObject {
  
  /** Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH. */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The HCFS URI of the script that contains Spark SQL queries to execute. */
  var queryFileUri: js.UndefOr[String] = js.undefined
  
  /** Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name="value";). */
  var queryVariables: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object SparkSqlBatch {
  
  inline def apply(): SparkSqlBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparkSqlBatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SparkSqlBatch] (val x: Self) extends AnyVal {
    
    inline def setJarFileUris(value: js.Array[String]): Self = StObject.set(x, "jarFileUris", value.asInstanceOf[js.Any])
    
    inline def setJarFileUrisUndefined: Self = StObject.set(x, "jarFileUris", js.undefined)
    
    inline def setJarFileUrisVarargs(value: String*): Self = StObject.set(x, "jarFileUris", js.Array(value*))
    
    inline def setQueryFileUri(value: String): Self = StObject.set(x, "queryFileUri", value.asInstanceOf[js.Any])
    
    inline def setQueryFileUriUndefined: Self = StObject.set(x, "queryFileUri", js.undefined)
    
    inline def setQueryVariables(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "queryVariables", value.asInstanceOf[js.Any])
    
    inline def setQueryVariablesUndefined: Self = StObject.set(x, "queryVariables", js.undefined)
  }
}
