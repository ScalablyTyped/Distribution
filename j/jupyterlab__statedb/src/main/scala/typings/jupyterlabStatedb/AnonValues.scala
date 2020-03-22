package typings.jupyterlabStatedb

import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValues[T /* <: ReadonlyPartialJSONValue */] extends js.Object {
  var ids: js.Array[String]
  var values: js.Array[T]
}

object AnonValues {
  @scala.inline
  def apply[T /* <: ReadonlyPartialJSONValue */](ids: js.Array[String], values: js.Array[T]): AnonValues[T] = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValues[T]]
  }
}

