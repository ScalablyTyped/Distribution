package typings
package googlepayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProtocolVersion extends js.Object {
  var protocolVersion: java.lang.String
  var publicKey: java.lang.String
}

object Anon_ProtocolVersion {
  @scala.inline
  def apply(protocolVersion: java.lang.String, publicKey: java.lang.String): Anon_ProtocolVersion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("protocolVersion")(protocolVersion)
    __obj.updateDynamic("publicKey")(publicKey)
    __obj.asInstanceOf[Anon_ProtocolVersion]
  }
}

