package typings.googleapis.mod.youtubeV3

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * YouTube Data API
  *
  * Supports core YouTube features, such as uploading videos, creating and
  * managing playlists, searching for content, and much more.
  *
  * @example
  * const {google} = require('googleapis');
  * const youtube = google.youtube('v3');
  *
  * @namespace youtube
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Youtube
  */
@JSImport("googleapis", "youtube_v3.Youtube")
@js.native
class Youtube protected ()
  extends typings.googleapis.youtubeV3Mod.youtubeV3.Youtube {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
