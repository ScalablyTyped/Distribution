package typings.atMaterialDashUiLab.autocompleteAutocompleteMod

import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupProps extends HTMLAttributes[HTMLElement] {
  var anchorEl: js.UndefOr[HTMLElement] = js.undefined
  var open: Boolean
  var popperRef: Ref[_]
}

object PopupProps {
  @scala.inline
  def apply(
    open: Boolean,
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    anchorEl: HTMLElement = null,
    popperRef: Ref[_] = null
  ): PopupProps = {
    val __obj = js.Dynamic.literal(open = open)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (anchorEl != null) __obj.updateDynamic("anchorEl")(anchorEl)
    if (popperRef != null) __obj.updateDynamic("popperRef")(popperRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupProps]
  }
}

