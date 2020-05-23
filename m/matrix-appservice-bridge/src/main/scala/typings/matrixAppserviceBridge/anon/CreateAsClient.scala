package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.mod.CreateRoomOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAsClient extends js.Object {
  var createAsClient: Boolean
  var options: CreateRoomOptions
}

object CreateAsClient {
  @scala.inline
  def apply(createAsClient: Boolean, options: CreateRoomOptions): CreateAsClient = {
    val __obj = js.Dynamic.literal(createAsClient = createAsClient.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAsClient]
  }
}

