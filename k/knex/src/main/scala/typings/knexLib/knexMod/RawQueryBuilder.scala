package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawQueryBuilder extends js.Object {
  def apply(raw: Raw): QueryBuilder = js.native
  def apply(sql: java.lang.String, bindings: (Value | QueryBuilder)*): QueryBuilder = js.native
  def apply(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): QueryBuilder = js.native
  def apply(sql: java.lang.String, bindings: ValueMap): QueryBuilder = js.native
}

