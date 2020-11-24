package typings.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ @js.native
trait GridControl_ extends js.Object {
  
  /**
    * If a tooltip is currently shown by the gridControl, hide and close it.
    */
  def hide(): js.Any = js.native
  
  def onAdd(map: Map_): js.Any = js.native
  
  def onRemove(map: Map_): js.Any = js.native
  
  /**
    * Change the Mustache template used to transform the UTFGrid data in the map's interactivity into HTML for display.
    */
  def setTemplate(template: String): js.Any = js.native
}
object GridControl_ {
  
  @scala.inline
  def apply(hide: () => js.Any, onAdd: Map_ => js.Any, onRemove: Map_ => js.Any, setTemplate: String => js.Any): GridControl_ = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove), setTemplate = js.Any.fromFunction1(setTemplate))
    __obj.asInstanceOf[GridControl_]
  }
  
  @scala.inline
  implicit class GridControl_Ops[Self <: GridControl_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHide(value: () => js.Any): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAdd(value: Map_ => js.Any): Self = this.set("onAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRemove(value: Map_ => js.Any): Self = this.set("onRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTemplate(value: String => js.Any): Self = this.set("setTemplate", js.Any.fromFunction1(value))
  }
}
