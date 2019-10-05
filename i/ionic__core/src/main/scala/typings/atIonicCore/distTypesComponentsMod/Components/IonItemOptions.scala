package typings.atIonicCore.distTypesComponentsMod.Components

import typings.atIonicCore.distTypesInterfaceMod.Side
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonItemOptions extends js.Object {
  /**
    * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
    */
  var side: Side
  def fireSwipeEvent(): js.Promise[Unit]
}

object IonItemOptions {
  @scala.inline
  def apply(fireSwipeEvent: () => js.Promise[Unit], side: Side): IonItemOptions = {
    val __obj = js.Dynamic.literal(fireSwipeEvent = js.Any.fromFunction0(fireSwipeEvent), side = side)
  
    __obj.asInstanceOf[IonItemOptions]
  }
}

