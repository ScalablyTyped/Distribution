package typings.kendoDashUi.kendoNs.datavizNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object LocationOptions {
  @scala.inline
  def apply(name: String = null): LocationOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[LocationOptions]
  }
}

