package typings.ionicCore.stencilPublicRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenOptions extends js.Object {
  /**
    * Event listener attached with `@Listen` does not "capture" by default,
    * When a event listener is set to "capture", means the event will be dispatched
    * during the "capture phase". Please see
    * https://www.quirksmode.org/js/events_order.html for further information.
    */
  var capture: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, Stencil uses several heuristics to determine if
    * it must attach a `passive` event listener or not.
    *
    * Using the `passive` option can be used to change the default behaviour.
    * Please see https://developers.google.com/web/updates/2016/06/passive-event-listeners for further information.
    */
  var passive: js.UndefOr[Boolean] = js.undefined
  /**
    * Handlers can also be registered for an event other than the host itself.
    * The `target` option can be used to change where the event listener is attached,
    * this is useful for listening to application-wide events.
    */
  var target: js.UndefOr[ListenTargetOptions] = js.undefined
}

object ListenOptions {
  @scala.inline
  def apply(
    capture: js.UndefOr[Boolean] = js.undefined,
    passive: js.UndefOr[Boolean] = js.undefined,
    target: ListenTargetOptions = null
  ): ListenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenOptions]
  }
}

