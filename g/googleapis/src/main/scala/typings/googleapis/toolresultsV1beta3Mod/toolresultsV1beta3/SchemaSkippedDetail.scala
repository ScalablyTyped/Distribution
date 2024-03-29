package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSkippedDetail extends StObject {
  
  /**
    * If the App doesn't support the specific API level.
    */
  var incompatibleAppVersion: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If the App doesn't run on the specific architecture, for example, x86.
    */
  var incompatibleArchitecture: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If the requested OS version doesn't run on the specific device model.
    */
  var incompatibleDevice: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSkippedDetail {
  
  inline def apply(): SchemaSkippedDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSkippedDetail]
  }
  
  extension [Self <: SchemaSkippedDetail](x: Self) {
    
    inline def setIncompatibleAppVersion(value: Boolean): Self = StObject.set(x, "incompatibleAppVersion", value.asInstanceOf[js.Any])
    
    inline def setIncompatibleAppVersionNull: Self = StObject.set(x, "incompatibleAppVersion", null)
    
    inline def setIncompatibleAppVersionUndefined: Self = StObject.set(x, "incompatibleAppVersion", js.undefined)
    
    inline def setIncompatibleArchitecture(value: Boolean): Self = StObject.set(x, "incompatibleArchitecture", value.asInstanceOf[js.Any])
    
    inline def setIncompatibleArchitectureNull: Self = StObject.set(x, "incompatibleArchitecture", null)
    
    inline def setIncompatibleArchitectureUndefined: Self = StObject.set(x, "incompatibleArchitecture", js.undefined)
    
    inline def setIncompatibleDevice(value: Boolean): Self = StObject.set(x, "incompatibleDevice", value.asInstanceOf[js.Any])
    
    inline def setIncompatibleDeviceNull: Self = StObject.set(x, "incompatibleDevice", null)
    
    inline def setIncompatibleDeviceUndefined: Self = StObject.set(x, "incompatibleDevice", js.undefined)
  }
}
