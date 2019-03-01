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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client4")(client4)
    __obj.updateDynamic("coneNat")(coneNat)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("microsoft")(microsoft)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("server4")(server4)
    __obj.updateDynamic("udpPort")(udpPort)
    __obj.asInstanceOf[TeredoProperties]
  }
}

