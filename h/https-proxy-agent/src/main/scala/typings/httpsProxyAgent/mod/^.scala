package typings.httpsProxyAgent.mod

import typings.node.httpsMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// HttpsProxyAgent doesnt *actually* extend https.Agent, but for my purposes I want it to pretend that it does
@JSImport("https-proxy-agent", JSImport.Namespace)
@js.native
class ^ protected () extends Agent {
  def this(opts: String) = this()
  def this(opts: HttpsProxyAgentOptions) = this()
}

