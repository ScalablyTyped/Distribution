package typings
package juiDashGridLib.juiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridBase extends js.Object {
  def appendColumn(tplType: java.lang.String, dataList: js.Array[_]): scala.Unit = js.native
  def appendRow(index: java.lang.String): GridRow = js.native
  def appendRow(index: java.lang.String, data: js.Object): GridRow = js.native
  def appendRow(index: scala.Double): GridRow = js.native
  def appendRow(index: scala.Double, data: js.Object): GridRow = js.native
  def foldRow(index: java.lang.String): scala.Unit = js.native
  def foldRow(index: scala.Double): scala.Unit = js.native
  def foldRowAll(): scala.Unit = js.native
  def getColumn(): GridColumn | js.Array[GridColumn] = js.native
  def getColumn(index: java.lang.String): GridColumn | js.Array[GridColumn] = js.native
  def getColumn(index: scala.Double): GridColumn | js.Array[GridColumn] = js.native
  def getColumnCount(): scala.Double = js.native
  def getRow(): GridRow | js.Array[GridRow] = js.native
  def getRow(index: java.lang.String): GridRow | js.Array[GridRow] = js.native
  def getRow(index: scala.Double): GridRow | js.Array[GridRow] = js.native
  def getRowAll(index: java.lang.String): js.Array[GridRow] = js.native
  def getRowAll(index: scala.Double): js.Array[GridRow] = js.native
  def getRowCount(): scala.Double = js.native
  def getRowParent(index: java.lang.String): GridRow = js.native
  def getRowParent(index: scala.Double): GridRow = js.native
  def hideColumn(index: java.lang.String): scala.Unit = js.native
  def hideColumn(index: scala.Double): scala.Unit = js.native
  def insertRow(index: java.lang.String, data: js.Object): GridRow = js.native
  def insertRow(index: scala.Double, data: js.Object): GridRow = js.native
  def moveRow(index: java.lang.String, targetIndex: java.lang.String): scala.Unit = js.native
  def moveRow(index: java.lang.String, targetIndex: scala.Double): scala.Unit = js.native
  def moveRow(index: scala.Double, targetIndex: java.lang.String): scala.Unit = js.native
  def moveRow(index: scala.Double, targetIndex: scala.Double): scala.Unit = js.native
  def openRow(index: java.lang.String): scala.Unit = js.native
  def openRow(index: scala.Double): scala.Unit = js.native
  def openRowAll(): scala.Unit = js.native
  def removeColumn(index: java.lang.String): scala.Unit = js.native
  def removeColumn(index: scala.Double): scala.Unit = js.native
  def removeRow(index: java.lang.String): scala.Unit = js.native
  def removeRow(index: scala.Double): scala.Unit = js.native
  def removeRows(): scala.Unit = js.native
  def setColumn(index: java.lang.String, column: GridColumn): scala.Unit = js.native
  def setColumn(index: scala.Double, column: GridColumn): scala.Unit = js.native
  def setRow(index: java.lang.String, row: GridRow): scala.Unit = js.native
  def setRow(index: scala.Double, row: GridRow): scala.Unit = js.native
  def showColumn(index: java.lang.String): scala.Unit = js.native
  def showColumn(index: scala.Double): scala.Unit = js.native
  def sortRows(name: java.lang.String, isDesc: scala.Boolean): scala.Unit = js.native
  def updateRow(index: java.lang.String, data: js.Object): GridRow = js.native
  def updateRow(index: scala.Double, data: js.Object): GridRow = js.native
}

