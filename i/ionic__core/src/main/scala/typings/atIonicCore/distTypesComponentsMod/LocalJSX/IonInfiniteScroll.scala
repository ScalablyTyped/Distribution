package typings.atIonicCore.distTypesComponentsMod.LocalJSX

import typings.atIonicCore.atIonicCoreStrings.bottom
import typings.atIonicCore.atIonicCoreStrings.top
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonInfiniteScroll extends js.Object {
  /**
    * If `true`, the infinite scroll will be hidden and scroll event listeners will be removed.  Set this to true to disable the infinite scroll from actively trying to receive new data while scrolling. This is useful when it is known that there is no more data that can be added, and the infinite scroll is no longer needed.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Emitted when the scroll reaches the threshold distance. From within your infinite handler, you must call the infinite scroll's `complete()` method when your async operation has completed.
    */
  var onIonInfinite: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * The position of the infinite scroll element. The value can be either `top` or `bottom`.
    */
  var position: js.UndefOr[top | bottom] = js.undefined
  /**
    * The threshold distance from the bottom of the content to call the `infinite` output event when scrolled. The threshold value can be either a percent, or in pixels. For example, use the value of `10%` for the `infinite` output event to get called when the user has scrolled 10% from the bottom of the page. Use the value `100px` when the scroll is within 100 pixels from the bottom of the page.
    */
  var threshold: js.UndefOr[String] = js.undefined
}

object IonInfiniteScroll {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    onIonInfinite: /* event */ CustomEvent[Unit] => Unit = null,
    position: top | bottom = null,
    threshold: String = null
  ): IonInfiniteScroll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onIonInfinite != null) __obj.updateDynamic("onIonInfinite")(js.Any.fromFunction1(onIonInfinite))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonInfiniteScroll]
  }
}

