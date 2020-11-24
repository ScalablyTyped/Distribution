package typings.knockback.Knockback

import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static extends Utils {
  
  var CollectionObservable: js.Any = js.native
  
  var ViewModel: js.Any = js.native
  
  def applyBindings(viewModel: ViewModel): js.Any = js.native
  def applyBindings(viewModel: ViewModel, node: Element): js.Any = js.native
  
  def collectionObservable(): CollectionObservable = js.native
  def collectionObservable(model: js.UndefOr[scala.Nothing], options: CollectionOptions): CollectionObservable = js.native
  def collectionObservable(model: Collection[Model[_, ModelSetOptions, js.Object]]): CollectionObservable = js.native
  def collectionObservable(model: Collection[Model[_, ModelSetOptions, js.Object]], options: CollectionOptions): CollectionObservable = js.native
  
  def defaultObservable(
    targetObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
    defaultValue: js.Any
  ): js.Any = js.native
  
  def formattedObservable(format: String, args: js.Array[_]): js.Any = js.native
  def formattedObservable(
    format: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
    args: js.Array[_]
  ): js.Any = js.native
  
  def localizedObservable(data: js.Any, options: js.Any): js.Any = js.native
  
  def observable(
    /** the model to observe (can be null) */
  model: Model[_, ModelSetOptions, js.Object],
    /** the create options. String is a single attribute name, Array is an array of attribute names. */
  options_attributeName: String
  ): js.Any = js.native
  def observable(
    /** the model to observe (can be null) */
  model: Model[_, ModelSetOptions, js.Object],
    /** the create options. String is a single attribute name, Array is an array of attribute names. */
  options_attributeName: String,
    /** the viewModel */
  vm: ViewModel
  ): js.Any = js.native
  /** Base class for observing model attributes. */
  def observable(
    /** the model to observe (can be null) */
  model: Model[_, ModelSetOptions, js.Object],
    /** the create options. String is a single attribute name, Array is an array of attribute names. */
  options: IObservableOptions
  ): js.Any = js.native
  def observable(
    /** the model to observe (can be null) */
  model: Model[_, ModelSetOptions, js.Object],
    /** the create options. String is a single attribute name, Array is an array of attribute names. */
  options: IObservableOptions,
    /** the viewModel */
  vm: ViewModel
  ): js.Any = js.native
  
  def release(`object`: js.Any): js.Any = js.native
  def release(`object`: js.Any, pre_release: js.Function0[Unit]): js.Any = js.native
  
  def releaseKeys(`object`: js.Any): js.Any = js.native
  
  def releaseOnNodeRemove(viewmodel: ViewModel, node: Element): js.Any = js.native
  
  def renderAutoReleasedTemplate(template: String, viewModel: ViewModel, options: js.Any): js.Any = js.native
  
  def renderTemplate(template: String, viewModel: ViewModel, options: js.Any): js.Any = js.native
  
  def viewModel(): js.Any = js.native
  def viewModel(model: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
  def viewModel(model: Model[_, ModelSetOptions, js.Object]): js.Any = js.native
  def viewModel(model: Model[_, ModelSetOptions, js.Object], options: js.Any): js.Any = js.native
}
