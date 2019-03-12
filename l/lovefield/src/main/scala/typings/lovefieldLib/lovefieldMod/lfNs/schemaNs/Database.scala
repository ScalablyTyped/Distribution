package typings
package lovefieldLib.lovefieldMod.lfNs.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Database extends js.Object {
  def name(): java.lang.String
  def pragma(): DatabasePragma
  def table(tableName: java.lang.String): Table
  def tables(): js.Array[Table]
  def version(): scala.Double
}

object Database {
  @scala.inline
  def apply(
    name: () => java.lang.String,
    pragma: () => DatabasePragma,
    table: java.lang.String => Table,
    tables: () => js.Array[Table],
    version: () => scala.Double
  ): Database = {
    val __obj = js.Dynamic.literal(name = js.Any.fromFunction0(name), pragma = js.Any.fromFunction0(pragma), table = js.Any.fromFunction1(table), tables = js.Any.fromFunction0(tables), version = js.Any.fromFunction0(version))
  
    __obj.asInstanceOf[Database]
  }
}

