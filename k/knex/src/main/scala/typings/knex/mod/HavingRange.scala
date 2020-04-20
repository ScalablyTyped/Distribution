package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HavingRange[TRecord, TResult] extends js.Object {
  def apply(columnName: String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def apply[K /* <: /* keyof TRecord */ String */](
    columnName: K,
    values: js.Array[
      DbColumn[
        /* import warning: importer.ImportType#apply Failed type conversion: TRecord[K] */ js.Any
      ]
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
}

