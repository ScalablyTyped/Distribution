package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupBy[TRecord, TResult]
  extends RawQueryBuilder[TRecord, TResult]
     with ColumnNameQueryBuilder[TRecord, TResult]

