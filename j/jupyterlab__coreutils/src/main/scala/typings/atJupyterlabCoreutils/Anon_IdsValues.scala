package typings.atJupyterlabCoreutils

import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdsValues[T /* <: ReadonlyJSONValue */] extends js.Object {
  var ids: js.Array[String]
  var values: js.Array[T]
}

object Anon_IdsValues {
  @scala.inline
  def apply[T /* <: ReadonlyJSONValue */](ids: js.Array[String], values: js.Array[T]): Anon_IdsValues[T] = {
    val __obj = js.Dynamic.literal(ids = ids, values = values)
  
    __obj.asInstanceOf[Anon_IdsValues[T]]
  }
}

