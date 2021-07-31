package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerListDpcsResponse extends StObject {
  
  /** The list of DPCs available to the customer that support zero-touch enrollment. */
  var dpcs: js.UndefOr[js.Array[Dpc]] = js.undefined
}
object CustomerListDpcsResponse {
  
  @scala.inline
  def apply(): CustomerListDpcsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerListDpcsResponse]
  }
  
  @scala.inline
  implicit class CustomerListDpcsResponseMutableBuilder[Self <: CustomerListDpcsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDpcs(value: js.Array[Dpc]): Self = StObject.set(x, "dpcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpcsUndefined: Self = StObject.set(x, "dpcs", js.undefined)
    
    @scala.inline
    def setDpcsVarargs(value: Dpc*): Self = StObject.set(x, "dpcs", js.Array(value :_*))
  }
}
