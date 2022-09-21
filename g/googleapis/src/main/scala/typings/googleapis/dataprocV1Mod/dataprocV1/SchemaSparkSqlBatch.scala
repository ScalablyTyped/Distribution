package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSparkSqlBatch extends StObject {
  
  /**
    * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
    */
  var jarFileUris: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The HCFS URI of the script that contains Spark SQL queries to execute.
    */
  var queryFileUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name="value";).
    */
  var queryVariables: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaSparkSqlBatch {
  
  inline def apply(): SchemaSparkSqlBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSparkSqlBatch]
  }
  
  extension [Self <: SchemaSparkSqlBatch](x: Self) {
    
    inline def setJarFileUris(value: js.Array[String]): Self = StObject.set(x, "jarFileUris", value.asInstanceOf[js.Any])
    
    inline def setJarFileUrisNull: Self = StObject.set(x, "jarFileUris", null)
    
    inline def setJarFileUrisUndefined: Self = StObject.set(x, "jarFileUris", js.undefined)
    
    inline def setJarFileUrisVarargs(value: String*): Self = StObject.set(x, "jarFileUris", js.Array(value*))
    
    inline def setQueryFileUri(value: String): Self = StObject.set(x, "queryFileUri", value.asInstanceOf[js.Any])
    
    inline def setQueryFileUriNull: Self = StObject.set(x, "queryFileUri", null)
    
    inline def setQueryFileUriUndefined: Self = StObject.set(x, "queryFileUri", js.undefined)
    
    inline def setQueryVariables(value: StringDictionary[String]): Self = StObject.set(x, "queryVariables", value.asInstanceOf[js.Any])
    
    inline def setQueryVariablesNull: Self = StObject.set(x, "queryVariables", null)
    
    inline def setQueryVariablesUndefined: Self = StObject.set(x, "queryVariables", js.undefined)
  }
}
