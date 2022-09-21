package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicDelegatedPrefixPublicDelegatedSubPrefix extends StObject {
  
  /** Name of the project scoping this PublicDelegatedSubPrefix. */
  var delegateeProject: js.UndefOr[String] = js.undefined
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The IPv4 address range, in CIDR format, represented by this sub public delegated prefix. */
  var ipCidrRange: js.UndefOr[String] = js.undefined
  
  /** Whether the sub prefix is delegated to create Address resources in the delegatee project. */
  var isAddress: js.UndefOr[Boolean] = js.undefined
  
  /** The name of the sub public delegated prefix. */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The region of the sub public delegated prefix if it is regional. If absent, the sub prefix is global. */
  var region: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The status of the sub public delegated prefix. */
  var status: js.UndefOr[String] = js.undefined
}
object PublicDelegatedPrefixPublicDelegatedSubPrefix {
  
  inline def apply(): PublicDelegatedPrefixPublicDelegatedSubPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicDelegatedPrefixPublicDelegatedSubPrefix]
  }
  
  extension [Self <: PublicDelegatedPrefixPublicDelegatedSubPrefix](x: Self) {
    
    inline def setDelegateeProject(value: String): Self = StObject.set(x, "delegateeProject", value.asInstanceOf[js.Any])
    
    inline def setDelegateeProjectUndefined: Self = StObject.set(x, "delegateeProject", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    inline def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    inline def setIsAddress(value: Boolean): Self = StObject.set(x, "isAddress", value.asInstanceOf[js.Any])
    
    inline def setIsAddressUndefined: Self = StObject.set(x, "isAddress", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
