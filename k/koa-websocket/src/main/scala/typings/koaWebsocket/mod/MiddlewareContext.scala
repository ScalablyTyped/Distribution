package typings.koaWebsocket.mod

import typings.koaWebsocket.mod.koaAugmentingMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareContext[StateT] extends Context {
  // Limitation: Declaration merging cannot overwrap existing properties.
  // That's why this property is here, not in the merged declaration above.
  var app: App[_, js.Object]
  var state: StateT
}

object MiddlewareContext {
  @scala.inline
  def apply[StateT](app: App[_, js.Object], path: String, state: StateT, websocket: typings.ws.mod.^): MiddlewareContext[StateT] = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], websocket = websocket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MiddlewareContext[StateT]]
  }
}

