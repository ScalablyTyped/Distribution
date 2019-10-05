package typings.koaDashWebsocket.koaDashWebsocketMod.koaMod

import typings.ws.wsMod.^
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
    val __obj = js.Dynamic.literal(path = path, websocket = websocket)
  
    __obj.asInstanceOf[Context]
  }
}

