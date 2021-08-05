package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents information regarding an operation.
  */
trait SchemaOperation extends StObject {
  
  /**
    * Identity of the consumer who is using the service. This field should be
    * filled in for the operations initiated by a consumer, but not for
    * service-initiated operations that are not related to a specific consumer.
    * - This can be in one of the following formats:     - project:PROJECT_ID,
    * - project`_`number:PROJECT_NUMBER,     - projects/PROJECT_ID or
    * PROJECT_NUMBER,     - folders/FOLDER_NUMBER,     -
    * organizations/ORGANIZATION_NUMBER,     - api`_`key:API_KEY.
    */
  var consumerId: js.UndefOr[String] = js.undefined
  
  /**
    * End time of the operation. Required when the operation is used in
    * ServiceController.Report, but optional when the operation is used in
    * ServiceController.Check.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * DO NOT USE. This is an experimental field.
    */
  var importance: js.UndefOr[String] = js.undefined
  
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
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Represents information to be logged.
    */
  var logEntries: js.UndefOr[js.Array[SchemaLogEntry]] = js.undefined
  
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
  var metricValueSets: js.UndefOr[js.Array[SchemaMetricValueSet]] = js.undefined
  
  /**
    * Identity of the operation. This must be unique within the scope of the
    * service that generated the operation. If the service calls Check() and
    * Report() on the same operation, the two calls should carry the same id.
    * UUID version 4 is recommended, though not required. In scenarios where an
    * operation is computed from existing information and an idempotent id is
    * desirable for deduplication purpose, UUID version 5 is recommended. See
    * RFC 4122 for details.
    */
  var operationId: js.UndefOr[String] = js.undefined
  
  /**
    * Fully qualified name of the operation. Reserved for future use.
    */
  var operationName: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the properties needed for quota check. Applicable only if this
    * operation is for a quota check request. If this is not specified, no
    * quota check will be performed.
    */
  var quotaProperties: js.UndefOr[SchemaQuotaProperties] = js.undefined
  
  /**
    * DO NOT USE. This field is deprecated, use &quot;resources&quot; field
    * instead. The resource name of the parent of a resource in the resource
    * hierarchy.  This can be in one of the following formats:     -
    * “projects/&lt;project-id or project-number&gt;”     -
    * “folders/&lt;folder-id&gt;”     - “organizations/&lt;organization-id&gt;”
    */
  var resourceContainer: js.UndefOr[String] = js.undefined
  
  /**
    * The resources that are involved in the operation. The maximum supported
    * number of entries in this field is 100.
    */
  var resources: js.UndefOr[js.Array[SchemaResourceInfo]] = js.undefined
  
  /**
    * Required. Start time of the operation.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * User defined labels for the resource that this operation is associated
    * with. Only a combination of 1000 user labels per consumer project are
    * allowed.
    */
  var userLabels: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SchemaOperation {
  
  inline def apply(): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperation]
  }
  
  extension [Self <: SchemaOperation](x: Self) {
    
    inline def setConsumerId(value: String): Self = StObject.set(x, "consumerId", value.asInstanceOf[js.Any])
    
    inline def setConsumerIdUndefined: Self = StObject.set(x, "consumerId", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setImportance(value: String): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    inline def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLogEntries(value: js.Array[SchemaLogEntry]): Self = StObject.set(x, "logEntries", value.asInstanceOf[js.Any])
    
    inline def setLogEntriesUndefined: Self = StObject.set(x, "logEntries", js.undefined)
    
    inline def setLogEntriesVarargs(value: SchemaLogEntry*): Self = StObject.set(x, "logEntries", js.Array(value :_*))
    
    inline def setMetricValueSets(value: js.Array[SchemaMetricValueSet]): Self = StObject.set(x, "metricValueSets", value.asInstanceOf[js.Any])
    
    inline def setMetricValueSetsUndefined: Self = StObject.set(x, "metricValueSets", js.undefined)
    
    inline def setMetricValueSetsVarargs(value: SchemaMetricValueSet*): Self = StObject.set(x, "metricValueSets", js.Array(value :_*))
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setOperationName(value: String): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
    
    inline def setOperationNameUndefined: Self = StObject.set(x, "operationName", js.undefined)
    
    inline def setQuotaProperties(value: SchemaQuotaProperties): Self = StObject.set(x, "quotaProperties", value.asInstanceOf[js.Any])
    
    inline def setQuotaPropertiesUndefined: Self = StObject.set(x, "quotaProperties", js.undefined)
    
    inline def setResourceContainer(value: String): Self = StObject.set(x, "resourceContainer", value.asInstanceOf[js.Any])
    
    inline def setResourceContainerUndefined: Self = StObject.set(x, "resourceContainer", js.undefined)
    
    inline def setResources(value: js.Array[SchemaResourceInfo]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaResourceInfo*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setUserLabels(value: StringDictionary[String]): Self = StObject.set(x, "userLabels", value.asInstanceOf[js.Any])
    
    inline def setUserLabelsUndefined: Self = StObject.set(x, "userLabels", js.undefined)
  }
}
