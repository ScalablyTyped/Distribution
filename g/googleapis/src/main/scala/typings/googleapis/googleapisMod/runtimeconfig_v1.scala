package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "runtimeconfig_v1")
@js.native
object runtimeconfig_v1 extends js.Object {
  @js.native
  class Resource$Operations protected ()
    extends typings.googleapis.buildSrcApisRuntimeconfigV1Mod.runtimeconfig_v1.Resource$Operations {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Runtime Configuration API
    *
    * The Runtime Configurator allows you to dynamically configure and expose
    * variables through Google Cloud Platform. In addition, you can also set
    * Watchers and Waiters that will watch for changes to your data and return
    * based on certain conditions.
    *
    * @example
    * const {google} = require('googleapis');
    * const runtimeconfig = google.runtimeconfig('v1');
    *
    * @namespace runtimeconfig
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Runtimeconfig
    */
  @js.native
  class Runtimeconfig protected ()
    extends typings.googleapis.buildSrcApisRuntimeconfigV1Mod.runtimeconfig_v1.Runtimeconfig {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

