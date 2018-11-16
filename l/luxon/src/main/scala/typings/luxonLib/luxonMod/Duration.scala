package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "Duration")
@js.native
class Duration ()
  extends luxonLib.luxonMod.luxonNs.Duration

@JSImport("luxon", "Duration")
@js.native
object Duration extends js.Object {
  def fromISO(text: java.lang.String): luxonLib.luxonMod.luxonNs.Duration = js.native
  def fromISO(text: java.lang.String, options: luxonLib.luxonMod.luxonNs.DurationOptions): luxonLib.luxonMod.luxonNs.Duration = js.native
  def fromMillis(count: scala.Double): luxonLib.luxonMod.luxonNs.Duration = js.native
  def fromMillis(count: scala.Double, options: luxonLib.luxonMod.luxonNs.DurationOptions): luxonLib.luxonMod.luxonNs.Duration = js.native
  def fromObject(Object: luxonLib.luxonMod.luxonNs.DurationObject): luxonLib.luxonMod.luxonNs.Duration = js.native
  def invalid(): luxonLib.luxonMod.luxonNs.Duration = js.native
  def invalid(reason: java.lang.String): luxonLib.luxonMod.luxonNs.Duration = js.native
}

