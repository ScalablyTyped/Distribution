package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereRaw[TRecord, TResult] extends RawQueryBuilder[TRecord, TResult] {
  def apply(condition: scala.Boolean): QueryBuilder[TRecord, TResult] = js.native
}

