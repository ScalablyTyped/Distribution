package typings.lovefield.lovefieldMod.rawNs

import typings.lovefield.lovefieldMod.Row
import typings.std.ArrayBuffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackStore extends js.Object {
  def addTableColumn(tableName: String, columnName: String, defaultValue: String): js.Promise[Unit] = js.native
  def addTableColumn(tableName: String, columnName: String, defaultValue: Boolean): js.Promise[Unit] = js.native
  def addTableColumn(tableName: String, columnName: String, defaultValue: Double): js.Promise[Unit] = js.native
  def addTableColumn(tableName: String, columnName: String, defaultValue: ArrayBuffer): js.Promise[Unit] = js.native
  def addTableColumn(tableName: String, columnName: String, defaultValue: Date): js.Promise[Unit] = js.native
  def createRow(payload: js.Object): Row = js.native
  def dropTable(tableName: String): js.Promise[Unit] = js.native
  def dropTableColumn(tableName: String, columnName: String): js.Promise[Unit] = js.native
  def dump(): js.Array[js.Object] = js.native
  def getRawDBInstance(): js.Any = js.native
  def getRawTransaction(): js.Any = js.native
  def getVersion(): Double = js.native
  def renameTableColumn(tableName: String, oldColumnName: String, newColumnName: String): js.Promise[Unit] = js.native
}

