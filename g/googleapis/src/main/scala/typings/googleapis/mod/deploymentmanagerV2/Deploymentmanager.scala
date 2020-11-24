package typings.googleapis.mod.deploymentmanagerV2

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Cloud Deployment Manager API
  *
  * Declares, configures, and deploys complex solutions on Google Cloud
  * Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const deploymentmanager = google.deploymentmanager('v2');
  *
  * @namespace deploymentmanager
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Deploymentmanager
  */
@JSImport("googleapis", "deploymentmanager_v2.Deploymentmanager")
@js.native
class Deploymentmanager protected ()
  extends typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.Deploymentmanager {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
