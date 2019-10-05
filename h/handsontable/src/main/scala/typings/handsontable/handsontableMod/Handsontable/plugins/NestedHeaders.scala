package typings.handsontable.handsontableMod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedHeaders extends Base {
  var colspanArray: js.Array[_]
  var columnHeaderLevelCount: Double
  var ghostTable: GhostTableNestedHeaders
  var settings: js.Array[_]
  def checkForFixedColumnsCollision(): Unit
  def checkForOverlappingHeaders(): Unit
  def fillColspanArrayWithDummies(colspan: Double, level: Double): Unit
  def fillTheRemainingColspans(): Unit
  def getChildHeaders(row: Double, column: Double): js.Array[_]
  def getColspan(row: Double, column: Double): Double
  def getNestedParent(level: Double, column: Double): js.Any
  def headerRendererFactory(headerRow: Double): js.Function0[Unit]
  def levelToRowCoords(level: Double): Double
  def rowCoordsToLevel(row: Double): Double
  def setupColspanArray(): Unit
}

object NestedHeaders {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    checkForFixedColumnsCollision: () => Unit,
    checkForOverlappingHeaders: () => Unit,
    clearHooks: () => Unit,
    colspanArray: js.Array[_],
    columnHeaderLevelCount: Double,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    fillColspanArrayWithDummies: (Double, Double) => Unit,
    fillTheRemainingColspans: () => Unit,
    getChildHeaders: (Double, Double) => js.Array[_],
    getColspan: (Double, Double) => Double,
    getNestedParent: (Double, Double) => js.Any,
    ghostTable: GhostTableNestedHeaders,
    headerRendererFactory: Double => js.Function0[Unit],
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    levelToRowCoords: Double => Double,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    rowCoordsToLevel: Double => Double,
    settings: js.Array[_],
    setupColspanArray: () => Unit
  ): NestedHeaders = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), checkForFixedColumnsCollision = js.Any.fromFunction0(checkForFixedColumnsCollision), checkForOverlappingHeaders = js.Any.fromFunction0(checkForOverlappingHeaders), clearHooks = js.Any.fromFunction0(clearHooks), colspanArray = colspanArray, columnHeaderLevelCount = columnHeaderLevelCount, destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, fillColspanArrayWithDummies = js.Any.fromFunction2(fillColspanArrayWithDummies), fillTheRemainingColspans = js.Any.fromFunction0(fillTheRemainingColspans), getChildHeaders = js.Any.fromFunction2(getChildHeaders), getColspan = js.Any.fromFunction2(getColspan), getNestedParent = js.Any.fromFunction2(getNestedParent), ghostTable = ghostTable, headerRendererFactory = js.Any.fromFunction1(headerRendererFactory), init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, levelToRowCoords = js.Any.fromFunction1(levelToRowCoords), pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks), rowCoordsToLevel = js.Any.fromFunction1(rowCoordsToLevel), settings = settings, setupColspanArray = js.Any.fromFunction0(setupColspanArray))
  
    __obj.asInstanceOf[NestedHeaders]
  }
}

