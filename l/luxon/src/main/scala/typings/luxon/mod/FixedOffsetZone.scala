package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "FixedOffsetZone")
@js.native
class FixedOffsetZone () extends Zone

/* static members */
@JSImport("luxon", "FixedOffsetZone")
@js.native
object FixedOffsetZone extends js.Object {
  var utcInstance: FixedOffsetZone = js.native
  def instance(offset: Double): FixedOffsetZone = js.native
  def parseSpecifier(s: String): FixedOffsetZone = js.native
}

