package typings
package igniteDashUiLib

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
  def addSeries(seriesObj: js.Object): scala.Unit
  /**
  	 * Get reference to chart object.
  	 */
  def chart(): js.Object
  /**
  	 * Binds data to the chart
  	 */
  def dataBind(): scala.Unit
  /**
  	 * Destroys the widget.
  	 */
  def destroy(): scala.Unit
  /**
  	 * Returns information about how the doughnut chart is rendered.
  	 */
  def exportVisualData(): js.Object
  /**
  	 * Find index of item within actual data used by chart.
  	 *
  	 * @param item The reference to item.
  	 */
  def findIndexOfItem(item: js.Object): scala.Double
  /**
  	 * Causes all of the series that have pending changes e.g. by changed property values to be rendered immediately.
  	 */
  def flush(): scala.Unit
  /**
  	 * Returns the center of the doughnut chart.
  	 */
  def getCenterCoordinates(): js.Object
  /**
  	 * Returns data source of the series.
  	 *
  	 * @param series Optional. The series name. If not provided an array of series data sources is returned.
  	 */
  def getData(series: java.lang.String): js.Object
  /**
  	 * Get item within actual data used by chart. That is similar to this.getData()[ index ].
  	 *
  	 * @param index Index of data item.
  	 */
  def getDataItem(index: js.Object): js.Object
  /**
  	 * Returns the radius of the chart's hole.
  	 */
  def getHoleRadius(): scala.Double
  /**
  	 * Inserts a new item to the data source and notifies the chart.
  	 *
  	 * @param item the new item that we want to insert in the data source.
  	 * @param index The index in the data source where the new item will be inserted.
  	 */
  def insertItem(item: js.Object, index: scala.Double): js.Object
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
  def notifyInsertItem(dataSource: js.Object, index: scala.Double, newItem: js.Object): js.Object
  /**
  	 * Notifies the target axis or series that an item has been removed from the specified index in its data source.
  	 * It's not necessary to notify more than one target of a change if they share the same items source.
  	 *
  	 * @param dataSource The data source in which the change happened.
  	 * @param index The index in the items source from where the old item has been removed.
  	 * @param oldItem the old item that has been removed from the collection.
  	 */
  def notifyRemoveItem(dataSource: js.Object, index: scala.Double, oldItem: js.Object): js.Object
  /**
  	 * Notifies the chart that an item has been set in an associated data source.
  	 *
  	 * @param dataSource The data source in which the change happened.
  	 * @param index The index in the items source that has been changed.
  	 * @param newItem the new item that has been set in the collection.
  	 * @param oldItem the old item that has been overwritten in the collection.
  	 */
  def notifySetItem(dataSource: js.Object, index: scala.Double, newItem: js.Object, oldItem: js.Object): js.Object
  /**
  	 * Deletes an item from the data source and notifies the chart.
  	 *
  	 * @param index The index in the data source from where the item will be been removed.
  	 */
  def removeItem(index: scala.Double): js.Object
  /**
  	 * Removes the specified series from the doughnut chart.
  	 *
  	 * @param seriesObj The series object identifying the series to be removed.
  	 */
  def removeSeries(seriesObj: js.Object): scala.Unit
  /**
  	 * Updates an item in the data source and notifies the chart.
  	 *
  	 * @param index The index of the item in the data source that we want to change.
  	 * @param item The new item object that will be set in the data source.
  	 */
  def setItem(index: scala.Double, item: js.Object): js.Object
  /**
  	 * Updates the series with the specified name with the specified new property values.
  	 *
  	 * @param value The series object identifying the series to be updated.
  	 */
  def updateSeries(value: js.Object): scala.Unit
}

