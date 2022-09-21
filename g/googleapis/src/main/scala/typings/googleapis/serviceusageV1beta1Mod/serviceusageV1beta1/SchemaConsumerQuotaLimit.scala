package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConsumerQuotaLimit extends StObject {
  
  /**
    * Whether admin overrides are allowed on this limit
    */
  var allowsAdminOverrides: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether this limit is precise or imprecise.
    */
  var isPrecise: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The name of the parent metric of this limit. An example name would be: `compute.googleapis.com/cpus`
    */
  var metric: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the quota limit. An example name would be: `projects/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion` The resource name is intended to be opaque and should not be parsed for its component strings, since its representation could change in the future.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Summary of the enforced quota buckets, organized by quota dimension, ordered from least specific to most specific (for example, the global default bucket, with no quota dimensions, will always appear first).
    */
  var quotaBuckets: js.UndefOr[js.Array[SchemaQuotaBucket]] = js.undefined
  
  /**
    * List of all supported locations. This field is present only if the limit has a {region\} or {zone\} dimension.
    */
  var supportedLocations: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The limit unit. An example unit would be `1/{project\}/{region\}` Note that `{project\}` and `{region\}` are not placeholders in this example; the literal characters `{` and `\}` occur in the string.
    */
  var unit: js.UndefOr[String | Null] = js.undefined
}
object SchemaConsumerQuotaLimit {
  
  inline def apply(): SchemaConsumerQuotaLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsumerQuotaLimit]
  }
  
  extension [Self <: SchemaConsumerQuotaLimit](x: Self) {
    
    inline def setAllowsAdminOverrides(value: Boolean): Self = StObject.set(x, "allowsAdminOverrides", value.asInstanceOf[js.Any])
    
    inline def setAllowsAdminOverridesNull: Self = StObject.set(x, "allowsAdminOverrides", null)
    
    inline def setAllowsAdminOverridesUndefined: Self = StObject.set(x, "allowsAdminOverrides", js.undefined)
    
    inline def setIsPrecise(value: Boolean): Self = StObject.set(x, "isPrecise", value.asInstanceOf[js.Any])
    
    inline def setIsPreciseNull: Self = StObject.set(x, "isPrecise", null)
    
    inline def setIsPreciseUndefined: Self = StObject.set(x, "isPrecise", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricNull: Self = StObject.set(x, "metric", null)
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuotaBuckets(value: js.Array[SchemaQuotaBucket]): Self = StObject.set(x, "quotaBuckets", value.asInstanceOf[js.Any])
    
    inline def setQuotaBucketsUndefined: Self = StObject.set(x, "quotaBuckets", js.undefined)
    
    inline def setQuotaBucketsVarargs(value: SchemaQuotaBucket*): Self = StObject.set(x, "quotaBuckets", js.Array(value*))
    
    inline def setSupportedLocations(value: js.Array[String]): Self = StObject.set(x, "supportedLocations", value.asInstanceOf[js.Any])
    
    inline def setSupportedLocationsNull: Self = StObject.set(x, "supportedLocations", null)
    
    inline def setSupportedLocationsUndefined: Self = StObject.set(x, "supportedLocations", js.undefined)
    
    inline def setSupportedLocationsVarargs(value: String*): Self = StObject.set(x, "supportedLocations", js.Array(value*))
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitNull: Self = StObject.set(x, "unit", null)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
