package typings.insertCss.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertCssOptions extends js.Object {
  var container: js.UndefOr[HTMLElement] = js.undefined
  var prepend: js.UndefOr[Boolean] = js.undefined
}

object InsertCssOptions {
  @scala.inline
  def apply(container: HTMLElement = null, prepend: js.UndefOr[Boolean] = js.undefined): InsertCssOptions = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(prepend)) __obj.updateDynamic("prepend")(prepend.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertCssOptions]
  }
}

