package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramPannable extends js.Object {
  var key: js.UndefOr[String] = js.undefined
}

object DiagramPannable {
  @scala.inline
  def apply(key: String = null): DiagramPannable = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[DiagramPannable]
  }
}

