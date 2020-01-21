package typings.makerJs.MakerJs.measure

import typings.makerJs.MakerJs.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.measure.boundingHexagon")
@js.native
object boundingHexagon extends js.Object {
  /**
    * Measures the minimum bounding hexagon surrounding a model. The hexagon is oriented such that the right and left sides are vertical, and the top and bottom are pointed.
    *
    * @param modelToMeasure The model to measure.
    * @returns IBoundingHex object which is a hexagon model, with an additional radius property.
    */
  def apply(modelToMeasure: IModel): IBoundingHex = js.native
}

