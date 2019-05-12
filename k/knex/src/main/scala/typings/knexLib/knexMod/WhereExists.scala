package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereExists[TRecord, TResult] extends js.Object {
  def apply(callback: QueryCallback): QueryBuilder[TRecord, TResult] = js.native
  def apply[TRecordInner, TResultInner](query: QueryBuilder[TRecordInner, TResultInner]): WhereResult[TRecord, TResult] = js.native
}

