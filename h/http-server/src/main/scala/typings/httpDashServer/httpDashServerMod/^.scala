package typings.httpDashServer.httpDashServerMod

import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createServer(): Server | typings.node.httpsMod.Server = js.native
  def createServer(options: Options): Server | typings.node.httpsMod.Server = js.native
}

