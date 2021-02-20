package typings.materialUiCore

import typings.materialUiCore.anon.FnCall
import typings.materialUiCore.anon.NonePSnodeReactElementopt
import typings.materialUiCore.anon.PartialMountOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMountMod {
  
  @JSImport("@material-ui/core/test-utils/createMount", JSImport.Default)
  @js.native
  def default(): NonePSnodeReactElementopt = js.native
  @JSImport("@material-ui/core/test-utils/createMount", JSImport.Default)
  @js.native
  def default(options: PartialMountOptions): NonePSnodeReactElementopt = js.native
  
  @js.native
  trait MountOptions extends StObject {
    
    var mount: FnCall = js.native
  }
  object MountOptions {
    
    @scala.inline
    def apply(mount: FnCall): MountOptions = {
      val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any])
      __obj.asInstanceOf[MountOptions]
    }
    
    @scala.inline
    implicit class MountOptionsMutableBuilder[Self <: MountOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMount(value: FnCall): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
    }
  }
}
