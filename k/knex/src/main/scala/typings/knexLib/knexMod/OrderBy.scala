package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderBy[TRecord, TResult] extends js.Object {
  def apply(columnDefs: js.Array[knexLib.Anon_Asc[TRecord] | knexLib.Anon_Column | java.lang.String]): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: java.lang.String, order: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: java.lang.String, order: knexLib.knexLibStrings.asc): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: java.lang.String, order: knexLib.knexLibStrings.desc): QueryBuilder[TRecord, TResult] = js.native
}

