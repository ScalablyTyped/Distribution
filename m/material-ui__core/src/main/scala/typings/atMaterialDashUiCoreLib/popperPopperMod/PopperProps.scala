package typings
package atMaterialDashUiCoreLib.popperPopperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  var anchorEl: js.UndefOr[
    scala.Null | reactLib.HTMLElement | popperDotJsLib.popperDotJsMod.ReferenceObject | (js.Function1[/* element */ reactLib.HTMLElement, reactLib.HTMLElement])
  ] = js.undefined
  @JSName("children")
  var children_PopperProps: reactLib.reactMod.ReactNs.ReactNode | (js.Function1[
    /* props */ atMaterialDashUiCoreLib.Anon_Placement, 
    reactLib.reactMod.ReactNs.ReactNode
  ])
  var container: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactInstance | js.Function0[reactLib.reactMod.ReactNs.ReactInstance] | scala.Null
  ] = js.undefined
  var disablePortal: js.UndefOr[scala.Boolean] = js.undefined
  var keepMounted: js.UndefOr[scala.Boolean] = js.undefined
  var modifiers: js.UndefOr[js.Object] = js.undefined
  var open: scala.Boolean
  var placement: js.UndefOr[PopperPlacementType] = js.undefined
  var popperOptions: js.UndefOr[js.Object] = js.undefined
  var transition: js.UndefOr[scala.Boolean] = js.undefined
}

object PopperProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode | (js.Function1[
      /* props */ atMaterialDashUiCoreLib.Anon_Placement, 
      reactLib.reactMod.ReactNs.ReactNode
    ]),
    open: scala.Boolean,
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] = null,
    anchorEl: reactLib.HTMLElement | popperDotJsLib.popperDotJsMod.ReferenceObject | (js.Function1[/* element */ reactLib.HTMLElement, reactLib.HTMLElement]) = null,
    container: reactLib.reactMod.ReactNs.ReactInstance | js.Function0[reactLib.reactMod.ReactNs.ReactInstance] = null,
    disablePortal: js.UndefOr[scala.Boolean] = js.undefined,
    keepMounted: js.UndefOr[scala.Boolean] = js.undefined,
    modifiers: js.Object = null,
    placement: PopperPlacementType = null,
    popperOptions: js.Object = null,
    transition: js.UndefOr[scala.Boolean] = js.undefined
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

