package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@js.native
trait SchemaQuota extends js.Object {
  /**
    * List of `QuotaLimit` definitions for the service.
    */
  var limits: js.UndefOr[js.Array[SchemaQuotaLimit]] = js.native
  /**
    * List of `MetricRule` definitions, each one mapping a selected method to
    * one or more metrics.
    */
  var metricRules: js.UndefOr[js.Array[SchemaMetricRule]] = js.native
}

object SchemaQuota {
  @scala.inline
  def apply(): SchemaQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuota]
  }
  @scala.inline
  implicit class SchemaQuotaOps[Self <: SchemaQuota] (val x: Self) extends AnyVal {
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
    def setLimitsVarargs(value: SchemaQuotaLimit*): Self = this.set("limits", js.Array(value :_*))
    @scala.inline
    def setLimits(value: js.Array[SchemaQuotaLimit]): Self = this.set("limits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimits: Self = this.set("limits", js.undefined)
    @scala.inline
    def setMetricRulesVarargs(value: SchemaMetricRule*): Self = this.set("metricRules", js.Array(value :_*))
    @scala.inline
    def setMetricRules(value: js.Array[SchemaMetricRule]): Self = this.set("metricRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricRules: Self = this.set("metricRules", js.undefined)
  }
  
}

