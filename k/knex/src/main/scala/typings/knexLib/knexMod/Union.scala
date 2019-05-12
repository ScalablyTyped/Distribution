package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Union[TRecord, TResult] extends js.Object {
  def apply(callback: QueryBuilder[TRecord, TResult]): QueryBuilder[TRecord, TResult] = js.native
  def apply(callback: QueryBuilder[TRecord, TResult], wrap: scala.Boolean): QueryBuilder[TRecord, TResult] = js.native
  def apply(callback: QueryCallback): QueryBuilder[TRecord, TResult] = js.native
  def apply(callback: QueryCallback, wrap: scala.Boolean): QueryBuilder[TRecord, TResult] = js.native
  def apply(callback: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def apply(callback: Raw[_], wrap: scala.Boolean): QueryBuilder[TRecord, TResult] = js.native
  def apply(callbacks: (QueryCallback | (QueryBuilder[TRecord, TResult]) | Raw[_])*): QueryBuilder[TRecord, TResult] = js.native
  def apply(callbacks: js.Array[QueryCallback | (QueryBuilder[TRecord, TResult]) | Raw[_]]): QueryBuilder[TRecord, TResult] = js.native
  def apply(
    callbacks: js.Array[QueryCallback | (QueryBuilder[TRecord, TResult]) | Raw[_]],
    wrap: scala.Boolean
  ): QueryBuilder[TRecord, TResult] = js.native
}

