package typings.knockback.Knockback

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends Destroyable {
  def clear(): js.Any
  def findOrCreate(obj: Model[_, ModelSetOptions], options: StoreOptions): js.Any
  def register(obj: Model[_, ModelSetOptions], observable: KnockoutObservable[_], options: StoreOptions): js.Any
}

object Store {
  @scala.inline
  def apply(
    clear: () => js.Any,
    destroy: () => js.Any,
    findOrCreate: (Model[_, ModelSetOptions], StoreOptions) => js.Any,
    register: (Model[_, ModelSetOptions], KnockoutObservable[_], StoreOptions) => js.Any
  ): Store = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), destroy = js.Any.fromFunction0(destroy), findOrCreate = js.Any.fromFunction2(findOrCreate), register = js.Any.fromFunction3(register))
    __obj.asInstanceOf[Store]
  }
}

