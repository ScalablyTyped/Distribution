package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypePreservingAggregation[TRecord, TResult, TValue] extends js.Object {
  def apply[TResult2](
    columnNames: ((stdLib.Record[java.lang.String, java.lang.String | js.Array[java.lang.String] | Raw[_]]) | Raw[_] | java.lang.String)*
  ): QueryBuilder[TRecord, TResult2] = js.native
  def apply[TAliases /* <: js.Object */, TResult2](aliases: TAliases): QueryBuilder[TRecord, TResult2] = js.native
}

