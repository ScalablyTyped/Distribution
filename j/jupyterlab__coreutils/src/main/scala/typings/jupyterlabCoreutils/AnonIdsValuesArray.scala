package typings.jupyterlabCoreutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdsValuesArray extends js.Object {
  var ids: js.Array[String]
  var values: js.Array[String]
}

object AnonIdsValuesArray {
  @scala.inline
  def apply(ids: js.Array[String], values: js.Array[String]): AnonIdsValuesArray = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdsValuesArray]
  }
}

