package typings.kissfftDashJs.kissfftDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kissfft-js", "FFT")
@js.native
class FFT protected () extends js.Object {
  def this(size: Double) = this()
  def dispose(): Unit = js.native
  def forward(input: js.Array[Double]): js.Array[Double] = js.native
  def inverse(input: js.Array[Double]): js.Array[Double] = js.native
}

