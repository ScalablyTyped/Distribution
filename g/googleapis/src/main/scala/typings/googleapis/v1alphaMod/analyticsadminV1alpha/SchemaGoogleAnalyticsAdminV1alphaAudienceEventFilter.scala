package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAudienceEventFilter extends StObject {
  
  /**
    * Required. Immutable. The name of the event to match against.
    */
  var eventName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. If specified, this filter matches events that match both the single event name and the parameter filter expressions. AudienceEventFilter inside the parameter filter expression cannot be set (i.e., nested event filters are not supported). This should be a single and_group of dimension_or_metric_filter or not_expression; ANDs of ORs are not supported. Also, if it includes a filter for "eventCount", only that one will be considered; all the other filters will be ignored.
    */
  var eventParameterFilterExpression: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpression] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAudienceEventFilter {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAudienceEventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAudienceEventFilter]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAudienceEventFilter](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameNull: Self = StObject.set(x, "eventName", null)
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    inline def setEventParameterFilterExpression(value: SchemaGoogleAnalyticsAdminV1alphaAudienceFilterExpression): Self = StObject.set(x, "eventParameterFilterExpression", value.asInstanceOf[js.Any])
    
    inline def setEventParameterFilterExpressionUndefined: Self = StObject.set(x, "eventParameterFilterExpression", js.undefined)
  }
}
