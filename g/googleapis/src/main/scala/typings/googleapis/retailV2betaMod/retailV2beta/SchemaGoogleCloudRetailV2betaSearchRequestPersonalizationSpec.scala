package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaSearchRequestPersonalizationSpec extends StObject {
  
  /**
    * Defaults to Mode.AUTO.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaSearchRequestPersonalizationSpec {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaSearchRequestPersonalizationSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaSearchRequestPersonalizationSpec]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaSearchRequestPersonalizationSpec](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
