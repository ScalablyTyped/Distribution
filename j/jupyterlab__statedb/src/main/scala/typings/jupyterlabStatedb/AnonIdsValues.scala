package typings.jupyterlabStatedb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdsValues extends js.Object {
  var ids: js.Array[String]
  var values: js.Array[String]
}

object AnonIdsValues {
  @scala.inline
  def apply(ids: js.Array[String], values: js.Array[String]): AnonIdsValues = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdsValues]
  }
}

