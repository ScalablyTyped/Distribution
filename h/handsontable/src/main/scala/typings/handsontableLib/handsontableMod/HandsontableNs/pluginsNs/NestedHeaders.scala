package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedHeaders extends Base {
  var colspanArray: js.Array[_]
  var columnHeaderLevelCount: scala.Double
  var ghostTable: GhostTableNestedHeaders
  var settings: js.Array[_]
  def checkForFixedColumnsCollision(): scala.Unit
  def checkForOverlappingHeaders(): scala.Unit
  def fillColspanArrayWithDummies(colspan: scala.Double, level: scala.Double): scala.Unit
  def fillTheRemainingColspans(): scala.Unit
  def getChildHeaders(row: scala.Double, column: scala.Double): js.Array[_]
  def getColspan(row: scala.Double, column: scala.Double): scala.Double
  def getNestedParent(level: scala.Double, column: scala.Double): js.Any
  def headerRendererFactory(headerRow: scala.Double): js.Function0[scala.Unit]
  def levelToRowCoords(level: scala.Double): scala.Double
  def rowCoordsToLevel(row: scala.Double): scala.Double
  def setupColspanArray(): scala.Unit
}

object NestedHeaders {
  @scala.inline
  def apply(
    addHook: (java.lang.String, js.Function0[scala.Unit]) => scala.Unit,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    checkForFixedColumnsCollision: () => scala.Unit,
    checkForOverlappingHeaders: () => scala.Unit,
    clearHooks: () => scala.Unit,
    colspanArray: js.Array[_],
    columnHeaderLevelCount: scala.Double,
    destroy: () => scala.Unit,
    disablePlugin: () => scala.Unit,
    enablePlugin: () => scala.Unit,
    enabled: scala.Boolean,
    fillColspanArrayWithDummies: (scala.Double, scala.Double) => scala.Unit,
    fillTheRemainingColspans: () => scala.Unit,
    getChildHeaders: (scala.Double, scala.Double) => js.Array[_],
    getColspan: (scala.Double, scala.Double) => scala.Double,
    getNestedParent: (scala.Double, scala.Double) => js.Any,
    ghostTable: GhostTableNestedHeaders,
    headerRendererFactory: scala.Double => js.Function0[scala.Unit],
    init: () => scala.Unit,
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    levelToRowCoords: scala.Double => scala.Double,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: java.lang.String => scala.Unit,
    rowCoordsToLevel: scala.Double => scala.Double,
    settings: js.Array[_],
    setupColspanArray: () => scala.Unit
  ): NestedHeaders = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), checkForFixedColumnsCollision = js.Any.fromFunction0(checkForFixedColumnsCollision), checkForOverlappingHeaders = js.Any.fromFunction0(checkForOverlappingHeaders), clearHooks = js.Any.fromFunction0(clearHooks), colspanArray = colspanArray, columnHeaderLevelCount = columnHeaderLevelCount, destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, fillColspanArrayWithDummies = js.Any.fromFunction2(fillColspanArrayWithDummies), fillTheRemainingColspans = js.Any.fromFunction0(fillTheRemainingColspans), getChildHeaders = js.Any.fromFunction2(getChildHeaders), getColspan = js.Any.fromFunction2(getColspan), getNestedParent = js.Any.fromFunction2(getNestedParent), ghostTable = ghostTable, headerRendererFactory = js.Any.fromFunction1(headerRendererFactory), init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, levelToRowCoords = js.Any.fromFunction1(levelToRowCoords), pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = js.Any.fromFunction1(removeHook), rowCoordsToLevel = js.Any.fromFunction1(rowCoordsToLevel), settings = settings, setupColspanArray = js.Any.fromFunction0(setupColspanArray))
  
    __obj.asInstanceOf[NestedHeaders]
  }
}

