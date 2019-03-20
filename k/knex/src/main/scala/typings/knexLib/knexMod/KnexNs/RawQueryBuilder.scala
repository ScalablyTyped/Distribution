package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawQueryBuilder extends js.Object {
  def apply(raw: Raw): QueryBuilder = js.native
  def apply(sql: java.lang.String, bindings: (knexLib.Value | QueryBuilder)*): QueryBuilder = js.native
  def apply(sql: java.lang.String, bindings: js.Array[knexLib.Value | QueryBuilder]): QueryBuilder = js.native
  def apply(sql: java.lang.String, bindings: knexLib.ValueMap): QueryBuilder = js.native
}

