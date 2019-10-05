package typings.kendoDashUi.kendo.geometry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object ArcOptions {
  @scala.inline
  def apply(name: String = null): ArcOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ArcOptions]
  }
}

