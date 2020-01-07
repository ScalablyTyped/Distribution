package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "servicecontrol_v1")
@js.native
object servicecontrol_v1 extends js.Object {
  @js.native
  class Resource$Services protected ()
    extends typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1.Resource$Services {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Service Control API
    *
    * Provides control plane functionality to managed services, such as logging,
    * monitoring, and status checks.
    *
    * @example
    * const {google} = require('googleapis');
    * const servicecontrol = google.servicecontrol('v1');
    *
    * @namespace servicecontrol
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Servicecontrol
    */
  @js.native
  class Servicecontrol protected ()
    extends typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1.Servicecontrol {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

