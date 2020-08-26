package typings.lyricist.mod

import typings.lyricist.anon.Acceptedannotations
import typings.lyricist.anon.Excludedpermissions
import typings.lyricist.anon.Songs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Song ============================================================================================
@js.native
trait Song extends js.Object {
  var album: js.UndefOr[js.Any] = js.native
  var annotation_count: Double = js.native
  var api_path: String = js.native
  var apple_music_id: js.UndefOr[js.Any] = js.native
  var apple_music_player_url: String = js.native
  var current_user_metadata: Excludedpermissions = js.native
  var custom_performances: js.Array[_] = js.native
  var description: Description = js.native
  var description_annotation: DescriptionAnnotation = js.native
  var embed_content: String = js.native
  var featured_artists: js.Array[_] = js.native
  var featured_video: Boolean = js.native
  var full_title: String = js.native
  var header_image_thumbnail_url: String = js.native
  var header_image_url: String = js.native
  var id: Double = js.native
  var lyrics: String = js.native
  var lyrics_marked_complete_by: js.UndefOr[js.Any] = js.native
  var lyrics_owner_id: Double = js.native
  var lyrics_state: String = js.native
  var media: js.Array[Media] = js.native
  var path: String = js.native
  var primary_artist: ArtistBrief = js.native
  var producer_artists: js.Array[ArtistBrief] = js.native
  var pyongs_count: js.UndefOr[js.Any] = js.native
  var recording_location: js.UndefOr[js.Any] = js.native
  var release_date: String = js.native
  var song_art_image_thumbnail_url: String = js.native
  var song_art_image_url: String = js.native
  var song_relationships: js.Array[Songs] = js.native
  var stats: Acceptedannotations = js.native
  var title: String = js.native
  var title_with_featured: String = js.native
  var url: String = js.native
  var verified_annotations_by: js.Array[_] = js.native
  var verified_contributors: js.Array[_] = js.native
  var verified_lyrics_by: js.Array[_] = js.native
  var writer_artists: js.Array[ArtistBrief] = js.native
}

