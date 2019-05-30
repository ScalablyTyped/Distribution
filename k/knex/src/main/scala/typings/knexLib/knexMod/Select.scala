package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select[TRecord /* <: js.Object */, TResult]
  extends AliasQueryBuilder[TRecord, TResult]
     with ColumnNameQueryBuilder[TRecord, TResult] {
  def apply(): QueryBuilder[TRecord, TResult] = js.native
}

