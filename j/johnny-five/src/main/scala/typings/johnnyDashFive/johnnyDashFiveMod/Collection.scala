package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Collection")
@js.native
class Collection[Base] protected () extends js.Object {
  def this(options: js.Array[Double | String | js.Object]) = this()
  def this(options: CollectionPinOptions) = this()
  var `type`: js.UndefOr[Base] = js.native
  def add(args: (Double | js.Object)*): Double = js.native
  def byId(id: js.Any): js.UndefOr[Base] = js.native
  def each(callback: js.Function2[/* item */ Base, /* index */ Double, Unit]): this.type = js.native
  def forEach(callback: js.Function2[/* item */ Base, /* index */ Double, Unit]): this.type = js.native
  def includes(item: Base): Boolean = js.native
  def indexOf(item: Base): Double = js.native
  def map(callback: js.Function2[/* item */ Base, /* index */ Double, Unit]): js.Array[_] = js.native
  def slice(): Collection[Base] = js.native
  def slice(begin: Double): Collection[Base] = js.native
  def slice(begin: Double, end: Double): Collection[Base] = js.native
}

/* static members */
@JSImport("johnny-five", "Collection")
@js.native
object Collection extends js.Object {
  def installMethodForwarding(target: js.Object, source: js.Object): js.Object = js.native
}

