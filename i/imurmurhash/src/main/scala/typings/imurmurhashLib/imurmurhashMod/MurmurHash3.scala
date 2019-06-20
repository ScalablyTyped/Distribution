package typings
package imurmurhashLib.imurmurhashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MurmurHash3 extends js.Object {
  def hash(value: java.lang.String): MurmurHash3 = js.native
  def reset(): MurmurHash3 = js.native
  def reset(seed: scala.Double): MurmurHash3 = js.native
  def result(): scala.Double = js.native
}

