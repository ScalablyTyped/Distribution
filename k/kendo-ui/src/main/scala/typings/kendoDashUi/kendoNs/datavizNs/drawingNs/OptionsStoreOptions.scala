package typings.kendoDashUi.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsStoreOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object OptionsStoreOptions {
  @scala.inline
  def apply(name: String = null): OptionsStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OptionsStoreOptions]
  }
}

