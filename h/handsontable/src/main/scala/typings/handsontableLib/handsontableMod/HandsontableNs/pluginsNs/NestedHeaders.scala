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
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    checkForFixedColumnsCollision: js.Function0[scala.Unit],
    checkForOverlappingHeaders: js.Function0[scala.Unit],
    clearHooks: js.Function0[scala.Unit],
    colspanArray: js.Array[_],
    columnHeaderLevelCount: scala.Double,
    destroy: js.Function0[scala.Unit],
    disablePlugin: js.Function0[scala.Unit],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    fillColspanArrayWithDummies: js.Function2[scala.Double, scala.Double, scala.Unit],
    fillTheRemainingColspans: js.Function0[scala.Unit],
    getChildHeaders: js.Function2[scala.Double, scala.Double, js.Array[_]],
    getColspan: js.Function2[scala.Double, scala.Double, scala.Double],
    getNestedParent: js.Function2[scala.Double, scala.Double, js.Any],
    ghostTable: GhostTableNestedHeaders,
    headerRendererFactory: js.Function1[scala.Double, js.Function0[scala.Unit]],
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    levelToRowCoords: js.Function1[scala.Double, scala.Double],
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: js.Function1[java.lang.String, scala.Unit],
    rowCoordsToLevel: js.Function1[scala.Double, scala.Double],
    settings: js.Array[_],
    setupColspanArray: js.Function0[scala.Unit]
  ): NestedHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addHook")(addHook)
    __obj.updateDynamic("callOnPluginsReady")(callOnPluginsReady)
    __obj.updateDynamic("checkForFixedColumnsCollision")(checkForFixedColumnsCollision)
    __obj.updateDynamic("checkForOverlappingHeaders")(checkForOverlappingHeaders)
    __obj.updateDynamic("clearHooks")(clearHooks)
    __obj.updateDynamic("colspanArray")(colspanArray)
    __obj.updateDynamic("columnHeaderLevelCount")(columnHeaderLevelCount)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("disablePlugin")(disablePlugin)
    __obj.updateDynamic("enablePlugin")(enablePlugin)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("fillColspanArrayWithDummies")(fillColspanArrayWithDummies)
    __obj.updateDynamic("fillTheRemainingColspans")(fillTheRemainingColspans)
    __obj.updateDynamic("getChildHeaders")(getChildHeaders)
    __obj.updateDynamic("getColspan")(getColspan)
    __obj.updateDynamic("getNestedParent")(getNestedParent)
    __obj.updateDynamic("ghostTable")(ghostTable)
    __obj.updateDynamic("headerRendererFactory")(headerRendererFactory)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("initialized")(initialized)
    __obj.updateDynamic("isPluginsReady")(isPluginsReady)
    __obj.updateDynamic("levelToRowCoords")(levelToRowCoords)
    __obj.updateDynamic("pluginName")(pluginName)
    __obj.updateDynamic("pluginsInitializedCallback")(pluginsInitializedCallback)
    __obj.updateDynamic("removeHook")(removeHook)
    __obj.updateDynamic("rowCoordsToLevel")(rowCoordsToLevel)
    __obj.updateDynamic("settings")(settings)
    __obj.updateDynamic("setupColspanArray")(setupColspanArray)
    __obj.asInstanceOf[NestedHeaders]
  }
}

