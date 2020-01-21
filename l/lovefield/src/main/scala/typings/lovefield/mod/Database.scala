package typings.lovefield.mod

import typings.lovefield.mod.query.Delete
import typings.lovefield.mod.query.Insert
import typings.lovefield.mod.query.Select
import typings.lovefield.mod.query.Update
import typings.lovefield.mod.schema.Column
import typings.lovefield.mod.schema.Table
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
  def getSchema(): typings.lovefield.mod.schema.Database = js.native
  def `import`(data: js.Object): js.Promise[Unit] = js.native
  def insert(): Insert = js.native
  def insertOrReplace(): Insert = js.native
  def observe(query: Select, callback: js.Function): Unit = js.native
  def select(columns: Column*): Select = js.native
  def unobserve(query: Select, callback: js.Function): Unit = js.native
  def update(table: Table): Update = js.native
}

