package typings.ionicCore.animationInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ trait AnimationKeyFrameEdge extends js.Object {
  var offset: js.UndefOr[Double] = js.undefined
}

object AnimationKeyFrameEdge {
  @scala.inline
  def apply(offset: Int | Double = null): AnimationKeyFrameEdge = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationKeyFrameEdge]
  }
}

