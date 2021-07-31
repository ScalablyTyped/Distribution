package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud Dataproc job for running Presto (https://prestosql.io/) queries
  */
trait SchemaPrestoJob extends StObject {
  
  /**
    * Optional. Presto client tags to attach to this query
    */
  var clientTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. Whether to continue executing queries if a query fails. The
    * default value is false. Setting to true can be useful when executing
    * independent parallel queries.
    */
  var continueOnFailure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. The runtime log config for job execution.
    */
  var loggingConfig: js.UndefOr[SchemaLoggingConfig] = js.undefined
  
  /**
    * Optional. The format in which query output will be displayed. See the
    * Presto documentation for supported output formats
    */
  var outputFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A mapping of property names to values. Used to set Presto
    * session properties
    * (https://prestodb.io/docs/current/sql/set-session.html) Equivalent to
    * using the --session flag in the Presto CLI
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
}
object SchemaPrestoJob {
  
  @scala.inline
  def apply(): SchemaPrestoJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrestoJob]
  }
  
  @scala.inline
  implicit class SchemaPrestoJobMutableBuilder[Self <: SchemaPrestoJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientTags(value: js.Array[String]): Self = StObject.set(x, "clientTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTagsUndefined: Self = StObject.set(x, "clientTags", js.undefined)
    
    @scala.inline
    def setClientTagsVarargs(value: String*): Self = StObject.set(x, "clientTags", js.Array(value :_*))
    
    @scala.inline
    def setContinueOnFailure(value: Boolean): Self = StObject.set(x, "continueOnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueOnFailureUndefined: Self = StObject.set(x, "continueOnFailure", js.undefined)
    
    @scala.inline
    def setLoggingConfig(value: SchemaLoggingConfig): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
    
    @scala.inline
    def setOutputFormat(value: String): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
    
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
  }
}
