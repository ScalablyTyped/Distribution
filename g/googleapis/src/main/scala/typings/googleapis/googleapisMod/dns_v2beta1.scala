package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "dns_v2beta1")
@js.native
object dns_v2beta1 extends js.Object {
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
  @js.native
  class Dns protected ()
    extends typings.googleapis.buildSrcApisDnsV2beta1Mod.dns_v2beta1.Dns {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Changes protected ()
    extends typings.googleapis.buildSrcApisDnsV2beta1Mod.dns_v2beta1.Resource$Changes {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Dnskeys protected ()
    extends typings.googleapis.buildSrcApisDnsV2beta1Mod.dns_v2beta1.Resource$Dnskeys {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Managedzoneoperations protected ()
    extends typings.googleapis.buildSrcApisDnsV2beta1Mod.dns_v2beta1.Resource$Managedzoneoperations {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Managedzones protected ()
    extends typings.googleapis.buildSrcApisDnsV2beta1Mod.dns_v2beta1.Resource$Managedzones {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Projects protected ()
    extends typings.googleapis.buildSrcApisDnsV2beta1Mod.dns_v2beta1.Resource$Projects {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Resourcerecordsets protected ()
    extends typings.googleapis.buildSrcApisDnsV2beta1Mod.dns_v2beta1.Resource$Resourcerecordsets {
    def this(context: APIRequestContext) = this()
  }
  
}

