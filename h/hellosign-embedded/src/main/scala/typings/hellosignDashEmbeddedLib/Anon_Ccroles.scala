package typings
package hellosignDashEmbeddedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ccroles extends js.Object {
  var cc_roles: js.Array[Anon_NameString]
  var message: java.lang.String
  var signer_roles: js.Array[Anon_Name]
  var title: java.lang.String
}

object Anon_Ccroles {
  @scala.inline
  def apply(
    cc_roles: js.Array[Anon_NameString],
    message: java.lang.String,
    signer_roles: js.Array[Anon_Name],
    title: java.lang.String
  ): Anon_Ccroles = {
    val __obj = js.Dynamic.literal(cc_roles = cc_roles, message = message, signer_roles = signer_roles, title = title)
  
    __obj.asInstanceOf[Anon_Ccroles]
  }
}

