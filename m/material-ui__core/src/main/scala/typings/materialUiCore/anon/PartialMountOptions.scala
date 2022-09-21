package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/test-utils/createMount.MountOptions> */
trait PartialMountOptions extends StObject {
  
  var mount: js.UndefOr[FnCallNodeOptions] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object PartialMountOptions {
  
  inline def apply(): PartialMountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMountOptions]
  }
  
  extension [Self <: PartialMountOptions](x: Self) {
    
    inline def setMount(value: FnCallNodeOptions): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
    
    inline def setMountUndefined: Self = StObject.set(x, "mount", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
