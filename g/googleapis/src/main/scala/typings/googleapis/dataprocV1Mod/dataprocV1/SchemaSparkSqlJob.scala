package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud Dataproc job for running Apache Spark SQL
  * (http://spark.apache.org/sql/) queries.
  */
trait SchemaSparkSqlJob extends StObject {
  
  /**
    * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
    */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The runtime log config for job execution.
    */
  var loggingConfig: js.UndefOr[SchemaLoggingConfig] = js.undefined
  
  /**
    * Optional. A mapping of property names to values, used to configure Spark
    * SQL&#39;s SparkConf. Properties that conflict with values set by the
    * Cloud Dataproc API may be overwritten.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The HCFS URI of the script that contains SQL queries.
    */
  var queryFileUri: js.UndefOr[String] = js.undefined
  
  /**
    * A list of queries.
    */
  var queryList: js.UndefOr[SchemaQueryList] = js.undefined
  
  /**
    * Optional. Mapping of query variable names to values (equivalent to the
    * Spark SQL command: SET name=&quot;value&quot;;).
    */
  var scriptVariables: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SchemaSparkSqlJob {
  
  @scala.inline
  def apply(): SchemaSparkSqlJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSparkSqlJob]
  }
  
  @scala.inline
  implicit class SchemaSparkSqlJobMutableBuilder[Self <: SchemaSparkSqlJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJarFileUris(value: js.Array[String]): Self = StObject.set(x, "jarFileUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJarFileUrisUndefined: Self = StObject.set(x, "jarFileUris", js.undefined)
    
    @scala.inline
    def setJarFileUrisVarargs(value: String*): Self = StObject.set(x, "jarFileUris", js.Array(value :_*))
    
    @scala.inline
    def setLoggingConfig(value: SchemaLoggingConfig): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setQueryFileUri(value: String): Self = StObject.set(x, "queryFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryFileUriUndefined: Self = StObject.set(x, "queryFileUri", js.undefined)
    
    @scala.inline
    def setQueryList(value: SchemaQueryList): Self = StObject.set(x, "queryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryListUndefined: Self = StObject.set(x, "queryList", js.undefined)
    
    @scala.inline
    def setScriptVariables(value: StringDictionary[String]): Self = StObject.set(x, "scriptVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptVariablesUndefined: Self = StObject.set(x, "scriptVariables", js.undefined)
  }
}
