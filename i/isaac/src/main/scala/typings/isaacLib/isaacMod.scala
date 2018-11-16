package typings
package isaacLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("isaac", JSImport.Namespace)
@js.native
object isaacMod extends js.Object {
  def internals(): js.Any = js.native
  def prng(n: scala.Double): scala.Unit = js.native
  def rand(): scala.Double = js.native
  def random(): scala.Double = js.native
  def reset(): scala.Unit = js.native
  def seed(s: java.lang.String): scala.Unit = js.native
  def seed(s: js.Array[scala.Double]): scala.Unit = js.native
  def seed(s: scala.Double): scala.Unit = js.native
}

