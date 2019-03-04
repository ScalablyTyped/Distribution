package typings
package koaDashWebsocketLib.koaDashWebsocketMod.KoaWebsocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareContext
  extends koaDashWebsocketLib.koaDashWebsocketMod.koaMod.Context {
  // Limitation: Declaration merging cannot overwrap existing properties.
  // That's why this property is here, not in the merged declaration above.
  var app: App
}

object MiddlewareContext {
  @scala.inline
  def apply(app: App, path: java.lang.String, websocket: wsLib.wsMod.namespaced): MiddlewareContext = {
    val __obj = js.Dynamic.literal(app = app, path = path, websocket = websocket)
  
    __obj.asInstanceOf[MiddlewareContext]
  }
}

