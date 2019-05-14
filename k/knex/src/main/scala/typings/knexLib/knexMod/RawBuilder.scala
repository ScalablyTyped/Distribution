package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawBuilder extends js.Object {
  def apply(sql: java.lang.String, bindings: (Value | QueryBuilder)*): Raw = js.native
  def apply(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): Raw = js.native
  def apply(sql: java.lang.String, bindings: ValueMap): Raw = js.native
  def apply(value: Value): Raw = js.native
}

