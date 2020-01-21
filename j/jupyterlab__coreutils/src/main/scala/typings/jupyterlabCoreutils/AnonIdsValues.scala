package typings.jupyterlabCoreutils

import typings.phosphorCoreutils.jsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdsValues[T /* <: ReadonlyJSONValue */] extends js.Object {
  var ids: js.Array[String]
  var values: js.Array[T]
}

object AnonIdsValues {
  @scala.inline
  def apply[T /* <: ReadonlyJSONValue */](ids: js.Array[String], values: js.Array[T]): AnonIdsValues[T] = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdsValues[T]]
  }
}

