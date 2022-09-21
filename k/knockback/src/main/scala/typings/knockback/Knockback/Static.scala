package typings.knockback.Knockback

import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static
  extends StObject
     with Utils {
  
  var CollectionObservable: Any = js.native
  
  var ViewModel: Any = js.native
  
  def applyBindings(viewModel: ViewModel): Any = js.native
  def applyBindings(viewModel: ViewModel, node: Element): Any = js.native
  
  def collectionObservable(): CollectionObservable = js.native
  def collectionObservable(model: Unit, options: CollectionOptions): CollectionObservable = js.native
  def collectionObservable(model: Collection[Model[Any, ModelSetOptions, Any]]): CollectionObservable = js.native
  def collectionObservable(model: Collection[Model[Any, ModelSetOptions, Any]], options: CollectionOptions): CollectionObservable = js.native
  
  def defaultObservable(
    targetObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any,
    defaultValue: Any
  ): Any = js.native
  
  def formattedObservable(format: String, args: js.Array[Any]): Any = js.native
  def formattedObservable(
    format: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any,
    args: js.Array[Any]
  ): Any = js.native
  
  def localizedObservable(data: Any, options: Any): Any = js.native
  
  def observable(
    /** the model to observe (can be null) */
  model: Model[Any, ModelSetOptions, Any],
    /** the create options. String is a single attribute name, Array is an array of attribute names. */
  options_attributeName: String
  ): Any = js.native
  def observable(
    /** the model to observe (can be null) */
  model: Model[Any, ModelSetOptions, Any],
    /** the create options. String is a single attribute name, Array is an array of attribute names. */
  options_attributeName: String,
    /** the viewModel */
  vm: ViewModel
  ): Any = js.native
  /** Base class for observing model attributes. */
  def observable(
    /** the model to observe (can be null) */
  model: Model[Any, ModelSetOptions, Any],
    /** the create options. String is a single attribute name, Array is an array of attribute names. */
  options: IObservableOptions
  ): Any = js.native
  def observable(
    /** the model to observe (can be null) */
  model: Model[Any, ModelSetOptions, Any],
    /** the create options. String is a single attribute name, Array is an array of attribute names. */
  options: IObservableOptions,
    /** the viewModel */
  vm: ViewModel
  ): Any = js.native
  
  def release(`object`: Any): Any = js.native
  def release(`object`: Any, pre_release: js.Function0[Unit]): Any = js.native
  
  def releaseKeys(`object`: Any): Any = js.native
  
  def releaseOnNodeRemove(viewmodel: ViewModel, node: Element): Any = js.native
  
  def renderAutoReleasedTemplate(template: String, viewModel: ViewModel, options: Any): Any = js.native
  
  def renderTemplate(template: String, viewModel: ViewModel, options: Any): Any = js.native
  
  def viewModel(): Any = js.native
  def viewModel(model: Unit, options: Any): Any = js.native
  def viewModel(model: Model[Any, ModelSetOptions, Any]): Any = js.native
  def viewModel(model: Model[Any, ModelSetOptions, Any], options: Any): Any = js.native
}
