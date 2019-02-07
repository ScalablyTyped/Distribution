package typings
package kissfftDashJsLib.kissfftDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kissfft-js", "FFTR")
@js.native
class FFTR protected () extends js.Object {
  def this(size: scala.Double) = this()
  def dispose(): scala.Unit = js.native
  def forward(input: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def inverse(input: js.Array[scala.Double]): js.Array[scala.Double] = js.native
}

