package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plusDomainsV1 {
  
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
  @JSImport("googleapis", "plusDomains_v1.Plusdomains")
  @js.native
  class Plusdomains protected ()
    extends typings.googleapis.plusDomainsV1Mod.plusDomainsV1.Plusdomains {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "plusDomains_v1.Resource$Activities")
  @js.native
  class ResourceActivities protected ()
    extends typings.googleapis.plusDomainsV1Mod.plusDomainsV1.ResourceActivities {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "plusDomains_v1.Resource$Audiences")
  @js.native
  class ResourceAudiences protected ()
    extends typings.googleapis.plusDomainsV1Mod.plusDomainsV1.ResourceAudiences {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "plusDomains_v1.Resource$Circles")
  @js.native
  class ResourceCircles protected ()
    extends typings.googleapis.plusDomainsV1Mod.plusDomainsV1.ResourceCircles {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "plusDomains_v1.Resource$Comments")
  @js.native
  class ResourceComments protected ()
    extends typings.googleapis.plusDomainsV1Mod.plusDomainsV1.ResourceComments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "plusDomains_v1.Resource$Media")
  @js.native
  class ResourceMedia protected ()
    extends typings.googleapis.plusDomainsV1Mod.plusDomainsV1.ResourceMedia {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "plusDomains_v1.Resource$People")
  @js.native
  class ResourcePeople protected ()
    extends typings.googleapis.plusDomainsV1Mod.plusDomainsV1.ResourcePeople {
    def this(context: APIRequestContext) = this()
  }
}
