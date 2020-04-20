package typings.ionicCore.componentsMod.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonBackdrop extends js.Object {
  /**
    * If `true`, the backdrop will stop propagation on tap.
    */
  var stopPropagation: Boolean
  /**
    * If `true`, the backdrop will can be clicked and will emit the `ionBackdropTap` event.
    */
  var tappable: Boolean
  /**
    * If `true`, the backdrop will be visible.
    */
  var visible: Boolean
}

object IonBackdrop {
  @scala.inline
  def apply(stopPropagation: Boolean, tappable: Boolean, visible: Boolean): IonBackdrop = {
    val __obj = js.Dynamic.literal(stopPropagation = stopPropagation.asInstanceOf[js.Any], tappable = tappable.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonBackdrop]
  }
}

