package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a sink used to export log entries to one of the following
  * destinations in any project: a Cloud Storage bucket, a BigQuery dataset, or
  * a Cloud Pub/Sub topic. A logs filter controls which log entries are
  * exported. The sink must be created within a project, organization, billing
  * account, or folder.
  */
@js.native
trait SchemaLogSink extends js.Object {
  
  /**
    * Output only. The creation timestamp of the sink.This field may not be
    * present for older sinks.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Required. The export destination:
    * &quot;storage.googleapis.com/[GCS_BUCKET]&quot;
    * &quot;bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]&quot;
    * &quot;pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]&quot;
    * The sink&#39;s writer_identity, set when the sink is created, must have
    * permission to write to the destination or else the log entries are not
    * exported. For more information, see Exporting Logs with Sinks.
    */
  var destination: js.UndefOr[String] = js.native
  
  /**
    * Optional. An advanced logs filter. The only exported log entries are
    * those that are in the resource owning the sink and that match the filter.
    * For example: logName=&quot;projects/[PROJECT_ID]/logs/[LOG_ID]&quot; AND
    * severity&gt;=ERROR
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Optional. This field applies only to sinks owned by organizations and
    * folders. If the field is false, the default, only the logs owned by the
    * sink&#39;s parent resource are available for export. If the field is
    * true, then logs from all the projects, folders, and billing accounts
    * contained in the sink&#39;s parent resource are also available for
    * export. Whether a particular log entry from the children is exported
    * depends on the sink&#39;s filter expression. For example, if this field
    * is true, then the filter resource.type=gce_instance would export all
    * Compute Engine VM instance log entries from all projects in the
    * sink&#39;s parent. To only export entries from certain child projects,
    * filter on the project part of the log name:
    * logName:(&quot;projects/test-project1/&quot; OR
    * &quot;projects/test-project2/&quot;) AND resource.type=gce_instance
    */
  var includeChildren: js.UndefOr[Boolean] = js.native
  
  /**
    * Required. The client-assigned sink identifier, unique within the project.
    * Example: &quot;my-syslog-errors-to-pubsub&quot;. Sink identifiers are
    * limited to 100 characters and can include only the following characters:
    * upper and lower-case alphanumeric characters, underscores, hyphens, and
    * periods.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. The log entry format to use for this sink&#39;s exported log
    * entries. The v2 format is used by default and cannot be changed.
    */
  var outputVersionFormat: js.UndefOr[String] = js.native
  
  /**
    * Output only. The last update timestamp of the sink.This field may not be
    * present for older sinks.
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. An IAM identity&amp;mdash;a service account or
    * group&amp;mdash;under which Logging writes the exported log entries to
    * the sink&#39;s destination. This field is set by sinks.create and
    * sinks.update based on the value of unique_writer_identity in those
    * methods.Until you grant this identity write-access to the destination,
    * log entry exports from this sink will fail. For more information, see
    * Granting Access for a Resource. Consult the destination service&#39;s
    * documentation to determine the appropriate IAM roles to assign to the
    * identity.
    */
  var writerIdentity: js.UndefOr[String] = js.native
}
object SchemaLogSink {
  
  @scala.inline
  def apply(): SchemaLogSink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogSink]
  }
  
  @scala.inline
  implicit class SchemaLogSinkOps[Self <: SchemaLogSink] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setIncludeChildren(value: Boolean): Self = this.set("includeChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeChildren: Self = this.set("includeChildren", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutputVersionFormat(value: String): Self = this.set("outputVersionFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputVersionFormat: Self = this.set("outputVersionFormat", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setWriterIdentity(value: String): Self = this.set("writerIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriterIdentity: Self = this.set("writerIdentity", js.undefined)
  }
}
