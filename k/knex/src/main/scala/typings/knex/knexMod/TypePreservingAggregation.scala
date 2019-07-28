package typings.knex.knexMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypePreservingAggregation[TRecord, TResult, TValue] extends js.Object {
  def apply[TResult2](columnNames: ((Record[String, String | js.Array[String] | Raw[_]]) | Raw[_] | String)*): QueryBuilder[TRecord, TResult2] = js.native
  def apply[TAliases /* <: js.Object */, TResult2](aliases: TAliases): QueryBuilder[TRecord, TResult2] = js.native
}

