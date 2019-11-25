package typings.atIonicCore.distTypesComponentsNavNavDashInterfaceMod

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
  var removeView: js.UndefOr[typings.atIonicCore.distTypesComponentsNavViewDashControllerMod.ViewController] = js.undefined
  var resolve: js.UndefOr[js.Function1[/* hasCompleted */ Boolean, Unit]] = js.undefined
}

object TransitionInstruction {
  @scala.inline
  def apply(
    done: (/* hasCompleted */ Boolean, /* requiresTransition */ Boolean, /* enteringView */ js.UndefOr[typings.atIonicCore.distTypesComponentsNavViewDashControllerMod.ViewController], /* leavingView */ js.UndefOr[typings.atIonicCore.distTypesComponentsNavViewDashControllerMod.ViewController], /* direction */ js.UndefOr[String]) => Unit = null,
    enteringRequiresTransition: js.UndefOr[Boolean] = js.undefined,
    insertStart: Int | Double = null,
    insertViews: js.Array[_] = null,
    leavingRequiresTransition: js.UndefOr[Boolean] = js.undefined,
    opts: NavOptions = null,
    reject: /* rejectReason */ String => Unit = null,
    removeCount: Int | Double = null,
    removeStart: Int | Double = null,
    removeView: typings.atIonicCore.distTypesComponentsNavViewDashControllerMod.ViewController = null,
    resolve: /* hasCompleted */ Boolean => Unit = null
  ): TransitionInstruction = {
    val __obj = js.Dynamic.literal()
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction5(done))
    if (!js.isUndefined(enteringRequiresTransition)) __obj.updateDynamic("enteringRequiresTransition")(enteringRequiresTransition.asInstanceOf[js.Any])
    if (insertStart != null) __obj.updateDynamic("insertStart")(insertStart.asInstanceOf[js.Any])
    if (insertViews != null) __obj.updateDynamic("insertViews")(insertViews.asInstanceOf[js.Any])
    if (!js.isUndefined(leavingRequiresTransition)) __obj.updateDynamic("leavingRequiresTransition")(leavingRequiresTransition.asInstanceOf[js.Any])
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    if (reject != null) __obj.updateDynamic("reject")(js.Any.fromFunction1(reject))
    if (removeCount != null) __obj.updateDynamic("removeCount")(removeCount.asInstanceOf[js.Any])
    if (removeStart != null) __obj.updateDynamic("removeStart")(removeStart.asInstanceOf[js.Any])
    if (removeView != null) __obj.updateDynamic("removeView")(removeView.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[TransitionInstruction]
  }
}

