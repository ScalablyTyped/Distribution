package typings.httpProxyAgent.mod

import typings.node.httpMod.Agent
import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpProxyAgent extends Agent {
  var proxy: Url = js.native
  var secureProxy: Boolean = js.native
}

