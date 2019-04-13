package typings
package ipcheckLib.ipcheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPCheck extends js.Object {
  var address: js.Array[scala.Double] = js.native
  var input: java.lang.String = js.native
  var ipv: ipcheckLib.ipcheckLibNumbers.`4` | ipcheckLib.ipcheckLibNumbers.`6` | ipcheckLib.ipcheckLibNumbers.`0` = js.native
  var mask: scala.Double = js.native
  var valid: scala.Boolean = js.native
  def `match`(cidr: IPCheck): scala.Boolean = js.native
  def `match`(cidr: java.lang.String): scala.Boolean = js.native
}

