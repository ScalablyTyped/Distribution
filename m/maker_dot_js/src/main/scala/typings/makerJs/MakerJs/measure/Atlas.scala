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
@js.native
trait Atlas extends js.Object {
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
  @scala.inline
  implicit class AtlasOps[Self <: Atlas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMeasureModels(value: () => Unit): Self = this.set("measureModels", js.Any.fromFunction0(value))
    @scala.inline
    def setModelContext(value: IModel): Self = this.set("modelContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelMap(value: IMeasureMap): Self = this.set("modelMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelsMeasured(value: Boolean): Self = this.set("modelsMeasured", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathMap(value: IMeasureMap): Self = this.set("pathMap", value.asInstanceOf[js.Any])
  }
  
}

