package typings.lovefield.lovefieldMod

import typings.lovefield.lovefieldMod.queryNs.Delete
import typings.lovefield.lovefieldMod.queryNs.Insert
import typings.lovefield.lovefieldMod.queryNs.Select
import typings.lovefield.lovefieldMod.queryNs.Update
import typings.lovefield.lovefieldMod.schemaNs.Column
import typings.lovefield.lovefieldMod.schemaNs.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  def close(): Unit = js.native
  def createTransaction(): Transaction = js.native
  def createTransaction(`type`: TransactionType): Transaction = js.native
  def delete(): Delete = js.native
  def export(): js.Promise[js.Object] = js.native
  def getSchema(): typings.lovefield.lovefieldMod.schemaNs.Database = js.native
  def `import`(data: js.Object): js.Promise[Unit] = js.native
  def insert(): Insert = js.native
  def insertOrReplace(): Insert = js.native
  def observe(query: Select, callback: js.Function): Unit = js.native
  def select(columns: Column*): Select = js.native
  def unobserve(query: Select, callback: js.Function): Unit = js.native
  def update(table: Table): Update = js.native
}

