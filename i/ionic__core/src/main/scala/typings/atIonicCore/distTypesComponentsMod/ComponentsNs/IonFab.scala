package typings.atIonicCore.distTypesComponentsMod.ComponentsNs

import typings.atIonicCore.atIonicCoreStrings.bottom
import typings.atIonicCore.atIonicCoreStrings.center
import typings.atIonicCore.atIonicCoreStrings.end
import typings.atIonicCore.atIonicCoreStrings.start
import typings.atIonicCore.atIonicCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonFab extends js.Object {
  /**
    * If `true`, both the `ion-fab-button` and all `ion-fab-list` inside `ion-fab` will become active. That means `ion-fab-button` will become a `close` icon and `ion-fab-list` will become visible.
    */
  var activated: Boolean
  /**
    * If `true`, the fab will display on the edge of the header if `vertical` is `"top"`, and on the edge of the footer if it is `"bottom"`. Should be used with a `fixed` slot.
    */
  var edge: Boolean
  /**
    * Where to align the fab horizontally in the viewport.
    */
  var horizontal: js.UndefOr[start | end | center] = js.undefined
  /**
    * Where to align the fab vertically in the viewport.
    */
  var vertical: js.UndefOr[top | bottom | center] = js.undefined
  /**
    * Close an active FAB list container.
    */
  def close(): js.Promise[Unit]
}

object IonFab {
  @scala.inline
  def apply(
    activated: Boolean,
    close: () => js.Promise[Unit],
    edge: Boolean,
    horizontal: start | end | center = null,
    vertical: top | bottom | center = null
  ): IonFab = {
    val __obj = js.Dynamic.literal(activated = activated, close = js.Any.fromFunction0(close), edge = edge)
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonFab]
  }
}

