package typings.jupyterlabUiComponents

import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.div
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDivSpan extends js.Object {
  var tag: js.UndefOr[span | div] = js.undefined
}

object AnonDivSpan {
  @scala.inline
  def apply(tag: span | div = null): AnonDivSpan = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDivSpan]
  }
}

