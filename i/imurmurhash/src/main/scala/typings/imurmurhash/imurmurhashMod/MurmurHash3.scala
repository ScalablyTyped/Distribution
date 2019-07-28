package typings.imurmurhash.imurmurhashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MurmurHash3 extends js.Object {
  def hash(value: String): MurmurHash3 = js.native
  def reset(): MurmurHash3 = js.native
  def reset(seed: Double): MurmurHash3 = js.native
  def result(): Double = js.native
}

