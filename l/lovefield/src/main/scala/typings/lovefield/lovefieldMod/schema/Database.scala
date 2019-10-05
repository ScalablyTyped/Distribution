package typings.lovefield.lovefieldMod.schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Database extends js.Object {
  def name(): String
  def pragma(): DatabasePragma
  def table(tableName: String): Table
  def tables(): js.Array[Table]
  def version(): Double
}

object Database {
  @scala.inline
  def apply(
    name: () => String,
    pragma: () => DatabasePragma,
    table: String => Table,
    tables: () => js.Array[Table],
    version: () => Double
  ): Database = {
    val __obj = js.Dynamic.literal(name = js.Any.fromFunction0(name), pragma = js.Any.fromFunction0(pragma), table = js.Any.fromFunction1(table), tables = js.Any.fromFunction0(tables), version = js.Any.fromFunction0(version))
  
    __obj.asInstanceOf[Database]
  }
}

