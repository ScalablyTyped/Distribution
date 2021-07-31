package typings.lyricist.mod

import typings.lyricist.anon.Acceptedannotations
import typings.lyricist.anon.Excludedpermissions
import typings.lyricist.anon.Songs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Song ============================================================================================
trait Song extends StObject {
  
  var album: js.UndefOr[js.Any] = js.undefined
  
  var annotation_count: Double
  
  var api_path: String
  
  var apple_music_id: js.UndefOr[js.Any] = js.undefined
  
  var apple_music_player_url: String
  
  var current_user_metadata: Excludedpermissions
  
  var custom_performances: js.Array[js.Any]
  
  var description: Description
  
  var description_annotation: DescriptionAnnotation
  
  var embed_content: String
  
  var featured_artists: js.Array[js.Any]
  
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
  
  var song_relationships: js.Array[Songs]
  
  var stats: Acceptedannotations
  
  var title: String
  
  var title_with_featured: String
  
  var url: String
  
  var verified_annotations_by: js.Array[js.Any]
  
  var verified_contributors: js.Array[js.Any]
  
  var verified_lyrics_by: js.Array[js.Any]
  
  var writer_artists: js.Array[ArtistBrief]
}
object Song {
  
  @scala.inline
  def apply(
    annotation_count: Double,
    api_path: String,
    apple_music_player_url: String,
    current_user_metadata: Excludedpermissions,
    custom_performances: js.Array[js.Any],
    description: Description,
    description_annotation: DescriptionAnnotation,
    embed_content: String,
    featured_artists: js.Array[js.Any],
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
    verified_annotations_by: js.Array[js.Any],
    verified_contributors: js.Array[js.Any],
    verified_lyrics_by: js.Array[js.Any],
    writer_artists: js.Array[ArtistBrief]
  ): Song = {
    val __obj = js.Dynamic.literal(annotation_count = annotation_count.asInstanceOf[js.Any], api_path = api_path.asInstanceOf[js.Any], apple_music_player_url = apple_music_player_url.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], custom_performances = custom_performances.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], description_annotation = description_annotation.asInstanceOf[js.Any], embed_content = embed_content.asInstanceOf[js.Any], featured_artists = featured_artists.asInstanceOf[js.Any], featured_video = featured_video.asInstanceOf[js.Any], full_title = full_title.asInstanceOf[js.Any], header_image_thumbnail_url = header_image_thumbnail_url.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lyrics = lyrics.asInstanceOf[js.Any], lyrics_owner_id = lyrics_owner_id.asInstanceOf[js.Any], lyrics_state = lyrics_state.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], primary_artist = primary_artist.asInstanceOf[js.Any], producer_artists = producer_artists.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], song_art_image_thumbnail_url = song_art_image_thumbnail_url.asInstanceOf[js.Any], song_art_image_url = song_art_image_url.asInstanceOf[js.Any], song_relationships = song_relationships.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], title_with_featured = title_with_featured.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified_annotations_by = verified_annotations_by.asInstanceOf[js.Any], verified_contributors = verified_contributors.asInstanceOf[js.Any], verified_lyrics_by = verified_lyrics_by.asInstanceOf[js.Any], writer_artists = writer_artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Song]
  }
  
  @scala.inline
  implicit class SongMutableBuilder[Self <: Song] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbum(value: js.Any): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
    
    @scala.inline
    def setAnnotation_count(value: Double): Self = StObject.set(x, "annotation_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi_path(value: String): Self = StObject.set(x, "api_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApple_music_id(value: js.Any): Self = StObject.set(x, "apple_music_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApple_music_idUndefined: Self = StObject.set(x, "apple_music_id", js.undefined)
    
    @scala.inline
    def setApple_music_player_url(value: String): Self = StObject.set(x, "apple_music_player_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent_user_metadata(value: Excludedpermissions): Self = StObject.set(x, "current_user_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_performances(value: js.Array[js.Any]): Self = StObject.set(x, "custom_performances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_performancesVarargs(value: js.Any*): Self = StObject.set(x, "custom_performances", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription_annotation(value: DescriptionAnnotation): Self = StObject.set(x, "description_annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbed_content(value: String): Self = StObject.set(x, "embed_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatured_artists(value: js.Array[js.Any]): Self = StObject.set(x, "featured_artists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatured_artistsVarargs(value: js.Any*): Self = StObject.set(x, "featured_artists", js.Array(value :_*))
    
    @scala.inline
    def setFeatured_video(value: Boolean): Self = StObject.set(x, "featured_video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_title(value: String): Self = StObject.set(x, "full_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader_image_thumbnail_url(value: String): Self = StObject.set(x, "header_image_thumbnail_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader_image_url(value: String): Self = StObject.set(x, "header_image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLyrics(value: String): Self = StObject.set(x, "lyrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLyrics_marked_complete_by(value: js.Any): Self = StObject.set(x, "lyrics_marked_complete_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLyrics_marked_complete_byUndefined: Self = StObject.set(x, "lyrics_marked_complete_by", js.undefined)
    
    @scala.inline
    def setLyrics_owner_id(value: Double): Self = StObject.set(x, "lyrics_owner_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLyrics_state(value: String): Self = StObject.set(x, "lyrics_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: js.Array[Media]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaVarargs(value: Media*): Self = StObject.set(x, "media", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary_artist(value: ArtistBrief): Self = StObject.set(x, "primary_artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducer_artists(value: js.Array[ArtistBrief]): Self = StObject.set(x, "producer_artists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducer_artistsVarargs(value: ArtistBrief*): Self = StObject.set(x, "producer_artists", js.Array(value :_*))
    
    @scala.inline
    def setPyongs_count(value: js.Any): Self = StObject.set(x, "pyongs_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPyongs_countUndefined: Self = StObject.set(x, "pyongs_count", js.undefined)
    
    @scala.inline
    def setRecording_location(value: js.Any): Self = StObject.set(x, "recording_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecording_locationUndefined: Self = StObject.set(x, "recording_location", js.undefined)
    
    @scala.inline
    def setRelease_date(value: String): Self = StObject.set(x, "release_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSong_art_image_thumbnail_url(value: String): Self = StObject.set(x, "song_art_image_thumbnail_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSong_art_image_url(value: String): Self = StObject.set(x, "song_art_image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSong_relationships(value: js.Array[Songs]): Self = StObject.set(x, "song_relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSong_relationshipsVarargs(value: Songs*): Self = StObject.set(x, "song_relationships", js.Array(value :_*))
    
    @scala.inline
    def setStats(value: Acceptedannotations): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle_with_featured(value: String): Self = StObject.set(x, "title_with_featured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_annotations_by(value: js.Array[js.Any]): Self = StObject.set(x, "verified_annotations_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_annotations_byVarargs(value: js.Any*): Self = StObject.set(x, "verified_annotations_by", js.Array(value :_*))
    
    @scala.inline
    def setVerified_contributors(value: js.Array[js.Any]): Self = StObject.set(x, "verified_contributors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_contributorsVarargs(value: js.Any*): Self = StObject.set(x, "verified_contributors", js.Array(value :_*))
    
    @scala.inline
    def setVerified_lyrics_by(value: js.Array[js.Any]): Self = StObject.set(x, "verified_lyrics_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_lyrics_byVarargs(value: js.Any*): Self = StObject.set(x, "verified_lyrics_by", js.Array(value :_*))
    
    @scala.inline
    def setWriter_artists(value: js.Array[ArtistBrief]): Self = StObject.set(x, "writer_artists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriter_artistsVarargs(value: ArtistBrief*): Self = StObject.set(x, "writer_artists", js.Array(value :_*))
  }
}
