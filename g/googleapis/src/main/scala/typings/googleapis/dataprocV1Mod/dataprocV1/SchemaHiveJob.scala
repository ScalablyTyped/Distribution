package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHiveJob extends StObject {
  
  /**
    * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
    */
  var continueOnFailure: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Hive server and Hadoop MapReduce (MR) tasks. Can contain Hive SerDes and UDFs.
    */
  var jarFileUris: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. A mapping of property names and values, used to configure Hive. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/hadoop/conf/x-site.xml, /etc/hive/conf/hive-site.xml, and classes in user code.
    */
  var properties: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The HCFS URI of the script that contains Hive queries.
    */
  var queryFileUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of queries.
    */
  var queryList: js.UndefOr[SchemaQueryList] = js.undefined
  
  /**
    * Optional. Mapping of query variable names to values (equivalent to the Hive command: SET name="value";).
    */
  var scriptVariables: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaHiveJob {
  
  inline def apply(): SchemaHiveJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHiveJob]
  }
  
  extension [Self <: SchemaHiveJob](x: Self) {
    
    inline def setContinueOnFailure(value: Boolean): Self = StObject.set(x, "continueOnFailure", value.asInstanceOf[js.Any])
    
    inline def setContinueOnFailureNull: Self = StObject.set(x, "continueOnFailure", null)
    
    inline def setContinueOnFailureUndefined: Self = StObject.set(x, "continueOnFailure", js.undefined)
    
    inline def setJarFileUris(value: js.Array[String]): Self = StObject.set(x, "jarFileUris", value.asInstanceOf[js.Any])
    
    inline def setJarFileUrisNull: Self = StObject.set(x, "jarFileUris", null)
    
    inline def setJarFileUrisUndefined: Self = StObject.set(x, "jarFileUris", js.undefined)
    
    inline def setJarFileUrisVarargs(value: String*): Self = StObject.set(x, "jarFileUris", js.Array(value*))
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setQueryFileUri(value: String): Self = StObject.set(x, "queryFileUri", value.asInstanceOf[js.Any])
    
    inline def setQueryFileUriNull: Self = StObject.set(x, "queryFileUri", null)
    
    inline def setQueryFileUriUndefined: Self = StObject.set(x, "queryFileUri", js.undefined)
    
    inline def setQueryList(value: SchemaQueryList): Self = StObject.set(x, "queryList", value.asInstanceOf[js.Any])
    
    inline def setQueryListUndefined: Self = StObject.set(x, "queryList", js.undefined)
    
    inline def setScriptVariables(value: StringDictionary[String]): Self = StObject.set(x, "scriptVariables", value.asInstanceOf[js.Any])
    
    inline def setScriptVariablesNull: Self = StObject.set(x, "scriptVariables", null)
    
    inline def setScriptVariablesUndefined: Self = StObject.set(x, "scriptVariables", js.undefined)
  }
}
