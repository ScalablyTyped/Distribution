package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithRaw[TRecordOuter, TResultOuter] extends js.Object {
  def apply[TRecordInner, TResultInner](alias: java.lang.String, raw: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecordOuter, TResultOuter] = js.native
  def apply[TRecordInner, TResultInner](alias: java.lang.String, raw: Raw[_]): QueryBuilder[TRecordOuter, TResultOuter] = js.native
  def apply[TRecordInner, TResultInner](alias: java.lang.String, sql: java.lang.String): QueryBuilder[TRecordOuter, TResultOuter] = js.native
  def apply[TRecordInner, TResultInner](alias: java.lang.String, sql: java.lang.String, bindings: js.Array[Value]): QueryBuilder[TRecordOuter, TResultOuter] = js.native
  def apply[TRecordInner, TResultInner](alias: java.lang.String, sql: java.lang.String, bindings: js.Object): QueryBuilder[TRecordOuter, TResultOuter] = js.native
}

