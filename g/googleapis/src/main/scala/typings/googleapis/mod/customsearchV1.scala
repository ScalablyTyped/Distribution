package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customsearchV1 {
  
  /**
    * CustomSearch API
    *
    * Searches over a website or collection of websites
    *
    * @example
    * const {google} = require('googleapis');
    * const customsearch = google.customsearch('v1');
    *
    * @namespace customsearch
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Customsearch
    */
  @JSImport("googleapis", "customsearch_v1.Customsearch")
  @js.native
  class Customsearch protected ()
    extends typings.googleapis.customsearchV1Mod.customsearchV1.Customsearch {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "customsearch_v1.Resource$Cse")
  @js.native
  class ResourceCse protected ()
    extends typings.googleapis.customsearchV1Mod.customsearchV1.ResourceCse {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "customsearch_v1.Resource$Cse$Siterestrict")
  @js.native
  class ResourceCseSiterestrict protected ()
    extends typings.googleapis.customsearchV1Mod.customsearchV1.ResourceCseSiterestrict {
    def this(context: APIRequestContext) = this()
  }
}
