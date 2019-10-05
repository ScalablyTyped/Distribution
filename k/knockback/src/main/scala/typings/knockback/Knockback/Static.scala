package typings.knockback.Knockback

import typings.backbone.backboneMod.Collection
import typings.backbone.backboneMod.Model
import typings.knockout.KnockoutObservable
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends Utils {
  var CollectionObservable: js.Any = js.native
  var ViewModel: js.Any = js.native
  def applyBindings(viewModel: ViewModel): js.Any = js.native
  def applyBindings(viewModel: ViewModel, node: Element): js.Any = js.native
  def collectionObservable(): CollectionObservable = js.native
  def collectionObservable(model: Collection[Model]): CollectionObservable = js.native
  def collectionObservable(model: Collection[Model], options: CollectionOptions): CollectionObservable = js.native
  def defaultObservable(targetObservable: KnockoutObservable[_], defaultValue: js.Any): KnockoutObservable[_] = js.native
  def formattedObservable(format: String, args: js.Array[_]): KnockoutObservable[_] = js.native
  def formattedObservable(format: KnockoutObservable[_], args: js.Array[_]): KnockoutObservable[_] = js.native
  def localizedObservable(data: js.Any, options: js.Any): KnockoutObservable[_] = js.native
  def observable(
    /** the model to observe (can be null) */
  model: Model,
    /** the create options. String is a single attribute name, Array is an array of attribute names. */
  options_attributeName: String
  ): KnockoutObservable[_] = js.native
  def observable(
    /** the model to observe (can be null) */
  model: Model,
    /** the create options. String is a single attribute name, Array is an array of attribute names. */
  options_attributeName: String,
    /** the viewModel */
  vm: ViewModel
  ): KnockoutObservable[_] = js.native
  /** Base class for observing model attributes. */
  def observable(
    /** the model to observe (can be null) */
  model: Model,
    /** the create options. String is a single attribute name, Array is an array of attribute names. */
  options: IObservableOptions
  ): KnockoutObservable[_] = js.native
  def observable(
    /** the model to observe (can be null) */
  model: Model,
    /** the create options. String is a single attribute name, Array is an array of attribute names. */
  options: IObservableOptions,
    /** the viewModel */
  vm: ViewModel
  ): KnockoutObservable[_] = js.native
  def release(`object`: js.Any): js.Any = js.native
  def release(`object`: js.Any, pre_release: js.Function0[Unit]): js.Any = js.native
  def releaseKeys(`object`: js.Any): js.Any = js.native
  def releaseOnNodeRemove(viewmodel: ViewModel, node: Element): js.Any = js.native
  def renderAutoReleasedTemplate(template: String, viewModel: ViewModel, options: js.Any): js.Any = js.native
  def renderTemplate(template: String, viewModel: ViewModel, options: js.Any): js.Any = js.native
  def viewModel(): KnockoutObservable[_] = js.native
  def viewModel(model: Model): KnockoutObservable[_] = js.native
  def viewModel(model: Model, options: js.Any): KnockoutObservable[_] = js.native
}

