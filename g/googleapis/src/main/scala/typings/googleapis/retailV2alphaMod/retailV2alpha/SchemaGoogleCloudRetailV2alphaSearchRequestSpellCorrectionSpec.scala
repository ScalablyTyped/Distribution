package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaSearchRequestSpellCorrectionSpec extends StObject {
  
  /**
    * The mode under which spell correction should take effect to replace the original search query. Default to Mode.AUTO.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaSearchRequestSpellCorrectionSpec {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaSearchRequestSpellCorrectionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaSearchRequestSpellCorrectionSpec]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaSearchRequestSpellCorrectionSpec](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
