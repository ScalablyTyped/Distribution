package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Intersect[TRecord, TResult] extends js.Object {
  def apply(callback: MaybeArray[(QueryCallback[_, js.Array[_]]) | (QueryBuilder[TRecord, _]) | Raw[_]]): QueryBuilder[TRecord, TResult] = js.native
  def apply(
    callback: MaybeArray[(QueryCallback[_, js.Array[_]]) | (QueryBuilder[TRecord, _]) | Raw[_]],
    wrap: scala.Boolean
  ): QueryBuilder[TRecord, TResult] = js.native
  def apply(callbacks: ((QueryCallback[_, js.Array[_]]) | Raw[_] | (QueryBuilder[TRecord, _]))*): QueryBuilder[TRecord, TResult] = js.native
}

