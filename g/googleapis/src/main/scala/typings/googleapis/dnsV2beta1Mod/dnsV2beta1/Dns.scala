package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dns/v2beta1", "dns_v2beta1.Dns")
@js.native
open class Dns protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var changes: ResourceChanges = js.native
  
  var context: APIRequestContext = js.native
  
  var dnsKeys: ResourceDnskeys = js.native
  
  var managedZoneOperations: ResourceManagedzoneoperations = js.native
  
  var managedZones: ResourceManagedzones = js.native
  
  var policies: ResourcePolicies = js.native
  
  var projects: ResourceProjects = js.native
  
  var resourceRecordSets: ResourceResourcerecordsets = js.native
}
