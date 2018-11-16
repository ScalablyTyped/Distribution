package typings
package knockbackLib.KnockbackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionObservable
  extends knockoutLib.KnockoutObservableArray[js.Any] {
  def collection(): backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model] = js.native
  def collection(colleciton: backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model]): js.Any = js.native
  def comparator(comparatorFunction: js.Any): js.Any = js.native
  def destroy(): js.Any = js.native
  def filters(id: js.Any): backboneLib.backboneMod.Model = js.native
  def filters(ids: js.Array[_]): CollectionObservable = js.native
  def filters(iterator: js.Function1[/* element */ backboneLib.backboneMod.Model, scala.Boolean]): CollectionObservable = js.native
  def hasViewModels(): scala.Boolean = js.native
  def shareOptions(): CollectionOptions = js.native
  def sortAttribute(attr: java.lang.String): js.Any = js.native
  def viewModelByModel(model: backboneLib.backboneMod.Model): ViewModel = js.native
}

