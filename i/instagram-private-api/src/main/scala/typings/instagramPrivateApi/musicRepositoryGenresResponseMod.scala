package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicRepositoryGenresResponseMod {
  
  trait MusicRepositoryGenresResponseGenre extends StObject {
    
    var cover_artwork_uri: String
    
    var id: String
    
    var name: String
  }
  object MusicRepositoryGenresResponseGenre {
    
    inline def apply(cover_artwork_uri: String, id: String, name: String): MusicRepositoryGenresResponseGenre = {
      val __obj = js.Dynamic.literal(cover_artwork_uri = cover_artwork_uri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicRepositoryGenresResponseGenre]
    }
    
    extension [Self <: MusicRepositoryGenresResponseGenre](x: Self) {
      
      inline def setCover_artwork_uri(value: String): Self = StObject.set(x, "cover_artwork_uri", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MusicRepositoryGenresResponseItemsItem extends StObject {
    
    var genre: MusicRepositoryGenresResponseGenre
  }
  object MusicRepositoryGenresResponseItemsItem {
    
    inline def apply(genre: MusicRepositoryGenresResponseGenre): MusicRepositoryGenresResponseItemsItem = {
      val __obj = js.Dynamic.literal(genre = genre.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicRepositoryGenresResponseItemsItem]
    }
    
    extension [Self <: MusicRepositoryGenresResponseItemsItem](x: Self) {
      
      inline def setGenre(value: MusicRepositoryGenresResponseGenre): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    }
  }
  
  trait MusicRepositoryGenresResponseRootObject extends StObject {
    
    var items: js.Array[MusicRepositoryGenresResponseItemsItem]
    
    var status: String
  }
  object MusicRepositoryGenresResponseRootObject {
    
    inline def apply(items: js.Array[MusicRepositoryGenresResponseItemsItem], status: String): MusicRepositoryGenresResponseRootObject = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicRepositoryGenresResponseRootObject]
    }
    
    extension [Self <: MusicRepositoryGenresResponseRootObject](x: Self) {
      
      inline def setItems(value: js.Array[MusicRepositoryGenresResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: MusicRepositoryGenresResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
