package typings
package httpsDashProxyDashAgentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpsDashProxyDashAgentMod {
  // HttpsProxyAgent doesnt *actually* extend https.Agent, but for my purposes I want it to pretend that it does
  type HttpsProxyAgent = nodeLib.httpsMod.Agent
}
