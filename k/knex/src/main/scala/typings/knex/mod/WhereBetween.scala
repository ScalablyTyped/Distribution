package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereBetween[TRecord, TResult] extends js.Object {
  def apply(columnName: String, range: js.Tuple2[Value, Value]): QueryBuilder[TRecord, TResult] = js.native
  def apply[K /* <: /* keyof TRecord */ String */](
    columnName: K,
    range: js.Tuple2[
      DbColumn[
        /* import warning: importer.ImportType#apply Failed type conversion: TRecord[K] */ js.Any
      ], 
      DbColumn[
        /* import warning: importer.ImportType#apply Failed type conversion: TRecord[K] */ js.Any
      ]
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
}

