package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud Dataproc job for running Apache Hive (https://hive.apache.org/)
  * queries on YARN.
  */
trait SchemaHiveJob extends StObject {
  
  /**
    * Optional. Whether to continue executing queries if a query fails. The
    * default value is false. Setting to true can be useful when executing
    * independent parallel queries.
    */
  var continueOnFailure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Hive
    * server and Hadoop MapReduce (MR) tasks. Can contain Hive SerDes and UDFs.
    */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. A mapping of property names and values, used to configure Hive.
    * Properties that conflict with values set by the Cloud Dataproc API may be
    * overwritten. Can include properties set in /etc/hadoop/conf/ *-site.xml,
    * /etc/hive/conf/hive-site.xml, and classes in user code.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The HCFS URI of the script that contains Hive queries.
    */
  var queryFileUri: js.UndefOr[String] = js.undefined
  
  /**
    * A list of queries.
    */
  var queryList: js.UndefOr[SchemaQueryList] = js.undefined
  
  /**
    * Optional. Mapping of query variable names to values (equivalent to the
    * Hive command: SET name=&quot;value&quot;;).
    */
  var scriptVariables: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SchemaHiveJob {
  
  @scala.inline
  def apply(): SchemaHiveJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHiveJob]
  }
  
  @scala.inline
  implicit class SchemaHiveJobMutableBuilder[Self <: SchemaHiveJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinueOnFailure(value: Boolean): Self = StObject.set(x, "continueOnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueOnFailureUndefined: Self = StObject.set(x, "continueOnFailure", js.undefined)
    
    @scala.inline
    def setJarFileUris(value: js.Array[String]): Self = StObject.set(x, "jarFileUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJarFileUrisUndefined: Self = StObject.set(x, "jarFileUris", js.undefined)
    
    @scala.inline
    def setJarFileUrisVarargs(value: String*): Self = StObject.set(x, "jarFileUris", js.Array(value :_*))
    
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
