package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsList extends StObject {
  
  /** A list of accounts. */
  var items: js.UndefOr[js.Array[Account]] = js.native
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
}
object AccountsList {
  
  @scala.inline
  def apply(): AccountsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsList]
  }
  
  @scala.inline
  implicit class AccountsListMutableBuilder[Self <: AccountsList] (val x: Self) extends AnyVal {
    
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
