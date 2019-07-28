package typings.heremaps.HNs.utilNs.ContextItemNs

import typings.heremaps.HNs.utilNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type defines options which can be used to initialize the context item.
  * @property label {string=} - the label of the context item
  * @property disabled {boolean=} - flag indicatting whether context item is disabled or no, by default false
  * @property callback {function(H.util.Event)=} - Optional callback function to call once context item is selected
  */
trait Options extends js.Object {
  var callback: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    callback: /* event */ Event => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    label: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Options]
  }
}

