package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dnsV1beta2 {
  
  /**
    * Google Cloud DNS API
    *
    * Configures and serves authoritative DNS records.
    *
    * @example
    * const {google} = require('googleapis');
    * const dns = google.dns('v1beta2');
    *
    * @namespace dns
    * @type {Function}
    * @version v1beta2
    * @variation v1beta2
    * @param {object=} options Options for Dns
    */
  @JSImport("googleapis", "dns_v1beta2.Dns")
  @js.native
  class Dns protected ()
    extends typings.googleapis.dnsV1beta2Mod.dnsV1beta2.Dns {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "dns_v1beta2.Resource$Changes")
  @js.native
  class ResourceChanges protected ()
    extends typings.googleapis.dnsV1beta2Mod.dnsV1beta2.ResourceChanges {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dns_v1beta2.Resource$Dnskeys")
  @js.native
  class ResourceDnskeys protected ()
    extends typings.googleapis.dnsV1beta2Mod.dnsV1beta2.ResourceDnskeys {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dns_v1beta2.Resource$Managedzoneoperations")
  @js.native
  class ResourceManagedzoneoperations protected ()
    extends typings.googleapis.dnsV1beta2Mod.dnsV1beta2.ResourceManagedzoneoperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dns_v1beta2.Resource$Managedzones")
  @js.native
  class ResourceManagedzones protected ()
    extends typings.googleapis.dnsV1beta2Mod.dnsV1beta2.ResourceManagedzones {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dns_v1beta2.Resource$Policies")
  @js.native
  class ResourcePolicies protected ()
    extends typings.googleapis.dnsV1beta2Mod.dnsV1beta2.ResourcePolicies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dns_v1beta2.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.dnsV1beta2Mod.dnsV1beta2.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dns_v1beta2.Resource$Resourcerecordsets")
  @js.native
  class ResourceResourcerecordsets protected ()
    extends typings.googleapis.dnsV1beta2Mod.dnsV1beta2.ResourceResourcerecordsets {
    def this(context: APIRequestContext) = this()
  }
}
