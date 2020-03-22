package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.mod.CreateRoomOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreateAsClient extends js.Object {
  var createAsClient: Boolean
  var options: CreateRoomOptions
}

object AnonCreateAsClient {
  @scala.inline
  def apply(createAsClient: Boolean, options: CreateRoomOptions): AnonCreateAsClient = {
    val __obj = js.Dynamic.literal(createAsClient = createAsClient.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCreateAsClient]
  }
}

