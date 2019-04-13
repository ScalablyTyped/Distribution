package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "LDAPMessage")
@js.native
abstract class LDAPMessage () extends js.Object {
  var controls: js.Array[Control] = js.native
  val dn: java.lang.String = js.native
  val id: scala.Double = js.native
  /** A plain object with main properties */
  val json: LDAPMessageJsonObject = js.native
  var log: js.Any = js.native
  var messageID: scala.Double = js.native
  var protocolOp: js.UndefOr[java.lang.String] = js.native
  val `type`: java.lang.String = js.native
  def parse(ber: nodeLib.Buffer): scala.Boolean = js.native
  def toBer(): nodeLib.Buffer = js.native
}

