package typings
package atJupyterlabCoreutilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdsValues[T /* <: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue */] extends js.Object {
  var ids: js.Array[java.lang.String]
  var values: js.Array[T]
}

object Anon_IdsValues {
  @scala.inline
  def apply[T /* <: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue */](ids: js.Array[java.lang.String], values: js.Array[T]): Anon_IdsValues[T] = {
    val __obj = js.Dynamic.literal(ids = ids, values = values)
  
    __obj.asInstanceOf[Anon_IdsValues[T]]
  }
}

