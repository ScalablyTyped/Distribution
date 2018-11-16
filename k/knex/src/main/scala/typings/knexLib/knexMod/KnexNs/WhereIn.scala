package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereIn extends js.Object {
  def apply(columnName: java.lang.String, values: js.Array[knexLib.Value]): QueryBuilder = js.native
  def apply(columnName: java.lang.String, values: QueryBuilder): QueryBuilder = js.native
  def apply(columnName: java.lang.String, values: QueryCallback): QueryBuilder = js.native
  def apply(columnNames: js.Array[java.lang.String], values: js.Array[js.Array[knexLib.Value]]): QueryBuilder = js.native
  def apply(columnNames: js.Array[java.lang.String], values: QueryBuilder): QueryBuilder = js.native
  def apply(columnNames: js.Array[java.lang.String], values: QueryCallback): QueryBuilder = js.native
}

