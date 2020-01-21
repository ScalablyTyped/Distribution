package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgDataChartMethods extends js.Object {
  /**
  	 * Adds a new item to the data source and notifies the chart.
  	 *
  	 * @param item The item that we want to add to the data source.
  	 * @param targetName The name of the series or axis bound to the data source. This is required only when the data is bound to series or axis. If the data is bound to dataSource of igDataChart, the second parameter should not be set.
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
  	 * Clears the tile zoom tile cache so that new tiles will be generated. Only applies if the viewer is using a tile based zoom.
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
  	 * Exports the chart to a PNG image.
  	 *
  	 * @param width The width of the image.
  	 * @param height The height of the image.
  	 */
  def exportImage(): js.Object = js.native
  def exportImage(width: js.Object): js.Object = js.native
  def exportImage(width: js.Object, height: js.Object): js.Object = js.native
  /**
  	 * Exports visual data from the chart to aid in unit testing
  	 */
  def exportVisualData(): Unit = js.native
  /**
  	 * Forces any pending deferred work to render on the chart before continuing
  	 */
  def flush(): Unit = js.native
  /**
  	 * Gets the actual interval of the target numeric or date time axis
  	 *
  	 * @param targetName The name of the axis from which to get the interval.
  	 */
  def getActualInterval(targetName: String): Unit = js.native
  /**
  	 * Gets the actual maximum value of the target numeric or date time axis
  	 *
  	 * @param targetName The name of the axis from which to get the maximum value.
  	 */
  def getActualMaximumValue(targetName: String): Unit = js.native
  /**
  	 * Gets the actual minimum value of the target numeric or date time axis
  	 *
  	 * @param targetName The name of the axis from which to get the minimum value.
  	 */
  def getActualMinimumValue(targetName: String): Unit = js.native
  /**
  	 * Gets the item that is the best match for the specified world coordinates.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param worldPoint The world position (in the form {x: [number from 0 to 1], y: [number from 0 to 1]} ) that represents a position in the space of the axes.
  	 */
  def getItem(targetName: String, worldPoint: js.Object): js.Object = js.native
  /**
  	 * Gets the item that is the best match for the specified world coordinates.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param seriesPoint The series pixel position (in the form {x: [number], y: [number]} ) that represents a position in the pixel space of the series.
  	 */
  def getItemFromSeriesPixel(targetName: String, seriesPoint: js.Object): js.Object = js.native
  /**
  	 * Gets the item item index associated with the specified world position.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param worldPoint The world position (in the form {x: [number from 0 to 1], y: [number from 0 to 1]} ) that represents a position in the space of the axes.
  	 */
  def getItemIndex(targetName: String, worldPoint: js.Object): Double = js.native
  /**
  	 * Gets the item item index associated with the specified series pixel coordinate.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param seriesPoint The world position (in the form {x: [number from 0 to 1], y: [number from 0 to 1]} ) that represents a position in the space of the axes.
  	 */
  def getItemIndexFromSeriesPixel(targetName: String, seriesPoint: js.Object): Double = js.native
  /**
  	 * For a category plotted series, gets the current width of the items within the categories. This only returns a value if the items have some form of width (e.g. columns, bars, etc.) otherwise 0 is returned.
  	 *
  	 * @param targetName The name of the series to target.
  	 */
  def getItemSpan(targetName: String): Double = js.native
  /**
  	 * Gets the category width for a series, if applicable.
  	 *
  	 * @param targetName The name of the series to target.
  	 */
  def getSeriesCategoryWidth(targetName: String): Double = js.native
  /**
  	 * If possible, will return the best available high value of the series for a given world coordinate.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param worldPoint The world position (in the form {x: [number from 0 to 1], y: [number from 0 to 1]} ) that represents a position in the space of the axes.
  	 * @param useInterpolation If true, interpolation should be used to get in-between values, rather than only the actual values in the data set.
  	 * @param skipUnknowns If true, unknown values should be skipped.
  	 */
  def getSeriesHighValue(targetName: String, worldPoint: js.Object, useInterpolation: Boolean, skipUnknowns: Boolean): Double = js.native
  /**
  	 * If possible, will return the best available high value of the series for a given world coordinate.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param seriesPoint The series pixel position (in the form {x: [number], y: [number]} ) that represents a position in the pixel space of the series.
  	 * @param useInterpolation If true, interpolation should be used to get in-between values, rather than only the actual values in the data set.
  	 * @param skipUnknowns If true, unknown values should be skipped.
  	 */
  def getSeriesHighValueFromSeriesPixel(targetName: String, seriesPoint: js.Object, useInterpolation: Boolean, skipUnknowns: Boolean): Double = js.native
  /**
  	 * If possible, will return the best available high value position of the series for a given world coordinate.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param worldPoint The world position (in the form {x: [number from 0 to 1], y: [number from 0 to 1]} ) that represents a position in the space of the axes.
  	 * @param useInterpolation If true, interpolation should be used to get in-between values, rather than only the actual values in the data set.
  	 * @param skipUnknowns If true, unknown values should be skipped.
  	 */
  def getSeriesHighValuePosition(targetName: String, worldPoint: js.Object, useInterpolation: Boolean, skipUnknowns: Boolean): js.Object = js.native
  /**
  	 * If possible, will return the best available high value position of the series for a given world coordinate.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param seriesPoint The series pixel position (in the form {x: [number], y: [number]} that represents a position within the pixel space of the series.
  	 * @param useInterpolation If true, interpolation should be used to get in-between values, rather than only the actual values in the data set.
  	 * @param skipUnknowns If true, unknown values should be skipped.
  	 */
  def getSeriesHighValuePositionFromSeriesPixel(targetName: String, seriesPoint: js.Object, useInterpolation: Boolean, skipUnknowns: Boolean): js.Object = js.native
  /**
  	 * If possible, will return the best available low value of the series for a given world coordinate.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param worldPoint The world position (in the form {x: [number from 0 to 1], y: [number from 0 to 1]} ) that represents a position in the space of the axes.
  	 * @param useInterpolation If true, interpolation should be used to get in-between values, rather than only the actual values in the data set.
  	 * @param skipUnknowns If true, unknown values should be skipped.
  	 */
  def getSeriesLowValue(targetName: String, worldPoint: js.Object, useInterpolation: Boolean, skipUnknowns: Boolean): Double = js.native
  /**
  	 * If possible, will return the best available low value of the series for a given world coordinate.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param seriesPoint The series pixel position (in the form {x: [number], y: [number]} ) that represents a position in the pixel space of the series.
  	 * @param useInterpolation If true, interpolation should be used to get in-between values, rather than only the actual values in the data set.
  	 * @param skipUnknowns If true, unknown values should be skipped.
  	 */
  def getSeriesLowValueFromSeriesPixel(targetName: String, seriesPoint: js.Object, useInterpolation: Boolean, skipUnknowns: Boolean): Double = js.native
  /**
  	 * If possible, will return the best available low value position of the series for a given world coordinate.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param worldPoint The world position (in the form {x: [number from 0 to 1], y: [number from 0 to 1]} ) that represents a position in the space of the axes.
  	 * @param useInterpolation If true, interpolation should be used to get in-between values, rather than only the actual values in the data set.
  	 * @param skipUnknowns If true, unknown values should be skipped.
  	 */
  def getSeriesLowValuePosition(targetName: String, worldPoint: js.Object, useInterpolation: Boolean, skipUnknowns: Boolean): js.Object = js.native
  /**
  	 * If possible, will return the best available low value position of the series for a given world coordinate.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param seriesPoint The series pixel position (in the form {x: [number], y: [number]} that represents a position within the pixel space of the series.
  	 * @param useInterpolation If true, interpolation should be used to get in-between values, rather than only the actual values in the data set.
  	 * @param skipUnknowns If true, unknown values should be skipped.
  	 */
  def getSeriesLowValuePositionFromSeriesPixel(targetName: String, seriesPoint: js.Object, useInterpolation: Boolean, skipUnknowns: Boolean): js.Object = js.native
  /**
  	 * Gets the category offset for a series, if applicable.
  	 *
  	 * @param targetName The name of the series to target.
  	 */
  def getSeriesOffsetValue(targetName: String): Double = js.native
  /**
  	 * If possible, will return the best available main value of the series for a given world coordinate.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param worldPoint The world position (in the form {x: [number from 0 to 1], y: [number from 0 to 1]} ) that represents a position in the space of the axes.
  	 * @param useInterpolation If true, interpolation should be used to get in-between values, rather than only the actual values in the data set.
  	 * @param skipUnknowns If true, unknown values should be skipped.
  	 */
  def getSeriesValue(targetName: String, worldPoint: js.Object, useInterpolation: Boolean, skipUnknowns: Boolean): Double = js.native
  /**
  	 * If possible, will return the best available value bounding box within the series that has the best value match for the world position provided.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param worldPoint The world position (in the form {x: [number from 0 to 1], y: [number from 0 to 1]} ) that represents a position in the space of the axes.
  	 */
  def getSeriesValueBoundingBox(targetName: String, worldPoint: js.Object): js.Object = js.native
  /**
  	 * If possible, will return the best available value bounding box within the series that has the best value match for the given series pixel coordinate.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param seriesPoint The series pixel position (in the form {x: [number], y: [number]} ) that represents a position in the pixel space of the series.
  	 */
  def getSeriesValueBoundingBoxFromSeriesPixel(targetName: String, seriesPoint: js.Object): js.Object = js.native
  /**
  	 * If possible, will return the best available value fine grained bounding boxes within the series that have the best value match for the world position provided.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param worldPoint The world position (in the form {x: [number from 0 to 1], y: [number from 0 to 1]} ) that represents a position in the space of the axes.
  	 */
  def getSeriesValueFineGrainedBoundingBoxes(targetName: String, worldPoint: js.Object): js.Object = js.native
  /**
  	 * If possible, will return the best available value fine grained bounding boxes within the series that have the best value match for series pixel position provided.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param worldPoint The series pixel position (in the form {x: [number], y: [number]} ) that represents a position in the pixel space of the series.
  	 */
  def getSeriesValueFineGrainedBoundingBoxesFromSeriesPixel(targetName: String, worldPoint: js.Object): js.Object = js.native
  /**
  	 * If possible, will return the best available main value of the series for a given world coordinate.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param seriesPoint The series pixel position (in the form {x: [number], y: [number]} ) that represents a position in the pixel space of the series.
  	 * @param useInterpolation If true, interpolation should be used to get in-between values, rather than only the actual values in the data set.
  	 * @param skipUnknowns If true, unknown values should be skipped.
  	 */
  def getSeriesValueFromSeriesPixel(targetName: String, seriesPoint: js.Object, useInterpolation: Boolean, skipUnknowns: Boolean): Double = js.native
  /**
  	 * If possible, will return the best available main value position of the series for a given world coordinate.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param worldPoint The world position (in the form {x: [number from 0 to 1], y: [number from 0 to 1]} ) that represents a position in the space of the axes.
  	 * @param useInterpolation If true, interpolation should be used to get in-between values, rather than only the actual values in the data set.
  	 * @param skipUnknowns If true, unknown values should be skipped.
  	 */
  def getSeriesValuePosition(targetName: String, worldPoint: js.Object, useInterpolation: Boolean, skipUnknowns: Boolean): js.Object = js.native
  /**
  	 * If possible, will return the best available main value position of the series for a given world coordinate.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param seriesPoint The series pixel position (in the form {x: [number], y: [number]} that represents a position within the pixel space of the series.
  	 * @param useInterpolation If true, interpolation should be used to get in-between values, rather than only the actual values in the data set.
  	 * @param skipUnknowns If true, unknown values should be skipped.
  	 */
  def getSeriesValuePositionFromSeriesPixel(targetName: String, seriesPoint: js.Object, useInterpolation: Boolean, skipUnknowns: Boolean): js.Object = js.native
  /**
  	 * Returns the ID of parent element holding the chart.
  	 */
  def id(): String = js.native
  /**
  	 * Inserts a new item to the data source and notifies the chart.
  	 *
  	 * @param item the new item that we want to insert in the data source.
  	 * @param index The index in the data source where the new item will be inserted.
  	 * @param targetName The name of the series or axis bound to the data source.
  	 */
  def insertItem(item: js.Object, index: Double, targetName: String): Unit = js.native
  /**
  	 * Moves the cursor point of the target annotation layer to the desired world coordinates.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param worldPoint The point to which to move the cursor. Should have an x property with type number and a y property with type number.
  	 */
  def moveCursorPoint(targetName: String, worldPoint: js.Object): js.Object = js.native
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
  	 * Notifies the target series that something that affects its visual properties has changed and the visual output needs a repaint.
  	 *
  	 * @param targetName The name of the series to notify.
  	 */
  def notifyVisualPropertiesChanged(targetName: String): js.Object = js.native
  def option(): Unit = js.native
  /**
  	 * Creates a print preview page with the chart, hiding all other elements on the page.
  	 */
  def print(): Unit = js.native
  /**
  	 * Deletes an item from the data source and notifies the chart.
  	 *
  	 * @param index The index in the data source from where the item will be been removed.
  	 * @param targetName The name of the series or axis bound to the data source. This is required only when the data is bound to series or axis. If the data is bound to dataSource of igDataChart, the second parameter should not be set.
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
  	 * Replays the transition in animation for a series, if applicable.
  	 *
  	 * @param targetName The name of the series to target.
  	 */
  def replayTransitionIn(targetName: String): js.Object = js.native
  /**
  	 * For the target axis, if using enhanced interval management and precise interval fitting, this will reset the cached maximum label width, and recalculate using the current labels.
  	 *
  	 * @param targetName The name of the axis to notify.
  	 */
  def resetCachedEnhancedInterval(targetName: String): js.Object = js.native
  /**
  	 * Resets the zoom level of the chart to default.
  	 */
  def resetZoom(): js.Object = js.native
  /**
  	 * Notifies the target axis that it should scale the requested value into chart space from axis space.
  	 * For example you can use this method if you want to find where value 50 of the x axis stands scaled to chart's width.
  	 *
  	 * @param targetName The name of the axis to notify.
  	 * @param unscaledValue The value in axis space to translate into chart space.
  	 */
  def scaleValue(targetName: String, unscaledValue: Double): Double = js.native
  /**
  	 * Notifies the target axis or series that it should scroll the requested data item into view.
  	 *
  	 * @param targetName The name of the axis or series notify.
  	 * @param item The data item to bring into view, if possible.
  	 */
  def scrollIntoView(targetName: String, item: js.Object): js.Object = js.native
  /**
  	 * Updates an item in the data source and notifies the chart.
  	 *
  	 * @param index The index of the item in the data source that we want to change.
  	 * @param item The new item object that will be set in the data source.
  	 * @param targetName The name of the series or axis bound to the data source.
  	 */
  def setItem(index: Double, item: js.Object, targetName: String): Unit = js.native
  /**
  	 * Simulates a hover interaction over a given point in the viewport of a series.
  	 *
  	 * @param targetName The name of the series to target.
  	 * @param seriesPoint The point at which to hover. Should have an x property with type number and a y property with type number.
  	 */
  def simulateHover(targetName: String, seriesPoint: js.Object): js.Object = js.native
  /**
  	 * Manually starts a tiled zoom if one isn't already running.
  	 */
  def startTiledZoomingIfNecessary(): Unit = js.native
  /**
  	 * Notify the chart that styles it draws colors from may have been updated.
  	 */
  def styleUpdated(): js.Object = js.native
  /**
  	 * Notifies the target axis that it should unscale the requested value into axis space from chart space.
  	 * For example you can use this method if you want to find what is the value of x axis unscaled from 0 width of the chart.
  	 *
  	 * @param targetName The name of the axis to notify.
  	 * @param scaledValue The value in chart space to translate into axis space.
  	 */
  def unscaleValue(targetName: String, scaledValue: Double): Double = js.native
  /**
  	 * Returns the element holding the chart.
  	 */
  def widget(): Unit = js.native
}

