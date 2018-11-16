package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "Zone")
@js.native
class Zone ()
  extends luxonLib.luxonMod.luxonNs.Zone {
  /* CompleteClass */
  override def equals(other: luxonLib.luxonMod.luxonNs.Zone): scala.Boolean = js.native
  /* CompleteClass */
  override def offset(ts: scala.Double): scala.Double = js.native
}

@JSImport("luxon", "Zone")
@js.native
object Zone extends js.Object {
  var isValid: scala.Boolean = js.native
  var name: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  var universal: scala.Boolean = js.native
  def offsetName(ts: scala.Double): java.lang.String = js.native
  def offsetName(ts: scala.Double, options: luxonLib.luxonMod.luxonNs.ZoneOffsetOptions): java.lang.String = js.native
}

