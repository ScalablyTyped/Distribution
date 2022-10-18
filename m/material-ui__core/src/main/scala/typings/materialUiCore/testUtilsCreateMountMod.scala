package typings.materialUiCore

import typings.materialUiCore.anon.FnCall
import typings.materialUiCore.anon.NonePSnodeReactElementopt
import typings.materialUiCore.anon.PartialMountOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilsCreateMountMod {
  
  @JSImport("@material-ui/core/test-utils/createMount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): NonePSnodeReactElementopt = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[NonePSnodeReactElementopt]
  inline def default(options: PartialMountOptions): NonePSnodeReactElementopt = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[NonePSnodeReactElementopt]
  
  trait MountOptions extends StObject {
    
    var mount: FnCall
    
    var strict: Boolean
  }
  object MountOptions {
    
    inline def apply(mount: FnCall, strict: Boolean): MountOptions = {
      val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
      __obj.asInstanceOf[MountOptions]
    }
    
    extension [Self <: MountOptions](x: Self) {
      
      inline def setMount(value: FnCall): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    }
  }
}
