package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "licensing_v1")
@js.native
object licensing_v1 extends js.Object {
  /**
    * Enterprise License Manager API
    *
    * Views and manages licenses for your domain.
    *
    * @example
    * const {google} = require('googleapis');
    * const licensing = google.licensing('v1');
    *
    * @namespace licensing
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Licensing
    */
  @js.native
  class Licensing protected ()
    extends typings.googleapis.buildSrcApisLicensingV1Mod.licensing_v1.Licensing {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Licenseassignments protected ()
    extends typings.googleapis.buildSrcApisLicensingV1Mod.licensing_v1.Resource$Licenseassignments {
    def this(context: APIRequestContext) = this()
  }
  
}

