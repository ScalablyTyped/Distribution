package typings.atIonicCore.distTypesComponentsMod.LocalJSXNs

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonItemSliding extends js.Object {
  /**
    * If `true`, the user cannot interact with the sliding item.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Emitted when the sliding position changes.
    */
  var onIonDrag: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
}

object IonItemSliding {
  @scala.inline
  def apply(disabled: js.UndefOr[Boolean] = js.undefined, onIonDrag: /* event */ CustomEvent[_] => Unit = null): IonItemSliding = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onIonDrag != null) __obj.updateDynamic("onIonDrag")(js.Any.fromFunction1(onIonDrag))
    __obj.asInstanceOf[IonItemSliding]
  }
}

