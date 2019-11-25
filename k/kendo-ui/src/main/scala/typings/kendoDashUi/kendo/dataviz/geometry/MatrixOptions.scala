package typings.kendoDashUi.kendo.dataviz.geometry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatrixOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object MatrixOptions {
  @scala.inline
  def apply(name: String = null): MatrixOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatrixOptions]
  }
}

