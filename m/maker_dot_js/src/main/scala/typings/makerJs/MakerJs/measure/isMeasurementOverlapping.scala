package typings.makerJs.MakerJs.measure

import typings.makerJs.MakerJs.IMeasure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.measure.isMeasurementOverlapping")
@js.native
object isMeasurementOverlapping extends js.Object {
  /**
    * Check for measurement overlapping another measurement.
    *
    * @param measureA The measurement to test.
    * @param measureB The measurement to check for overlap.
    * @returns Boolean true if measureA is overlapped with measureB.
    */
  def apply(measureA: IMeasure, measureB: IMeasure): Boolean = js.native
}

