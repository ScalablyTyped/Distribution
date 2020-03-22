package typings.ionicCore.componentsMod.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSkeletonText extends js.Object {
  /**
    * If `true`, the skeleton text will animate.
    */
  var animated: Boolean
}

object IonSkeletonText {
  @scala.inline
  def apply(animated: Boolean): IonSkeletonText = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IonSkeletonText]
  }
}

