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
  def apply(offset: js.UndefOr[Double] = js.undefined): AnimationKeyFrameEdge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationKeyFrameEdge]
  }
}

