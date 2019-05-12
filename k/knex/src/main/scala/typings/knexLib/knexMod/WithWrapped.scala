package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithWrapped[TRecordOuter, TResultOuter] extends js.Object {
  def apply[TRecordInner, TResultInner](
    alias: java.lang.String,
    callback: js.Function1[/* queryBuilder */ QueryBuilder[TRecordInner, TResultInner], _]
  ): QueryBuilder[TRecordOuter, TResultOuter] = js.native
  def apply[TRecordInner, TResultInner](alias: java.lang.String, queryBuilder: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecordOuter, TResultOuter] = js.native
}

