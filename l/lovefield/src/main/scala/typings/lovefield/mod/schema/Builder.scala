package typings.lovefield.mod.schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Builder extends js.Object {
  def connect(): js.Promise[Database] = js.native
  def connect(options: ConnectOptions): js.Promise[Database] = js.native
  def createTable(tableName: String): TableBuilder = js.native
  def getSchema(): Database = js.native
  def setPragma(pragma: DatabasePragma): Unit = js.native
}

