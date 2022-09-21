package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2SearchRequestPersonalizationSpec extends StObject {
  
  /**
    * Defaults to Mode.AUTO.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2SearchRequestPersonalizationSpec {
  
  inline def apply(): SchemaGoogleCloudRetailV2SearchRequestPersonalizationSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2SearchRequestPersonalizationSpec]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2SearchRequestPersonalizationSpec](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
