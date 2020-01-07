package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "indexing_v3")
@js.native
object indexing_v3 extends js.Object {
  /**
    * Indexing API
    *
    * Notifies Google when your web pages change.
    *
    * @example
    * const {google} = require('googleapis');
    * const indexing = google.indexing('v3');
    *
    * @namespace indexing
    * @type {Function}
    * @version v3
    * @variation v3
    * @param {object=} options Options for Indexing
    */
  @js.native
  class Indexing protected ()
    extends typings.googleapis.buildSrcApisIndexingV3Mod.indexing_v3.Indexing {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Urlnotifications protected ()
    extends typings.googleapis.buildSrcApisIndexingV3Mod.indexing_v3.Resource$Urlnotifications {
    def this(context: APIRequestContext) = this()
  }
  
}

