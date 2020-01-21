package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Dataproc job for running Apache Spark SQL
  * (http://spark.apache.org/sql/) queries.
  */
@js.native
trait SchemaSparkSqlJob extends js.Object {
  /**
    * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
    */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The runtime log config for job execution.
    */
  var loggingConfig: js.UndefOr[SchemaLoggingConfig] = js.native
  /**
    * Optional. A mapping of property names to values, used to configure Spark
    * SQL&#39;s SparkConf. Properties that conflict with values set by the
    * Cloud Dataproc API may be overwritten.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The HCFS URI of the script that contains SQL queries.
    */
  var queryFileUri: js.UndefOr[String] = js.native
  /**
    * A list of queries.
    */
  var queryList: js.UndefOr[SchemaQueryList] = js.native
  /**
    * Optional. Mapping of query variable names to values (equivalent to the
    * Spark SQL command: SET name=&quot;value&quot;;).
    */
  var scriptVariables: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaSparkSqlJob {
  @scala.inline
  def apply(
    jarFileUris: js.Array[String] = null,
    loggingConfig: SchemaLoggingConfig = null,
    properties: StringDictionary[String] = null,
    queryFileUri: String = null,
    queryList: SchemaQueryList = null,
    scriptVariables: StringDictionary[String] = null
  ): SchemaSparkSqlJob = {
    val __obj = js.Dynamic.literal()
    if (jarFileUris != null) __obj.updateDynamic("jarFileUris")(jarFileUris.asInstanceOf[js.Any])
    if (loggingConfig != null) __obj.updateDynamic("loggingConfig")(loggingConfig.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (queryFileUri != null) __obj.updateDynamic("queryFileUri")(queryFileUri.asInstanceOf[js.Any])
    if (queryList != null) __obj.updateDynamic("queryList")(queryList.asInstanceOf[js.Any])
    if (scriptVariables != null) __obj.updateDynamic("scriptVariables")(scriptVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSparkSqlJob]
  }
}

