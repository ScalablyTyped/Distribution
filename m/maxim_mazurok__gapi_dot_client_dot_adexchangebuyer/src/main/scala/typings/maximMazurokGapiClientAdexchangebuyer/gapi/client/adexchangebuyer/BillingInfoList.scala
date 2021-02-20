package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingInfoList extends StObject {
  
  /** A list of billing info relevant for your account. */
  var items: js.UndefOr[js.Array[BillingInfo]] = js.native
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
}
object BillingInfoList {
  
  @scala.inline
  def apply(): BillingInfoList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingInfoList]
  }
  
  @scala.inline
  implicit class BillingInfoListMutableBuilder[Self <: BillingInfoList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[BillingInfo]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: BillingInfo*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
