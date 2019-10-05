package typings.atIonicCore.distTypesComponentsMod.LocalJSX

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
  var activated: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the fab will display on the edge of the header if `vertical` is `"top"`, and on the edge of the footer if it is `"bottom"`. Should be used with a `fixed` slot.
    */
  var edge: js.UndefOr[Boolean] = js.undefined
  /**
    * Where to align the fab horizontally in the viewport.
    */
  var horizontal: js.UndefOr[start | end | center] = js.undefined
  /**
    * Where to align the fab vertically in the viewport.
    */
  var vertical: js.UndefOr[top | bottom | center] = js.undefined
}

object IonFab {
  @scala.inline
  def apply(
    activated: js.UndefOr[Boolean] = js.undefined,
    edge: js.UndefOr[Boolean] = js.undefined,
    horizontal: start | end | center = null,
    vertical: top | bottom | center = null
  ): IonFab = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activated)) __obj.updateDynamic("activated")(activated)
    if (!js.isUndefined(edge)) __obj.updateDynamic("edge")(edge)
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonFab]
  }
}

