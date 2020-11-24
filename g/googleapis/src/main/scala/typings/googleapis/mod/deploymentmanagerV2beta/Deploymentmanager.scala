package typings.googleapis.mod.deploymentmanagerV2beta

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Cloud Deployment Manager API V2Beta Methods
  *
  * The Deployment Manager API allows users to declaratively configure, deploy
  * and run complex solutions on the Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const deploymentmanager = google.deploymentmanager('v2beta');
  *
  * @namespace deploymentmanager
  * @type {Function}
  * @version v2beta
  * @variation v2beta
  * @param {object=} options Options for Deploymentmanager
  */
@JSImport("googleapis", "deploymentmanager_v2beta.Deploymentmanager")
@js.native
class Deploymentmanager protected ()
  extends typings.googleapis.v2betaMod.deploymentmanagerV2beta.Deploymentmanager {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
