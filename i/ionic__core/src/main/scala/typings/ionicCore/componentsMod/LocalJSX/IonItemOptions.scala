package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.mod.Side
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonItemOptions extends js.Object {
  /**
    * Emitted when the item has been fully swiped.
    */
  var onIonSwipe: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  /**
    * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
    */
  var side: js.UndefOr[Side] = js.undefined
}

object IonItemOptions {
  @scala.inline
  def apply(onIonSwipe: /* event */ CustomEvent[_] => Unit = null, side: Side = null): IonItemOptions = {
    val __obj = js.Dynamic.literal()
    if (onIonSwipe != null) __obj.updateDynamic("onIonSwipe")(js.Any.fromFunction1(onIonSwipe))
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonItemOptions]
  }
}

