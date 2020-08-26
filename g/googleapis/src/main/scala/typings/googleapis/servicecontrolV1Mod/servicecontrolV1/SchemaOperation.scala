package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents information regarding an operation.
  */
@js.native
trait SchemaOperation extends js.Object {
  /**
    * Identity of the consumer who is using the service. This field should be
    * filled in for the operations initiated by a consumer, but not for
    * service-initiated operations that are not related to a specific consumer.
    * - This can be in one of the following formats:     - project:PROJECT_ID,
    * - project`_`number:PROJECT_NUMBER,     - projects/PROJECT_ID or
    * PROJECT_NUMBER,     - folders/FOLDER_NUMBER,     -
    * organizations/ORGANIZATION_NUMBER,     - api`_`key:API_KEY.
    */
  var consumerId: js.UndefOr[String] = js.native
  /**
    * End time of the operation. Required when the operation is used in
    * ServiceController.Report, but optional when the operation is used in
    * ServiceController.Check.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * DO NOT USE. This is an experimental field.
    */
  var importance: js.UndefOr[String] = js.native
  /**
    * Labels describing the operation. Only the following labels are allowed:
    * - Labels describing monitored resources as defined in   the service
    * configuration. - Default labels of metric values. When specified, labels
    * defined in the   metric value override these default. - The following
    * labels defined by Google Cloud Platform:     -
    * `cloud.googleapis.com/location` describing the location where the
    * operation happened,     - `servicecontrol.googleapis.com/user_agent`
    * describing the user agent        of the API request,     -
    * `servicecontrol.googleapis.com/service_agent` describing the service used
    * to handle the API request (e.g. ESP),     -
    * `servicecontrol.googleapis.com/platform` describing the platform where
    * the API is served, such as App Engine, Compute Engine, or Kubernetes
    * Engine.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Represents information to be logged.
    */
  var logEntries: js.UndefOr[js.Array[SchemaLogEntry]] = js.native
  /**
    * Represents information about this operation. Each MetricValueSet
    * corresponds to a metric defined in the service configuration. The data
    * type used in the MetricValueSet must agree with the data type specified
    * in the metric definition.  Within a single operation, it is not allowed
    * to have more than one MetricValue instances that have the same metric
    * names and identical label value combinations. If a request has such
    * duplicated MetricValue instances, the entire request is rejected with an
    * invalid argument error.
    */
  var metricValueSets: js.UndefOr[js.Array[SchemaMetricValueSet]] = js.native
  /**
    * Identity of the operation. This must be unique within the scope of the
    * service that generated the operation. If the service calls Check() and
    * Report() on the same operation, the two calls should carry the same id.
    * UUID version 4 is recommended, though not required. In scenarios where an
    * operation is computed from existing information and an idempotent id is
    * desirable for deduplication purpose, UUID version 5 is recommended. See
    * RFC 4122 for details.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Fully qualified name of the operation. Reserved for future use.
    */
  var operationName: js.UndefOr[String] = js.native
  /**
    * Represents the properties needed for quota check. Applicable only if this
    * operation is for a quota check request. If this is not specified, no
    * quota check will be performed.
    */
  var quotaProperties: js.UndefOr[SchemaQuotaProperties] = js.native
  /**
    * DO NOT USE. This field is deprecated, use &quot;resources&quot; field
    * instead. The resource name of the parent of a resource in the resource
    * hierarchy.  This can be in one of the following formats:     -
    * “projects/&lt;project-id or project-number&gt;”     -
    * “folders/&lt;folder-id&gt;”     - “organizations/&lt;organization-id&gt;”
    */
  var resourceContainer: js.UndefOr[String] = js.native
  /**
    * The resources that are involved in the operation. The maximum supported
    * number of entries in this field is 100.
    */
  var resources: js.UndefOr[js.Array[SchemaResourceInfo]] = js.native
  /**
    * Required. Start time of the operation.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * User defined labels for the resource that this operation is associated
    * with. Only a combination of 1000 user labels per consumer project are
    * allowed.
    */
  var userLabels: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaOperation {
  @scala.inline
  def apply(): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperation]
  }
  @scala.inline
  implicit class SchemaOperationOps[Self <: SchemaOperation] (val x: Self) extends AnyVal {
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
    def setConsumerId(value: String): Self = this.set("consumerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumerId: Self = this.set("consumerId", js.undefined)
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setImportance(value: String): Self = this.set("importance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportance: Self = this.set("importance", js.undefined)
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLogEntriesVarargs(value: SchemaLogEntry*): Self = this.set("logEntries", js.Array(value :_*))
    @scala.inline
    def setLogEntries(value: js.Array[SchemaLogEntry]): Self = this.set("logEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogEntries: Self = this.set("logEntries", js.undefined)
    @scala.inline
    def setMetricValueSetsVarargs(value: SchemaMetricValueSet*): Self = this.set("metricValueSets", js.Array(value :_*))
    @scala.inline
    def setMetricValueSets(value: js.Array[SchemaMetricValueSet]): Self = this.set("metricValueSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricValueSets: Self = this.set("metricValueSets", js.undefined)
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationName: Self = this.set("operationName", js.undefined)
    @scala.inline
    def setQuotaProperties(value: SchemaQuotaProperties): Self = this.set("quotaProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaProperties: Self = this.set("quotaProperties", js.undefined)
    @scala.inline
    def setResourceContainer(value: String): Self = this.set("resourceContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceContainer: Self = this.set("resourceContainer", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: SchemaResourceInfo*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[SchemaResourceInfo]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setUserLabels(value: StringDictionary[String]): Self = this.set("userLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserLabels: Self = this.set("userLabels", js.undefined)
  }
  
}

