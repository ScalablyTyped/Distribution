package typings.ionicCore.stencilPublicRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOptions extends js.Object {
  /**
    * A Boolean indicating whether the event bubbles up through the DOM or not.
    */
  var bubbles: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean indicating whether the event is cancelable.
    */
  var cancelable: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean value indicating whether or not the event can bubble across the boundary between the shadow DOM and the regular DOM.
    */
  var composed: js.UndefOr[Boolean] = js.undefined
  /**
    * A string custom event name to override the default.
    */
  var eventName: js.UndefOr[String] = js.undefined
}

object EventOptions {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined,
    eventName: String = null
  ): EventOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOptions]
  }
}

