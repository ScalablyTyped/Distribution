package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "webmasters_v3")
@js.native
object webmasters_v3 extends js.Object {
  @js.native
  class Resource$Searchanalytics protected ()
    extends typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3.Resource$Searchanalytics {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Sitemaps protected ()
    extends typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3.Resource$Sitemaps {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Sites protected ()
    extends typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3.Resource$Sites {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Urlcrawlerrorscounts protected ()
    extends typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3.Resource$Urlcrawlerrorscounts {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Urlcrawlerrorssamples protected ()
    extends typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3.Resource$Urlcrawlerrorssamples {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Search Console API
    *
    * View Google Search Console data for your verified sites.
    *
    * @example
    * const {google} = require('googleapis');
    * const webmasters = google.webmasters('v3');
    *
    * @namespace webmasters
    * @type {Function}
    * @version v3
    * @variation v3
    * @param {object=} options Options for Webmasters
    */
  @js.native
  class Webmasters protected ()
    extends typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3.Webmasters {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

