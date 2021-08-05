package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GalleryItem extends StObject {
  
  var account_id: js.UndefOr[Double] = js.undefined
  
  var account_url: js.UndefOr[String] = js.undefined
  
  var comment_count: Double
  
  var datetime: Double
  
  var description: String
  
  var downs: Double
  
  var favorite: Boolean
  
  var id: String
  
  var is_album: Boolean
  
  var link: String
  
  var nsfw: js.UndefOr[Boolean] = js.undefined
  
  var score: Double
  
  var title: String
  
  var topic: String
  
  var topic_id: Double
  
  var ups: Double
  
  var views: Double
  
  var vote: js.UndefOr[String] = js.undefined
}
object GalleryItem {
  
  inline def apply(
    comment_count: Double,
    datetime: Double,
    description: String,
    downs: Double,
    favorite: Boolean,
    id: String,
    is_album: Boolean,
    link: String,
    score: Double,
    title: String,
    topic: String,
    topic_id: Double,
    ups: Double,
    views: Double
  ): GalleryItem = {
    val __obj = js.Dynamic.literal(comment_count = comment_count.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_album = is_album.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], topic_id = topic_id.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleryItem]
  }
  
  extension [Self <: GalleryItem](x: Self) {
    
    inline def setAccount_id(value: Double): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setAccount_idUndefined: Self = StObject.set(x, "account_id", js.undefined)
    
    inline def setAccount_url(value: String): Self = StObject.set(x, "account_url", value.asInstanceOf[js.Any])
    
    inline def setAccount_urlUndefined: Self = StObject.set(x, "account_url", js.undefined)
    
    inline def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    inline def setDatetime(value: Double): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDowns(value: Double): Self = StObject.set(x, "downs", value.asInstanceOf[js.Any])
    
    inline def setFavorite(value: Boolean): Self = StObject.set(x, "favorite", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_album(value: Boolean): Self = StObject.set(x, "is_album", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setNsfw(value: Boolean): Self = StObject.set(x, "nsfw", value.asInstanceOf[js.Any])
    
    inline def setNsfwUndefined: Self = StObject.set(x, "nsfw", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopic_id(value: Double): Self = StObject.set(x, "topic_id", value.asInstanceOf[js.Any])
    
    inline def setUps(value: Double): Self = StObject.set(x, "ups", value.asInstanceOf[js.Any])
    
    inline def setViews(value: Double): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setVote(value: String): Self = StObject.set(x, "vote", value.asInstanceOf[js.Any])
    
    inline def setVoteUndefined: Self = StObject.set(x, "vote", js.undefined)
  }
}
