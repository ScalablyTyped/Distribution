package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgDoughnutChartMethods extends js.Object {
  /**
  	 * Adds a new item to the data source and notifies the chart.
  	 *
  	 * @param item The item that we want to add to the data source.
  	 */
  def addItem(item: js.Object): js.Object
  /**
  	 * Adds a new series to the doughnut chart.
  	 *
  	 * @param seriesObj The series object to be added.
  	 */
  def addSeries(seriesObj: js.Object): Unit
  /**
  	 * Get reference to chart object.
  	 */
  def chart(): js.Object
  /**
  	 * Binds data to the chart
  	 */
  def dataBind(): Unit
  /**
  	 * Destroys the widget.
  	 */
  def destroy(): Unit
  /**
  	 * Returns information about how the doughnut chart is rendered.
  	 */
  def exportVisualData(): js.Object
  /**
  	 * Find index of item within actual data used by chart.
  	 *
  	 * @param item The reference to item.
  	 */
  def findIndexOfItem(item: js.Object): Double
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
  	 * Get item within actual data used by chart. That is similar to this.getData()[ index ].
  	 *
  	 * @param index Index of data item.
  	 */
  def getDataItem(index: js.Object): js.Object
  /**
  	 * Returns the radius of the chart's hole.
  	 */
  def getHoleRadius(): Double
  /**
  	 * Inserts a new item to the data source and notifies the chart.
  	 *
  	 * @param item the new item that we want to insert in the data source.
  	 * @param index The index in the data source where the new item will be inserted.
  	 */
  def insertItem(item: js.Object, index: Double): js.Object
  /**
  	 * Notifies the chart that the items have been cleared from an associated data source.
  	 * It's not necessary to notify more than one target of a change if they share the same items source.
  	 *
  	 * @param dataSource The data source in which the change happened.
  	 */
  def notifyClearItems(dataSource: js.Object): js.Object
  /**
  	 * Notifies the target axis or series that an item has been inserted at the specified index in its data source.
  	 * It's not necessary to notify more than one target of a change if they share the same items source.
  	 *
  	 * @param dataSource The data source in which the change happened.
  	 * @param index The index in the items source where the new item has been inserted.
  	 * @param newItem the new item that has been set in the collection.
  	 */
  def notifyInsertItem(dataSource: js.Object, index: Double, newItem: js.Object): js.Object
  /**
  	 * Notifies the target axis or series that an item has been removed from the specified index in its data source.
  	 * It's not necessary to notify more than one target of a change if they share the same items source.
  	 *
  	 * @param dataSource The data source in which the change happened.
  	 * @param index The index in the items source from where the old item has been removed.
  	 * @param oldItem the old item that has been removed from the collection.
  	 */
  def notifyRemoveItem(dataSource: js.Object, index: Double, oldItem: js.Object): js.Object
  /**
  	 * Notifies the chart that an item has been set in an associated data source.
  	 *
  	 * @param dataSource The data source in which the change happened.
  	 * @param index The index in the items source that has been changed.
  	 * @param newItem the new item that has been set in the collection.
  	 * @param oldItem the old item that has been overwritten in the collection.
  	 */
  def notifySetItem(dataSource: js.Object, index: Double, newItem: js.Object, oldItem: js.Object): js.Object
  /**
  	 * Deletes an item from the data source and notifies the chart.
  	 *
  	 * @param index The index in the data source from where the item will be been removed.
  	 */
  def removeItem(index: Double): js.Object
  /**
  	 * Removes the specified series from the doughnut chart.
  	 *
  	 * @param seriesObj The series object identifying the series to be removed.
  	 */
  def removeSeries(seriesObj: js.Object): Unit
  /**
  	 * Updates an item in the data source and notifies the chart.
  	 *
  	 * @param index The index of the item in the data source that we want to change.
  	 * @param item The new item object that will be set in the data source.
  	 */
  def setItem(index: Double, item: js.Object): js.Object
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
    addItem: js.Object => js.Object,
    addSeries: js.Object => Unit,
    chart: () => js.Object,
    dataBind: () => Unit,
    destroy: () => Unit,
    exportVisualData: () => js.Object,
    findIndexOfItem: js.Object => Double,
    flush: () => Unit,
    getCenterCoordinates: () => js.Object,
    getData: String => js.Object,
    getDataItem: js.Object => js.Object,
    getHoleRadius: () => Double,
    insertItem: (js.Object, Double) => js.Object,
    notifyClearItems: js.Object => js.Object,
    notifyInsertItem: (js.Object, Double, js.Object) => js.Object,
    notifyRemoveItem: (js.Object, Double, js.Object) => js.Object,
    notifySetItem: (js.Object, Double, js.Object, js.Object) => js.Object,
    removeItem: Double => js.Object,
    removeSeries: js.Object => Unit,
    setItem: (Double, js.Object) => js.Object,
    updateSeries: js.Object => Unit
  ): IgDoughnutChartMethods = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction1(addItem), addSeries = js.Any.fromFunction1(addSeries), chart = js.Any.fromFunction0(chart), dataBind = js.Any.fromFunction0(dataBind), destroy = js.Any.fromFunction0(destroy), exportVisualData = js.Any.fromFunction0(exportVisualData), findIndexOfItem = js.Any.fromFunction1(findIndexOfItem), flush = js.Any.fromFunction0(flush), getCenterCoordinates = js.Any.fromFunction0(getCenterCoordinates), getData = js.Any.fromFunction1(getData), getDataItem = js.Any.fromFunction1(getDataItem), getHoleRadius = js.Any.fromFunction0(getHoleRadius), insertItem = js.Any.fromFunction2(insertItem), notifyClearItems = js.Any.fromFunction1(notifyClearItems), notifyInsertItem = js.Any.fromFunction3(notifyInsertItem), notifyRemoveItem = js.Any.fromFunction3(notifyRemoveItem), notifySetItem = js.Any.fromFunction4(notifySetItem), removeItem = js.Any.fromFunction1(removeItem), removeSeries = js.Any.fromFunction1(removeSeries), setItem = js.Any.fromFunction2(setItem), updateSeries = js.Any.fromFunction1(updateSeries))
  
    __obj.asInstanceOf[IgDoughnutChartMethods]
  }
}

