package typings.lovefield.lovefieldMod.schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Builder extends js.Object {
  def connect(): js.Promise[typings.lovefield.lovefieldMod.schema.Database] = js.native
  def connect(options: ConnectOptions): js.Promise[typings.lovefield.lovefieldMod.schema.Database] = js.native
  def createTable(tableName: String): TableBuilder = js.native
  def getSchema(): typings.lovefield.lovefieldMod.schema.Database = js.native
  def setPragma(pragma: DatabasePragma): Unit = js.native
}

