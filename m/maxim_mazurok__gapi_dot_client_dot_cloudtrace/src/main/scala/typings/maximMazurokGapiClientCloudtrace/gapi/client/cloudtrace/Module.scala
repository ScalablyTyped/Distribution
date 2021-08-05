package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Module extends StObject {
  
  /** A unique identifier for the module, usually a hash of its contents (up to 128 bytes). */
  var buildId: js.UndefOr[TruncatableString] = js.undefined
  
  /** For example: main binary, kernel modules, and dynamic libraries such as libc.so, sharedlib.so (up to 256 bytes). */
  var module: js.UndefOr[TruncatableString] = js.undefined
}
object Module {
  
  inline def apply(): Module = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Module]
  }
  
  extension [Self <: Module](x: Self) {
    
    inline def setBuildId(value: TruncatableString): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
    
    inline def setModule(value: TruncatableString): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
  }
}
