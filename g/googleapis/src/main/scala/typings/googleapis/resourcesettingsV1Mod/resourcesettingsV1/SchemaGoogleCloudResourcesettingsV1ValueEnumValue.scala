package typings.googleapis.resourcesettingsV1Mod.resourcesettingsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudResourcesettingsV1ValueEnumValue extends StObject {
  
  /**
    * The value of this enum
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudResourcesettingsV1ValueEnumValue {
  
  inline def apply(): SchemaGoogleCloudResourcesettingsV1ValueEnumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudResourcesettingsV1ValueEnumValue]
  }
  
  extension [Self <: SchemaGoogleCloudResourcesettingsV1ValueEnumValue](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
