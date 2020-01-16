package typings.atHapiWreck.atHapiWreckMod.Client

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Agents extends js.Object {
  /**
    * The agent used for HTTP requests.
    */
  val http: Agent
  /**
    * The agent used for HTTPS requests.
    */
  val https: typings.node.httpsMod.Agent
  /**
    * The agent used for HTTPS requests which ignores unauthorized requests.
    */
  val httpsAllowUnauthorized: typings.node.httpsMod.Agent
}

object Agents {
  @scala.inline
  def apply(
    http: Agent,
    https: typings.node.httpsMod.Agent,
    httpsAllowUnauthorized: typings.node.httpsMod.Agent
  ): Agents = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any], httpsAllowUnauthorized = httpsAllowUnauthorized.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Agents]
  }
}

