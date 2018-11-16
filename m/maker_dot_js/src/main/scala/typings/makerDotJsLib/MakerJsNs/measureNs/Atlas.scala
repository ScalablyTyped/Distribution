package typings
package makerDotJsLib.MakerJsNs.measureNs

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
  def this(modelContext: makerDotJsLib.MakerJsNs.IModel) = this()
  var modelContext: makerDotJsLib.MakerJsNs.IModel = js.native
  /**
           * Map of model measurements, mapped by routeKey.
           */
  var modelMap: makerDotJsLib.MakerJsNs.IMeasureMap = js.native
  /**
           * Flag that models have been measured.
           */
  var modelsMeasured: scala.Boolean = js.native
  /**
           * Map of path measurements, mapped by routeKey.
           */
  var pathMap: makerDotJsLib.MakerJsNs.IMeasureMap = js.native
  def measureModels(): scala.Unit = js.native
}

