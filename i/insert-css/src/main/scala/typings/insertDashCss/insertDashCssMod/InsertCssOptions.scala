package typings.insertDashCss.insertDashCssMod

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
    if (container != null) __obj.updateDynamic("container")(container)
    if (!js.isUndefined(prepend)) __obj.updateDynamic("prepend")(prepend)
    __obj.asInstanceOf[InsertCssOptions]
  }
}

