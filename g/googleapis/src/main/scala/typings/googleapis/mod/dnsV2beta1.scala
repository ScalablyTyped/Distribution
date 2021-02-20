package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dnsV2beta1 {
  
  /**
    * Google Cloud DNS API
    *
    * Configures and serves authoritative DNS records.
    *
    * @example
    * const {google} = require('googleapis');
    * const dns = google.dns('v2beta1');
    *
    * @namespace dns
    * @type {Function}
    * @version v2beta1
    * @variation v2beta1
    * @param {object=} options Options for Dns
    */
  @JSImport("googleapis", "dns_v2beta1.Dns")
  @js.native
  class Dns protected ()
    extends typings.googleapis.dnsV2beta1Mod.dnsV2beta1.Dns {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "dns_v2beta1.Resource$Changes")
  @js.native
  class ResourceChanges protected ()
    extends typings.googleapis.dnsV2beta1Mod.dnsV2beta1.ResourceChanges {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dns_v2beta1.Resource$Dnskeys")
  @js.native
  class ResourceDnskeys protected ()
    extends typings.googleapis.dnsV2beta1Mod.dnsV2beta1.ResourceDnskeys {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dns_v2beta1.Resource$Managedzoneoperations")
  @js.native
  class ResourceManagedzoneoperations protected ()
    extends typings.googleapis.dnsV2beta1Mod.dnsV2beta1.ResourceManagedzoneoperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dns_v2beta1.Resource$Managedzones")
  @js.native
  class ResourceManagedzones protected ()
    extends typings.googleapis.dnsV2beta1Mod.dnsV2beta1.ResourceManagedzones {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dns_v2beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.dnsV2beta1Mod.dnsV2beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "dns_v2beta1.Resource$Resourcerecordsets")
  @js.native
  class ResourceResourcerecordsets protected ()
    extends typings.googleapis.dnsV2beta1Mod.dnsV2beta1.ResourceResourcerecordsets {
    def this(context: APIRequestContext) = this()
  }
}
