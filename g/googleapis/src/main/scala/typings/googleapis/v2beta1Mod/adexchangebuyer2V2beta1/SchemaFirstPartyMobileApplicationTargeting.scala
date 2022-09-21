package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFirstPartyMobileApplicationTargeting extends StObject {
  
  /**
    * A list of application IDs to be excluded.
    */
  var excludedAppIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of application IDs to be included.
    */
  var targetedAppIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaFirstPartyMobileApplicationTargeting {
  
  inline def apply(): SchemaFirstPartyMobileApplicationTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirstPartyMobileApplicationTargeting]
  }
  
  extension [Self <: SchemaFirstPartyMobileApplicationTargeting](x: Self) {
    
    inline def setExcludedAppIds(value: js.Array[String]): Self = StObject.set(x, "excludedAppIds", value.asInstanceOf[js.Any])
    
    inline def setExcludedAppIdsNull: Self = StObject.set(x, "excludedAppIds", null)
    
    inline def setExcludedAppIdsUndefined: Self = StObject.set(x, "excludedAppIds", js.undefined)
    
    inline def setExcludedAppIdsVarargs(value: String*): Self = StObject.set(x, "excludedAppIds", js.Array(value*))
    
    inline def setTargetedAppIds(value: js.Array[String]): Self = StObject.set(x, "targetedAppIds", value.asInstanceOf[js.Any])
    
    inline def setTargetedAppIdsNull: Self = StObject.set(x, "targetedAppIds", null)
    
    inline def setTargetedAppIdsUndefined: Self = StObject.set(x, "targetedAppIds", js.undefined)
    
    inline def setTargetedAppIdsVarargs(value: String*): Self = StObject.set(x, "targetedAppIds", js.Array(value*))
  }
}
