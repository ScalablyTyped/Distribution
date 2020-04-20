package typings.ipAddress.mod

import typings.ipAddress.AnonGroupIndividual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeredoProperties extends js.Object {
  var client4: Address4
  var coneNat: Boolean
  var flags: String
  var microsoft: AnonGroupIndividual
  var prefix: String
  var server4: Address4
  var udpPort: String
}

object TeredoProperties {
  @scala.inline
  def apply(
    client4: Address4,
    coneNat: Boolean,
    flags: String,
    microsoft: AnonGroupIndividual,
    prefix: String,
    server4: Address4,
    udpPort: String
  ): TeredoProperties = {
    val __obj = js.Dynamic.literal(client4 = client4.asInstanceOf[js.Any], coneNat = coneNat.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], microsoft = microsoft.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], server4 = server4.asInstanceOf[js.Any], udpPort = udpPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeredoProperties]
  }
}

