package typings.makerJs.MakerJs.measure

import typings.makerJs.MakerJs.IMeasure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.measure.increase")
@js.native
object increase extends js.Object {
  /**
    * Increase a measurement by an additional measurement.
    *
    * @param baseMeasure The measurement to increase.
    * @param addMeasure The additional measurement.
    * @param addOffset Optional offset point of the additional measurement.
    * @returns The increased original measurement (for cascading).
    */
  def apply(baseMeasure: IMeasure, addMeasure: IMeasure): IMeasure = js.native
}

