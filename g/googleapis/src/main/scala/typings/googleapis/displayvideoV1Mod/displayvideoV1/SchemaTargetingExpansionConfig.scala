package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetingExpansionConfig extends StObject {
  
  /**
    * Required. Whether to exclude first party audiences from targeting. Similar audiences of the excluded first party lists will not be excluded. Only applicable when a first-party audience is positively targeted (directly or included in a combined audience), otherwise this selection will be ignored.
    */
  var excludeFirstPartyAudience: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. Magnitude of expansion for applicable targeting under this line item.
    */
  var targetingExpansionLevel: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetingExpansionConfig {
  
  inline def apply(): SchemaTargetingExpansionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingExpansionConfig]
  }
  
  extension [Self <: SchemaTargetingExpansionConfig](x: Self) {
    
    inline def setExcludeFirstPartyAudience(value: Boolean): Self = StObject.set(x, "excludeFirstPartyAudience", value.asInstanceOf[js.Any])
    
    inline def setExcludeFirstPartyAudienceNull: Self = StObject.set(x, "excludeFirstPartyAudience", null)
    
    inline def setExcludeFirstPartyAudienceUndefined: Self = StObject.set(x, "excludeFirstPartyAudience", js.undefined)
    
    inline def setTargetingExpansionLevel(value: String): Self = StObject.set(x, "targetingExpansionLevel", value.asInstanceOf[js.Any])
    
    inline def setTargetingExpansionLevelNull: Self = StObject.set(x, "targetingExpansionLevel", null)
    
    inline def setTargetingExpansionLevelUndefined: Self = StObject.set(x, "targetingExpansionLevel", js.undefined)
  }
}
