package typings.ipDashAddress.ipDashAddressMod

import typings.ipDashAddress.Anon_GroupIndividual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeredoProperties extends js.Object {
  var client4: Address4
  var coneNat: Boolean
  var flags: String
  var microsoft: Anon_GroupIndividual
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
    microsoft: Anon_GroupIndividual,
    prefix: String,
    server4: Address4,
    udpPort: String
  ): TeredoProperties = {
    val __obj = js.Dynamic.literal(client4 = client4, coneNat = coneNat, flags = flags, microsoft = microsoft, prefix = prefix, server4 = server4, udpPort = udpPort)
  
    __obj.asInstanceOf[TeredoProperties]
  }
}

