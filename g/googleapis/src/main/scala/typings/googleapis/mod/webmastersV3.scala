package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webmastersV3 {
  
  @JSImport("googleapis", "webmasters_v3.Resource$Searchanalytics")
  @js.native
  class ResourceSearchanalytics protected ()
    extends typings.googleapis.webmastersV3Mod.webmastersV3.ResourceSearchanalytics {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "webmasters_v3.Resource$Sitemaps")
  @js.native
  class ResourceSitemaps protected ()
    extends typings.googleapis.webmastersV3Mod.webmastersV3.ResourceSitemaps {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "webmasters_v3.Resource$Sites")
  @js.native
  class ResourceSites protected ()
    extends typings.googleapis.webmastersV3Mod.webmastersV3.ResourceSites {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "webmasters_v3.Resource$Urlcrawlerrorscounts")
  @js.native
  class ResourceUrlcrawlerrorscounts protected ()
    extends typings.googleapis.webmastersV3Mod.webmastersV3.ResourceUrlcrawlerrorscounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "webmasters_v3.Resource$Urlcrawlerrorssamples")
  @js.native
  class ResourceUrlcrawlerrorssamples protected ()
    extends typings.googleapis.webmastersV3Mod.webmastersV3.ResourceUrlcrawlerrorssamples {
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
  @JSImport("googleapis", "webmasters_v3.Webmasters")
  @js.native
  class Webmasters protected ()
    extends typings.googleapis.webmastersV3Mod.webmastersV3.Webmasters {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
