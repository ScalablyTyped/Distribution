package typings.kendoDashUi.kendo.dataviz.geometry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object SizeOptions {
  @scala.inline
  def apply(name: String = null): SizeOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SizeOptions]
  }
}

