package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "appstate_v1")
@js.native
object appstate_v1 extends js.Object {
  /**
    * Google App State API
    *
    * The Google App State API.
    *
    * @example
    * const {google} = require('googleapis');
    * const appstate = google.appstate('v1');
    *
    * @namespace appstate
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Appstate
    */
  @js.native
  class Appstate protected ()
    extends typings.googleapis.buildSrcApisAppstateV1Mod.appstate_v1.Appstate {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$States protected ()
    extends typings.googleapis.buildSrcApisAppstateV1Mod.appstate_v1.Resource$States {
    def this(context: APIRequestContext) = this()
  }
  
}

