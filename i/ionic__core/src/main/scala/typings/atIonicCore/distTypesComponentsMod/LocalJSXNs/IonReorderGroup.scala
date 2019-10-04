package typings.atIonicCore.distTypesComponentsMod.LocalJSXNs

import typings.atIonicCore.distTypesComponentsReorderDashGroupReorderDashGroupDashInterfaceMod.ItemReorderEventDetail
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonReorderGroup extends js.Object {
  /**
    * If `true`, the reorder will be hidden.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Event that needs to be listened to in order to complete the reorder action. Once the event has been emitted, the `complete()` method then needs to be called in order to finalize the reorder action.
    */
  var onIonItemReorder: js.UndefOr[js.Function1[/* event */ CustomEvent[ItemReorderEventDetail], Unit]] = js.undefined
}

object IonReorderGroup {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    onIonItemReorder: /* event */ CustomEvent[ItemReorderEventDetail] => Unit = null
  ): IonReorderGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onIonItemReorder != null) __obj.updateDynamic("onIonItemReorder")(js.Any.fromFunction1(onIonItemReorder))
    __obj.asInstanceOf[IonReorderGroup]
  }
}

