package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceMakeModelTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The display name of the device make and model.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeviceMakeModelTargetingOptionDetails {
  
  inline def apply(): SchemaDeviceMakeModelTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceMakeModelTargetingOptionDetails]
  }
  
  extension [Self <: SchemaDeviceMakeModelTargetingOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
