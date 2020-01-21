package typings.knockback.Knockback

import typings.backbone.mod.Model
import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Knockback.Store")
@js.native
class Store protected () extends Destroyable {
  def this(model: Model, options: StoreOptions) = this()
  def clear(): js.Any = js.native
  def findOrCreate(obj: Model, options: StoreOptions): js.Any = js.native
  def register(obj: Model, observable: KnockoutObservable[_], options: StoreOptions): js.Any = js.native
}

/* static members */
@JSGlobal("Knockback.Store")
@js.native
object Store extends js.Object {
  def useOptionsOrCreate(options: StoreOptions, obj: js.Any, observable: KnockoutObservable[_]): js.Any = js.native
}

