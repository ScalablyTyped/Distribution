package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgBaseChartMethods extends js.Object {
  /**
  	 * Adds a new item to the data source and notifies the chart.
  	 *
  	 * @param item The item that we want to add to the data source.
  	 */
  def addItem(item: js.Object): js.Object
  /**
  	 * Get reference to chart object.
  	 */
  def chart(): js.Object
  /**
  	 * Binds data to the chart
  	 */
  def dataBind(): scala.Unit
  /**
  	 * Destroys widget.
  	 */
  def destroy(): scala.Unit
  /**
  	 * Find index of item within actual data used by chart.
  	 *
  	 * @param item The reference to item.
  	 */
  def findIndexOfItem(item: js.Object): scala.Double
  /**
  	 * Forces any pending deferred work to render on the chart before continuing
  	 */
  def flush(): scala.Unit
  /**
  	 * Get reference of actual data used by chart.
  	 */
  def getData(): js.Array[_]
  /**
  	 * Get item within actual data used by chart. That is similar to this.getData()[ index ].
  	 *
  	 * @param index Index of data item.
  	 */
  def getDataItem(index: js.Object): js.Object
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
  	 * Updates an item in the data source and notifies the chart.
  	 *
  	 * @param index The index of the item in the data source that we want to change.
  	 * @param item The new item object that will be set in the data source.
  	 */
  def setItem(index: scala.Double, item: js.Object): js.Object
}

object IgBaseChartMethods {
  @scala.inline
  def apply(
    addItem: js.Function1[js.Object, js.Object],
    chart: js.Function0[js.Object],
    dataBind: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    findIndexOfItem: js.Function1[js.Object, scala.Double],
    flush: js.Function0[scala.Unit],
    getData: js.Function0[js.Array[_]],
    getDataItem: js.Function1[js.Object, js.Object],
    insertItem: js.Function2[js.Object, scala.Double, js.Object],
    notifyClearItems: js.Function1[js.Object, js.Object],
    notifyInsertItem: js.Function3[js.Object, scala.Double, js.Object, js.Object],
    notifyRemoveItem: js.Function3[js.Object, scala.Double, js.Object, js.Object],
    notifySetItem: js.Function4[js.Object, scala.Double, js.Object, js.Object, js.Object],
    removeItem: js.Function1[scala.Double, js.Object],
    setItem: js.Function2[scala.Double, js.Object, js.Object]
  ): IgBaseChartMethods = {
    val __obj = js.Dynamic.literal(addItem = addItem, chart = chart, dataBind = dataBind, destroy = destroy, findIndexOfItem = findIndexOfItem, flush = flush, getData = getData, getDataItem = getDataItem, insertItem = insertItem, notifyClearItems = notifyClearItems, notifyInsertItem = notifyInsertItem, notifyRemoveItem = notifyRemoveItem, notifySetItem = notifySetItem, removeItem = removeItem, setItem = setItem)
  
    __obj.asInstanceOf[IgBaseChartMethods]
  }
}

