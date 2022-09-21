package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment extends StObject {
  
  var album_cover: String
  
  var author: String
  
  var author_id: Double
  
  var children: js.Array[Comment]
  
  var comment: String
  
  var datetime: Double
  
  var deleted: Boolean
  
  var downs: Double
  
  var id: Double
  
  var image_id: String
  
  var on_album: Boolean
  
  var parent_id: Double
  
  var points: Double
  
  var ups: Double
  
  var vote: js.UndefOr[String] = js.undefined
}
object Comment {
  
  inline def apply(
    album_cover: String,
    author: String,
    author_id: Double,
    children: js.Array[Comment],
    comment: String,
    datetime: Double,
    deleted: Boolean,
    downs: Double,
    id: Double,
    image_id: String,
    on_album: Boolean,
    parent_id: Double,
    points: Double,
    ups: Double
  ): Comment = {
    val __obj = js.Dynamic.literal(album_cover = album_cover.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], author_id = author_id.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_id = image_id.asInstanceOf[js.Any], on_album = on_album.asInstanceOf[js.Any], parent_id = parent_id.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  extension [Self <: Comment](x: Self) {
    
    inline def setAlbum_cover(value: String): Self = StObject.set(x, "album_cover", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthor_id(value: Double): Self = StObject.set(x, "author_id", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[Comment]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Comment*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setDatetime(value: Double): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDowns(value: Double): Self = StObject.set(x, "downs", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage_id(value: String): Self = StObject.set(x, "image_id", value.asInstanceOf[js.Any])
    
    inline def setOn_album(value: Boolean): Self = StObject.set(x, "on_album", value.asInstanceOf[js.Any])
    
    inline def setParent_id(value: Double): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setUps(value: Double): Self = StObject.set(x, "ups", value.asInstanceOf[js.Any])
    
    inline def setVote(value: String): Self = StObject.set(x, "vote", value.asInstanceOf[js.Any])
    
    inline def setVoteUndefined: Self = StObject.set(x, "vote", js.undefined)
  }
}
