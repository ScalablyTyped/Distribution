package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaModule extends StObject {
  
  /**
    * A unique identifier for the module, usually a hash of its contents (up to 128 bytes).
    */
  var buildId: js.UndefOr[SchemaTruncatableString] = js.undefined
  
  /**
    * For example: main binary, kernel modules, and dynamic libraries such as libc.so, sharedlib.so (up to 256 bytes).
    */
  var module: js.UndefOr[SchemaTruncatableString] = js.undefined
}
object SchemaModule {
  
  inline def apply(): SchemaModule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModule]
  }
  
  extension [Self <: SchemaModule](x: Self) {
    
    inline def setBuildId(value: SchemaTruncatableString): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
    
    inline def setModule(value: SchemaTruncatableString): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
  }
}
