package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait With[TRecordOuter, TResultOuter]
  extends WithRaw[TRecordOuter, TResultOuter]
     with WithWrapped[TRecordOuter, TResultOuter] {
  /* InferMemberOverrides */
  override def apply[TRecordInner, TResultInner](alias: java.lang.String, raw: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecordOuter, TResultOuter] = js.native
}

