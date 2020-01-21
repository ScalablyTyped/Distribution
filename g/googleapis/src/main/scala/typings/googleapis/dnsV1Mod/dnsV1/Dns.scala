package typings.googleapis.dnsV1Mod.dnsV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Cloud DNS API
  *
  * Configures and serves authoritative DNS records.
  *
  * @example
  * const {google} = require('googleapis');
  * const dns = google.dns('v1');
  *
  * @namespace dns
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Dns
  */
@JSImport("googleapis/build/src/apis/dns/v1", "dns_v1.Dns")
@js.native
class Dns protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var changes: ResourceChanges = js.native
  var context: APIRequestContext = js.native
  var dnsKeys: ResourceDnskeys = js.native
  var managedZoneOperations: ResourceManagedzoneoperations = js.native
  var managedZones: ResourceManagedzones = js.native
  var projects: ResourceProjects = js.native
  var resourceRecordSets: ResourceResourcerecordsets = js.native
}

