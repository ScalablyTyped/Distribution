package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramExportImageOptions extends js.Object {
  var cors: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object DiagramExportImageOptions {
  @scala.inline
  def apply(cors: String = null, height: String = null, width: String = null): DiagramExportImageOptions = {
    val __obj = js.Dynamic.literal()
    if (cors != null) __obj.updateDynamic("cors")(cors)
    if (height != null) __obj.updateDynamic("height")(height)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[DiagramExportImageOptions]
  }
}

