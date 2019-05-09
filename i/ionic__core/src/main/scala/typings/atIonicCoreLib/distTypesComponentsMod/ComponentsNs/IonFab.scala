package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonFab extends js.Object {
  /**
    * If `true`, both the `ion-fab-button` and all `ion-fab-list` inside `ion-fab` will become active. That means `ion-fab-button` will become a `close` icon and `ion-fab-list` will become visible.
    */
  var activated: scala.Boolean
  /**
    * If `true`, the fab will display on the edge of the header if `vertical` is `"top"`, and on the edge of the footer if it is `"bottom"`. Should be used with a `fixed` slot.
    */
  var edge: scala.Boolean
  /**
    * Where to align the fab horizontally in the viewport.
    */
  var horizontal: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.start | atIonicCoreLib.atIonicCoreLibStrings.end | atIonicCoreLib.atIonicCoreLibStrings.center
  ] = js.undefined
  /**
    * Where to align the fab vertically in the viewport.
    */
  var vertical: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.top | atIonicCoreLib.atIonicCoreLibStrings.bottom | atIonicCoreLib.atIonicCoreLibStrings.center
  ] = js.undefined
  /**
    * Close an active FAB list container.
    */
  def close(): scala.Unit
}

object IonFab {
  @scala.inline
  def apply(
    activated: scala.Boolean,
    close: () => scala.Unit,
    edge: scala.Boolean,
    horizontal: atIonicCoreLib.atIonicCoreLibStrings.start | atIonicCoreLib.atIonicCoreLibStrings.end | atIonicCoreLib.atIonicCoreLibStrings.center = null,
    vertical: atIonicCoreLib.atIonicCoreLibStrings.top | atIonicCoreLib.atIonicCoreLibStrings.bottom | atIonicCoreLib.atIonicCoreLibStrings.center = null
  ): IonFab = {
    val __obj = js.Dynamic.literal(activated = activated, close = js.Any.fromFunction0(close), edge = edge)
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonFab]
  }
}

