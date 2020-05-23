package typings.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IceConnection extends js.Object {
  var componentId: Double
  var state: js.Any
  var streamId: String
}

object IceConnection {
  @scala.inline
  def apply(componentId: Double, state: js.Any, streamId: String): IceConnection = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IceConnection]
  }
}

