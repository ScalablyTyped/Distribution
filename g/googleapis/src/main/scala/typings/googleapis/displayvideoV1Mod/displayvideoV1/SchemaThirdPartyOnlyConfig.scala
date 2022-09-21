package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaThirdPartyOnlyConfig extends StObject {
  
  /**
    * Whether or not order ID reporting for pixels is enabled. This value cannot be changed once set to `true`.
    */
  var pixelOrderIdReportingEnabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaThirdPartyOnlyConfig {
  
  inline def apply(): SchemaThirdPartyOnlyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThirdPartyOnlyConfig]
  }
  
  extension [Self <: SchemaThirdPartyOnlyConfig](x: Self) {
    
    inline def setPixelOrderIdReportingEnabled(value: Boolean): Self = StObject.set(x, "pixelOrderIdReportingEnabled", value.asInstanceOf[js.Any])
    
    inline def setPixelOrderIdReportingEnabledNull: Self = StObject.set(x, "pixelOrderIdReportingEnabled", null)
    
    inline def setPixelOrderIdReportingEnabledUndefined: Self = StObject.set(x, "pixelOrderIdReportingEnabled", js.undefined)
  }
}
