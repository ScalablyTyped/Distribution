package typings
package knockbackLib.KnockbackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends Utils {
  var CollectionObservable: js.Any = js.native
  var ViewModel: js.Any = js.native
  def applyBindings(viewModel: ViewModel): js.Any = js.native
  def applyBindings(viewModel: ViewModel, node: stdLib.Element): js.Any = js.native
  def collectionObservable(): CollectionObservable = js.native
  def collectionObservable(model: backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model]): CollectionObservable = js.native
  def collectionObservable(
    model: backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model],
    options: CollectionOptions
  ): CollectionObservable = js.native
  def defaultObservable(targetObservable: knockoutLib.KnockoutObservable[_], defaultValue: js.Any): knockoutLib.KnockoutObservable[_] = js.native
  def formattedObservable(format: java.lang.String, args: js.Array[_]): knockoutLib.KnockoutObservable[_] = js.native
  def formattedObservable(format: knockoutLib.KnockoutObservable[_], args: js.Array[_]): knockoutLib.KnockoutObservable[_] = js.native
  def localizedObservable(data: js.Any, options: js.Any): knockoutLib.KnockoutObservable[_] = js.native
  def observable(
    /** the model to observe (can be null) */
  model: backboneLib.backboneMod.Model,
    /** the create options. String is a single attribute name, Array is an array of attribute names. */
  options_attributeName: java.lang.String
  ): knockoutLib.KnockoutObservable[_] = js.native
  def observable(
    /** the model to observe (can be null) */
  model: backboneLib.backboneMod.Model,
    /** the create options. String is a single attribute name, Array is an array of attribute names. */
  options_attributeName: java.lang.String,
    /** the viewModel */
  vm: ViewModel
  ): knockoutLib.KnockoutObservable[_] = js.native
  /** Base class for observing model attributes. */
  def observable(
    /** the model to observe (can be null) */
  model: backboneLib.backboneMod.Model,
    /** the create options. String is a single attribute name, Array is an array of attribute names. */
  options: IObservableOptions
  ): knockoutLib.KnockoutObservable[_] = js.native
  def observable(
    /** the model to observe (can be null) */
  model: backboneLib.backboneMod.Model,
    /** the create options. String is a single attribute name, Array is an array of attribute names. */
  options: IObservableOptions,
    /** the viewModel */
  vm: ViewModel
  ): knockoutLib.KnockoutObservable[_] = js.native
  def release(`object`: js.Any): js.Any = js.native
  def release(`object`: js.Any, pre_release: js.Function0[scala.Unit]): js.Any = js.native
  def releaseKeys(`object`: js.Any): js.Any = js.native
  def releaseOnNodeRemove(viewmodel: ViewModel, node: stdLib.Element): js.Any = js.native
  def renderAutoReleasedTemplate(template: java.lang.String, viewModel: ViewModel, options: js.Any): js.Any = js.native
  def renderTemplate(template: java.lang.String, viewModel: ViewModel, options: js.Any): js.Any = js.native
  def viewModel(): knockoutLib.KnockoutObservable[_] = js.native
  def viewModel(model: backboneLib.backboneMod.Model): knockoutLib.KnockoutObservable[_] = js.native
  def viewModel(model: backboneLib.backboneMod.Model, options: js.Any): knockoutLib.KnockoutObservable[_] = js.native
}

