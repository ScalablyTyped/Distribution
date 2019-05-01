package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// commons
@js.native
trait ColumnNameQueryBuilder extends js.Object {
  def apply(columnNames: ColumnName*): QueryBuilder = js.native
  def apply(columnNames: js.Array[ColumnName]): QueryBuilder = js.native
}

