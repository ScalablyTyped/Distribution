package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSiteCompanionSetting extends StObject {
  
  /**
    * Whether companions are disabled for this site template.
    */
  var companionsDisabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Allowlist of companion sizes to be served via this site template. Set this list to null or empty to serve all companion sizes.
    */
  var enabledSizes: js.UndefOr[js.Array[SchemaSize]] = js.undefined
  
  /**
    * Whether to serve only static images as companions.
    */
  var imageOnly: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#siteCompanionSetting".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaSiteCompanionSetting {
  
  inline def apply(): SchemaSiteCompanionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteCompanionSetting]
  }
  
  extension [Self <: SchemaSiteCompanionSetting](x: Self) {
    
    inline def setCompanionsDisabled(value: Boolean): Self = StObject.set(x, "companionsDisabled", value.asInstanceOf[js.Any])
    
    inline def setCompanionsDisabledNull: Self = StObject.set(x, "companionsDisabled", null)
    
    inline def setCompanionsDisabledUndefined: Self = StObject.set(x, "companionsDisabled", js.undefined)
    
    inline def setEnabledSizes(value: js.Array[SchemaSize]): Self = StObject.set(x, "enabledSizes", value.asInstanceOf[js.Any])
    
    inline def setEnabledSizesUndefined: Self = StObject.set(x, "enabledSizes", js.undefined)
    
    inline def setEnabledSizesVarargs(value: SchemaSize*): Self = StObject.set(x, "enabledSizes", js.Array(value*))
    
    inline def setImageOnly(value: Boolean): Self = StObject.set(x, "imageOnly", value.asInstanceOf[js.Any])
    
    inline def setImageOnlyNull: Self = StObject.set(x, "imageOnly", null)
    
    inline def setImageOnlyUndefined: Self = StObject.set(x, "imageOnly", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
