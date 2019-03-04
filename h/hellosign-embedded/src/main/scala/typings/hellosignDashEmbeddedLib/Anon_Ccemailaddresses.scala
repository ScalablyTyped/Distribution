package typings
package hellosignDashEmbeddedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ccemailaddresses extends js.Object {
  var cc_email_addresses: js.Array[java.lang.String]
  var message: java.lang.String
  var signatures: js.Array[Anon_Haspin]
  var title: java.lang.String
}

object Anon_Ccemailaddresses {
  @scala.inline
  def apply(
    cc_email_addresses: js.Array[java.lang.String],
    message: java.lang.String,
    signatures: js.Array[Anon_Haspin],
    title: java.lang.String
  ): Anon_Ccemailaddresses = {
    val __obj = js.Dynamic.literal(cc_email_addresses = cc_email_addresses, message = message, signatures = signatures, title = title)
  
    __obj.asInstanceOf[Anon_Ccemailaddresses]
  }
}

