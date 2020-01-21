package typings.koaWebsocket.mod.koaAugmentingMod

import typings.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var path: String
  var websocket: ^
}

object Context {
  @scala.inline
  def apply(path: String, websocket: ^): Context = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], websocket = websocket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Context]
  }
}

