package typings.httpsProxyAgent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // HttpsProxyAgent doesnt *actually* extend https.Agent, but for my purposes I want it to pretend that it does
  type HttpsProxyAgent = typings.node.httpsMod.Agent
}
