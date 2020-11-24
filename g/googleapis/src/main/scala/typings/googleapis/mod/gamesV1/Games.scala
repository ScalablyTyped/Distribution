package typings.googleapis.mod.gamesV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Play Game Services API
  *
  * The API for Google Play Game Services.
  *
  * @example
  * const {google} = require('googleapis');
  * const games = google.games('v1');
  *
  * @namespace games
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Games
  */
@JSImport("googleapis", "games_v1.Games")
@js.native
class Games protected ()
  extends typings.googleapis.gamesV1Mod.gamesV1.Games {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
