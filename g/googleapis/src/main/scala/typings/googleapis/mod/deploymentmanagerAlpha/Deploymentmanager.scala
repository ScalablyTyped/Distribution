package typings.googleapis.mod.deploymentmanagerAlpha

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Cloud Deployment Manager Alpha API
  *
  * The Deployment Manager API allows users to declaratively configure, deploy
  * and run complex solutions on the Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const deploymentmanager = google.deploymentmanager('alpha');
  *
  * @namespace deploymentmanager
  * @type {Function}
  * @version alpha
  * @variation alpha
  * @param {object=} options Options for Deploymentmanager
  */
@JSImport("googleapis", "deploymentmanager_alpha.Deploymentmanager")
@js.native
class Deploymentmanager protected ()
  extends typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.Deploymentmanager {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

