package typings.makerDotJs.MakerJs.measure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.measure.isBetween")
@js.native
object isBetween extends js.Object {
  /**
    * Check if a given number is between two given limits.
    *
    * @param valueInQuestion The number to test.
    * @param limitA First limit.
    * @param limitB Second limit.
    * @param exclusive Flag to exclude equaling the limits.
    * @returns Boolean true if value is between (or equal to) the limits.
    */
  def apply(valueInQuestion: Double, limitA: Double, limitB: Double, exclusive: Boolean): Boolean = js.native
}

