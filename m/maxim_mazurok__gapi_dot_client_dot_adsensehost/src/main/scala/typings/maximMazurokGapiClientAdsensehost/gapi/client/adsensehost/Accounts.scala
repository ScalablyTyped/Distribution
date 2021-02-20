package typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accounts extends StObject {
  
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.native
  
  /** The accounts returned in this list response. */
  var items: js.UndefOr[js.Array[Account]] = js.native
  
  /** Kind of list this is, in this case adsensehost#accounts. */
  var kind: js.UndefOr[String] = js.native
}
object Accounts {
  
  @scala.inline
  def apply(): Accounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accounts]
  }
  
  @scala.inline
  implicit class AccountsMutableBuilder[Self <: Accounts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[Account]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Account*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
