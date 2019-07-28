package typings.juiDashGrid.juiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridBase extends js.Object {
  def appendColumn(tplType: String, dataList: js.Array[_]): Unit = js.native
  def appendRow(index: String): GridRow = js.native
  def appendRow(index: String, data: js.Object): GridRow = js.native
  def appendRow(index: Double): GridRow = js.native
  def appendRow(index: Double, data: js.Object): GridRow = js.native
  def foldRow(index: String): Unit = js.native
  def foldRow(index: Double): Unit = js.native
  def foldRowAll(): Unit = js.native
  def getColumn(): GridColumn | js.Array[GridColumn] = js.native
  def getColumn(index: String): GridColumn | js.Array[GridColumn] = js.native
  def getColumn(index: Double): GridColumn | js.Array[GridColumn] = js.native
  def getColumnCount(): Double = js.native
  def getRow(): GridRow | js.Array[GridRow] = js.native
  def getRow(index: String): GridRow | js.Array[GridRow] = js.native
  def getRow(index: Double): GridRow | js.Array[GridRow] = js.native
  def getRowAll(index: String): js.Array[GridRow] = js.native
  def getRowAll(index: Double): js.Array[GridRow] = js.native
  def getRowCount(): Double = js.native
  def getRowParent(index: String): GridRow = js.native
  def getRowParent(index: Double): GridRow = js.native
  def hideColumn(index: String): Unit = js.native
  def hideColumn(index: Double): Unit = js.native
  def insertRow(index: String, data: js.Object): GridRow = js.native
  def insertRow(index: Double, data: js.Object): GridRow = js.native
  def moveRow(index: String, targetIndex: String): Unit = js.native
  def moveRow(index: String, targetIndex: Double): Unit = js.native
  def moveRow(index: Double, targetIndex: String): Unit = js.native
  def moveRow(index: Double, targetIndex: Double): Unit = js.native
  def openRow(index: String): Unit = js.native
  def openRow(index: Double): Unit = js.native
  def openRowAll(): Unit = js.native
  def removeColumn(index: String): Unit = js.native
  def removeColumn(index: Double): Unit = js.native
  def removeRow(index: String): Unit = js.native
  def removeRow(index: Double): Unit = js.native
  def removeRows(): Unit = js.native
  def setColumn(index: String, column: GridColumn): Unit = js.native
  def setColumn(index: Double, column: GridColumn): Unit = js.native
  def setRow(index: String, row: GridRow): Unit = js.native
  def setRow(index: Double, row: GridRow): Unit = js.native
  def showColumn(index: String): Unit = js.native
  def showColumn(index: Double): Unit = js.native
  def sortRows(name: String, isDesc: Boolean): Unit = js.native
  def updateRow(index: String, data: js.Object): GridRow = js.native
  def updateRow(index: Double, data: js.Object): GridRow = js.native
}

