package typings
package levelupLib.levelupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelUpChain[K, V] extends js.Object {
  val length: scala.Double = js.native
  def clear(): this.type = js.native
  def del(key: K): this.type = js.native
  def put(key: K, value: V): this.type = js.native
  def write(): js.Promise[this.type] = js.native
  def write(callback: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback): this.type = js.native
}

