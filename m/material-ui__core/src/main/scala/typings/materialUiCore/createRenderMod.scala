package typings.materialUiCore

import typings.materialUiCore.anon.Fn0
import typings.materialUiCore.anon.PartialRenderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createRenderMod {
  
  @JSImport("@material-ui/core/test-utils/createRender", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Fn0 = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Fn0]
  @scala.inline
  def default(options: PartialRenderOptions): Fn0 = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Fn0]
  
  trait RenderOptions extends StObject {
    
    var render: Fn0
  }
  object RenderOptions {
    
    @scala.inline
    def apply(render: Fn0): RenderOptions = {
      val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderOptions]
    }
    
    @scala.inline
    implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: Fn0): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    }
  }
}
