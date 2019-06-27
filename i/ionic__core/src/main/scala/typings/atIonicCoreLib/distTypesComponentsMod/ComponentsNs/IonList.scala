package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonList extends js.Object {
  /**
    * If `true`, the list will have margin around it and rounded corners.
    */
  var inset: scala.Boolean
  /**
    * How the bottom border should be displayed on all items.
    */
  var lines: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.full | atIonicCoreLib.atIonicCoreLibStrings.inset | atIonicCoreLib.atIonicCoreLibStrings.none
  ] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md
  ] = js.undefined
  /**
    * If `ion-item-sliding` are used inside the list, this method closes any open sliding item.  Returns `true` if an actual `ion-item-sliding` is closed.
    */
  def closeSlidingItems(): js.Promise[scala.Boolean]
}

object IonList {
  @scala.inline
  def apply(
    closeSlidingItems: () => js.Promise[scala.Boolean],
    inset: scala.Boolean,
    lines: atIonicCoreLib.atIonicCoreLibStrings.full | atIonicCoreLib.atIonicCoreLibStrings.inset | atIonicCoreLib.atIonicCoreLibStrings.none = null,
    mode: atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md = null
  ): IonList = {
    val __obj = js.Dynamic.literal(closeSlidingItems = js.Any.fromFunction0(closeSlidingItems), inset = inset)
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonList]
  }
}

