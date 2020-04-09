package typings.jupyterlabUiComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIgnore extends js.Object {
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonIgnore {
  @scala.inline
  def apply(ignore: js.Array[String] = null): AnonIgnore = {
    val __obj = js.Dynamic.literal()
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnore]
  }
}

