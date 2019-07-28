package typings.ldapjs.ldapjsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "LDAPMessage")
@js.native
abstract class LDAPMessage () extends js.Object {
  var controls: js.Array[Control] = js.native
  val dn: String = js.native
  val id: Double = js.native
  /** A plain object with main properties */
  val json: LDAPMessageJsonObject = js.native
  var log: js.Any = js.native
  var messageID: Double = js.native
  var protocolOp: js.UndefOr[String] = js.native
  val `type`: String = js.native
  def parse(ber: Buffer): Boolean = js.native
  def toBer(): Buffer = js.native
}

