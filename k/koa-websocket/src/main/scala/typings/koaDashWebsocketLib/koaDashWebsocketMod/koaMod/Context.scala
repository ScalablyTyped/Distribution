package typings
package koaDashWebsocketLib.koaDashWebsocketMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var path: java.lang.String
  var websocket: wsLib.wsMod.^
}

object Context {
  @scala.inline
  def apply(path: java.lang.String, websocket: wsLib.wsMod.^): Context = {
    val __obj = js.Dynamic.literal(path = path, websocket = websocket)
  
    __obj.asInstanceOf[Context]
  }
}

