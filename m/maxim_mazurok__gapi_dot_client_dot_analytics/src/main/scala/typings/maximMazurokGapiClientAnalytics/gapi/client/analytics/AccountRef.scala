package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountRef extends StObject {
  
  /** Link for this account. */
  var href: js.UndefOr[String] = js.undefined
  
  /** Account ID. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Analytics account reference. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Account name. */
  var name: js.UndefOr[String] = js.undefined
}
object AccountRef {
  
  @scala.inline
  def apply(): AccountRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountRef]
  }
  
  @scala.inline
  implicit class AccountRefMutableBuilder[Self <: AccountRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
