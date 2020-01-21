package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnector extends js.Object {
  var connector: js.Any
  var properties: js.UndefOr[js.Any] = js.undefined
}

object AnonConnector {
  @scala.inline
  def apply(connector: js.Any, properties: js.Any = null): AnonConnector = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnector]
  }
}

