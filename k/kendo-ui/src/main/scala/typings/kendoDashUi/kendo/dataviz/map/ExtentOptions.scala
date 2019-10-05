package typings.kendoDashUi.kendo.dataviz.map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtentOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object ExtentOptions {
  @scala.inline
  def apply(name: String = null): ExtentOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ExtentOptions]
  }
}

