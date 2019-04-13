package typings
package lovefieldLib.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  def close(): scala.Unit = js.native
  def createTransaction(): Transaction = js.native
  def createTransaction(`type`: TransactionType): Transaction = js.native
  def delete(): lovefieldLib.lovefieldMod.queryNs.Delete = js.native
  def export(): js.Promise[js.Object] = js.native
  def getSchema(): lovefieldLib.lovefieldMod.schemaNs.Database = js.native
  def `import`(data: js.Object): js.Promise[scala.Unit] = js.native
  def insert(): lovefieldLib.lovefieldMod.queryNs.Insert = js.native
  def insertOrReplace(): lovefieldLib.lovefieldMod.queryNs.Insert = js.native
  def observe(query: lovefieldLib.lovefieldMod.queryNs.Select, callback: js.Function): scala.Unit = js.native
  def select(columns: lovefieldLib.lovefieldMod.schemaNs.Column*): lovefieldLib.lovefieldMod.queryNs.Select = js.native
  def unobserve(query: lovefieldLib.lovefieldMod.queryNs.Select, callback: js.Function): scala.Unit = js.native
  def update(table: lovefieldLib.lovefieldMod.schemaNs.Table): lovefieldLib.lovefieldMod.queryNs.Update = js.native
}

