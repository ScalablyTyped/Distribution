package typings
package httpsDashProxyDashAgentLib.httpsDashProxyDashAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// HttpsProxyAgent doesnt *actually* extend https.Agent, but for my purposes I want it to pretend that it does
@JSImport("https-proxy-agent", JSImport.Namespace)
@js.native
class ^ protected () extends HttpsProxyAgent {
  def this(opts: HttpsProxyAgentOptions) = this()
  def this(opts: java.lang.String) = this()
}

