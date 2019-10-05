package typings.heremaps.H.ui.InfoBubble

import typings.heremaps.H.util.Event
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * content to be added to the info bubble
    */
  var content: String | Node
  /**
    * a callback to be invoked when the info bubble's state changes
    * @param event {H.util.Event}
    */
  var onStateChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(content: String | Node, onStateChange: /* event */ Event => Unit = null): Options = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    __obj.asInstanceOf[Options]
  }
}

