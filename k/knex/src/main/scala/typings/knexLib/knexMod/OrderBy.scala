package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderBy extends js.Object {
  def apply(columnDefs: js.Array[java.lang.String | knexLib.Anon_Column]): QueryBuilder = js.native
  def apply(columnName: java.lang.String): QueryBuilder = js.native
  def apply(columnName: java.lang.String, order: java.lang.String): QueryBuilder = js.native
}

