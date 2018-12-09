package typings
package lovefieldLib.lovefieldMod.lfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  def close(): scala.Unit = js.native
  def createTransaction(): Transaction = js.native
  def createTransaction(`type`: TransactionType): Transaction = js.native
  def delete(): lovefieldLib.lovefieldMod.lfNs.queryNs.Delete = js.native
  def export(): js.Promise[js.Object] = js.native
  def getSchema(): lovefieldLib.lovefieldMod.lfNs.schemaNs.Database = js.native
  def `import`(data: js.Object): js.Promise[scala.Unit] = js.native
  def insert(): lovefieldLib.lovefieldMod.lfNs.queryNs.Insert = js.native
  def insertOrReplace(): lovefieldLib.lovefieldMod.lfNs.queryNs.Insert = js.native
  def observe(query: lovefieldLib.lovefieldMod.lfNs.queryNs.Select, callback: js.Function): scala.Unit = js.native
  def select(columns: lovefieldLib.lovefieldMod.lfNs.schemaNs.Column*): lovefieldLib.lovefieldMod.lfNs.queryNs.Select = js.native
  def unobserve(query: lovefieldLib.lovefieldMod.lfNs.queryNs.Select, callback: js.Function): scala.Unit = js.native
  def update(table: lovefieldLib.lovefieldMod.lfNs.schemaNs.Table): lovefieldLib.lovefieldMod.lfNs.queryNs.Update = js.native
}

