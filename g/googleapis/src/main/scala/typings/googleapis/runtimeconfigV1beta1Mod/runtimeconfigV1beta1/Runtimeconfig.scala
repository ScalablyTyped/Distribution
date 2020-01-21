package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("googleapis/build/src/apis/runtimeconfig/v1beta1", "runtimeconfig_v1beta1.Runtimeconfig")
@js.native
class Runtimeconfig protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: ResourceProjects = js.native
}

