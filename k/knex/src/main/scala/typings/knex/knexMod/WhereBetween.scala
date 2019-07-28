package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereBetween[TRecord, TResult] extends js.Object {
  def apply(columnName: String, range: js.Tuple2[Value, Value]): QueryBuilder[TRecord, TResult] = js.native
  def apply[K /* <: String */](
    columnName: K,
    range: js.Tuple2[
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
}

