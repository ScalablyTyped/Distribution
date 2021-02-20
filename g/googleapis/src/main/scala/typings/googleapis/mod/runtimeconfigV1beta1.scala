package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeconfigV1beta1 {
  
  @JSImport("googleapis", "runtimeconfig_v1beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "runtimeconfig_v1beta1.Resource$Projects$Configs")
  @js.native
  class ResourceProjectsConfigs protected ()
    extends typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1.ResourceProjectsConfigs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "runtimeconfig_v1beta1.Resource$Projects$Configs$Operations")
  @js.native
  class ResourceProjectsConfigsOperations protected ()
    extends typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1.ResourceProjectsConfigsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "runtimeconfig_v1beta1.Resource$Projects$Configs$Variables")
  @js.native
  class ResourceProjectsConfigsVariables protected ()
    extends typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1.ResourceProjectsConfigsVariables {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "runtimeconfig_v1beta1.Resource$Projects$Configs$Waiters")
  @js.native
  class ResourceProjectsConfigsWaiters protected ()
    extends typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1.ResourceProjectsConfigsWaiters {
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
    * const runtimeconfig = google.runtimeconfig('v1beta1');
    *
    * @namespace runtimeconfig
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Runtimeconfig
    */
  @JSImport("googleapis", "runtimeconfig_v1beta1.Runtimeconfig")
  @js.native
  class Runtimeconfig protected ()
    extends typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1.Runtimeconfig {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
