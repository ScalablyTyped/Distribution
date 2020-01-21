package typings.ionicCore.componentsMod.LocalJSX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonGrid extends js.Object {
  /**
    * If `true`, the grid will have a fixed width based on the screen size.
    */
  var fixed: js.UndefOr[Boolean] = js.undefined
}

object IonGrid {
  @scala.inline
  def apply(fixed: js.UndefOr[Boolean] = js.undefined): IonGrid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonGrid]
  }
}

