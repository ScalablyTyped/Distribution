package typings.ionicCore.componentsMod.LocalJSX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSkeletonText extends js.Object {
  /**
    * If `true`, the skeleton text will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
}

object IonSkeletonText {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined): IonSkeletonText = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSkeletonText]
  }
}

