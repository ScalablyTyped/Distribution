package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawBuilder extends js.Object {
  def apply[TResult](sql: java.lang.String, bindings: Value*): Raw[TResult] = js.native
  def apply[TResult](sql: java.lang.String, bindings: js.Array[Value]): Raw[TResult] = js.native
  def apply[TResult](sql: java.lang.String, bindings: ValueMap): Raw[TResult] = js.native
  def apply[TResult](value: Value): Raw[TResult] = js.native
}

