package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a list of targeted and excluded mobile application IDs that
  * publishers own. Mobile application IDs are from App Store and Google Play
  * Store. Android App ID, for example, com.google.android.apps.maps, can be
  * found in Google Play Store URL. iOS App ID (which is a number) can be found
  * at the end of iTunes store URL. First party mobile applications is either
  * included or excluded.
  */
trait SchemaFirstPartyMobileApplicationTargeting extends StObject {
  
  /**
    * A list of application IDs to be excluded.
    */
  var excludedAppIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of application IDs to be included.
    */
  var targetedAppIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaFirstPartyMobileApplicationTargeting {
  
  inline def apply(): SchemaFirstPartyMobileApplicationTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirstPartyMobileApplicationTargeting]
  }
  
  extension [Self <: SchemaFirstPartyMobileApplicationTargeting](x: Self) {
    
    inline def setExcludedAppIds(value: js.Array[String]): Self = StObject.set(x, "excludedAppIds", value.asInstanceOf[js.Any])
    
    inline def setExcludedAppIdsUndefined: Self = StObject.set(x, "excludedAppIds", js.undefined)
    
    inline def setExcludedAppIdsVarargs(value: String*): Self = StObject.set(x, "excludedAppIds", js.Array(value :_*))
    
    inline def setTargetedAppIds(value: js.Array[String]): Self = StObject.set(x, "targetedAppIds", value.asInstanceOf[js.Any])
    
    inline def setTargetedAppIdsUndefined: Self = StObject.set(x, "targetedAppIds", js.undefined)
    
    inline def setTargetedAppIdsVarargs(value: String*): Self = StObject.set(x, "targetedAppIds", js.Array(value :_*))
  }
}
