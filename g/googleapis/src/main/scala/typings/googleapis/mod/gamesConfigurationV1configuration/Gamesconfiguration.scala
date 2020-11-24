package typings.googleapis.mod.gamesConfigurationV1configuration

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Play Game Services Publishing API
  *
  * The Publishing API for Google Play Game Services.
  *
  * @example
  * const {google} = require('googleapis');
  * const gamesConfiguration = google.gamesConfiguration('v1configuration');
  *
  * @namespace gamesConfiguration
  * @type {Function}
  * @version v1configuration
  * @variation v1configuration
  * @param {object=} options Options for Gamesconfiguration
  */
@JSImport("googleapis", "gamesConfiguration_v1configuration.Gamesconfiguration")
@js.native
class Gamesconfiguration protected ()
  extends typings.googleapis.v1configurationMod.gamesConfigurationV1configuration.Gamesconfiguration {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
