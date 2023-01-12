package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/test-utils/createRender.RenderOptions> */
trait PartialRenderOptions extends StObject {
  
  var render: js.UndefOr[Fn0] = js.undefined
}
object PartialRenderOptions {
  
  inline def apply(): PartialRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRenderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRenderOptions] (val x: Self) extends AnyVal {
    
    inline def setRender(value: Fn0): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
  }
}
