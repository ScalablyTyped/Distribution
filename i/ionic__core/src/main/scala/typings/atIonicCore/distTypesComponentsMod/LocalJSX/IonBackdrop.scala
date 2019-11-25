package typings.atIonicCore.distTypesComponentsMod.LocalJSX

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonBackdrop extends js.Object {
  /**
    * Emitted when the backdrop is tapped.
    */
  var onIonBackdropTap: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * If `true`, the backdrop will stop propagation on tap.
    */
  var stopPropagation: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the backdrop will can be clicked and will emit the `ionBackdropTap` event.
    */
  var tappable: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the backdrop will be visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IonBackdrop {
  @scala.inline
  def apply(
    onIonBackdropTap: /* event */ CustomEvent[Unit] => Unit = null,
    stopPropagation: js.UndefOr[Boolean] = js.undefined,
    tappable: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IonBackdrop = {
    val __obj = js.Dynamic.literal()
    if (onIonBackdropTap != null) __obj.updateDynamic("onIonBackdropTap")(js.Any.fromFunction1(onIonBackdropTap))
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation.asInstanceOf[js.Any])
    if (!js.isUndefined(tappable)) __obj.updateDynamic("tappable")(tappable.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonBackdrop]
  }
}

