package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicAdvertisedPrefixPublicDelegatedPrefix extends StObject {
  
  /** The IP address range of the public delegated prefix */
  var ipRange: js.UndefOr[String] = js.undefined
  
  /** The name of the public delegated prefix */
  var name: js.UndefOr[String] = js.undefined
  
  /** The project number of the public delegated prefix */
  var project: js.UndefOr[String] = js.undefined
  
  /** The region of the public delegated prefix if it is regional. If absent, the prefix is global. */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the public delegated prefix. Possible values are: INITIALIZING: The public delegated prefix is being initialized and addresses cannot be created yet. ANNOUNCED: The
    * public delegated prefix is active.
    */
  var status: js.UndefOr[String] = js.undefined
}
object PublicAdvertisedPrefixPublicDelegatedPrefix {
  
  inline def apply(): PublicAdvertisedPrefixPublicDelegatedPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicAdvertisedPrefixPublicDelegatedPrefix]
  }
  
  extension [Self <: PublicAdvertisedPrefixPublicDelegatedPrefix](x: Self) {
    
    inline def setIpRange(value: String): Self = StObject.set(x, "ipRange", value.asInstanceOf[js.Any])
    
    inline def setIpRangeUndefined: Self = StObject.set(x, "ipRange", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
