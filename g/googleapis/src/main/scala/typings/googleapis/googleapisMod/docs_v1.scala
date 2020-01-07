package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "docs_v1")
@js.native
object docs_v1 extends js.Object {
  /**
    * Google Docs API
    *
    * Reads and writes Google Docs documents.
    *
    * @example
    * const {google} = require('googleapis');
    * const docs = google.docs('v1');
    *
    * @namespace docs
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Docs
    */
  @js.native
  class Docs protected ()
    extends typings.googleapis.buildSrcApisDocsV1Mod.docs_v1.Docs {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Documents protected ()
    extends typings.googleapis.buildSrcApisDocsV1Mod.docs_v1.Resource$Documents {
    def this(context: APIRequestContext) = this()
  }
  
}

