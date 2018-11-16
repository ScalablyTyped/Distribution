package typings
package lovefieldLib.lovefieldMod.lfNs.rawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackStore extends js.Object {
  def addTableColumn(tableName: java.lang.String, columnName: java.lang.String, defaultValue: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def addTableColumn(tableName: java.lang.String, columnName: java.lang.String, defaultValue: scala.Boolean): stdLib.Promise[scala.Unit] = js.native
  def addTableColumn(tableName: java.lang.String, columnName: java.lang.String, defaultValue: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def addTableColumn(tableName: java.lang.String, columnName: java.lang.String, defaultValue: stdLib.ArrayBuffer): stdLib.Promise[scala.Unit] = js.native
  def addTableColumn(tableName: java.lang.String, columnName: java.lang.String, defaultValue: stdLib.Date): stdLib.Promise[scala.Unit] = js.native
  def createRow(payload: js.Object): lovefieldLib.lovefieldMod.lfNs.Row = js.native
  def dropTable(tableName: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def dropTableColumn(tableName: java.lang.String, columnName: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def dump(): js.Array[js.Object] = js.native
  def getRawDBInstance(): js.Any = js.native
  def getRawTransaction(): js.Any = js.native
  def getVersion(): scala.Double = js.native
  def renameTableColumn(tableName: java.lang.String, oldColumnName: java.lang.String, newColumnName: java.lang.String): stdLib.Promise[scala.Unit] = js.native
}

