package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrestoJob extends StObject {
  
  /**
    * Optional. Presto client tags to attach to this query
    */
  var clientTags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
    */
  var continueOnFailure: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The runtime log config for job execution.
    */
  var loggingConfig: js.UndefOr[SchemaLoggingConfig] = js.undefined
  
  /**
    * Optional. The format in which query output will be displayed. See the Presto documentation for supported output formats
    */
  var outputFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A mapping of property names to values. Used to set Presto session properties (https://prestodb.io/docs/current/sql/set-session.html) Equivalent to using the --session flag in the Presto CLI
    */
  var properties: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The HCFS URI of the script that contains SQL queries.
    */
  var queryFileUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of queries.
    */
  var queryList: js.UndefOr[SchemaQueryList] = js.undefined
}
object SchemaPrestoJob {
  
  inline def apply(): SchemaPrestoJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrestoJob]
  }
  
  extension [Self <: SchemaPrestoJob](x: Self) {
    
    inline def setClientTags(value: js.Array[String]): Self = StObject.set(x, "clientTags", value.asInstanceOf[js.Any])
    
    inline def setClientTagsNull: Self = StObject.set(x, "clientTags", null)
    
    inline def setClientTagsUndefined: Self = StObject.set(x, "clientTags", js.undefined)
    
    inline def setClientTagsVarargs(value: String*): Self = StObject.set(x, "clientTags", js.Array(value*))
    
    inline def setContinueOnFailure(value: Boolean): Self = StObject.set(x, "continueOnFailure", value.asInstanceOf[js.Any])
    
    inline def setContinueOnFailureNull: Self = StObject.set(x, "continueOnFailure", null)
    
    inline def setContinueOnFailureUndefined: Self = StObject.set(x, "continueOnFailure", js.undefined)
    
    inline def setLoggingConfig(value: SchemaLoggingConfig): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
    
    inline def setOutputFormat(value: String): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputFormatNull: Self = StObject.set(x, "outputFormat", null)
    
    inline def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setQueryFileUri(value: String): Self = StObject.set(x, "queryFileUri", value.asInstanceOf[js.Any])
    
    inline def setQueryFileUriNull: Self = StObject.set(x, "queryFileUri", null)
    
    inline def setQueryFileUriUndefined: Self = StObject.set(x, "queryFileUri", js.undefined)
    
    inline def setQueryList(value: SchemaQueryList): Self = StObject.set(x, "queryList", value.asInstanceOf[js.Any])
    
    inline def setQueryListUndefined: Self = StObject.set(x, "queryList", js.undefined)
  }
}
