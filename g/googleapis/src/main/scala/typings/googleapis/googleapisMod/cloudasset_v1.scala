package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "cloudasset_v1")
@js.native
object cloudasset_v1 extends js.Object {
  /**
    * Cloud Asset API
    *
    * The cloud asset API manages the history and inventory of cloud resources.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudasset = google.cloudasset('v1');
    *
    * @namespace cloudasset
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Cloudasset
    */
  @js.native
  class Cloudasset protected ()
    extends typings.googleapis.buildSrcApisCloudassetV1Mod.cloudasset_v1.Cloudasset {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Operations protected ()
    extends typings.googleapis.buildSrcApisCloudassetV1Mod.cloudasset_v1.Resource$Operations {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$V1 protected ()
    extends typings.googleapis.buildSrcApisCloudassetV1Mod.cloudasset_v1.Resource$V1 {
    def this(context: APIRequestContext) = this()
  }
  
}

