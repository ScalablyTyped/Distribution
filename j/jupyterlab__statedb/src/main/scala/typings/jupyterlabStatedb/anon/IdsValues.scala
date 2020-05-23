package typings.jupyterlabStatedb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdsValues extends js.Object {
  var ids: js.Array[String]
  var values: js.Array[String]
}

object IdsValues {
  @scala.inline
  def apply(ids: js.Array[String], values: js.Array[String]): IdsValues = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdsValues]
  }
}

