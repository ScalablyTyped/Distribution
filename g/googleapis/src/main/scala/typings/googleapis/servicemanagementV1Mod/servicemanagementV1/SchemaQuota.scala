package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Quota configuration helps to achieve fairness and budgeting in service
  * usage.  The metric based quota configuration works this way: - The service
  * configuration defines a set of metrics. - For API calls, the
  * quota.metric_rules maps methods to metrics with   corresponding costs. -
  * The quota.limits defines limits on the metrics, which will be used for
  * quota checks at runtime.  An example quota configuration in yaml format:
  * quota:      limits:       - name: apiWriteQpsPerProject        metric:
  * library.googleapis.com/write_calls        unit: &quot;1/min/{project}&quot;
  * # rate limit for consumer projects        values:          STANDARD: 10000
  * # The metric rules bind all methods to the read_calls metric,      # except
  * for the UpdateBook and DeleteBook methods. These two methods      # are
  * mapped to the write_calls metric, with the UpdateBook method      #
  * consuming at twice rate as the DeleteBook method.      metric_rules:      -
  * selector: &quot;*&quot;        metric_costs:
  * library.googleapis.com/read_calls: 1      - selector:
  * google.example.library.v1.LibraryService.UpdateBook        metric_costs:
  * library.googleapis.com/write_calls: 2      - selector:
  * google.example.library.v1.LibraryService.DeleteBook        metric_costs:
  * library.googleapis.com/write_calls: 1   Corresponding Metric definition:
  * metrics:      - name: library.googleapis.com/read_calls display_name: Read
  * requests        metric_kind: DELTA        value_type: INT64       - name:
  * library.googleapis.com/write_calls        display_name: Write requests
  * metric_kind: DELTA        value_type: INT64
  */
trait SchemaQuota extends StObject {
  
  /**
    * List of `QuotaLimit` definitions for the service.
    */
  var limits: js.UndefOr[js.Array[SchemaQuotaLimit]] = js.undefined
  
  /**
    * List of `MetricRule` definitions, each one mapping a selected method to
    * one or more metrics.
    */
  var metricRules: js.UndefOr[js.Array[SchemaMetricRule]] = js.undefined
}
object SchemaQuota {
  
  inline def apply(): SchemaQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuota]
  }
  
  extension [Self <: SchemaQuota](x: Self) {
    
    inline def setLimits(value: js.Array[SchemaQuotaLimit]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    inline def setLimitsVarargs(value: SchemaQuotaLimit*): Self = StObject.set(x, "limits", js.Array(value :_*))
    
    inline def setMetricRules(value: js.Array[SchemaMetricRule]): Self = StObject.set(x, "metricRules", value.asInstanceOf[js.Any])
    
    inline def setMetricRulesUndefined: Self = StObject.set(x, "metricRules", js.undefined)
    
    inline def setMetricRulesVarargs(value: SchemaMetricRule*): Self = StObject.set(x, "metricRules", js.Array(value :_*))
  }
}
