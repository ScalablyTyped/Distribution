package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubnetworksScopedList extends StObject {
  
  /** A list of subnetworks contained in this scope. */
  var subnetworks: js.UndefOr[js.Array[Subnetwork]] = js.undefined
  
  /** An informational warning that appears when the list of addresses is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object SubnetworksScopedList {
  
  inline def apply(): SubnetworksScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetworksScopedList]
  }
  
  extension [Self <: SubnetworksScopedList](x: Self) {
    
    inline def setSubnetworks(value: js.Array[Subnetwork]): Self = StObject.set(x, "subnetworks", value.asInstanceOf[js.Any])
    
    inline def setSubnetworksUndefined: Self = StObject.set(x, "subnetworks", js.undefined)
    
    inline def setSubnetworksVarargs(value: Subnetwork*): Self = StObject.set(x, "subnetworks", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
