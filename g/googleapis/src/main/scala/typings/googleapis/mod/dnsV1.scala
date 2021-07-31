package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dnsV1 {
  
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
  @JSImport("googleapis", "dns_v1.Dns")
  @js.native
  class Dns protected ()
    extends typings.googleapis.dnsV1Mod.dnsV1.Dns {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "dns_v1.Resource$Changes")
  @js.native
  class ResourceChanges protected ()
    extends typings.googleapis.dnsV1Mod.dnsV1.ResourceChanges {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dns_v1.Resource$Dnskeys")
  @js.native
  class ResourceDnskeys protected ()
    extends typings.googleapis.dnsV1Mod.dnsV1.ResourceDnskeys {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dns_v1.Resource$Managedzoneoperations")
  @js.native
  class ResourceManagedzoneoperations protected ()
    extends typings.googleapis.dnsV1Mod.dnsV1.ResourceManagedzoneoperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dns_v1.Resource$Managedzones")
  @js.native
  class ResourceManagedzones protected ()
    extends typings.googleapis.dnsV1Mod.dnsV1.ResourceManagedzones {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dns_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.dnsV1Mod.dnsV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dns_v1.Resource$Resourcerecordsets")
  @js.native
  class ResourceResourcerecordsets protected ()
    extends typings.googleapis.dnsV1Mod.dnsV1.ResourceResourcerecordsets {
    def this(context: APIRequestContext) = this()
  }
}
