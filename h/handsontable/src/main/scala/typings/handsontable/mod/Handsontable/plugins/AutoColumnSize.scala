package typings.handsontable.mod.Handsontable.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoColumnSize extends Base {
  
  def calculateAllColumnsWidth(): Unit = js.native
  def calculateAllColumnsWidth(rowRange: js.Object): Unit = js.native
  def calculateAllColumnsWidth(rowRange: Double): Unit = js.native
  
  def calculateColumnsWidth(): Unit = js.native
  def calculateColumnsWidth(colRange: js.UndefOr[scala.Nothing], rowRange: js.UndefOr[scala.Nothing], force: Boolean): Unit = js.native
  def calculateColumnsWidth(colRange: js.UndefOr[scala.Nothing], rowRange: js.Object): Unit = js.native
  def calculateColumnsWidth(colRange: js.UndefOr[scala.Nothing], rowRange: js.Object, force: Boolean): Unit = js.native
  def calculateColumnsWidth(colRange: js.UndefOr[scala.Nothing], rowRange: Double): Unit = js.native
  def calculateColumnsWidth(colRange: js.UndefOr[scala.Nothing], rowRange: Double, force: Boolean): Unit = js.native
  def calculateColumnsWidth(colRange: js.Object): Unit = js.native
  def calculateColumnsWidth(colRange: js.Object, rowRange: js.UndefOr[scala.Nothing], force: Boolean): Unit = js.native
  def calculateColumnsWidth(colRange: js.Object, rowRange: js.Object): Unit = js.native
  def calculateColumnsWidth(colRange: js.Object, rowRange: js.Object, force: Boolean): Unit = js.native
  def calculateColumnsWidth(colRange: js.Object, rowRange: Double): Unit = js.native
  def calculateColumnsWidth(colRange: js.Object, rowRange: Double, force: Boolean): Unit = js.native
  def calculateColumnsWidth(colRange: Double): Unit = js.native
  def calculateColumnsWidth(colRange: Double, rowRange: js.UndefOr[scala.Nothing], force: Boolean): Unit = js.native
  def calculateColumnsWidth(colRange: Double, rowRange: js.Object): Unit = js.native
  def calculateColumnsWidth(colRange: Double, rowRange: js.Object, force: Boolean): Unit = js.native
  def calculateColumnsWidth(colRange: Double, rowRange: Double): Unit = js.native
  def calculateColumnsWidth(colRange: Double, rowRange: Double, force: Boolean): Unit = js.native
  
  def calculateVisibleColumnsWidth(): Unit = js.native
  
  def clearCache(): Unit = js.native
  def clearCache(columns: js.Array[_]): Unit = js.native
  
  def findColumnsWhereHeaderWasChanged(): js.Array[_] = js.native
  
  var firstCalculation: Boolean = js.native
  
  def getColumnWidth(col: Double): Double = js.native
  def getColumnWidth(col: Double, defaultWidth: js.UndefOr[scala.Nothing], keepMinimum: Boolean): Double = js.native
  def getColumnWidth(col: Double, defaultWidth: Double): Double = js.native
  def getColumnWidth(col: Double, defaultWidth: Double, keepMinimum: Boolean): Double = js.native
  
  def getFirstVisibleColumn(): Double = js.native
  
  def getLastVisibleColumn(): Double = js.native
  
  def getSyncCalculationLimit(): Double = js.native
  
  var ghostTable: GhostTable = js.native
  
  var inProgress: Boolean = js.native
  
  def isNeedRecalculate(): Boolean = js.native
  
  var measuredRows: Double = js.native
  
  def recalculateAllColumnsWidth(): Unit = js.native
  
  var samplesGenerator: SamplesGenerator = js.native
}
