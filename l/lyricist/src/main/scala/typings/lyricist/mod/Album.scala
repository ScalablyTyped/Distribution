package typings.lyricist.mod

import typings.lyricist.anon.ExcludedpermissionsInteractions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Album =================================================
trait Album extends StObject {
  
  var api_path: String
  
  var artist: ArtistBrief
  
  var comment_count: Double
  
  var cover_art_url: String
  
  var cover_arts: js.Array[Any]
  
  var current_user_metadata: ExcludedpermissionsInteractions
  
  var custom_header_image_url: js.UndefOr[Any] = js.undefined
  
  var description_annotation: DescriptionAnnotation
  
  var full_title: String
  
  var header_image_url: String
  
  var id: Double
  
  var lock_state: String
  
  var name: String
  
  var performance_groups: js.Array[Any]
  
  var pyongs_count: Double
  
  var release_date: js.UndefOr[Any] = js.undefined
  
  var release_date_components: js.UndefOr[Any] = js.undefined
  
  var song_pageviews: Double
  
  var song_performances: js.Array[Any]
  
  var url: String
}
object Album {
  
  inline def apply(
    api_path: String,
    artist: ArtistBrief,
    comment_count: Double,
    cover_art_url: String,
    cover_arts: js.Array[Any],
    current_user_metadata: ExcludedpermissionsInteractions,
    description_annotation: DescriptionAnnotation,
    full_title: String,
    header_image_url: String,
    id: Double,
    lock_state: String,
    name: String,
    performance_groups: js.Array[Any],
    pyongs_count: Double,
    song_pageviews: Double,
    song_performances: js.Array[Any],
    url: String
  ): Album = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], cover_art_url = cover_art_url.asInstanceOf[js.Any], cover_arts = cover_arts.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], description_annotation = description_annotation.asInstanceOf[js.Any], full_title = full_title.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lock_state = lock_state.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], performance_groups = performance_groups.asInstanceOf[js.Any], pyongs_count = pyongs_count.asInstanceOf[js.Any], song_pageviews = song_pageviews.asInstanceOf[js.Any], song_performances = song_performances.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Album]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Album] (val x: Self) extends AnyVal {
    
    inline def setApi_path(value: String): Self = StObject.set(x, "api_path", value.asInstanceOf[js.Any])
    
    inline def setArtist(value: ArtistBrief): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    inline def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    inline def setCover_art_url(value: String): Self = StObject.set(x, "cover_art_url", value.asInstanceOf[js.Any])
    
    inline def setCover_arts(value: js.Array[Any]): Self = StObject.set(x, "cover_arts", value.asInstanceOf[js.Any])
    
    inline def setCover_artsVarargs(value: Any*): Self = StObject.set(x, "cover_arts", js.Array(value*))
    
    inline def setCurrent_user_metadata(value: ExcludedpermissionsInteractions): Self = StObject.set(x, "current_user_metadata", value.asInstanceOf[js.Any])
    
    inline def setCustom_header_image_url(value: Any): Self = StObject.set(x, "custom_header_image_url", value.asInstanceOf[js.Any])
    
    inline def setCustom_header_image_urlUndefined: Self = StObject.set(x, "custom_header_image_url", js.undefined)
    
    inline def setDescription_annotation(value: DescriptionAnnotation): Self = StObject.set(x, "description_annotation", value.asInstanceOf[js.Any])
    
    inline def setFull_title(value: String): Self = StObject.set(x, "full_title", value.asInstanceOf[js.Any])
    
    inline def setHeader_image_url(value: String): Self = StObject.set(x, "header_image_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLock_state(value: String): Self = StObject.set(x, "lock_state", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPerformance_groups(value: js.Array[Any]): Self = StObject.set(x, "performance_groups", value.asInstanceOf[js.Any])
    
    inline def setPerformance_groupsVarargs(value: Any*): Self = StObject.set(x, "performance_groups", js.Array(value*))
    
    inline def setPyongs_count(value: Double): Self = StObject.set(x, "pyongs_count", value.asInstanceOf[js.Any])
    
    inline def setRelease_date(value: Any): Self = StObject.set(x, "release_date", value.asInstanceOf[js.Any])
    
    inline def setRelease_dateUndefined: Self = StObject.set(x, "release_date", js.undefined)
    
    inline def setRelease_date_components(value: Any): Self = StObject.set(x, "release_date_components", value.asInstanceOf[js.Any])
    
    inline def setRelease_date_componentsUndefined: Self = StObject.set(x, "release_date_components", js.undefined)
    
    inline def setSong_pageviews(value: Double): Self = StObject.set(x, "song_pageviews", value.asInstanceOf[js.Any])
    
    inline def setSong_performances(value: js.Array[Any]): Self = StObject.set(x, "song_performances", value.asInstanceOf[js.Any])
    
    inline def setSong_performancesVarargs(value: Any*): Self = StObject.set(x, "song_performances", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
