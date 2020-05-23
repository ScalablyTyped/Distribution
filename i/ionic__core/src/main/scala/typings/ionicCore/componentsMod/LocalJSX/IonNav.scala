package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.navInterfaceMod.NavComponent
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonNav extends js.Object {
  /**
    * If `true`, the nav should animate the transition of components.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * By default `ion-nav` animates transition between pages based in the mode (ios or material design). However, this property allows to create custom transition using `AnimateBuilder` functions.
    */
  var animation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * Event fired when the nav has changed components
    */
  var onIonNavDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Event fired when the nav will change components
    */
  var onIonNavWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Root NavComponent to load
    */
  var root: js.UndefOr[NavComponent] = js.undefined
  /**
    * Any parameters for the root component
    */
  var rootParams: js.UndefOr[ComponentProps[Null]] = js.undefined
  /**
    * If the nav component should allow for swipe-to-go-back.
    */
  var swipeGesture: js.UndefOr[Boolean] = js.undefined
}

object IonNav {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    onIonNavDidChange: /* event */ CustomEvent[Unit] => Unit = null,
    onIonNavWillChange: /* event */ CustomEvent[Unit] => Unit = null,
    root: js.UndefOr[Null | NavComponent] = js.undefined,
    rootParams: ComponentProps[Null] = null,
    swipeGesture: js.UndefOr[Boolean] = js.undefined
  ): IonNav = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(js.Any.fromFunction2(animation))
    if (onIonNavDidChange != null) __obj.updateDynamic("onIonNavDidChange")(js.Any.fromFunction1(onIonNavDidChange))
    if (onIonNavWillChange != null) __obj.updateDynamic("onIonNavWillChange")(js.Any.fromFunction1(onIonNavWillChange))
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (rootParams != null) __obj.updateDynamic("rootParams")(rootParams.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeGesture)) __obj.updateDynamic("swipeGesture")(swipeGesture.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonNav]
  }
}

