package typings.kefir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", "Pool")
@js.native
class Pool_[T, S] () extends Observable[T, S] {
  def plug(obs: Observable[T, S]): this.type = js.native
  def unplug(obs: Observable[T, S]): this.type = js.native
}

