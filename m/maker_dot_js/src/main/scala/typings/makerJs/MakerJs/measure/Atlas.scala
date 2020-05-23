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
trait Atlas extends js.Object {
  var modelContext: IModel
  /**
    * Map of model measurements, mapped by routeKey.
    */
  var modelMap: IMeasureMap
  /**
    * Flag that models have been measured.
    */
  var modelsMeasured: Boolean
  /**
    * Map of path measurements, mapped by routeKey.
    */
  var pathMap: IMeasureMap
  def measureModels(): Unit
}

object Atlas {
  @scala.inline
  def apply(
    measureModels: () => Unit,
    modelContext: IModel,
    modelMap: IMeasureMap,
    modelsMeasured: Boolean,
    pathMap: IMeasureMap
  ): Atlas = {
    val __obj = js.Dynamic.literal(measureModels = js.Any.fromFunction0(measureModels), modelContext = modelContext.asInstanceOf[js.Any], modelMap = modelMap.asInstanceOf[js.Any], modelsMeasured = modelsMeasured.asInstanceOf[js.Any], pathMap = pathMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Atlas]
  }
}

