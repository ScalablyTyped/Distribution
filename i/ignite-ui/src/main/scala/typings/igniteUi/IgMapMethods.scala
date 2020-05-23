package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgMapMethods extends js.Object {
  /**
    * Adds a new item to the data source and notifies the map.
    *
    * @param item The item that we want to add to the data source.
    * @param targetName The name of the series bound to the data source.
    */
  def addItem(item: js.Object, targetName: String): Unit = js.native
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit = js.native
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit = js.native
  /**
    * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
    * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
    *
    * @param $container Optional parameter - if not set it would use the element of the widget as $container
    */
  def changeLocale($container: js.Object): Unit = js.native
  /**
    * Clears the tile zoom tile cache so that new tiles will be generated. Only applies if the viewer is using a tile based zoom..
    */
  def clearTileZoomCache(): Unit = js.native
  /**
    * Destroys the widget.
    */
  def destroy(): Unit = js.native
  /**
    * Manually ends a tiled zoom if one is running.
    */
  def endTiledZoomingIfRunning(): Unit = js.native
  /**
    * Exports the map to a PNG image.
    *
    * @param width The width of the image.
    * @param height The height of the image.
    */
  def exportImage(): js.Object = js.native
  def exportImage(width: js.Object): js.Object = js.native
  def exportImage(width: js.Object, height: js.Object): js.Object = js.native
  /**
    * Exports visual data from the map to aid in unit testing
    */
  def exportVisualData(): Unit = js.native
  /**
    * Forces any pending deferred work to render on the map before continuing
    */
  def flush(): Unit = js.native
  /**
    * Gets the actual maximum value of the target xAxis or yAxis
    *
    * @param targetName
    */
  def getActualMaximumValue(targetName: js.Object): Unit = js.native
  /**
    * Gets the actual minimum value of the target xAxis or yAxis
    *
    * @param targetName
    */
  def getActualMinimumValue(targetName: js.Object): Unit = js.native
  /**
    * Given the current plot area of the control and a geographic region, get the WindowRect that would encompass that geographic region.
    *
    * @param rect The geographic area rectangle.
    */
  def getGeographicFromZoom(rect: js.Object): js.Object = js.native
  /**
    * Given the current plot area of the control and a geographic region, get the WindowRect that would encompass that geographic region.
    *
    * @param rect The geographic area rectangle.
    */
  def getZoomFromGeographic(rect: js.Object): js.Object = js.native
  /**
    * Returns the ID of parent element holding the map.
    */
  def id(): String = js.native
  /**
    * Inserts a new item to the data source and notifies the map.
    *
    * @param item the new item that we want to insert in the data source.
    * @param index The index in the data source where the new item will be inserted.
    * @param targetName The name of the series bound to the data source.
    */
  def insertItem(item: js.Object, index: Double, targetName: String): Unit = js.native
  /**
    * Notifies the the map that the items have been cleared from an associated data source.
    *                 It's not necessary to notify more than one target of a change if they share the same items source.
    *
    * @param dataSource The data source in which the change happened.
    */
  def notifyClearItems(dataSource: js.Object): js.Object = js.native
  /**
    * Notifies the map that the container was resized
    */
  def notifyContainerResized(): Unit = js.native
  /**
    * Notifies the the target series that an item has been inserted at the specified index in its data source.
    *                 It's not necessary to notify more than one target of a change if they share the same items source.
    *
    * @param dataSource The data source in which the change happened.
    * @param index The index in the items source where the new item has been inserted.
    * @param newItem the new item that has been set in the collection.
    */
  def notifyInsertItem(dataSource: js.Object, index: Double, newItem: js.Object): js.Object = js.native
  /**
    * Notifies the the target series that an item has been removed from the specified index in its data source.
    *                 It's not necessary to notify more than one target of a change if they share the same items source.
    *
    * @param dataSource The data source in which the change happened.
    * @param index The index in the items source from where the old item has been removed.
    * @param oldItem the old item that has been removed from the collection.
    */
  def notifyRemoveItem(dataSource: js.Object, index: Double, oldItem: js.Object): js.Object = js.native
  /**
    * Notifies the the map that an item has been set in an associated data source.
    *
    * @param dataSource The data source in which the change happened.
    * @param index The index in the items source that has been changed.
    * @param newItem the new item that has been set in the collection.
    * @param oldItem the old item that has been overwritten in the collection.
    */
  def notifySetItem(dataSource: js.Object, index: Double, newItem: js.Object, oldItem: js.Object): js.Object = js.native
  def option(): Unit = js.native
  /**
    * Creates a print preview page with the map, hiding all other elements on the page.
    */
  def print(): Unit = js.native
  /**
    * Deletes an item from the data source and notifies the map.
    *
    * @param index The index in the data source from where the item will be been removed.
    * @param targetName The name of the series bound to the data source.
    */
  def removeItem(index: Double, targetName: String): Unit = js.native
  /**
    * Indicates that a series should render, even though no option has been modified that would normally cause it to refresh.
    *
    * @param targetName The name of the series to render.
    * @param animate Whether the change should be animated, if possible.
    */
  def renderSeries(targetName: String, animate: Boolean): Unit = js.native
  /**
    * Resets the zoom level of the map to default.
    */
  def resetZoom(): js.Object = js.native
  /**
    * Either xAxis or yAxis (longitude or latitude) that it should scale the requested value into map space from axis space.
    * For example you can use this method if you want to find where longitude 50 stands scaled to map's width.
    *
    * @param targetName Either xAxis or yAxis to notify.
    * @param unscaledValue The value in axis space to translate into map space.
    */
  def scaleValue(targetName: String, unscaledValue: Double): Double = js.native
  /**
    * Notifies the target series or axis that it should scroll the requested data item into view.
    *
    * @param targetName The name of the series or axis notify.
    * @param item The data item to bring into view, if possible.
    */
  def scrollIntoView(targetName: String, item: js.Object): js.Object = js.native
  /**
    * Updates an item in the data source and notifies the map.
    *
    * @param index The index of the item in the data source that we want to change.
    * @param item The new item object that will be set in the data source.
    * @param targetName The name of the series bound to the data source.
    */
  def setItem(index: Double, item: js.Object, targetName: String): Unit = js.native
  /**
    * Manually starts a tiled zoom if one isn't already running.
    */
  def startTiledZoomingIfNecessary(): Unit = js.native
  /**
    * Notify the map that styles it draws colors from may have been updated.
    */
  def styleUpdated(): js.Object = js.native
  /**
    * Either xAxis or yAxis (longitude or latitude) that it should unscale the requested value into axis space from map space.
    * For example you can use this method if you want to find what is the longitude unscaled from 0 width of the map.
    *
    * @param targetName Either xAxis or yAxis to notify.
    * @param scaledValue The value in map space to translate into axis space.
    */
  def unscaleValue(targetName: String, scaledValue: Double): Double = js.native
  /**
    * Zoom in to the geographic region specified, when possible (may need to wait fior map to be initialized).
    *
    * @param rect The geographic area rectangle.
    */
  def zoomToGeographic(rect: js.Object): js.Object = js.native
}

