package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Change: ldapjsLib.Anon_Change = js.native
  def createClient(): Client = js.native
  def createClient(options: ClientOptions): Client = js.native
  def parseFilter(filterString: java.lang.String): Filter = js.native
}

