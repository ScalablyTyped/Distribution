package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstPartyMobileApplicationTargeting extends StObject {
  
  /** A list of application IDs to be excluded. */
  var excludedAppIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of application IDs to be included. */
  var targetedAppIds: js.UndefOr[js.Array[String]] = js.undefined
}
object FirstPartyMobileApplicationTargeting {
  
  inline def apply(): FirstPartyMobileApplicationTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstPartyMobileApplicationTargeting]
  }
  
  extension [Self <: FirstPartyMobileApplicationTargeting](x: Self) {
    
    inline def setExcludedAppIds(value: js.Array[String]): Self = StObject.set(x, "excludedAppIds", value.asInstanceOf[js.Any])
    
    inline def setExcludedAppIdsUndefined: Self = StObject.set(x, "excludedAppIds", js.undefined)
    
    inline def setExcludedAppIdsVarargs(value: String*): Self = StObject.set(x, "excludedAppIds", js.Array(value*))
    
    inline def setTargetedAppIds(value: js.Array[String]): Self = StObject.set(x, "targetedAppIds", value.asInstanceOf[js.Any])
    
    inline def setTargetedAppIdsUndefined: Self = StObject.set(x, "targetedAppIds", js.undefined)
    
    inline def setTargetedAppIdsVarargs(value: String*): Self = StObject.set(x, "targetedAppIds", js.Array(value*))
  }
}
