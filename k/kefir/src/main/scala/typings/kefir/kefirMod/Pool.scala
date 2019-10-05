package typings.kefir.kefirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", "Pool")
@js.native
class Pool[T, S] () extends Observable[T, S] {
  def plug(obs: Observable[T, S]): this.type = js.native
  def unplug(obs: Observable[T, S]): this.type = js.native
}

@JSImport("kefir", "pool")
@js.native
object pool extends js.Object {
  def apply[T, S](): Pool[T, S] = js.native
}

