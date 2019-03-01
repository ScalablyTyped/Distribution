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
    name: js.Function0[java.lang.String],
    pragma: js.Function0[DatabasePragma],
    table: js.Function1[java.lang.String, Table],
    tables: js.Function0[js.Array[Table]],
    version: js.Function0[scala.Double]
  ): Database = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pragma")(pragma)
    __obj.updateDynamic("table")(table)
    __obj.updateDynamic("tables")(tables)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Database]
  }
}

