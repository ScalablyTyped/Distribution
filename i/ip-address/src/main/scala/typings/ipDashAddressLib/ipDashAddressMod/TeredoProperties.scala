package typings
package ipDashAddressLib.ipDashAddressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeredoProperties extends js.Object {
  var client4: Address4
  var coneNat: scala.Boolean
  var flags: java.lang.String
  var microsoft: ipDashAddressLib.Anon_GroupIndividual
  var prefix: java.lang.String
  var server4: Address4
  var udpPort: java.lang.String
}

object TeredoProperties {
  @scala.inline
  def apply(
    client4: Address4,
    coneNat: scala.Boolean,
    flags: java.lang.String,
    microsoft: ipDashAddressLib.Anon_GroupIndividual,
    prefix: java.lang.String,
    server4: Address4,
    udpPort: java.lang.String
  ): TeredoProperties = {
    val __obj = js.Dynamic.literal(client4 = client4, coneNat = coneNat, flags = flags, microsoft = microsoft, prefix = prefix, server4 = server4, udpPort = udpPort)
  
    __obj.asInstanceOf[TeredoProperties]
  }
}

