package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Dataproc job for running Apache Pig (https://pig.apache.org/)
  * queries on YARN.
  */
@js.native
trait SchemaPigJob extends js.Object {
  /**
    * Optional. Whether to continue executing queries if a query fails. The
    * default value is false. Setting to true can be useful when executing
    * independent parallel queries.
    */
  var continueOnFailure: js.UndefOr[Boolean] = js.native
  /**
    * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Pig
    * Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
    */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The runtime log config for job execution.
    */
  var loggingConfig: js.UndefOr[SchemaLoggingConfig] = js.native
  /**
    * Optional. A mapping of property names to values, used to configure Pig.
    * Properties that conflict with values set by the Cloud Dataproc API may be
    * overwritten. Can include properties set in /etc/hadoop/conf/ *-site.xml,
    * /etc/pig/conf/pig.properties, and classes in user code.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The HCFS URI of the script that contains the Pig queries.
    */
  var queryFileUri: js.UndefOr[String] = js.native
  /**
    * A list of queries.
    */
  var queryList: js.UndefOr[SchemaQueryList] = js.native
  /**
    * Optional. Mapping of query variable names to values (equivalent to the
    * Pig command: name=[value]).
    */
  var scriptVariables: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaPigJob {
  @scala.inline
  def apply(): SchemaPigJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPigJob]
  }
  @scala.inline
  implicit class SchemaPigJobOps[Self <: SchemaPigJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContinueOnFailure(value: Boolean): Self = this.set("continueOnFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinueOnFailure: Self = this.set("continueOnFailure", js.undefined)
    @scala.inline
    def setJarFileUrisVarargs(value: String*): Self = this.set("jarFileUris", js.Array(value :_*))
    @scala.inline
    def setJarFileUris(value: js.Array[String]): Self = this.set("jarFileUris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJarFileUris: Self = this.set("jarFileUris", js.undefined)
    @scala.inline
    def setLoggingConfig(value: SchemaLoggingConfig): Self = this.set("loggingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingConfig: Self = this.set("loggingConfig", js.undefined)
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setQueryFileUri(value: String): Self = this.set("queryFileUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryFileUri: Self = this.set("queryFileUri", js.undefined)
    @scala.inline
    def setQueryList(value: SchemaQueryList): Self = this.set("queryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryList: Self = this.set("queryList", js.undefined)
    @scala.inline
    def setScriptVariables(value: StringDictionary[String]): Self = this.set("scriptVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptVariables: Self = this.set("scriptVariables", js.undefined)
  }
  
}

