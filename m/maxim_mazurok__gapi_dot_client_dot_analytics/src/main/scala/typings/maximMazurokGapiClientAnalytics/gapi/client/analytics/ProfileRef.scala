package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileRef extends StObject {
  
  /** Account ID to which this view (profile) belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** Link for this view (profile). */
  var href: js.UndefOr[String] = js.undefined
  
  /** View (Profile) ID. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Internal ID for the web property to which this view (profile) belongs. */
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  
  /** Analytics view (profile) reference. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Name of this view (profile). */
  var name: js.UndefOr[String] = js.undefined
  
  /** Web property ID of the form UA-XXXXX-YY to which this view (profile) belongs. */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ProfileRef {
  
  inline def apply(): ProfileRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileRef]
  }
  
  extension [Self <: ProfileRef](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    inline def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
