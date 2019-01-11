package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Change: ldapjsLib.Anon_Change = js.native
  def createClient(): ldapjsLib.ldapjsMod.Client = js.native
  def createClient(options: ldapjsLib.ldapjsMod.ClientOptions): ldapjsLib.ldapjsMod.Client = js.native
  def parseFilter(filterString: java.lang.String): ldapjsLib.ldapjsMod.Filter = js.native
}

