package typings.googleapis.googleapisMod.youtube_v3

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3.Youtube {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

