package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawBuilder[TRecord /* <: js.Object */, TResult] extends js.Object {
  def apply[TResult2](sql: String, bindings: RawBinding*): Raw[TResult2] = js.native
  def apply[TResult2](sql: String, bindings: js.Array[RawBinding]): Raw[TResult2] = js.native
  def apply[TResult2](sql: String, bindings: ValueDict): Raw[TResult2] = js.native
  def apply[TResult2](value: Value): Raw[TResult2] = js.native
}

