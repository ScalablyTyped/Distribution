package typings.httpServer.mod

import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http-server", "createServer")
@js.native
object createServer extends js.Object {
  
  def apply(): Server | typings.node.httpsMod.Server = js.native
  def apply(options: Options): Server | typings.node.httpsMod.Server = js.native
}
