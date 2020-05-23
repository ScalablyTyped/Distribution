package typings.knockback.Knockback

import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.knockout.KnockoutObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionObservable
  extends KnockoutObservableArray[js.Any] {
  def collection(): Collection[Model[_, ModelSetOptions]] = js.native
  def collection(colleciton: Collection[Model[_, ModelSetOptions]]): js.Any = js.native
  def comparator(comparatorFunction: js.Any): js.Any = js.native
  def destroy(): js.Any = js.native
  def filters(id: js.Any): Model[_, ModelSetOptions] = js.native
  def filters(ids: js.Array[_]): CollectionObservable = js.native
  def filters(iterator: js.Function1[/* element */ Model[_, ModelSetOptions], Boolean]): CollectionObservable = js.native
  def hasViewModels(): Boolean = js.native
  def shareOptions(): CollectionOptions = js.native
  def sortAttribute(attr: String): js.Any = js.native
  def viewModelByModel(model: Model[_, ModelSetOptions]): ViewModel = js.native
}

