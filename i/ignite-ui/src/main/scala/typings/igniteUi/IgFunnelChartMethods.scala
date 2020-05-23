package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgFunnelChartMethods extends js.Object {
  /**
    * Adds a new item to the data source and notifies the chart.
    *
    * @param item The item that we want to add to the data source.
    */
  def addItem(item: js.Object): js.Object = js.native
  /**
    * Get reference to chart object.
    */
  def chart(): js.Object = js.native
  /**
    * Binds data to the chart
    */
  def dataBind(): Unit = js.native
  /**
    * Destroys widget.
    */
  def destroy(): Unit = js.native
  def exportVisualData(): Unit = js.native
  /**
    * Find index of item within actual data used by chart.
    *
    * @param item The reference to item.
    */
  def findIndexOfItem(item: js.Object): Double = js.native
  /**
    * Forces any pending deferred work to render on the chart before continuing
    */
  def flush(): Unit = js.native
  /**
    * Get reference of actual data used by chart.
    */
  def getData(): js.Array[_] = js.native
  /**
    * Get item within actual data used by chart. That is similar to this.getData()[ index ].
    *
    * @param index Index of data item.
    */
  def getDataItem(index: js.Object): js.Object = js.native
  /**
    * Inserts a new item to the data source and notifies the chart.
    *
    * @param item the new item that we want to insert in the data source.
    * @param index The index in the data source where the new item will be inserted.
    */
  def insertItem(item: js.Object, index: Double): js.Object = js.native
  /**
    * Checks if slice is selected.
    *
    * @param slice Index of slice or reference to slice-data-item.
    */
  def isSelected(slice: js.Object): Boolean = js.native
  /**
    * Notifies the chart that the items have been cleared from an associated data source.
    * It's not necessary to notify more than one target of a change if they share the same items source.
    *
    * @param dataSource The data source in which the change happened.
    */
  def notifyClearItems(dataSource: js.Object): js.Object = js.native
  /**
    * Notifies the target axis or series that an item has been inserted at the specified index in its data source.
    * It's not necessary to notify more than one target of a change if they share the same items source.
    *
    * @param dataSource The data source in which the change happened.
    * @param index The index in the items source where the new item has been inserted.
    * @param newItem the new item that has been set in the collection.
    */
  def notifyInsertItem(dataSource: js.Object, index: Double, newItem: js.Object): js.Object = js.native
  /**
    * Notifies the target axis or series that an item has been removed from the specified index in its data source.
    * It's not necessary to notify more than one target of a change if they share the same items source.
    *
    * @param dataSource The data source in which the change happened.
    * @param index The index in the items source from where the old item has been removed.
    * @param oldItem the old item that has been removed from the collection.
    */
  def notifyRemoveItem(dataSource: js.Object, index: Double, oldItem: js.Object): js.Object = js.native
  /**
    * Notifies the chart that an item has been set in an associated data source.
    *
    * @param dataSource The data source in which the change happened.
    * @param index The index in the items source that has been changed.
    * @param newItem the new item that has been set in the collection.
    * @param oldItem the old item that has been overwritten in the collection.
    */
  def notifySetItem(dataSource: js.Object, index: Double, newItem: js.Object, oldItem: js.Object): js.Object = js.native
  /**
    * Deletes an item from the data source and notifies the chart.
    *
    * @param index The index in the data source from where the item will be been removed.
    */
  def removeItem(index: Double): js.Object = js.native
  /**
    * Gets sets array of indexes of selected slices.
    *
    * @param selection Array or selected slice indexes.
    * @return array|object If parameter is undefined, then array of selected indexes is returned. Otherwise, it returns reference to igFunnelChart.
    */
  def selectedSliceIndexes(): js.Array[_] = js.native
  def selectedSliceIndexes(selection: js.Array[_]): js.Array[_] = js.native
  /**
    * Gets array of selected slice items.
    *
    * @param selection Array or selected slice items.
    * @return array|object If parameter is undefined, then array of selected items is returned. Otherwise, it returns reference to igFunnelChart.
    */
  def selectedSliceItems(): js.Array[_] = js.native
  def selectedSliceItems(selection: js.Array[_]): js.Array[_] = js.native
  /**
    * Updates an item in the data source and notifies the chart.
    *
    * @param index The index of the item in the data source that we want to change.
    * @param item The new item object that will be set in the data source.
    */
  def setItem(index: Double, item: js.Object): js.Object = js.native
  /**
    * Toggles selected state of slice.
    *
    * @param slice Index of slice or reference to slice-data-item.
    */
  def toggleSelection(slice: js.Object): js.Object = js.native
}

