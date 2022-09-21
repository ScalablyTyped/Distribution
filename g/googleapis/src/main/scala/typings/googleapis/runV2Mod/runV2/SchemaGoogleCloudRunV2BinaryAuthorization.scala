package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2BinaryAuthorization extends StObject {
  
  /**
    * If present, indicates to use Breakglass using this justification. If use_default is False, then it must be empty. For more information on breakglass, see https://cloud.google.com/binary-authorization/docs/using-breakglass
    */
  var breakglassJustification: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If True, indicates to use the default project's binary authorization policy. If False, binary authorization will be disabled.
    */
  var useDefault: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudRunV2BinaryAuthorization {
  
  inline def apply(): SchemaGoogleCloudRunV2BinaryAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2BinaryAuthorization]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2BinaryAuthorization](x: Self) {
    
    inline def setBreakglassJustification(value: String): Self = StObject.set(x, "breakglassJustification", value.asInstanceOf[js.Any])
    
    inline def setBreakglassJustificationNull: Self = StObject.set(x, "breakglassJustification", null)
    
    inline def setBreakglassJustificationUndefined: Self = StObject.set(x, "breakglassJustification", js.undefined)
    
    inline def setUseDefault(value: Boolean): Self = StObject.set(x, "useDefault", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultNull: Self = StObject.set(x, "useDefault", null)
    
    inline def setUseDefaultUndefined: Self = StObject.set(x, "useDefault", js.undefined)
  }
}
