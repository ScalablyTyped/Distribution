package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2SearchRequestSpellCorrectionSpec extends StObject {
  
  /**
    * The mode under which spell correction should take effect to replace the original search query. Default to Mode.AUTO.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2SearchRequestSpellCorrectionSpec {
  
  inline def apply(): SchemaGoogleCloudRetailV2SearchRequestSpellCorrectionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2SearchRequestSpellCorrectionSpec]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2SearchRequestSpellCorrectionSpec](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
