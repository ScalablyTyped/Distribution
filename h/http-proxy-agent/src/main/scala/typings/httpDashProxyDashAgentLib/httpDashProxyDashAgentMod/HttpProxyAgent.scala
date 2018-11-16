package typings
package httpDashProxyDashAgentLib.httpDashProxyDashAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpProxyAgent
  extends nodeLib.httpMod.Agent {
  var proxy: nodeLib.urlMod.Url = js.native
  var secureProxy: scala.Boolean = js.native
}

