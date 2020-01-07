package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "adexperiencereport_v1")
@js.native
object adexperiencereport_v1 extends js.Object {
  /**
    * Ad Experience Report API
    *
    * Views Ad Experience Report data, and gets a list of sites that have a
    * significant number of annoying ads.
    *
    * @example
    * const {google} = require('googleapis');
    * const adexperiencereport = google.adexperiencereport('v1');
    *
    * @namespace adexperiencereport
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Adexperiencereport
    */
  @js.native
  class Adexperiencereport protected ()
    extends typings.googleapis.buildSrcApisAdexperiencereportV1Mod.adexperiencereport_v1.Adexperiencereport {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Sites protected ()
    extends typings.googleapis.buildSrcApisAdexperiencereportV1Mod.adexperiencereport_v1.Resource$Sites {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Violatingsites protected ()
    extends typings.googleapis.buildSrcApisAdexperiencereportV1Mod.adexperiencereport_v1.Resource$Violatingsites {
    def this(context: APIRequestContext) = this()
  }
  
}

