package typings.ldapjs.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createClient(): Client = js.native
  def createClient(options: ClientOptions): Client = js.native
  def createServer(): Server = js.native
  def createServer(options: ServerOptions): Server = js.native
  def parseDN(dn: String): js.Any = js.native
  def parseFilter(filterString: String): Filter = js.native
}

