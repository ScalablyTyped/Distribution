package typings.hapiCryptiles

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/cryptiles", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def fixedTimeComparison(a: String, b: String): Boolean = js.native
  def fixedTimeComparison(a: String, b: js.Array[_]): Boolean = js.native
  def fixedTimeComparison(a: js.Array[_], b: String): Boolean = js.native
  def fixedTimeComparison(a: js.Array[_], b: js.Array[_]): Boolean = js.native
  def randomAlphanumString(size: Double): String = js.native
  def randomBits(bits: Double): Buffer = js.native
  def randomDigits(size: Double): String = js.native
  def randomString(size: Double): String = js.native
}

