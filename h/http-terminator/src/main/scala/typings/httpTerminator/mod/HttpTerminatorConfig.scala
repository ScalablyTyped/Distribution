package typings.httpTerminator.mod

import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpTerminatorConfig extends js.Object {
  
  /**
    * Number of milliseconds to allow for the active sockets to complete
    * serving the response (default: 5000).
    */
  var gracefulTerminationTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Intsance of http.Server or https.Server.
    */
  var server: Server | typings.node.httpsMod.Server = js.native
}
object HttpTerminatorConfig {
  
  @scala.inline
  def apply(server: Server | typings.node.httpsMod.Server): HttpTerminatorConfig = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpTerminatorConfig]
  }
  
  @scala.inline
  implicit class HttpTerminatorConfigOps[Self <: HttpTerminatorConfig] (val x: Self) extends AnyVal {
    
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
    def setServer(value: Server | typings.node.httpsMod.Server): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGracefulTerminationTimeout(value: Double): Self = this.set("gracefulTerminationTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGracefulTerminationTimeout: Self = this.set("gracefulTerminationTimeout", js.undefined)
  }
}
