package typings.kendoDashUi.kendo.geometry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object PointOptions {
  @scala.inline
  def apply(name: String = null): PointOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointOptions]
  }
}

