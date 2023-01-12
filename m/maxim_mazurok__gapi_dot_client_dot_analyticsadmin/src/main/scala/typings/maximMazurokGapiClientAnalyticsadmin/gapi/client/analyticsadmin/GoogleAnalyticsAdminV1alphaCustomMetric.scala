package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaCustomMetric extends StObject {
  
  /** Optional. Description for this custom dimension. Max length of 150 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Display name for this custom metric as shown in the Analytics UI. Max length of 82 characters, alphanumeric plus space and underscore starting with a letter. Legacy
    * system-generated display names may contain square brackets, but updates to this field will never permit square brackets.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Required. The type for the custom metric's value. */
  var measurementUnit: js.UndefOr[String] = js.undefined
  
  /** Output only. Resource name for this CustomMetric resource. Format: properties/{property}/customMetrics/{customMetric} */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Immutable. Tagging name for this custom metric. If this is an event-scoped metric, then this is the event parameter name. May only contain alphanumeric and underscore
    * charactes, starting with a letter. Max length of 40 characters for event-scoped metrics.
    */
  var parameterName: js.UndefOr[String] = js.undefined
  
  /** Optional. Types of restricted data that this metric may contain. Required for metrics with CURRENCY measurement unit. Must be empty for metrics with a non-CURRENCY measurement unit. */
  var restrictedMetricType: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. Immutable. The scope of this custom metric. */
  var scope: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaCustomMetric {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaCustomMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaCustomMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaCustomMetric] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMeasurementUnit(value: String): Self = StObject.set(x, "measurementUnit", value.asInstanceOf[js.Any])
    
    inline def setMeasurementUnitUndefined: Self = StObject.set(x, "measurementUnit", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "parameterName", js.undefined)
    
    inline def setRestrictedMetricType(value: js.Array[String]): Self = StObject.set(x, "restrictedMetricType", value.asInstanceOf[js.Any])
    
    inline def setRestrictedMetricTypeUndefined: Self = StObject.set(x, "restrictedMetricType", js.undefined)
    
    inline def setRestrictedMetricTypeVarargs(value: String*): Self = StObject.set(x, "restrictedMetricType", js.Array(value*))
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
