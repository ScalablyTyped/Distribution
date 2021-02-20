package typings.knockback.Knockback

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewModel extends Destroyable {
  
  def extend(source: js.Any): js.Any = js.native
  
  def model(): Model[_, ModelSetOptions, js.Object] = js.native
  
  def shareOptions(): ViewModelOptions = js.native
}
object ViewModel {
  
  @scala.inline
  def apply(
    destroy: () => js.Any,
    extend: js.Any => js.Any,
    model: () => Model[_, ModelSetOptions, js.Object],
    shareOptions: () => ViewModelOptions
  ): ViewModel = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), extend = js.Any.fromFunction1(extend), model = js.Any.fromFunction0(model), shareOptions = js.Any.fromFunction0(shareOptions))
    __obj.asInstanceOf[ViewModel]
  }
  
  @scala.inline
  implicit class ViewModelMutableBuilder[Self <: ViewModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Any => js.Any): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setModel(value: () => Model[_, ModelSetOptions, js.Object]): Self = StObject.set(x, "model", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShareOptions(value: () => ViewModelOptions): Self = StObject.set(x, "shareOptions", js.Any.fromFunction0(value))
  }
}
