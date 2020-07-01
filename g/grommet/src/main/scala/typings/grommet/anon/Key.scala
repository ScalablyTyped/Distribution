package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var color: js.UndefOr[String | Color | js.Array[Value]] = js.undefined
  var key: String
}

object Key {
  @scala.inline
  def apply(key: String, color: String | Color | js.Array[Value] = null): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

