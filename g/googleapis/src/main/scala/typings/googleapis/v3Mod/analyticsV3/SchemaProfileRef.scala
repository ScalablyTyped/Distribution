package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProfileRef extends StObject {
  
  /**
    * Account ID to which this view (profile) belongs.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link for this view (profile).
    */
  var href: js.UndefOr[String | Null] = js.undefined
  
  /**
    * View (Profile) ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Internal ID for the web property to which this view (profile) belongs.
    */
  var internalWebPropertyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Analytics view (profile) reference.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this view (profile).
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Web property ID of the form UA-XXXXX-YY to which this view (profile) belongs.
    */
  var webPropertyId: js.UndefOr[String | Null] = js.undefined
}
object SchemaProfileRef {
  
  inline def apply(): SchemaProfileRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfileRef]
  }
  
  extension [Self <: SchemaProfileRef](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefNull: Self = StObject.set(x, "href", null)
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    inline def setInternalWebPropertyIdNull: Self = StObject.set(x, "internalWebPropertyId", null)
    
    inline def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdNull: Self = StObject.set(x, "webPropertyId", null)
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
