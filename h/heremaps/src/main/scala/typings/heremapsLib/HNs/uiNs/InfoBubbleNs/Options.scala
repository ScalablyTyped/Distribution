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

