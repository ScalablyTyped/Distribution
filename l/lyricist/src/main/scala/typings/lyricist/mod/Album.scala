package typings.lyricist.mod

import typings.lyricist.anon.ExcludedpermissionsInteractions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Album =================================================
@js.native
trait Album extends js.Object {
  
  var api_path: String = js.native
  
  var artist: ArtistBrief = js.native
  
  var comment_count: Double = js.native
  
  var cover_art_url: String = js.native
  
  var cover_arts: js.Array[_] = js.native
  
  var current_user_metadata: ExcludedpermissionsInteractions = js.native
  
  var custom_header_image_url: js.UndefOr[js.Any] = js.native
  
  var description_annotation: DescriptionAnnotation = js.native
  
  var full_title: String = js.native
  
  var header_image_url: String = js.native
  
  var id: Double = js.native
  
  var lock_state: String = js.native
  
  var name: String = js.native
  
  var performance_groups: js.Array[_] = js.native
  
  var pyongs_count: Double = js.native
  
  var release_date: js.UndefOr[js.Any] = js.native
  
  var release_date_components: js.UndefOr[js.Any] = js.native
  
  var song_pageviews: Double = js.native
  
  var song_performances: js.Array[_] = js.native
  
  var url: String = js.native
}
object Album {
  
  @scala.inline
  def apply(
    api_path: String,
    artist: ArtistBrief,
    comment_count: Double,
    cover_art_url: String,
    cover_arts: js.Array[_],
    current_user_metadata: ExcludedpermissionsInteractions,
    description_annotation: DescriptionAnnotation,
    full_title: String,
    header_image_url: String,
    id: Double,
    lock_state: String,
    name: String,
    performance_groups: js.Array[_],
    pyongs_count: Double,
    song_pageviews: Double,
    song_performances: js.Array[_],
    url: String
  ): Album = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], cover_art_url = cover_art_url.asInstanceOf[js.Any], cover_arts = cover_arts.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], description_annotation = description_annotation.asInstanceOf[js.Any], full_title = full_title.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lock_state = lock_state.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], performance_groups = performance_groups.asInstanceOf[js.Any], pyongs_count = pyongs_count.asInstanceOf[js.Any], song_pageviews = song_pageviews.asInstanceOf[js.Any], song_performances = song_performances.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Album]
  }
  
  @scala.inline
  implicit class AlbumOps[Self <: Album] (val x: Self) extends AnyVal {
    
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
    def setApi_path(value: String): Self = this.set("api_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtist(value: ArtistBrief): Self = this.set("artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_count(value: Double): Self = this.set("comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover_art_url(value: String): Self = this.set("cover_art_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover_artsVarargs(value: js.Any*): Self = this.set("cover_arts", js.Array(value :_*))
    
    @scala.inline
    def setCover_arts(value: js.Array[_]): Self = this.set("cover_arts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent_user_metadata(value: ExcludedpermissionsInteractions): Self = this.set("current_user_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription_annotation(value: DescriptionAnnotation): Self = this.set("description_annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_title(value: String): Self = this.set("full_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader_image_url(value: String): Self = this.set("header_image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLock_state(value: String): Self = this.set("lock_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformance_groupsVarargs(value: js.Any*): Self = this.set("performance_groups", js.Array(value :_*))
    
    @scala.inline
    def setPerformance_groups(value: js.Array[_]): Self = this.set("performance_groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPyongs_count(value: Double): Self = this.set("pyongs_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSong_pageviews(value: Double): Self = this.set("song_pageviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSong_performancesVarargs(value: js.Any*): Self = this.set("song_performances", js.Array(value :_*))
    
    @scala.inline
    def setSong_performances(value: js.Array[_]): Self = this.set("song_performances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_header_image_url(value: js.Any): Self = this.set("custom_header_image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_header_image_url: Self = this.set("custom_header_image_url", js.undefined)
    
    @scala.inline
    def setRelease_date(value: js.Any): Self = this.set("release_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelease_date: Self = this.set("release_date", js.undefined)
    
    @scala.inline
    def setRelease_date_components(value: js.Any): Self = this.set("release_date_components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelease_date_components: Self = this.set("release_date_components", js.undefined)
  }
}
