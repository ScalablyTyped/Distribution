package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaCustomMetric extends StObject {
  
  /**
    * Optional. Description for this custom dimension. Max length of 150 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Display name for this custom metric as shown in the Analytics UI. Max length of 82 characters, alphanumeric plus space and underscore starting with a letter. Legacy system-generated display names may contain square brackets, but updates to this field will never permit square brackets.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The type for the custom metric's value.
    */
  var measurementUnit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name for this CustomMetric resource. Format: properties/{property\}/customMetrics/{customMetric\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. Tagging name for this custom metric. If this is an event-scoped metric, then this is the event parameter name. May only contain alphanumeric and underscore charactes, starting with a letter. Max length of 40 characters for event-scoped metrics.
    */
  var parameterName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Types of restricted data that this metric may contain. Required for metrics with CURRENCY measurement unit. Must be empty for metrics with a non-CURRENCY measurement unit.
    */
  var restrictedMetricType: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. Immutable. The scope of this custom metric.
    */
  var scope: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaCustomMetric {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaCustomMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaCustomMetric]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaCustomMetric](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMeasurementUnit(value: String): Self = StObject.set(x, "measurementUnit", value.asInstanceOf[js.Any])
    
    inline def setMeasurementUnitNull: Self = StObject.set(x, "measurementUnit", null)
    
    inline def setMeasurementUnitUndefined: Self = StObject.set(x, "measurementUnit", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameNull: Self = StObject.set(x, "parameterName", null)
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "parameterName", js.undefined)
    
    inline def setRestrictedMetricType(value: js.Array[String]): Self = StObject.set(x, "restrictedMetricType", value.asInstanceOf[js.Any])
    
    inline def setRestrictedMetricTypeNull: Self = StObject.set(x, "restrictedMetricType", null)
    
    inline def setRestrictedMetricTypeUndefined: Self = StObject.set(x, "restrictedMetricType", js.undefined)
    
    inline def setRestrictedMetricTypeVarargs(value: String*): Self = StObject.set(x, "restrictedMetricType", js.Array(value*))
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
