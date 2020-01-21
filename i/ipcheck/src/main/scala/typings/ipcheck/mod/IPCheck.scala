package typings.ipcheck.mod

import typings.ipcheck.ipcheckNumbers.`0`
import typings.ipcheck.ipcheckNumbers.`4`
import typings.ipcheck.ipcheckNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPCheck extends js.Object {
  var address: js.Array[Double] = js.native
  var input: String = js.native
  var ipv: `4` | `6` | `0` = js.native
  var mask: Double = js.native
  var valid: Boolean = js.native
  def `match`(cidr: String): Boolean = js.native
  def `match`(cidr: IPCheck): Boolean = js.native
}