object Song {
  @scala.inline
  def apply(
    annotation_count: Double,
    api_path: String,
    apple_music_player_url: String,
    current_user_metadata: Excludedpermissions,
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
    song_relationships: js.Array[Songs],
    stats: Acceptedannotations,
    title: String,
    title_with_featured: String,
    url: String,
    verified_annotations_by: js.Array[_],
    verified_contributors: js.Array[_],
    verified_lyrics_by: js.Array[_],
    writer_artists: js.Array[ArtistBrief]
  ): Song = {
    val __obj = js.Dynamic.literal(annotation_count = annotation_count.asInstanceOf[js.Any], api_path = api_path.asInstanceOf[js.Any], apple_music_player_url = apple_music_player_url.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], custom_performances = custom_performances.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], description_annotation = description_annotation.asInstanceOf[js.Any], embed_content = embed_content.asInstanceOf[js.Any], featured_artists = featured_artists.asInstanceOf[js.Any], featured_video = featured_video.asInstanceOf[js.Any], full_title = full_title.asInstanceOf[js.Any], header_image_thumbnail_url = header_image_thumbnail_url.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lyrics = lyrics.asInstanceOf[js.Any], lyrics_owner_id = lyrics_owner_id.asInstanceOf[js.Any], lyrics_state = lyrics_state.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], primary_artist = primary_artist.asInstanceOf[js.Any], producer_artists = producer_artists.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], song_art_image_thumbnail_url = song_art_image_thumbnail_url.asInstanceOf[js.Any], song_art_image_url = song_art_image_url.asInstanceOf[js.Any], song_relationships = song_relationships.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], title_with_featured = title_with_featured.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified_annotations_by = verified_annotations_by.asInstanceOf[js.Any], verified_contributors = verified_contributors.asInstanceOf[js.Any], verified_lyrics_by = verified_lyrics_by.asInstanceOf[js.Any], writer_artists = writer_artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Song]
  }
  @scala.inline
  implicit class SongOps[Self <: Song] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnnotation_count(value: Double): Self = this.set("annotation_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi_path(value: String): Self = this.set("api_path", value.asInstanceOf[js.Any])
    @scala.inline
    def setApple_music_player_url(value: String): Self = this.set("apple_music_player_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrent_user_metadata(value: Excludedpermissions): Self = this.set("current_user_metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom_performancesVarargs(value: js.Any*): Self = this.set("custom_performances", js.Array(value :_*))
    @scala.inline
    def setCustom_performances(value: js.Array[_]): Self = this.set("custom_performances", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription_annotation(value: DescriptionAnnotation): Self = this.set("description_annotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmbed_content(value: String): Self = this.set("embed_content", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeatured_artistsVarargs(value: js.Any*): Self = this.set("featured_artists", js.Array(value :_*))
    @scala.inline
    def setFeatured_artists(value: js.Array[_]): Self = this.set("featured_artists", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeatured_video(value: Boolean): Self = this.set("featured_video", value.asInstanceOf[js.Any])
    @scala.inline
    def setFull_title(value: String): Self = this.set("full_title", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader_image_thumbnail_url(value: String): Self = this.set("header_image_thumbnail_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader_image_url(value: String): Self = this.set("header_image_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLyrics(value: String): Self = this.set("lyrics", value.asInstanceOf[js.Any])
    @scala.inline
    def setLyrics_owner_id(value: Double): Self = this.set("lyrics_owner_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLyrics_state(value: String): Self = this.set("lyrics_state", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaVarargs(value: Media*): Self = this.set("media", js.Array(value :_*))
    @scala.inline
    def setMedia(value: js.Array[Media]): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimary_artist(value: ArtistBrief): Self = this.set("primary_artist", value.asInstanceOf[js.Any])
    @scala.inline
    def setProducer_artistsVarargs(value: ArtistBrief*): Self = this.set("producer_artists", js.Array(value :_*))
    @scala.inline
    def setProducer_artists(value: js.Array[ArtistBrief]): Self = this.set("producer_artists", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelease_date(value: String): Self = this.set("release_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setSong_art_image_thumbnail_url(value: String): Self = this.set("song_art_image_thumbnail_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setSong_art_image_url(value: String): Self = this.set("song_art_image_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setSong_relationshipsVarargs(value: Songs*): Self = this.set("song_relationships", js.Array(value :_*))
    @scala.inline
    def setSong_relationships(value: js.Array[Songs]): Self = this.set("song_relationships", value.asInstanceOf[js.Any])
    @scala.inline
    def setStats(value: Acceptedannotations): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle_with_featured(value: String): Self = this.set("title_with_featured", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerified_annotations_byVarargs(value: js.Any*): Self = this.set("verified_annotations_by", js.Array(value :_*))
    @scala.inline
    def setVerified_annotations_by(value: js.Array[_]): Self = this.set("verified_annotations_by", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerified_contributorsVarargs(value: js.Any*): Self = this.set("verified_contributors", js.Array(value :_*))
    @scala.inline
    def setVerified_contributors(value: js.Array[_]): Self = this.set("verified_contributors", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerified_lyrics_byVarargs(value: js.Any*): Self = this.set("verified_lyrics_by", js.Array(value :_*))
    @scala.inline
    def setVerified_lyrics_by(value: js.Array[_]): Self = this.set("verified_lyrics_by", value.asInstanceOf[js.Any])
    @scala.inline
    def setWriter_artistsVarargs(value: ArtistBrief*): Self = this.set("writer_artists", js.Array(value :_*))
    @scala.inline
    def setWriter_artists(value: js.Array[ArtistBrief]): Self = this.set("writer_artists", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlbum(value: js.Any): Self = this.set("album", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbum: Self = this.set("album", js.undefined)
    @scala.inline
    def setApple_music_id(value: js.Any): Self = this.set("apple_music_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApple_music_id: Self = this.set("apple_music_id", js.undefined)
    @scala.inline
    def setLyrics_marked_complete_by(value: js.Any): Self = this.set("lyrics_marked_complete_by", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLyrics_marked_complete_by: Self = this.set("lyrics_marked_complete_by", js.undefined)
    @scala.inline
    def setPyongs_count(value: js.Any): Self = this.set("pyongs_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePyongs_count: Self = this.set("pyongs_count", js.undefined)
    @scala.inline
    def setRecording_location(value: js.Any): Self = this.set("recording_location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecording_location: Self = this.set("recording_location", js.undefined)
  }
  
}

