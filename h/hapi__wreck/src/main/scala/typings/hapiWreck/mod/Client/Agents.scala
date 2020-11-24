package typings.hapiWreck.mod.Client

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Agents extends js.Object {
  
  /**
    * The agent used for HTTP requests.
    */
  val http: Agent = js.native
  
  /**
    * The agent used for HTTPS requests.
    */
  val https: typings.node.httpsMod.Agent = js.native
  
  /**
    * The agent used for HTTPS requests which ignores unauthorized requests.
    */
  val httpsAllowUnauthorized: typings.node.httpsMod.Agent = js.native
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
  
  @scala.inline
  implicit class AgentsOps[Self <: Agents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHttp(value: Agent): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttps(value: typings.node.httpsMod.Agent): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpsAllowUnauthorized(value: typings.node.httpsMod.Agent): Self = this.set("httpsAllowUnauthorized", value.asInstanceOf[js.Any])
  }
}
