package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "groupssettings_v1")
@js.native
object groupssettings_v1 extends js.Object {
  /**
    * Groups Settings API
    *
    * Manages permission levels and related settings of a group.
    *
    * @example
    * const {google} = require('googleapis');
    * const groupssettings = google.groupssettings('v1');
    *
    * @namespace groupssettings
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Groupssettings
    */
  @js.native
  class Groupssettings protected ()
    extends typings.googleapis.buildSrcApisGroupssettingsV1Mod.groupssettings_v1.Groupssettings {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Groups protected ()
    extends typings.googleapis.buildSrcApisGroupssettingsV1Mod.groupssettings_v1.Resource$Groups {
    def this(context: APIRequestContext) = this()
  }
  
}

