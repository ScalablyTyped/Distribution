package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawBuilder extends js.Object {
  def apply(sql: java.lang.String, bindings: (knexLib.Value | QueryBuilder)*): Raw = js.native
  def apply(sql: java.lang.String, bindings: js.Array[knexLib.Value | QueryBuilder]): Raw = js.native
  def apply(sql: java.lang.String, bindings: knexLib.ValueMap): Raw = js.native
  def apply(value: knexLib.Value): Raw = js.native
}

