package typings.knockback.Knockback

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewModel
  extends StObject
     with Destroyable {
  
  def extend(source: Any): Any
  
  def model(): Model[Any, ModelSetOptions, Any]
  
  def shareOptions(): ViewModelOptions
}
object ViewModel {
  
  inline def apply(
    destroy: () => Any,
    extend: Any => Any,
    model: () => Model[Any, ModelSetOptions, Any],
    shareOptions: () => ViewModelOptions
  ): ViewModel = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), extend = js.Any.fromFunction1(extend), model = js.Any.fromFunction0(model), shareOptions = js.Any.fromFunction0(shareOptions))
    __obj.asInstanceOf[ViewModel]
  }
  
  extension [Self <: ViewModel](x: Self) {
    
    inline def setExtend(value: Any => Any): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setModel(value: () => Model[Any, ModelSetOptions, Any]): Self = StObject.set(x, "model", js.Any.fromFunction0(value))
    
    inline def setShareOptions(value: () => ViewModelOptions): Self = StObject.set(x, "shareOptions", js.Any.fromFunction0(value))
  }
}
