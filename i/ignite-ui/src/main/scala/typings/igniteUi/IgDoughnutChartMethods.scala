package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgDoughnutChartMethods extends js.Object {
  /**
    * Adds a new series to the doughnut chart.
    *
    * @param seriesObj The series object to be added.
    */
  def addSeries(seriesObj: js.Object): Unit
  /**
    * Destroys the widget.
    */
  def destroy(): Unit
  /**
    * Returns information about how the doughnut chart is rendered.
    */
  def exportVisualData(): js.Object
  /**
    * Causes all of the series that have pending changes e.g. by changed property values to be rendered immediately.
    */
  def flush(): Unit
  /**
    * Returns the center of the doughnut chart.
    */
  def getCenterCoordinates(): js.Object
  /**
    * Returns data source of the series.
    *
    * @param series Optional. The series name. If not provided an array of series data sources is returned.
    */
  def getData(series: String): js.Object
  /**
    * Returns the radius of the chart's hole.
    */
  def getHoleRadius(): Double
  /**
    * Removes the specified series from the doughnut chart.
    *
    * @param seriesObj The series object identifying the series to be removed.
    */
  def removeSeries(seriesObj: js.Object): Unit
  /**
    * Updates the series with the specified name with the specified new property values.
    *
    * @param value The series object identifying the series to be updated.
    */
  def updateSeries(value: js.Object): Unit
}

object IgDoughnutChartMethods {
  @scala.inline
  def apply(
    addSeries: js.Object => Unit,
    destroy: () => Unit,
    exportVisualData: () => js.Object,
    flush: () => Unit,
    getCenterCoordinates: () => js.Object,
    getData: String => js.Object,
    getHoleRadius: () => Double,
    removeSeries: js.Object => Unit,
    updateSeries: js.Object => Unit
  ): IgDoughnutChartMethods = {
    val __obj = js.Dynamic.literal(addSeries = js.Any.fromFunction1(addSeries), destroy = js.Any.fromFunction0(destroy), exportVisualData = js.Any.fromFunction0(exportVisualData), flush = js.Any.fromFunction0(flush), getCenterCoordinates = js.Any.fromFunction0(getCenterCoordinates), getData = js.Any.fromFunction1(getData), getHoleRadius = js.Any.fromFunction0(getHoleRadius), removeSeries = js.Any.fromFunction1(removeSeries), updateSeries = js.Any.fromFunction1(updateSeries))
    __obj.asInstanceOf[IgDoughnutChartMethods]
  }
}

