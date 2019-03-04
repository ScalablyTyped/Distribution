package typings
package heremapsLib.HNs.uiNs.InfoBubbleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * content to be added to the info bubble
    */
  var content: java.lang.String | stdLib.Node
  /**
    * a callback to be invoked when the info bubble's state changes
    * @param event {H.util.Event}
    */
  var onStateChange: js.UndefOr[js.Function1[/* event */ heremapsLib.HNs.utilNs.Event, scala.Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    content: java.lang.String | stdLib.Node,
    onStateChange: js.Function1[/* event */ heremapsLib.HNs.utilNs.Event, scala.Unit] = null
  ): Options = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(onStateChange)
    __obj.asInstanceOf[Options]
  }
}

