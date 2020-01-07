package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "serviceusage_v1")
@js.native
object serviceusage_v1 extends js.Object {
  @js.native
  class Resource$Operations protected ()
    extends typings.googleapis.buildSrcApisServiceusageV1Mod.serviceusage_v1.Resource$Operations {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Services protected ()
    extends typings.googleapis.buildSrcApisServiceusageV1Mod.serviceusage_v1.Resource$Services {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Service Usage API
    *
    * Enables services that service consumers want to use on Google Cloud
    * Platform, lists the available or enabled services, or disables services
    * that service consumers no longer use.
    *
    * @example
    * const {google} = require('googleapis');
    * const serviceusage = google.serviceusage('v1');
    *
    * @namespace serviceusage
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Serviceusage
    */
  @js.native
  class Serviceusage protected ()
    extends typings.googleapis.buildSrcApisServiceusageV1Mod.serviceusage_v1.Serviceusage {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

