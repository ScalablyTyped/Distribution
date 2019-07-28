package typings.makerDotJs.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to model.walk().
  */
trait IWalkOptions extends js.Object {
  var afterChildWalk: js.UndefOr[IWalkModelCallback] = js.undefined
  var beforeChildWalk: js.UndefOr[IWalkModelCancellableCallback] = js.undefined
  var onPath: js.UndefOr[IWalkPathCallback] = js.undefined
}

object IWalkOptions {
  @scala.inline
  def apply(
    afterChildWalk: IWalkModelCallback = null,
    beforeChildWalk: IWalkModelCancellableCallback = null,
    onPath: IWalkPathCallback = null
  ): IWalkOptions = {
    val __obj = js.Dynamic.literal()
    if (afterChildWalk != null) __obj.updateDynamic("afterChildWalk")(afterChildWalk)
    if (beforeChildWalk != null) __obj.updateDynamic("beforeChildWalk")(beforeChildWalk)
    if (onPath != null) __obj.updateDynamic("onPath")(onPath)
    __obj.asInstanceOf[IWalkOptions]
  }
}

