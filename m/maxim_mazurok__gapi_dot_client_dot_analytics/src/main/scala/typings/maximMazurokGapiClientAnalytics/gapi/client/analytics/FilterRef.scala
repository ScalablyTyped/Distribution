package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterRef extends StObject {
  
  /** Account ID to which this filter belongs. */
  var accountId: js.UndefOr[String] = js.native
  
  /** Link for this filter. */
  var href: js.UndefOr[String] = js.native
  
  /** Filter ID. */
  var id: js.UndefOr[String] = js.native
  
  /** Kind value for filter reference. */
  var kind: js.UndefOr[String] = js.native
  
  /** Name of this filter. */
  var name: js.UndefOr[String] = js.native
}
object FilterRef {
  
  @scala.inline
  def apply(): FilterRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterRef]
  }
  
  @scala.inline
  implicit class FilterRefMutableBuilder[Self <: FilterRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
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
