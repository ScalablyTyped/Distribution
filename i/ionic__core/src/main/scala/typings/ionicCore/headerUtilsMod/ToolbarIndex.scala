package typings.ionicCore.headerUtilsMod

import typings.ionicCore.componentsMod.global.HTMLIonTitleElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarIndex extends js.Object {
  var background: HTMLElement
  var el: HTMLElement
  var innerTitleEl: HTMLElement
  var ionButtonsEl: js.Array[js.Any | HTMLElement]
  var ionTitleEl: js.UndefOr[HTMLIonTitleElement] = js.undefined
}

object ToolbarIndex {
  @scala.inline
  def apply(
    background: HTMLElement,
    el: HTMLElement,
    innerTitleEl: HTMLElement,
    ionButtonsEl: js.Array[js.Any | HTMLElement],
    ionTitleEl: HTMLIonTitleElement = null
  ): ToolbarIndex = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], innerTitleEl = innerTitleEl.asInstanceOf[js.Any], ionButtonsEl = ionButtonsEl.asInstanceOf[js.Any])
    if (ionTitleEl != null) __obj.updateDynamic("ionTitleEl")(ionTitleEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarIndex]
  }
}

