package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.refresherInterfaceMod.RefresherEventDetail
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRefresher extends js.Object {
  /**
    * Time it takes to close the refresher.
    */
  var closeDuration: js.UndefOr[String] = js.undefined
  /**
    * If `true`, the refresher will be hidden.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Emitted while the user is pulling down the content and exposing the refresher.
    */
  var onIonPull: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted when the user lets go of the content and has pulled down further than the `pullMin` or pulls the content down and exceeds the pullMax. Updates the refresher state to `refreshing`. The `complete()` method should be called when the async operation has completed.
    */
  var onIonRefresh: js.UndefOr[js.Function1[/* event */ CustomEvent[RefresherEventDetail], Unit]] = js.undefined
  /**
    * Emitted when the user begins to start pulling down.
    */
  var onIonStart: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * How much to multiply the pull speed by. To slow the pull animation down, pass a number less than `1`. To speed up the pull, pass a number greater than `1`. The default value is `1` which is equal to the speed of the cursor. If a negative value is passed in, the factor will be `1` instead.  For example: If the value passed is `1.2` and the content is dragged by `10` pixels, instead of `10` pixels the content will be pulled by `12` pixels (an increase of 20 percent). If the value passed is `0.8`, the dragged amount will be `8` pixels, less than the amount the cursor has moved.
    */
  var pullFactor: js.UndefOr[Double] = js.undefined
  /**
    * The maximum distance of the pull until the refresher will automatically go into the `refreshing` state. Defaults to the result of `pullMin + 60`.
    */
  var pullMax: js.UndefOr[Double] = js.undefined
  /**
    * The minimum distance the user must pull down until the refresher will go into the `refreshing` state.
    */
  var pullMin: js.UndefOr[Double] = js.undefined
  /**
    * Time it takes the refresher to to snap back to the `refreshing` state.
    */
  var snapbackDuration: js.UndefOr[String] = js.undefined
}

object IonRefresher {
  @scala.inline
  def apply(
    closeDuration: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onIonPull: /* event */ CustomEvent[Unit] => Unit = null,
    onIonRefresh: /* event */ CustomEvent[RefresherEventDetail] => Unit = null,
    onIonStart: /* event */ CustomEvent[Unit] => Unit = null,
    pullFactor: Int | Double = null,
    pullMax: Int | Double = null,
    pullMin: Int | Double = null,
    snapbackDuration: String = null
  ): IonRefresher = {
    val __obj = js.Dynamic.literal()
    if (closeDuration != null) __obj.updateDynamic("closeDuration")(closeDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onIonPull != null) __obj.updateDynamic("onIonPull")(js.Any.fromFunction1(onIonPull))
    if (onIonRefresh != null) __obj.updateDynamic("onIonRefresh")(js.Any.fromFunction1(onIonRefresh))
    if (onIonStart != null) __obj.updateDynamic("onIonStart")(js.Any.fromFunction1(onIonStart))
    if (pullFactor != null) __obj.updateDynamic("pullFactor")(pullFactor.asInstanceOf[js.Any])
    if (pullMax != null) __obj.updateDynamic("pullMax")(pullMax.asInstanceOf[js.Any])
    if (pullMin != null) __obj.updateDynamic("pullMin")(pullMin.asInstanceOf[js.Any])
    if (snapbackDuration != null) __obj.updateDynamic("snapbackDuration")(snapbackDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRefresher]
  }
}

