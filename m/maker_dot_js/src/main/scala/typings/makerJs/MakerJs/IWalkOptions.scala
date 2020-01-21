package typings.makerJs.MakerJs

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
    afterChildWalk: /* context */ IWalkModel => Unit = null,
    beforeChildWalk: /* context */ IWalkModel => Boolean = null,
    onPath: /* context */ IWalkPath => Unit = null
  ): IWalkOptions = {
    val __obj = js.Dynamic.literal()
    if (afterChildWalk != null) __obj.updateDynamic("afterChildWalk")(js.Any.fromFunction1(afterChildWalk))
    if (beforeChildWalk != null) __obj.updateDynamic("beforeChildWalk")(js.Any.fromFunction1(beforeChildWalk))
    if (onPath != null) __obj.updateDynamic("onPath")(js.Any.fromFunction1(onPath))
    __obj.asInstanceOf[IWalkOptions]
  }
}

