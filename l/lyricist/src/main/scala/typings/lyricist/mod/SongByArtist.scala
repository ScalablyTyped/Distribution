package typings.lyricist.mod

import typings.lyricist.anon.Hot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Song by Artist =========================================
trait SongByArtist extends StObject {
  
  var annotation_count: Double
  
  var api_path: String
  
  var full_title: String
  
  var header_image_thumbnail_url: String
  
  var header_image_url: String
  
  var id: Double
  
  var lyrics_owner_id: Double
  
  var lyrics_state: String
  
  var path: String
  
  var primary_artist: ArtistBrief
  
  var pyongs_count: Double
  
  var song_art_image_thumbnail_url: String
  
  var stats: Hot
  
  var title: String
  
  var title_with_featured: String
  
  var url: String
}
object SongByArtist {
  
  inline def apply(
    annotation_count: Double,
    api_path: String,
    full_title: String,
    header_image_thumbnail_url: String,
    header_image_url: String,
    id: Double,
    lyrics_owner_id: Double,
    lyrics_state: String,
    path: String,
    primary_artist: ArtistBrief,
    pyongs_count: Double,
    song_art_image_thumbnail_url: String,
    stats: Hot,
    title: String,
    title_with_featured: String,
    url: String
  ): SongByArtist = {
    val __obj = js.Dynamic.literal(annotation_count = annotation_count.asInstanceOf[js.Any], api_path = api_path.asInstanceOf[js.Any], full_title = full_title.asInstanceOf[js.Any], header_image_thumbnail_url = header_image_thumbnail_url.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lyrics_owner_id = lyrics_owner_id.asInstanceOf[js.Any], lyrics_state = lyrics_state.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], primary_artist = primary_artist.asInstanceOf[js.Any], pyongs_count = pyongs_count.asInstanceOf[js.Any], song_art_image_thumbnail_url = song_art_image_thumbnail_url.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], title_with_featured = title_with_featured.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SongByArtist]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SongByArtist] (val x: Self) extends AnyVal {
    
    inline def setAnnotation_count(value: Double): Self = StObject.set(x, "annotation_count", value.asInstanceOf[js.Any])
    
    inline def setApi_path(value: String): Self = StObject.set(x, "api_path", value.asInstanceOf[js.Any])
    
    inline def setFull_title(value: String): Self = StObject.set(x, "full_title", value.asInstanceOf[js.Any])
    
    inline def setHeader_image_thumbnail_url(value: String): Self = StObject.set(x, "header_image_thumbnail_url", value.asInstanceOf[js.Any])
    
    inline def setHeader_image_url(value: String): Self = StObject.set(x, "header_image_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLyrics_owner_id(value: Double): Self = StObject.set(x, "lyrics_owner_id", value.asInstanceOf[js.Any])
    
    inline def setLyrics_state(value: String): Self = StObject.set(x, "lyrics_state", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPrimary_artist(value: ArtistBrief): Self = StObject.set(x, "primary_artist", value.asInstanceOf[js.Any])
    
    inline def setPyongs_count(value: Double): Self = StObject.set(x, "pyongs_count", value.asInstanceOf[js.Any])
    
    inline def setSong_art_image_thumbnail_url(value: String): Self = StObject.set(x, "song_art_image_thumbnail_url", value.asInstanceOf[js.Any])
    
    inline def setStats(value: Hot): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitle_with_featured(value: String): Self = StObject.set(x, "title_with_featured", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
