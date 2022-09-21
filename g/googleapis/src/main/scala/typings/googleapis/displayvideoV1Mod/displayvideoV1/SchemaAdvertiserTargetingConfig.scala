package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdvertiserTargetingConfig extends StObject {
  
  /**
    * Whether or not connected TV devices are exempt from viewability targeting for all video line items under the advertiser.
    */
  var exemptTvFromViewabilityTargeting: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAdvertiserTargetingConfig {
  
  inline def apply(): SchemaAdvertiserTargetingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiserTargetingConfig]
  }
  
  extension [Self <: SchemaAdvertiserTargetingConfig](x: Self) {
    
    inline def setExemptTvFromViewabilityTargeting(value: Boolean): Self = StObject.set(x, "exemptTvFromViewabilityTargeting", value.asInstanceOf[js.Any])
    
    inline def setExemptTvFromViewabilityTargetingNull: Self = StObject.set(x, "exemptTvFromViewabilityTargeting", null)
    
    inline def setExemptTvFromViewabilityTargetingUndefined: Self = StObject.set(x, "exemptTvFromViewabilityTargeting", js.undefined)
  }
}
