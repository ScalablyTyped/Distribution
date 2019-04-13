package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "LDAPResult")
@js.native
class LDAPResult () extends LDAPMessage {
  var connection: js.Any = js.native
  var errorMessage: java.lang.String = js.native
  var matchedDN: java.lang.String = js.native
  var referrals: js.Array[java.lang.String] = js.native
  /** Result status 0 = success */
  var status: scala.Double = js.native
  @JSName("type")
  val type_LDAPResult: ldapjsLib.ldapjsLibStrings.LDAPResult = js.native
}

