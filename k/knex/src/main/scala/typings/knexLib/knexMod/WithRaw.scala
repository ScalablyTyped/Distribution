package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithRaw extends js.Object {
  def apply(alias: java.lang.String, raw: QueryBuilder): QueryBuilder = js.native
  def apply(alias: java.lang.String, raw: Raw): QueryBuilder = js.native
  def apply(alias: java.lang.String, sql: java.lang.String): QueryBuilder = js.native
  def apply(alias: java.lang.String, sql: java.lang.String, bindings: js.Array[Value]): QueryBuilder = js.native
  def apply(alias: java.lang.String, sql: java.lang.String, bindings: js.Object): QueryBuilder = js.native
}

