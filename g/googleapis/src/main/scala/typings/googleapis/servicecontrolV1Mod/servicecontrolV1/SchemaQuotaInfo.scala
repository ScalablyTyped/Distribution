package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the quota information for a quota check response.
  */
trait SchemaQuotaInfo extends StObject {
  
  /**
    * Quota Metrics that have exceeded quota limits. For QuotaGroup-based
    * quota, this is QuotaGroup.name For QuotaLimit-based quota, this is
    * QuotaLimit.name See: google.api.Quota Deprecated: Use quota_metrics to
    * get per quota group limit exceeded status.
    */
  var limitExceeded: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Map of quota group name to the actual number of tokens consumed. If the
    * quota check was not successful, then this will not be populated due to no
    * quota consumption.  We are not merging this field with
    * &#39;quota_metrics&#39; field because of the complexity of scaling in
    * Chemist client code base. For simplicity, we will keep this field for
    * Castor (that scales quota usage) and &#39;quota_metrics&#39; for
    * SuperQuota (that doesn&#39;t scale quota usage).
    */
  var quotaConsumed: js.UndefOr[StringDictionary[Double]] = js.undefined
  
  /**
    * Quota metrics to indicate the usage. Depending on the check request, one
    * or more of the following metrics will be included:  1. For rate quota,
    * per quota group or per quota metric incremental usage will be specified
    * using the following delta metric:
    * &quot;serviceruntime.googleapis.com/api/consumer/quota_used_count&quot;
    * 2. For allocation quota, per quota metric total usage will be specified
    * using the following gauge metric:
    * &quot;serviceruntime.googleapis.com/allocation/consumer/quota_used_count&quot;
    * 3. For both rate quota and allocation quota, the quota limit reached
    * condition will be specified using the following boolean metric:
    * &quot;serviceruntime.googleapis.com/quota/exceeded&quot;
    */
  var quotaMetrics: js.UndefOr[js.Array[SchemaMetricValueSet]] = js.undefined
}
object SchemaQuotaInfo {
  
  @scala.inline
  def apply(): SchemaQuotaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuotaInfo]
  }
  
  @scala.inline
  implicit class SchemaQuotaInfoMutableBuilder[Self <: SchemaQuotaInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimitExceeded(value: js.Array[String]): Self = StObject.set(x, "limitExceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitExceededUndefined: Self = StObject.set(x, "limitExceeded", js.undefined)
    
    @scala.inline
    def setLimitExceededVarargs(value: String*): Self = StObject.set(x, "limitExceeded", js.Array(value :_*))
    
    @scala.inline
    def setQuotaConsumed(value: StringDictionary[Double]): Self = StObject.set(x, "quotaConsumed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaConsumedUndefined: Self = StObject.set(x, "quotaConsumed", js.undefined)
    
    @scala.inline
    def setQuotaMetrics(value: js.Array[SchemaMetricValueSet]): Self = StObject.set(x, "quotaMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaMetricsUndefined: Self = StObject.set(x, "quotaMetrics", js.undefined)
    
    @scala.inline
    def setQuotaMetricsVarargs(value: SchemaMetricValueSet*): Self = StObject.set(x, "quotaMetrics", js.Array(value :_*))
  }
}
