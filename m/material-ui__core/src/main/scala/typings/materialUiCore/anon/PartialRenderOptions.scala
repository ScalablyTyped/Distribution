package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/test-utils/createRender.RenderOptions> */
@js.native
trait PartialRenderOptions extends StObject {
  
  var render: js.UndefOr[Fn0] = js.native
}
object PartialRenderOptions {
  
  @scala.inline
  def apply(): PartialRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRenderOptions]
  }
  
  @scala.inline
  implicit class PartialRenderOptionsMutableBuilder[Self <: PartialRenderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRender(value: Fn0): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
  }
}
