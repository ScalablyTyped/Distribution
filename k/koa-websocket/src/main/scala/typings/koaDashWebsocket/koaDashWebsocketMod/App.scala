package typings.koaDashWebsocket.koaDashWebsocketMod

import typings.koa.koaMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App[StateT, CustomT] extends ^[StateT, CustomT] {
  var ws: Server[StateT, CustomT] = js.native
}

