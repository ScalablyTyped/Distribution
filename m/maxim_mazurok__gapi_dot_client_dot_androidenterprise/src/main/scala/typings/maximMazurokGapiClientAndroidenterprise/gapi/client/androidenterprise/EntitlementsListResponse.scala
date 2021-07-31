package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntitlementsListResponse extends StObject {
  
  /** An entitlement of a user to a product (e.g. an app). For example, a free app that they have installed, or a paid app that they have been allocated a license to. */
  var entitlement: js.UndefOr[js.Array[Entitlement]] = js.undefined
}
object EntitlementsListResponse {
  
  @scala.inline
  def apply(): EntitlementsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitlementsListResponse]
  }
  
  @scala.inline
  implicit class EntitlementsListResponseMutableBuilder[Self <: EntitlementsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntitlement(value: js.Array[Entitlement]): Self = StObject.set(x, "entitlement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitlementUndefined: Self = StObject.set(x, "entitlement", js.undefined)
    
    @scala.inline
    def setEntitlementVarargs(value: Entitlement*): Self = StObject.set(x, "entitlement", js.Array(value :_*))
  }
}
