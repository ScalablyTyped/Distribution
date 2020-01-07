package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "plusDomains_v1")
@js.native
object plusDomains_v1 extends js.Object {
  /**
    * Google+ Domains API
    *
    * Builds on top of the Google+ platform for Google Apps Domains.
    *
    * @example
    * const {google} = require('googleapis');
    * const plusDomains = google.plusDomains('v1');
    *
    * @namespace plusDomains
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Plusdomains
    */
  @js.native
  class Plusdomains protected ()
    extends typings.googleapis.buildSrcApisPlusDomainsV1Mod.plusDomains_v1.Plusdomains {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Activities protected ()
    extends typings.googleapis.buildSrcApisPlusDomainsV1Mod.plusDomains_v1.Resource$Activities {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Audiences protected ()
    extends typings.googleapis.buildSrcApisPlusDomainsV1Mod.plusDomains_v1.Resource$Audiences {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Circles protected ()
    extends typings.googleapis.buildSrcApisPlusDomainsV1Mod.plusDomains_v1.Resource$Circles {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Comments protected ()
    extends typings.googleapis.buildSrcApisPlusDomainsV1Mod.plusDomains_v1.Resource$Comments {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Media protected ()
    extends typings.googleapis.buildSrcApisPlusDomainsV1Mod.plusDomains_v1.Resource$Media {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$People protected ()
    extends typings.googleapis.buildSrcApisPlusDomainsV1Mod.plusDomains_v1.Resource$People {
    def this(context: APIRequestContext) = this()
  }
  
}

