package typings.makerJs.MakerJs.measure

import typings.makerJs.MakerJs.IMeasureMap
import typings.makerJs.MakerJs.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of maps of measurements.
  *
  * @param modelToMeasure The model to measure.
  * @param atlas Optional atlas to save measurements.
  * @returns object with low and high points.
  */
@JSGlobal("MakerJs.measure.Atlas")
@js.native
class Atlas protected () extends js.Object {
  /**
    * Constructor.
    * @param modelContext The model to measure.
    */
  def this(modelContext: IModel) = this()
  var modelContext: IModel = js.native
  /**
    * Map of model measurements, mapped by routeKey.
    */
  var modelMap: IMeasureMap = js.native
  /**
    * Flag that models have been measured.
    */
  var modelsMeasured: Boolean = js.native
  /**
    * Map of path measurements, mapped by routeKey.
    */
  var pathMap: IMeasureMap = js.native
  def measureModels(): Unit = js.native
}

