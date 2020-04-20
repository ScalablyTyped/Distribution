package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistinctOn[TRecord /* <: js.Object */, TResult] extends js.Object {
  def apply(columnNames: String*): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnNames: js.Array[String]): QueryBuilder[TRecord, TResult] = js.native
}

