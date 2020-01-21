package typings.jupyterlabUiComponents

import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.div
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDiv extends js.Object {
  var tag: js.UndefOr[div | span] = js.undefined
}

object AnonDiv {
  @scala.inline
  def apply(tag: div | span = null): AnonDiv = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDiv]
  }
}

