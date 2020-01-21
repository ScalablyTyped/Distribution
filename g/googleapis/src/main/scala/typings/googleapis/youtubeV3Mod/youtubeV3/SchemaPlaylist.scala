package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A playlist resource represents a YouTube playlist. A playlist is a
  * collection of videos that can be viewed sequentially and shared with other
  * users. A playlist can contain up to 200 videos, and YouTube does not limit
  * the number of playlists that each user creates. By default, playlists are
  * publicly visible to other users, but playlists can be public or private.
  * YouTube also uses playlists to identify special collections of videos for a
  * channel, such as:   - uploaded videos  - favorite videos  - positively
  * rated (liked) videos  - watch history  - watch later  To be more specific,
  * these lists are associated with a channel, which is a collection of a
  * person, group, or company&#39;s videos, playlists, and other YouTube
  * information. You can retrieve the playlist IDs for each of these lists from
  * the  channel resource for a given channel.  You can then use the
  * playlistItems.list method to retrieve any of those lists. You can also add
  * or remove items from those lists by calling the   playlistItems.insert and
  * playlistItems.delete methods.
  */
@js.native
trait SchemaPlaylist extends js.Object {
  /**
    * The contentDetails object contains information like video count.
    */
  var contentDetails: js.UndefOr[SchemaPlaylistContentDetails] = js.native
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the playlist.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#playlist&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Localizations for different languages
    */
  var localizations: js.UndefOr[StringDictionary[SchemaPlaylistLocalization]] = js.native
  /**
    * The player object contains information that you would use to play the
    * playlist in an embedded player.
    */
  var player: js.UndefOr[SchemaPlaylistPlayer] = js.native
  /**
    * The snippet object contains basic details about the playlist, such as its
    * title and description.
    */
  var snippet: js.UndefOr[SchemaPlaylistSnippet] = js.native
  /**
    * The status object contains status information for the playlist.
    */
  var status: js.UndefOr[SchemaPlaylistStatus] = js.native
}

object SchemaPlaylist {
  @scala.inline
  def apply(
    contentDetails: SchemaPlaylistContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    localizations: StringDictionary[SchemaPlaylistLocalization] = null,
    player: SchemaPlaylistPlayer = null,
    snippet: SchemaPlaylistSnippet = null,
    status: SchemaPlaylistStatus = null
  ): SchemaPlaylist = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (localizations != null) __obj.updateDynamic("localizations")(localizations.asInstanceOf[js.Any])
    if (player != null) __obj.updateDynamic("player")(player.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlaylist]
  }
}

