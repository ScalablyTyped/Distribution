package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpression extends StObject {
  
  /**
    * A list of expressions to be AND’ed together. It can only contain AudienceFilterExpressions with or_group. This must be set for the top level AudienceFilterExpression.
    */
  var andGroup: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpressionList] = js.undefined
  
  /**
    * A filter on a single dimension or metric. This cannot be set on the top level AudienceFilterExpression.
    */
  var dimensionOrMetricFilter: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilter] = js.undefined
  
  /**
    * Creates a filter that matches a specific event. This cannot be set on the top level AudienceFilterExpression.
    */
  var eventFilter: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAudienceEventFilter] = js.undefined
  
  /**
    * A filter expression to be NOT'ed (i.e., inverted, complemented). It can only include a dimension_or_metric_filter. This cannot be set on the top level AudienceFilterExpression.
    */
  var notExpression: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpression] = js.undefined
  
  /**
    * A list of expressions to OR’ed together. It cannot contain AudienceFilterExpressions with and_group or or_group.
    */
  var orGroup: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpressionList] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpression {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpression]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpression](x: Self) {
    
    inline def setAndGroup(value: SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpressionList): Self = StObject.set(x, "andGroup", value.asInstanceOf[js.Any])
    
    inline def setAndGroupUndefined: Self = StObject.set(x, "andGroup", js.undefined)
    
    inline def setDimensionOrMetricFilter(value: SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilter): Self = StObject.set(x, "dimensionOrMetricFilter", value.asInstanceOf[js.Any])
    
    inline def setDimensionOrMetricFilterUndefined: Self = StObject.set(x, "dimensionOrMetricFilter", js.undefined)
    
    inline def setEventFilter(value: SchemaGoogleAnalyticsAdminV1alphaAudienceEventFilter): Self = StObject.set(x, "eventFilter", value.asInstanceOf[js.Any])
    
    inline def setEventFilterUndefined: Self = StObject.set(x, "eventFilter", js.undefined)
    
    inline def setNotExpression(value: SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpression): Self = StObject.set(x, "notExpression", value.asInstanceOf[js.Any])
    
    inline def setNotExpressionUndefined: Self = StObject.set(x, "notExpression", js.undefined)
    
    inline def setOrGroup(value: SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpressionList): Self = StObject.set(x, "orGroup", value.asInstanceOf[js.Any])
    
    inline def setOrGroupUndefined: Self = StObject.set(x, "orGroup", js.undefined)
  }
}
