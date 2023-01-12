package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSummary extends StObject {
  
  /** Account ID. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Resource type for Analytics AccountSummary. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Account name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Indicates whether this account is starred or not. */
  var starred: js.UndefOr[Boolean] = js.undefined
  
  /** List of web properties under this account. */
  var webProperties: js.UndefOr[js.Array[WebPropertySummary]] = js.undefined
}
object AccountSummary {
  
  inline def apply(): AccountSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountSummary] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    inline def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
    
    inline def setWebProperties(value: js.Array[WebPropertySummary]): Self = StObject.set(x, "webProperties", value.asInstanceOf[js.Any])
    
    inline def setWebPropertiesUndefined: Self = StObject.set(x, "webProperties", js.undefined)
    
    inline def setWebPropertiesVarargs(value: WebPropertySummary*): Self = StObject.set(x, "webProperties", js.Array(value*))
  }
}
