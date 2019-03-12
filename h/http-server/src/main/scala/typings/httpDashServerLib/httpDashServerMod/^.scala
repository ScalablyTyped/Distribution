package typings
package httpDashServerLib.httpDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createServer(): nodeLib.httpMod.Server | nodeLib.httpsMod.Server = js.native
  def createServer(options: Options): nodeLib.httpMod.Server | nodeLib.httpsMod.Server = js.native
}

