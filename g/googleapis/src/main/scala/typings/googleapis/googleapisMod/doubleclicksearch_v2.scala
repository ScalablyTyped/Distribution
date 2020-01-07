package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "doubleclicksearch_v2")
@js.native
object doubleclicksearch_v2 extends js.Object {
  /**
    * DoubleClick Search API
    *
    * Reports and modifies your advertising data in DoubleClick Search (for
    * example, campaigns, ad groups, keywords, and conversions).
    *
    * @example
    * const {google} = require('googleapis');
    * const doubleclicksearch = google.doubleclicksearch('v2');
    *
    * @namespace doubleclicksearch
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Doubleclicksearch
    */
  @js.native
  class Doubleclicksearch protected ()
    extends typings.googleapis.buildSrcApisDoubleclicksearchV2Mod.doubleclicksearch_v2.Doubleclicksearch {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Conversion protected ()
    extends typings.googleapis.buildSrcApisDoubleclicksearchV2Mod.doubleclicksearch_v2.Resource$Conversion {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Reports protected ()
    extends typings.googleapis.buildSrcApisDoubleclicksearchV2Mod.doubleclicksearch_v2.Resource$Reports {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Savedcolumns protected ()
    extends typings.googleapis.buildSrcApisDoubleclicksearchV2Mod.doubleclicksearch_v2.Resource$Savedcolumns {
    def this(context: APIRequestContext) = this()
  }
  
}

