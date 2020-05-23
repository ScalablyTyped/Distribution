package typings.jupyterlabUiComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ignore extends js.Object {
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
}

object Ignore {
  @scala.inline
  def apply(ignore: js.Array[String] = null): Ignore = {
    val __obj = js.Dynamic.literal()
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ignore]
  }
}

