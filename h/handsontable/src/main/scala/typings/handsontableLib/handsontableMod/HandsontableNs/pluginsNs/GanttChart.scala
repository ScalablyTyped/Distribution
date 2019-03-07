package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttChart extends Base {
  var colorData: js.Object = js.native
  var currentYear: scala.Double | scala.Unit = js.native
  var dataFeed: js.Object | scala.Unit = js.native
  var dateCalculator: js.Object | scala.Unit = js.native
  var hotSource: handsontableLib.handsontableMod.underscoreHandsontableNs.Core | scala.Unit = js.native
  var initialSettings: js.Object | scala.Unit = js.native
  var monthHeadersArray: js.Array[_] = js.native
  var monthList: js.Array[_] = js.native
  var nestedHeadersPlugin: NestedHeaders | scala.Unit = js.native
  var overallWeekSectionCount: scala.Double | scala.Unit = js.native
  var rangeBarMeta: js.Object | scala.Unit = js.native
  var rangeBars: js.Object = js.native
  var rangeList: js.Object = js.native
  var settings: js.Object = js.native
  var weekHeadersArray: js.Array[_] = js.native
  def addRangeBar(
    row: scala.Double,
    startDate: java.lang.String,
    endDate: java.lang.String,
    additionalData: js.Object
  ): scala.Boolean | js.Array[_] = js.native
  def addRangeBar(row: scala.Double, startDate: java.lang.String, endDate: stdLib.Date, additionalData: js.Object): scala.Boolean | js.Array[_] = js.native
  def addRangeBar(row: scala.Double, startDate: stdLib.Date, endDate: java.lang.String, additionalData: js.Object): scala.Boolean | js.Array[_] = js.native
  def addRangeBar(row: scala.Double, startDate: stdLib.Date, endDate: stdLib.Date, additionalData: js.Object): scala.Boolean | js.Array[_] = js.native
  def applyRangeBarMetaCache(): scala.Unit = js.native
  def cacheRangeBarMeta(row: scala.Double, col: scala.Double, key: java.lang.String, value: js.Any): scala.Unit = js.native
  def cacheRangeBarMeta(row: scala.Double, col: scala.Double, key: java.lang.String, value: js.Array[_]): scala.Unit = js.native
  def checkDependencies(): scala.Unit = js.native
  def getRangeBarCoordinates(row: scala.Double): js.Object = js.native
  def getRangeBarData(row: scala.Double, column: scala.Double): js.Object | scala.Boolean = js.native
  def removeAllRangeBars(): scala.Unit = js.native
  def removeRangeBarByColumn(row: scala.Double, startDateColumn: scala.Double): scala.Unit = js.native
  def removeRangeBarByDate(row: scala.Double, startDate: java.lang.String): scala.Unit = js.native
  def removeRangeBarByDate(row: scala.Double, startDate: stdLib.Date): scala.Unit = js.native
  def renderRangeBar(
    row: scala.Double,
    startDateColumn: scala.Double,
    endDateColumn: scala.Double,
    additionalData: js.Object
  ): scala.Unit = js.native
  def setRangeBarColors(rows: js.Object): scala.Unit = js.native
  def setYear(year: scala.Double): scala.Unit = js.native
  def uniformBackgroundRenderer(
    instance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    TD: stdLib.HTMLElement,
    row: scala.Double,
    col: scala.Double,
    prop: java.lang.String,
    value: java.lang.String,
    cellProperties: handsontableLib.handsontableMod.HandsontableNs.CellProperties
  ): scala.Unit = js.native
  def uniformBackgroundRenderer(
    instance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    TD: stdLib.HTMLElement,
    row: scala.Double,
    col: scala.Double,
    prop: java.lang.String,
    value: scala.Double,
    cellProperties: handsontableLib.handsontableMod.HandsontableNs.CellProperties
  ): scala.Unit = js.native
  def uniformBackgroundRenderer(
    instance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    TD: stdLib.HTMLElement,
    row: scala.Double,
    col: scala.Double,
    prop: scala.Double,
    value: java.lang.String,
    cellProperties: handsontableLib.handsontableMod.HandsontableNs.CellProperties
  ): scala.Unit = js.native
  def uniformBackgroundRenderer(
    instance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    TD: stdLib.HTMLElement,
    row: scala.Double,
    col: scala.Double,
    prop: scala.Double,
    value: scala.Double,
    cellProperties: handsontableLib.handsontableMod.HandsontableNs.CellProperties
  ): scala.Unit = js.native
  def unrenderRangeBar(row: scala.Double, startDateColumn: scala.Double, endDateColumn: scala.Double): scala.Unit = js.native
  def updateRangeBarData(row: scala.Double, column: scala.Double, data: js.Object): scala.Unit = js.native
}

