package typings.knockback.Knockback

import typings.backbone.backboneMod.Collection
import typings.backbone.backboneMod.Model
import typings.knockout.KnockoutObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionObservable
  extends KnockoutObservableArray[js.Any] {
  def collection(): Collection[Model] = js.native
  def collection(colleciton: Collection[Model]): js.Any = js.native
  def comparator(comparatorFunction: js.Any): js.Any = js.native
  def destroy(): js.Any = js.native
  def filters(id: js.Any): Model = js.native
  def filters(ids: js.Array[_]): CollectionObservable = js.native
  def filters(iterator: js.Function1[/* element */ Model, Boolean]): CollectionObservable = js.native
  def hasViewModels(): Boolean = js.native
  def shareOptions(): CollectionOptions = js.native
  def sortAttribute(attr: String): js.Any = js.native
  def viewModelByModel(model: Model): ViewModel = js.native
}

