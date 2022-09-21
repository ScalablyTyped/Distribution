package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomDimension extends StObject {
  
  /**
    * Account ID.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Boolean indicating whether the custom dimension is active.
    */
  var active: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Time the custom dimension was created.
    */
  var created: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Custom dimension ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Index of the custom dimension.
    */
  var index: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Kind value for a custom dimension. Set to "analytics#customDimension". It is a read-only field.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the custom dimension.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parent link for the custom dimension. Points to the property to which the custom dimension belongs.
    */
  var parentLink: js.UndefOr[Href | Null] = js.undefined
  
  /**
    * Scope of the custom dimension: HIT, SESSION, USER or PRODUCT.
    */
  var scope: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link for the custom dimension
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time the custom dimension was last modified.
    */
  var updated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Property ID.
    */
  var webPropertyId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomDimension {
  
  inline def apply(): SchemaCustomDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomDimension]
  }
  
  extension [Self <: SchemaCustomDimension](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveNull: Self = StObject.set(x, "active", null)
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedNull: Self = StObject.set(x, "created", null)
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentLink(value: Href): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    inline def setParentLinkNull: Self = StObject.set(x, "parentLink", null)
    
    inline def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdNull: Self = StObject.set(x, "webPropertyId", null)
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
