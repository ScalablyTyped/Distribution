package typings.lyricist.lyricistMod

import typings.lyricist.Anon_Acceptedannotations
import typings.lyricist.Anon_Excludedpermissions
import typings.lyricist.Anon_Songs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Song ============================================================================================
trait Song extends js.Object {
  var album: js.UndefOr[js.Any] = js.undefined
  var annotation_count: Double
  var api_path: String
  var apple_music_id: js.UndefOr[js.Any] = js.undefined
  var apple_music_player_url: String
  var current_user_metadata: Anon_Excludedpermissions
  var custom_performances: js.Array[_]
  var description: Description
  var description_annotation: DescriptionAnnotation
  var embed_content: String
  var featured_artists: js.Array[_]
  var featured_video: Boolean
  var full_title: String
  var header_image_thumbnail_url: String
  var header_image_url: String
  var id: Double
  var lyrics: String
  var lyrics_marked_complete_by: js.UndefOr[js.Any] = js.undefined
  var lyrics_owner_id: Double
  var lyrics_state: String
  var media: js.Array[Media]
  var path: String
  var primary_artist: ArtistBrief
  var producer_artists: js.Array[ArtistBrief]
  var pyongs_count: js.UndefOr[js.Any] = js.undefined
  var recording_location: js.UndefOr[js.Any] = js.undefined
  var release_date: String
  var song_art_image_thumbnail_url: String
  var song_art_image_url: String
  var song_relationships: js.Array[Anon_Songs]
  var stats: Anon_Acceptedannotations
  var title: String
  var title_with_featured: String
  var url: String
  var verified_annotations_by: js.Array[_]
  var verified_contributors: js.Array[_]
  var verified_lyrics_by: js.Array[_]
  var writer_artists: js.Array[ArtistBrief]
}

object Song {
  @scala.inline
  def apply(
    annotation_count: Double,
    api_path: String,
    apple_music_player_url: String,
    current_user_metadata: Anon_Excludedpermissions,
    custom_performances: js.Array[_],
    description: Description,
    description_annotation: DescriptionAnnotation,
    embed_content: String,
    featured_artists: js.Array[_],
    featured_video: Boolean,
    full_title: String,
    header_image_thumbnail_url: String,
    header_image_url: String,
    id: Double,
    lyrics: String,
    lyrics_owner_id: Double,
    lyrics_state: String,
    media: js.Array[Media],
    path: String,
    primary_artist: ArtistBrief,
    producer_artists: js.Array[ArtistBrief],
    release_date: String,
    song_art_image_thumbnail_url: String,
    song_art_image_url: String,
    song_relationships: js.Array[Anon_Songs],
    stats: Anon_Acceptedannotations,
    title: String,
    title_with_featured: String,
    url: String,
    verified_annotations_by: js.Array[_],
    verified_contributors: js.Array[_],
    verified_lyrics_by: js.Array[_],
    writer_artists: js.Array[ArtistBrief],
    album: js.Any = null,
    apple_music_id: js.Any = null,
    lyrics_marked_complete_by: js.Any = null,
    pyongs_count: js.Any = null,
    recording_location: js.Any = null
  ): Song = {
    val __obj = js.Dynamic.literal(annotation_count = annotation_count.asInstanceOf[js.Any], api_path = api_path.asInstanceOf[js.Any], apple_music_player_url = apple_music_player_url.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], custom_performances = custom_performances.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], description_annotation = description_annotation.asInstanceOf[js.Any], embed_content = embed_content.asInstanceOf[js.Any], featured_artists = featured_artists.asInstanceOf[js.Any], featured_video = featured_video.asInstanceOf[js.Any], full_title = full_title.asInstanceOf[js.Any], header_image_thumbnail_url = header_image_thumbnail_url.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lyrics = lyrics.asInstanceOf[js.Any], lyrics_owner_id = lyrics_owner_id.asInstanceOf[js.Any], lyrics_state = lyrics_state.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], primary_artist = primary_artist.asInstanceOf[js.Any], producer_artists = producer_artists.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], song_art_image_thumbnail_url = song_art_image_thumbnail_url.asInstanceOf[js.Any], song_art_image_url = song_art_image_url.asInstanceOf[js.Any], song_relationships = song_relationships.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], title_with_featured = title_with_featured.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified_annotations_by = verified_annotations_by.asInstanceOf[js.Any], verified_contributors = verified_contributors.asInstanceOf[js.Any], verified_lyrics_by = verified_lyrics_by.asInstanceOf[js.Any], writer_artists = writer_artists.asInstanceOf[js.Any])
    if (album != null) __obj.updateDynamic("album")(album.asInstanceOf[js.Any])
    if (apple_music_id != null) __obj.updateDynamic("apple_music_id")(apple_music_id.asInstanceOf[js.Any])
    if (lyrics_marked_complete_by != null) __obj.updateDynamic("lyrics_marked_complete_by")(lyrics_marked_complete_by.asInstanceOf[js.Any])
    if (pyongs_count != null) __obj.updateDynamic("pyongs_count")(pyongs_count.asInstanceOf[js.Any])
    if (recording_location != null) __obj.updateDynamic("recording_location")(recording_location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Song]
  }
}

