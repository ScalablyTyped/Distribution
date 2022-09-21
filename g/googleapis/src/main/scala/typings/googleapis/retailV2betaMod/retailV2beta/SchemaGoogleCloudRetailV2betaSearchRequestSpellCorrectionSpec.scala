package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaSearchRequestSpellCorrectionSpec extends StObject {
  
  /**
    * The mode under which spell correction should take effect to replace the original search query. Default to Mode.AUTO.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaSearchRequestSpellCorrectionSpec {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaSearchRequestSpellCorrectionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaSearchRequestSpellCorrectionSpec]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaSearchRequestSpellCorrectionSpec](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
