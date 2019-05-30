package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HavingRange[TRecord, TResult] extends js.Object {
  def apply(columnName: java.lang.String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def apply[K /* <: java.lang.String */](
    columnName: K,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: TRecord[K] */ js.Any]
  ): QueryBuilder[TRecord, TResult] = js.native
}

