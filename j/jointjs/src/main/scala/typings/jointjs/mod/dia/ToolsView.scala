package typings.jointjs.mod.dia

import typings.jointjs.mod.dia.ToolsView.Options
import typings.jointjs.mod.mvc.View
import typings.jointjs.mod.mvc.ViewOptions
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "dia.ToolsView")
@js.native
class ToolsView () extends View[Unit] {
  def this(opt: Options) = this()
  
  def blurTool(tool: ToolView): this.type = js.native
  
  def configure(): this.type = js.native
  def configure(opt: Options): this.type = js.native
  
  def focusTool(tool: ToolView): this.type = js.native
  
  def getName(): String | Null = js.native
  
  def hide(): this.type = js.native
  
  def mount(): this.type = js.native
  
  @JSName("options")
  var options_ToolsView: Options = js.native
  
  def show(): this.type = js.native
  
  /* protected */ def simulateRelatedView(el: SVGElement): Unit = js.native
}
object ToolsView {
  
  trait Options
    extends StObject
       with ViewOptions[Unit] {
    
    var component: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String | Null] = js.undefined
    
    var relatedView: js.UndefOr[CellView] = js.undefined
    
    var tools: js.UndefOr[js.Array[ToolView]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setComponent(value: Boolean): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRelatedView(value: CellView): Self = StObject.set(x, "relatedView", value.asInstanceOf[js.Any])
      
      inline def setRelatedViewUndefined: Self = StObject.set(x, "relatedView", js.undefined)
      
      inline def setTools(value: js.Array[ToolView]): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
      
      inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
      
      inline def setToolsVarargs(value: ToolView*): Self = StObject.set(x, "tools", js.Array(value :_*))
    }
  }
}
