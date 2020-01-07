package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "kgsearch_v1")
@js.native
object kgsearch_v1 extends js.Object {
  /**
    * Knowledge Graph Search API
    *
    * Searches the Google Knowledge Graph for entities.
    *
    * @example
    * const {google} = require('googleapis');
    * const kgsearch = google.kgsearch('v1');
    *
    * @namespace kgsearch
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Kgsearch
    */
  @js.native
  class Kgsearch protected ()
    extends typings.googleapis.buildSrcApisKgsearchV1Mod.kgsearch_v1.Kgsearch {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Entities protected ()
    extends typings.googleapis.buildSrcApisKgsearchV1Mod.kgsearch_v1.Resource$Entities {
    def this(context: APIRequestContext) = this()
  }
  
}

