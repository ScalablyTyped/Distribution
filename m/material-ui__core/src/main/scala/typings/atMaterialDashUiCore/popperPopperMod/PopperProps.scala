package typings.atMaterialDashUiCore.popperPopperMod

import typings.atMaterialDashUiCore.Anon_Placement
import typings.popperDotJs.popperDotJsMod.ReferenceObject
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactInstance
import typings.react.reactMod.ReactNode
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperProps extends HTMLAttributes[HTMLDivElement] {
  var anchorEl: js.UndefOr[
    Null | HTMLElement | ReferenceObject | (js.Function1[/* element */ HTMLElement, HTMLElement])
  ] = js.undefined
  @JSName("children")
  var children_PopperProps: ReactNode | (js.Function1[/* props */ Anon_Placement, ReactNode])
  var container: js.UndefOr[ReactInstance | js.Function0[ReactInstance] | Null] = js.undefined
  var disablePortal: js.UndefOr[Boolean] = js.undefined
  var keepMounted: js.UndefOr[Boolean] = js.undefined
  var modifiers: js.UndefOr[js.Object] = js.undefined
  var open: Boolean
  var placement: js.UndefOr[PopperPlacementType] = js.undefined
  var popperOptions: js.UndefOr[js.Object] = js.undefined
  var transition: js.UndefOr[Boolean] = js.undefined
}

object PopperProps {
  @scala.inline
  def apply(
    children: ReactNode | (js.Function1[/* props */ Anon_Placement, ReactNode]),
    open: Boolean,
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    anchorEl: HTMLElement | ReferenceObject | (js.Function1[/* element */ HTMLElement, HTMLElement]) = null,
    container: ReactInstance | js.Function0[ReactInstance] = null,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    keepMounted: js.UndefOr[Boolean] = js.undefined,
    modifiers: js.Object = null,
    placement: PopperPlacementType = null,
    popperOptions: js.Object = null,
    transition: js.UndefOr[Boolean] = js.undefined
  ): PopperProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], open = open)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (anchorEl != null) __obj.updateDynamic("anchorEl")(anchorEl.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePortal)) __obj.updateDynamic("disablePortal")(disablePortal)
    if (!js.isUndefined(keepMounted)) __obj.updateDynamic("keepMounted")(keepMounted)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (popperOptions != null) __obj.updateDynamic("popperOptions")(popperOptions)
    if (!js.isUndefined(transition)) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[PopperProps]
  }
}

