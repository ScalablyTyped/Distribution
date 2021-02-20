package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/test-utils/createMount.MountOptions> */
@js.native
trait PartialMountOptions extends StObject {
  
  var mount: js.UndefOr[FnCallNodeOptions] = js.native
}
object PartialMountOptions {
  
  @scala.inline
  def apply(): PartialMountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMountOptions]
  }
  
  @scala.inline
  implicit class PartialMountOptionsMutableBuilder[Self <: PartialMountOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMount(value: FnCallNodeOptions): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountUndefined: Self = StObject.set(x, "mount", js.undefined)
  }
}
