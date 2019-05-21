package typings
package atIonicCoreLib.distTypesComponentsNavNavDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionInstruction extends js.Object {
  var done: js.UndefOr[TransitionDoneFn] = js.undefined
  var enteringRequiresTransition: js.UndefOr[scala.Boolean] = js.undefined
  var insertStart: js.UndefOr[scala.Double] = js.undefined
  var insertViews: js.UndefOr[js.Array[_]] = js.undefined
  var leavingRequiresTransition: js.UndefOr[scala.Boolean] = js.undefined
  var opts: js.UndefOr[NavOptions | scala.Null] = js.undefined
  var reject: js.UndefOr[js.Function1[/* rejectReason */ java.lang.String, scala.Unit]] = js.undefined
  var removeCount: js.UndefOr[scala.Double] = js.undefined
  var removeStart: js.UndefOr[scala.Double] = js.undefined
  var removeView: js.UndefOr[atIonicCoreLib.distTypesComponentsNavViewDashControllerMod.ViewController] = js.undefined
  var resolve: js.UndefOr[js.Function1[/* hasCompleted */ scala.Boolean, scala.Unit]] = js.undefined
}

object TransitionInstruction {
  @scala.inline
  def apply(
    done: TransitionDoneFn = null,
    enteringRequiresTransition: js.UndefOr[scala.Boolean] = js.undefined,
    insertStart: scala.Int | scala.Double = null,
    insertViews: js.Array[_] = null,
    leavingRequiresTransition: js.UndefOr[scala.Boolean] = js.undefined,
    opts: NavOptions = null,
    reject: /* rejectReason */ java.lang.String => scala.Unit = null,
    removeCount: scala.Int | scala.Double = null,
    removeStart: scala.Int | scala.Double = null,
    removeView: atIonicCoreLib.distTypesComponentsNavViewDashControllerMod.ViewController = null,
    resolve: /* hasCompleted */ scala.Boolean => scala.Unit = null
  ): TransitionInstruction = {
    val __obj = js.Dynamic.literal()
    if (done != null) __obj.updateDynamic("done")(done)
    if (!js.isUndefined(enteringRequiresTransition)) __obj.updateDynamic("enteringRequiresTransition")(enteringRequiresTransition)
    if (insertStart != null) __obj.updateDynamic("insertStart")(insertStart.asInstanceOf[js.Any])
    if (insertViews != null) __obj.updateDynamic("insertViews")(insertViews)
    if (!js.isUndefined(leavingRequiresTransition)) __obj.updateDynamic("leavingRequiresTransition")(leavingRequiresTransition)
    if (opts != null) __obj.updateDynamic("opts")(opts)
    if (reject != null) __obj.updateDynamic("reject")(js.Any.fromFunction1(reject))
    if (removeCount != null) __obj.updateDynamic("removeCount")(removeCount.asInstanceOf[js.Any])
    if (removeStart != null) __obj.updateDynamic("removeStart")(removeStart.asInstanceOf[js.Any])
    if (removeView != null) __obj.updateDynamic("removeView")(removeView)
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[TransitionInstruction]
  }
}

