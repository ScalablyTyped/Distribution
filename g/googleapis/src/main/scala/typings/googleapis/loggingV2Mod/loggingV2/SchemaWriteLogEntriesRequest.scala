package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameters to WriteLogEntries.
  */
@js.native
trait SchemaWriteLogEntriesRequest extends js.Object {
  /**
    * Optional. If true, the request should expect normal response, but the
    * entries won&#39;t be persisted nor exported. Useful for checking whether
    * the logging API endpoints are working properly before sending valuable
    * data.
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  /**
    * Required. The log entries to send to Logging. The order of log entries in
    * this list does not matter. Values supplied in this method&#39;s log_name,
    * resource, and labels fields are copied into those log entries in this
    * list that do not include values for their corresponding fields. For more
    * information, see the LogEntry type.If the timestamp or insert_id fields
    * are missing in log entries, then this method supplies the current time or
    * a unique identifier, respectively. The supplied values are chosen so
    * that, among the log entries that did not supply their own values, the
    * entries earlier in the list will sort before the entries later in the
    * list. See the entries.list method.Log entries with timestamps that are
    * more than the logs retention period in the past or more than 24 hours in
    * the future will not be available when calling entries.list. However,
    * those log entries can still be exported with LogSinks.To improve
    * throughput and to avoid exceeding the quota limit for calls to
    * entries.write, you should try to include several log entries in this
    * list, rather than calling this method for each individual log entry.
    */
  var entries: js.UndefOr[js.Array[SchemaLogEntry]] = js.native
  /**
    * Optional. Default labels that are added to the labels field of all log
    * entries in entries. If a log entry already has a label with the same key
    * as a label in this parameter, then the log entry&#39;s label is not
    * changed. See LogEntry.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Optional. A default log resource name that is assigned to all log entries
    * in entries that do not specify a value for log_name:
    * &quot;projects/[PROJECT_ID]/logs/[LOG_ID]&quot;
    * &quot;organizations/[ORGANIZATION_ID]/logs/[LOG_ID]&quot;
    * &quot;billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]&quot;
    * &quot;folders/[FOLDER_ID]/logs/[LOG_ID]&quot; [LOG_ID] must be
    * URL-encoded. For example: &quot;projects/my-project-id/logs/syslog&quot;
    * &quot;organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity&quot;
    * The permission &lt;code&gt;logging.logEntries.create&lt;/code&gt; is
    * needed on each project, organization, billing account, or folder that is
    * receiving new log entries, whether the resource is specified in
    * &lt;code&gt;logName&lt;/code&gt; or in an individual log entry.
    */
  var logName: js.UndefOr[String] = js.native
  /**
    * Optional. Whether valid entries should be written even if some other
    * entries fail due to INVALID_ARGUMENT or PERMISSION_DENIED errors. If any
    * entry is not written, then the response status is the error associated
    * with one of the failed entries and the response includes error details
    * keyed by the entries&#39; zero-based index in the entries.write method.
    */
  var partialSuccess: js.UndefOr[Boolean] = js.native
  /**
    * Optional. A default monitored resource object that is assigned to all log
    * entries in entries that do not specify a value for resource. Example: {
    * &quot;type&quot;: &quot;gce_instance&quot;,   &quot;labels&quot;: {
    * &quot;zone&quot;: &quot;us-central1-a&quot;, &quot;instance_id&quot;:
    * &quot;00000000000000000000&quot; }} See LogEntry.
    */
  var resource: js.UndefOr[SchemaMonitoredResource] = js.native
}

object SchemaWriteLogEntriesRequest {
  @scala.inline
  def apply(): SchemaWriteLogEntriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWriteLogEntriesRequest]
  }
  @scala.inline
  implicit class SchemaWriteLogEntriesRequestOps[Self <: SchemaWriteLogEntriesRequest] (val x: Self) extends AnyVal {
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
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    @scala.inline
    def setEntriesVarargs(value: SchemaLogEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[SchemaLogEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLogName(value: String): Self = this.set("logName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogName: Self = this.set("logName", js.undefined)
    @scala.inline
    def setPartialSuccess(value: Boolean): Self = this.set("partialSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartialSuccess: Self = this.set("partialSuccess", js.undefined)
    @scala.inline
    def setResource(value: SchemaMonitoredResource): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
  
}

