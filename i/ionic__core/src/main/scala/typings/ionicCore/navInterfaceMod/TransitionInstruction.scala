package typings.ionicCore.navInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionInstruction extends js.Object {
  var done: js.UndefOr[TransitionDoneFn] = js.undefined
  var enteringRequiresTransition: js.UndefOr[Boolean] = js.undefined
  var insertStart: js.UndefOr[Double] = js.undefined
  var insertViews: js.UndefOr[js.Array[_]] = js.undefined
  var leavingRequiresTransition: js.UndefOr[Boolean] = js.undefined
  var opts: js.UndefOr[NavOptions | Null] = js.undefined
  var reject: js.UndefOr[js.Function1[/* rejectReason */ String, Unit]] = js.undefined
  var removeCount: js.UndefOr[Double] = js.undefined
  var removeStart: js.UndefOr[Double] = js.undefined
  var removeView: js.UndefOr[typings.ionicCore.viewControllerMod.ViewController] = js.undefined
  var resolve: js.UndefOr[js.Function1[/* hasCompleted */ Boolean, Unit]] = js.undefined
}

object TransitionInstruction {
  @scala.inline
  def apply(
    done: (/* hasCompleted */ Boolean, /* requiresTransition */ Boolean, /* enteringView */ js.UndefOr[typings.ionicCore.viewControllerMod.ViewController], /* leavingView */ js.UndefOr[typings.ionicCore.viewControllerMod.ViewController], /* direction */ js.UndefOr[String]) => Unit = null,
    enteringRequiresTransition: js.UndefOr[Boolean] = js.undefined,
    insertStart: js.UndefOr[Double] = js.undefined,
    insertViews: js.Array[_] = null,
    leavingRequiresTransition: js.UndefOr[Boolean] = js.undefined,
    opts: js.UndefOr[Null | NavOptions] = js.undefined,
    reject: /* rejectReason */ String => Unit = null,
    removeCount: js.UndefOr[Double] = js.undefined,
    removeStart: js.UndefOr[Double] = js.undefined,
    removeView: typings.ionicCore.viewControllerMod.ViewController = null,
    resolve: /* hasCompleted */ Boolean => Unit = null
  ): TransitionInstruction = {
    val __obj = js.Dynamic.literal()
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction5(done))
    if (!js.isUndefined(enteringRequiresTransition)) __obj.updateDynamic("enteringRequiresTransition")(enteringRequiresTransition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertStart)) __obj.updateDynamic("insertStart")(insertStart.get.asInstanceOf[js.Any])
    if (insertViews != null) __obj.updateDynamic("insertViews")(insertViews.asInstanceOf[js.Any])
    if (!js.isUndefined(leavingRequiresTransition)) __obj.updateDynamic("leavingRequiresTransition")(leavingRequiresTransition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opts)) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    if (reject != null) __obj.updateDynamic("reject")(js.Any.fromFunction1(reject))
    if (!js.isUndefined(removeCount)) __obj.updateDynamic("removeCount")(removeCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeStart)) __obj.updateDynamic("removeStart")(removeStart.get.asInstanceOf[js.Any])
    if (removeView != null) __obj.updateDynamic("removeView")(removeView.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[TransitionInstruction]
  }
}

