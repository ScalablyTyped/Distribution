package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Diagnostics information about interconnect, contains detailed and current
  * technical information about Google?s side of the connection.
  */
@js.native
trait SchemaInterconnectDiagnostics extends js.Object {
  /**
    * A list of InterconnectDiagnostics.ARPEntry objects, describing individual
    * neighbors currently seen by the Google router in the ARP cache for the
    * Interconnect. This will be empty when the Interconnect is not bundled.
    */
  var arpCaches: js.UndefOr[js.Array[SchemaInterconnectDiagnosticsARPEntry]] = js.native
  /**
    * A list of InterconnectDiagnostics.LinkStatus objects, describing the
    * status for each link on the Interconnect.
    */
  var links: js.UndefOr[js.Array[SchemaInterconnectDiagnosticsLinkStatus]] = js.native
  /**
    * The MAC address of the Interconnect&#39;s bundle interface.
    */
  var macAddress: js.UndefOr[String] = js.native
}

object SchemaInterconnectDiagnostics {
  @scala.inline
  def apply(
    arpCaches: js.Array[SchemaInterconnectDiagnosticsARPEntry] = null,
    links: js.Array[SchemaInterconnectDiagnosticsLinkStatus] = null,
    macAddress: String = null
  ): SchemaInterconnectDiagnostics = {
    val __obj = js.Dynamic.literal()
    if (arpCaches != null) __obj.updateDynamic("arpCaches")(arpCaches.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (macAddress != null) __obj.updateDynamic("macAddress")(macAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterconnectDiagnostics]
  }
}

