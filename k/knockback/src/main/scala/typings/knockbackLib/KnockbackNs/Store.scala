package typings
package knockbackLib.KnockbackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Knockback.Store")
@js.native
class Store protected () extends Destroyable {
  def this(model: backboneLib.backboneMod.Model, options: StoreOptions) = this()
  def clear(): js.Any = js.native
  def findOrCreate(obj: backboneLib.backboneMod.Model, options: StoreOptions): js.Any = js.native
  def register(
    obj: backboneLib.backboneMod.Model,
    observable: knockoutLib.KnockoutObservable[_],
    options: StoreOptions
  ): js.Any = js.native
}

@JSGlobal("Knockback.Store")
@js.native
object Store extends js.Object {
  def useOptionsOrCreate(
    options: knockbackLib.KnockbackNs.StoreOptions,
    obj: js.Any,
    observable: knockoutLib.KnockoutObservable[_]
  ): js.Any = js.native
}

