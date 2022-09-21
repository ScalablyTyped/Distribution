package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAudienceFilterExpression extends StObject {
  
  /** A list of expressions to be AND’ed together. It can only contain AudienceFilterExpressions with or_group. This must be set for the top level AudienceFilterExpression. */
  var andGroup: js.UndefOr[GoogleAnalyticsAdminV1alphaAudienceFilterExpressionList] = js.undefined
  
  /** A filter on a single dimension or metric. This cannot be set on the top level AudienceFilterExpression. */
  var dimensionOrMetricFilter: js.UndefOr[GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilter] = js.undefined
  
  /** Creates a filter that matches a specific event. This cannot be set on the top level AudienceFilterExpression. */
  var eventFilter: js.UndefOr[GoogleAnalyticsAdminV1alphaAudienceEventFilter] = js.undefined
  
  /** A filter expression to be NOT'ed (i.e., inverted, complemented). It can only include a dimension_or_metric_filter. This cannot be set on the top level AudienceFilterExpression. */
  var notExpression: js.UndefOr[GoogleAnalyticsAdminV1alphaAudienceFilterExpression] = js.undefined
  
  /** A list of expressions to OR’ed together. It cannot contain AudienceFilterExpressions with and_group or or_group. */
  var orGroup: js.UndefOr[GoogleAnalyticsAdminV1alphaAudienceFilterExpressionList] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAudienceFilterExpression {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAudienceFilterExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAudienceFilterExpression]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAudienceFilterExpression](x: Self) {
    
    inline def setAndGroup(value: GoogleAnalyticsAdminV1alphaAudienceFilterExpressionList): Self = StObject.set(x, "andGroup", value.asInstanceOf[js.Any])
    
    inline def setAndGroupUndefined: Self = StObject.set(x, "andGroup", js.undefined)
    
    inline def setDimensionOrMetricFilter(value: GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilter): Self = StObject.set(x, "dimensionOrMetricFilter", value.asInstanceOf[js.Any])
    
    inline def setDimensionOrMetricFilterUndefined: Self = StObject.set(x, "dimensionOrMetricFilter", js.undefined)
    
    inline def setEventFilter(value: GoogleAnalyticsAdminV1alphaAudienceEventFilter): Self = StObject.set(x, "eventFilter", value.asInstanceOf[js.Any])
    
    inline def setEventFilterUndefined: Self = StObject.set(x, "eventFilter", js.undefined)
    
    inline def setNotExpression(value: GoogleAnalyticsAdminV1alphaAudienceFilterExpression): Self = StObject.set(x, "notExpression", value.asInstanceOf[js.Any])
    
    inline def setNotExpressionUndefined: Self = StObject.set(x, "notExpression", js.undefined)
    
    inline def setOrGroup(value: GoogleAnalyticsAdminV1alphaAudienceFilterExpressionList): Self = StObject.set(x, "orGroup", value.asInstanceOf[js.Any])
    
    inline def setOrGroupUndefined: Self = StObject.set(x, "orGroup", js.undefined)
  }
}
