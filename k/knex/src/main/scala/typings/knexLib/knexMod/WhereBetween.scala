package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereBetween[TRecord, TResult] extends js.Object {
  def apply(columnName: java.lang.String, range: js.Tuple2[Value, Value]): WhereResult[TRecord, TResult] = js.native
  def apply[K /* <: java.lang.String */](
    columnName: K,
    range: js.Tuple2[
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): WhereResult[TRecord, TResult] = js.native
}

