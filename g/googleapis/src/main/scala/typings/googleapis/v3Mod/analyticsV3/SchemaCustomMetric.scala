package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Analytics Custom Metric.
  */
trait SchemaCustomMetric extends StObject {
  
  /**
    * Account ID.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Boolean indicating whether the custom metric is active.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Time the custom metric was created.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * Custom metric ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Index of the custom metric.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * Kind value for a custom metric. Set to
    * &quot;analytics#customMetric&quot;. It is a read-only field.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Max value of custom metric.
    */
  var max_value: js.UndefOr[String] = js.undefined
  
  /**
    * Min value of custom metric.
    */
  var min_value: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the custom metric.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Parent link for the custom metric. Points to the property to which the
    * custom metric belongs.
    */
  var parentLink: js.UndefOr[Href] = js.undefined
  
  /**
    * Scope of the custom metric: HIT or PRODUCT.
    */
  var scope: js.UndefOr[String] = js.undefined
  
  /**
    * Link for the custom metric
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Data type of custom metric.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Time the custom metric was last modified.
    */
  var updated: js.UndefOr[String] = js.undefined
  
  /**
    * Property ID.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object SchemaCustomMetric {
  
  inline def apply(): SchemaCustomMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomMetric]
  }
  
  extension [Self <: SchemaCustomMetric](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMax_value(value: String): Self = StObject.set(x, "max_value", value.asInstanceOf[js.Any])
    
    inline def setMax_valueUndefined: Self = StObject.set(x, "max_value", js.undefined)
    
    inline def setMin_value(value: String): Self = StObject.set(x, "min_value", value.asInstanceOf[js.Any])
    
    inline def setMin_valueUndefined: Self = StObject.set(x, "min_value", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentLink(value: Href): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    inline def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
