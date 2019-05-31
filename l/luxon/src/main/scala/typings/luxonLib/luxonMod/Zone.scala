package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "Zone")
@js.native
class Zone () extends js.Object {
  var isValid: scala.Boolean = js.native
  var name: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  var universal: scala.Boolean = js.native
  def equals(other: Zone): scala.Boolean = js.native
  def formatOffset(ts: scala.Double, format: ZoneOffsetFormat): java.lang.String = js.native
  def offset(ts: scala.Double): scala.Double = js.native
  def offsetName(ts: scala.Double, options: ZoneOffsetOptions): java.lang.String = js.native
}

