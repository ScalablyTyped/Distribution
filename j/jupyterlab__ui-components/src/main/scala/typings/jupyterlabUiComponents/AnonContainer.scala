package typings.jupyterlabUiComponents

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainer extends js.Object {
  var container: js.UndefOr[HTMLElement] = js.undefined
}

object AnonContainer {
  @scala.inline
  def apply(container: HTMLElement = null): AnonContainer = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainer]
  }
}

