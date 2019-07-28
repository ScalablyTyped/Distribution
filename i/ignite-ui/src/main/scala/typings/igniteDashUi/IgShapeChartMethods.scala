package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgShapeChartMethods extends js.Object {
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
  def dataBind(): Unit
  def destroy(): Unit
  def exportVisualData(): Unit
  /**
  	 * Find index of item within actual data used by chart.
  	 *
  	 * @param item The reference to item.
  	 */
  def findIndexOfItem(item: js.Object): Double
  /**
  	 * Forces any pending deferred work to render on the chart before continuing
  	 */
  def flush(): Unit
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
  def id(): Unit
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
  	 * Updates an item in the data source and notifies the chart.
  	 *
  	 * @param index The index of the item in the data source that we want to change.
  	 * @param item The new item object that will be set in the data source.
  	 */
  def setItem(index: Double, item: js.Object): js.Object
}

object IgShapeChartMethods {
  @scala.inline
  def apply(
    addItem: js.Object => js.Object,
    chart: () => js.Object,
    dataBind: () => Unit,
    destroy: () => Unit,
    exportVisualData: () => Unit,
    findIndexOfItem: js.Object => Double,
    flush: () => Unit,
    getData: () => js.Array[_],
    getDataItem: js.Object => js.Object,
    id: () => Unit,
    insertItem: (js.Object, Double) => js.Object,
    notifyClearItems: js.Object => js.Object,
    notifyInsertItem: (js.Object, Double, js.Object) => js.Object,
    notifyRemoveItem: (js.Object, Double, js.Object) => js.Object,
    notifySetItem: (js.Object, Double, js.Object, js.Object) => js.Object,
    removeItem: Double => js.Object,
    setItem: (Double, js.Object) => js.Object
  ): IgShapeChartMethods = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction1(addItem), chart = js.Any.fromFunction0(chart), dataBind = js.Any.fromFunction0(dataBind), destroy = js.Any.fromFunction0(destroy), exportVisualData = js.Any.fromFunction0(exportVisualData), findIndexOfItem = js.Any.fromFunction1(findIndexOfItem), flush = js.Any.fromFunction0(flush), getData = js.Any.fromFunction0(getData), getDataItem = js.Any.fromFunction1(getDataItem), id = js.Any.fromFunction0(id), insertItem = js.Any.fromFunction2(insertItem), notifyClearItems = js.Any.fromFunction1(notifyClearItems), notifyInsertItem = js.Any.fromFunction3(notifyInsertItem), notifyRemoveItem = js.Any.fromFunction3(notifyRemoveItem), notifySetItem = js.Any.fromFunction4(notifySetItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
  
    __obj.asInstanceOf[IgShapeChartMethods]
  }
}

