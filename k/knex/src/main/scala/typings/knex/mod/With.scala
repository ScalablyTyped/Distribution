package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait With[TRecord, TResult]
  extends WithRaw[TRecord, TResult]
     with WithWrapped[TRecord, TResult] {
  /* InferMemberOverrides */
  override def apply(alias: String, raw: QueryBuilder[_, _]): QueryBuilder[TRecord, TResult] = js.native
}

