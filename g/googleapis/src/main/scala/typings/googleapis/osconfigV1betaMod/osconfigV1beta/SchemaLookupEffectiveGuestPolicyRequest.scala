package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLookupEffectiveGuestPolicyRequest extends StObject {
  
  /**
    * Architecture of OS running on the instance. The OS Config agent only provides this field for targeting if OS Inventory is enabled for that instance.
    */
  var osArchitecture: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Short name of the OS running on the instance. The OS Config agent only provides this field for targeting if OS Inventory is enabled for that instance.
    */
  var osShortName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Version of the OS running on the instance. The OS Config agent only provides this field for targeting if OS Inventory is enabled for that VM instance.
    */
  var osVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaLookupEffectiveGuestPolicyRequest {
  
  inline def apply(): SchemaLookupEffectiveGuestPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupEffectiveGuestPolicyRequest]
  }
  
  extension [Self <: SchemaLookupEffectiveGuestPolicyRequest](x: Self) {
    
    inline def setOsArchitecture(value: String): Self = StObject.set(x, "osArchitecture", value.asInstanceOf[js.Any])
    
    inline def setOsArchitectureNull: Self = StObject.set(x, "osArchitecture", null)
    
    inline def setOsArchitectureUndefined: Self = StObject.set(x, "osArchitecture", js.undefined)
    
    inline def setOsShortName(value: String): Self = StObject.set(x, "osShortName", value.asInstanceOf[js.Any])
    
    inline def setOsShortNameNull: Self = StObject.set(x, "osShortName", null)
    
    inline def setOsShortNameUndefined: Self = StObject.set(x, "osShortName", js.undefined)
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionNull: Self = StObject.set(x, "osVersion", null)
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
  }
}
