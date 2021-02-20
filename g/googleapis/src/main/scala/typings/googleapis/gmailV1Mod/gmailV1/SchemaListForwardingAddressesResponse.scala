package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the ListForwardingAddresses method.
  */
@js.native
trait SchemaListForwardingAddressesResponse extends StObject {
  
  /**
    * List of addresses that may be used for forwarding.
    */
  var forwardingAddresses: js.UndefOr[js.Array[SchemaForwardingAddress]] = js.native
}
object SchemaListForwardingAddressesResponse {
  
  @scala.inline
  def apply(): SchemaListForwardingAddressesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListForwardingAddressesResponse]
  }
  
  @scala.inline
  implicit class SchemaListForwardingAddressesResponseMutableBuilder[Self <: SchemaListForwardingAddressesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForwardingAddresses(value: js.Array[SchemaForwardingAddress]): Self = StObject.set(x, "forwardingAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardingAddressesUndefined: Self = StObject.set(x, "forwardingAddresses", js.undefined)
    
    @scala.inline
    def setForwardingAddressesVarargs(value: SchemaForwardingAddress*): Self = StObject.set(x, "forwardingAddresses", js.Array(value :_*))
  }
}
