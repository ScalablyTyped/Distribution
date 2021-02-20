package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeconfigV1 {
  
  @JSImport("googleapis", "runtimeconfig_v1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.runtimeconfigV1Mod.runtimeconfigV1.ResourceOperations {
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
  @JSImport("googleapis", "runtimeconfig_v1.Runtimeconfig")
  @js.native
  class Runtimeconfig protected ()
    extends typings.googleapis.runtimeconfigV1Mod.runtimeconfigV1.Runtimeconfig {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
