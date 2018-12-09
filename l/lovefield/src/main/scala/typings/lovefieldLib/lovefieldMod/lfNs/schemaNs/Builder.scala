package typings
package lovefieldLib.lovefieldMod.lfNs.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Builder extends js.Object {
  def connect(): js.Promise[lovefieldLib.lovefieldMod.lfNs.Database] = js.native
  def connect(options: ConnectOptions): js.Promise[lovefieldLib.lovefieldMod.lfNs.Database] = js.native
  def createTable(tableName: java.lang.String): TableBuilder = js.native
  def getSchema(): Database = js.native
  def setPragma(pragma: DatabasePragma): scala.Unit = js.native
}

