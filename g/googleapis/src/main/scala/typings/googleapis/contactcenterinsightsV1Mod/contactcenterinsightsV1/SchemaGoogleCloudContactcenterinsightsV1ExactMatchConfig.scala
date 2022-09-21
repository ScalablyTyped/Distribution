package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ExactMatchConfig extends StObject {
  
  /**
    * Whether to consider case sensitivity when performing an exact match.
    */
  var caseSensitive: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ExactMatchConfig {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ExactMatchConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ExactMatchConfig]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ExactMatchConfig](x: Self) {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveNull: Self = StObject.set(x, "caseSensitive", null)
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
  }
}
