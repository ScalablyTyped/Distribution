package typings.kendoUi.kendo.dataviz.geometry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object TransformationOptions {
  @scala.inline
  def apply(name: String = null): TransformationOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformationOptions]
  }
}

