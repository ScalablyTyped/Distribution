package typings.knockback.Knockback

import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<any> * / any */ @js.native
trait CollectionObservable extends StObject {
  
  def collection(): Collection[Model[Any, ModelSetOptions, Any]] = js.native
  def collection(colleciton: Collection[Model[Any, ModelSetOptions, Any]]): Any = js.native
  
  def comparator(comparatorFunction: Any): Any = js.native
  
  def destroy(): Any = js.native
  
  def filters(id: Any): Model[Any, ModelSetOptions, Any] = js.native
  def filters(ids: js.Array[Any]): CollectionObservable = js.native
  def filters(iterator: js.Function1[/* element */ Model[Any, ModelSetOptions, Any], Boolean]): CollectionObservable = js.native
  
  def hasViewModels(): Boolean = js.native
  
  def shareOptions(): CollectionOptions = js.native
  
  def sortAttribute(attr: String): Any = js.native
  
  def viewModelByModel(model: Model[Any, ModelSetOptions, Any]): ViewModel = js.native
}
