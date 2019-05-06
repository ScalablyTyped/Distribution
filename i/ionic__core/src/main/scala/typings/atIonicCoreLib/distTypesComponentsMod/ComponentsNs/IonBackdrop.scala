package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonBackdrop extends js.Object {
  /**
    * If `true`, the backdrop will stop propagation on tap.
    */
  var stopPropagation: scala.Boolean
  /**
    * If `true`, the backdrop will can be clicked and will emit the `ionBackdropTap` event.
    */
  var tappable: scala.Boolean
  /**
    * If `true`, the backdrop will be visible.
    */
  var visible: scala.Boolean
}

object IonBackdrop {
  @scala.inline
  def apply(stopPropagation: scala.Boolean, tappable: scala.Boolean, visible: scala.Boolean): IonBackdrop = {
    val __obj = js.Dynamic.literal(stopPropagation = stopPropagation, tappable = tappable, visible = visible)
  
    __obj.asInstanceOf[IonBackdrop]
  }
}

