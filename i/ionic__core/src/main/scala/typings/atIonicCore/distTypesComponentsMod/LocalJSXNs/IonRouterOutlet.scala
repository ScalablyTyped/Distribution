package typings.atIonicCore.distTypesComponentsMod.LocalJSXNs

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.distTypesUtilsAnimationOldDashAnimationAnimationDashInterfaceMod.AnimationBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRouterOutlet extends js.Object {
  /**
    * If `true`, the router-outlet should animate the transition of components.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * By default `ion-nav` animates transition between pages based in the mode (ios or material design). However, this property allows to create custom transition using `AnimateBuilder` functions.
    */
  var animation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
}

object IonRouterOutlet {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: AnimationBuilder = null,
    mode: ios | md = null
  ): IonRouterOutlet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRouterOutlet]
  }
}

