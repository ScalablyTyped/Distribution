package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table[TRecord /* <: js.Object */, TResult /* <: js.Object */] extends js.Object {
  def apply[TRecord2, TResult2](callback: js.Function): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TRecord2, TResult2](raw: Raw[_]): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TRecord2, TResult2](tableName: Identifier): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TRecord2, TResult2](tableName: TableName): QueryBuilder[TRecord2, TResult2] = js.native
}

