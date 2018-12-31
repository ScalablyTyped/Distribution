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

