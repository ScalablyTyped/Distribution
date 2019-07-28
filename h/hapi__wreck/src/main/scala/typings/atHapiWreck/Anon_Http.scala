package typings.atHapiWreck

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Http extends js.Object {
  var http: Agent
  var https: Agent
  var httpsAllowUnauthorized: Agent
}

object Anon_Http {
  @scala.inline
  def apply(http: Agent, https: Agent, httpsAllowUnauthorized: Agent): Anon_Http = {
    val __obj = js.Dynamic.literal(http = http, https = https, httpsAllowUnauthorized = httpsAllowUnauthorized)
  
    __obj.asInstanceOf[Anon_Http]
  }
}

