package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Analytics Custom Metric.
  */
@js.native
trait SchemaCustomMetric extends StObject {
  
  /**
    * Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Boolean indicating whether the custom metric is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Time the custom metric was created.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * Custom metric ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Index of the custom metric.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Kind value for a custom metric. Set to
    * &quot;analytics#customMetric&quot;. It is a read-only field.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Max value of custom metric.
    */
  var max_value: js.UndefOr[String] = js.native
  
  /**
    * Min value of custom metric.
    */
  var min_value: js.UndefOr[String] = js.native
  
  /**
    * Name of the custom metric.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Parent link for the custom metric. Points to the property to which the
    * custom metric belongs.
    */
  var parentLink: js.UndefOr[Href] = js.native
  
  /**
    * Scope of the custom metric: HIT or PRODUCT.
    */
  var scope: js.UndefOr[String] = js.native
  
  /**
    * Link for the custom metric
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Data type of custom metric.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Time the custom metric was last modified.
    */
  var updated: js.UndefOr[String] = js.native
  
  /**
    * Property ID.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}
object SchemaCustomMetric {
  
  @scala.inline
  def apply(): SchemaCustomMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomMetric]
  }
  
  @scala.inline
  implicit class SchemaCustomMetricMutableBuilder[Self <: SchemaCustomMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMax_value(value: String): Self = StObject.set(x, "max_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_valueUndefined: Self = StObject.set(x, "max_value", js.undefined)
    
    @scala.inline
    def setMin_value(value: String): Self = StObject.set(x, "min_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin_valueUndefined: Self = StObject.set(x, "min_value", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentLink(value: Href): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
